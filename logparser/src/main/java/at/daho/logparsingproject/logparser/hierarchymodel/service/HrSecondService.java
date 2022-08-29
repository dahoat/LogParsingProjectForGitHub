package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrSecond;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrSecondRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrSecondService extends GenericService<HrSecond, Long, HrSecondRepository>
{
	HrSecond findOrCreate(int year, int month, int day, int hour, int minute, int second);
}
