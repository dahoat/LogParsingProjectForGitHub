package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.*;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrSecondRepository;
import org.springframework.stereotype.Service;

@Service
public class HrSecondServiceImpl extends GenericHrTimestampServiceImpl<HrSecond, Long, HrSecondRepository> implements HrSecondService
{
	private final HrMinuteService hrMinuteService;

	public HrSecondServiceImpl(HrMinuteService hrMinuteService)
	{
		this.hrMinuteService = hrMinuteService;
	}

	@Override
	protected HrSecond getInstance(HrTimeItem timeItem)
	{
		return new HrSecond(timeItem.getSecond());
	}

	@Override
	protected HrTimeNode findParent(HrTimeItem hrTimeItem)
	{
		return hrMinuteService.findOrCreate(hrTimeItem.getYear(), hrTimeItem.getMonth(), hrTimeItem.getDay(), hrTimeItem.getHour(), hrTimeItem.getMinute());
	}

	@Override
	public HrSecond findOrCreate(int year, int month, int day, int hour, int minute, int second)
	{
		return super.findOrCreate(new HrTimeItem(year, month, day, hour, minute, second));
	}

	@Override
	protected void saveParent(HrTimeNode timeNode)
	{
		this.hrMinuteService.save((HrMinute) timeNode);
	}
}
