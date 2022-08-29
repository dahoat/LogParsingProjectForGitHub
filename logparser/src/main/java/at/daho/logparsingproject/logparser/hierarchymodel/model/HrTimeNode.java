package at.daho.logparsingproject.logparser.hierarchymodel.model;

public interface HrTimeNode
{
	Long getId();
	void setId(Long id);
	Integer getValue();
	void setValue(Integer value);

	<T extends HrTimeNode> T getNext();
	void setNext(HrTimeNode timeItem);
	<T extends HrTimeNode> void addChild(T childNode);
}
