package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeNode;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrYear;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrYearRepository;
import org.springframework.stereotype.Service;

@Service
public class HrYearServiceImpl extends GenericHrTimestampServiceImpl<HrYear, Long, HrYearRepository> implements HrYearService
{
	@Override
	public HrYear findOrCreate(int year)
	{
		return super.findOrCreate(new HrTimeItem(year));
	}

	@Override
	protected HrTimeNode findParent(HrTimeItem hrTimeItem)
	{
		return null;
	}

	@Override
	protected void saveParent(HrTimeNode timeNode)
	{

	}

	@Override
	protected HrYear getInstance(HrTimeItem timeItem)
	{
		return new HrYear(timeItem.getYear());
	}
}
