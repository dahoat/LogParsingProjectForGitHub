package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeNode;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrTimestampRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;

import java.io.Serializable;

public abstract class GenericHrTimestampServiceImpl<T extends HrTimeNode, ID extends Serializable, REPO extends HrTimestampRepository<T, ID>> extends GenericServiceImpl<T, ID, REPO>
{
	public T findOrCreate(HrTimeItem timeItem)
	{
		HrTimeNode model = find(timeItem);
		if(model == null) {
			model = getInstance(timeItem);
			insert(timeItem, model);
			addToParent(timeItem, model);
		}
		return returnTimeNode(model);
	}

	protected void insert(HrTimeItem timeItem, HrTimeNode model) {
		HrTimeNode previous = findPrevious(timeItem);
		HrTimeNode next;
		if(previous != null) {
			next = previous.getNext();
			previous.setNext(model);
			saveTimeNode(previous);
		}
		else
		{
			next = findNext(timeItem);
		}

		model.setNext(next);
		saveTimeNode(model);
	}

	protected void addToParent(HrTimeItem hrTimeItem, HrTimeNode model) {
		HrTimeNode parent = findParent(hrTimeItem);
		if(parent != null) {
			parent.addChild(model);
			saveParent(parent);
		}
	}

	private void saveTimeNode(HrTimeNode timeNode) {
		repository.save((T)timeNode);
	}

	private T returnTimeNode(HrTimeNode timeNode) {
		return (T) timeNode;
	}

	protected abstract T getInstance(HrTimeItem timeItem);
	protected abstract HrTimeNode findParent(HrTimeItem hrTimeItem);
	protected abstract void saveParent(HrTimeNode timeNode);
	/*protected abstract T find(HrTimeItem timeItem);
	protected abstract T findPrevious(HrTimeItem timeItem);
	protected abstract T findNext(HrTimeItem timeItem);*/

	protected HrTimeNode find(HrTimeItem timeItem)
	{
		return repository.find(timeItem);
	}

	protected HrTimeNode findPrevious(HrTimeItem timeItem)
	{
		return repository.findPrevious(timeItem);
	}

	protected HrTimeNode findNext(HrTimeItem timeItem)
	{
		return repository.findNext(timeItem);
	}
}
