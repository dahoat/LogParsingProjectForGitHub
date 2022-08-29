package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrDay;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrDayRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrDayService extends GenericService<HrDay, Long, HrDayRepository>
{
	HrDay findOrCreate(int year, int month, int day);
}
