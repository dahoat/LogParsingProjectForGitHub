package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrDay;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrMonth;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeNode;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrDayRepository;
import org.springframework.stereotype.Service;

@Service
public class HrDayServiceImpl extends GenericHrTimestampServiceImpl<HrDay, Long, HrDayRepository> implements HrDayService
{
	private final HrMonthService hrMonthService;

	public HrDayServiceImpl(HrMonthService hrMonthService)
	{
		this.hrMonthService = hrMonthService;
	}

	@Override
	public HrDay findOrCreate(int year, int month, int day)
	{
		return super.findOrCreate(new HrTimeItem(year, month, day));
	}

	@Override
	protected HrDay getInstance(HrTimeItem timeItem)
	{
		return new HrDay(timeItem.getDay());
	}

	@Override
	protected HrTimeNode findParent(HrTimeItem hrTimeItem)
	{
		return hrMonthService.findOrCreate(hrTimeItem.getYear(), hrTimeItem.getMonth());
	}

	@Override
	protected void saveParent(HrTimeNode timeNode)
	{
		this.hrMonthService.save((HrMonth) timeNode);
	}
}
