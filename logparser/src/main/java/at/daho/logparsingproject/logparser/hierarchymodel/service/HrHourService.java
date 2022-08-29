package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrHour;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrHourRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrHourService extends GenericService<HrHour, Long, HrHourRepository>
{
	HrHour findOrCreate(int year, int month, int day, int hour);
}
