package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrMonth;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrMonthRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrMonthService extends GenericService<HrMonth, Long, HrMonthRepository>
{
	HrMonth findOrCreate(int year, int month);
}
