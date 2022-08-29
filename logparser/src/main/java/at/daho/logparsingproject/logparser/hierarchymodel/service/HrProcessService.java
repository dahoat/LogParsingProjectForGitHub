package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrProcess;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrProcessRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrProcessService extends GenericService<HrProcess, Long, HrProcessRepository>
{
	HrProcess find(Long processId);

	HrProcess findOrCreate(Long processId);
}
