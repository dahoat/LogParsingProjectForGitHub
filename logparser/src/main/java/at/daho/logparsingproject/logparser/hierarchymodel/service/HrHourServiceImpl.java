package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.*;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrHourRepository;
import org.springframework.stereotype.Service;

@Service
public class HrHourServiceImpl extends GenericHrTimestampServiceImpl<HrHour, Long, HrHourRepository> implements HrHourService
{
	private final HrDayService hrDayService;

	public HrHourServiceImpl(HrDayService hrDayService)
	{
		this.hrDayService = hrDayService;
	}

	@Override
	public HrHour findOrCreate(int year, int month, int day, int hour)
	{
		return super.findOrCreate(new HrTimeItem(year, month, day, hour));
	}

	@Override
	protected HrHour getInstance(HrTimeItem timeItem)
	{
		return new HrHour(timeItem.getHour());
	}

	@Override
	protected HrTimeNode findParent(HrTimeItem hrTimeItem)
	{
		return hrDayService.findOrCreate(hrTimeItem.getYear(), hrTimeItem.getMonth(), hrTimeItem.getDay());
	}

	@Override
	protected void saveParent(HrTimeNode timeNode)
	{
		this.hrDayService.save((HrDay) timeNode);
	}
}
