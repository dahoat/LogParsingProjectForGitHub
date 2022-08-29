package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrYear;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrYearRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrYearService extends GenericService<HrYear, Long, HrYearRepository>
{
	HrYear findOrCreate(int year);
}
