package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.*;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrMinuteRepository;
import org.springframework.stereotype.Service;

@Service
public class HrMinuteServiceImpl extends GenericHrTimestampServiceImpl<HrMinute, Long, HrMinuteRepository> implements HrMinuteService
{
	private final HrHourService hrHourService;

	public HrMinuteServiceImpl(HrHourService hrHourService)
	{
		this.hrHourService = hrHourService;
	}

	@Override
	public HrMinute findOrCreate(int year, int month, int day, int hour, int minute)
	{
		return super.findOrCreate(new HrTimeItem(year, month, day, hour, minute));
	}

	@Override
	protected HrMinute getInstance(HrTimeItem timeItem)
	{
		return new HrMinute(timeItem.getMinute());
	}

	@Override
	protected HrTimeNode findParent(HrTimeItem hrTimeItem)
	{
		return hrHourService.findOrCreate(hrTimeItem.getYear(), hrTimeItem.getMonth(), hrTimeItem.getDay(), hrTimeItem.getHour());
	}

	@Override
	protected void saveParent(HrTimeNode timeNode)
	{
		this.hrHourService.save((HrHour) timeNode);
	}


}
