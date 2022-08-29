package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

public abstract class HrTimeNodeImpl<T extends HrTimeNode> implements HrTimeNode
{
	@Id
	@GeneratedValue
	private Long id;

	private Integer value;

	private HrTimeNode next;

	@Relationship(type = GraphDBNames.FINER)
	private final List<HrTimeNode> children = new ArrayList<>();

	public HrTimeNodeImpl() {

	}

	public HrTimeNodeImpl(int value)
	{
		this.value = value;
	}


	@Override
	public Long getId()
	{
		return id;
	}

	@Override
	public void setId(Long id)
	{
		this.id = id;
	}

	@Override
	public Integer getValue()
	{
		return value;
	}

	@Override
	public void setValue(Integer value)
	{
		this.value = value;
	}

	public void copy(HrTimeNodeImpl<T> timeNode)
	{
		if(this == timeNode) return;
		if(!this.getClass().equals(timeNode.getClass())) throw new IllegalArgumentException();

		this.id = timeNode.getId();
		this.value = timeNode.getValue();

		List<HrTimeNode> finer = getFiner();
		if(finer != null) {
			this.getFiner().clear();
			this.getFiner().addAll(timeNode.getFiner());
		}
	}

	public HrTimeNode getNext()
	{
		return next;
	}

	@Override
	public void setNext(HrTimeNode timeItem)
	{
		this.next = timeItem;
	}

	@Override
	public void addChild(HrTimeNode childNode)
	{
		this.children.add(childNode);
	}

	public List<HrTimeNode> getChildren()
	{
		return children;
	}

	protected List<HrTimeNode> getFiner()
	{
		return children;
	}
}
