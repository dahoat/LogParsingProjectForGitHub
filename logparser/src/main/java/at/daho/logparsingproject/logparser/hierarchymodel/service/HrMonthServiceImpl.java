package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.*;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrMonthRepository;
import org.springframework.stereotype.Service;

@Service
public class HrMonthServiceImpl extends GenericHrTimestampServiceImpl<HrMonth, Long, HrMonthRepository> implements HrMonthService
{
	private final HrYearService hrYearService;

	public HrMonthServiceImpl(HrYearService hrYearService)
	{
		this.hrYearService = hrYearService;
	}

	@Override
	public HrMonth findOrCreate(int year, int month)
	{
		return super.findOrCreate(new HrTimeItem(year, month));
	}

	@Override
	protected HrMonth getInstance(HrTimeItem timeItem)
	{
		return new HrMonth(timeItem.getMonth());
	}

	@Override
	protected HrTimeNode findParent(HrTimeItem hrTimeItem)
	{
		return hrYearService.findOrCreate(hrTimeItem.getYear());
	}

	@Override
	protected void saveParent(HrTimeNode timeNode)
	{
		this.hrYearService.save((HrYear) timeNode);
	}
}
