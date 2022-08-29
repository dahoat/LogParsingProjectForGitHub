package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrMinute;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrMinuteRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrMinuteService extends GenericService<HrMinute, Long, HrMinuteRepository>
{
	HrMinute findOrCreate(int year, int month, int day, int hour, int minute);
}
