package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrProcess;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrProcessRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HrProcessServiceImpl extends GenericServiceImpl<HrProcess, Long, HrProcessRepository> implements HrProcessService
{
	@Override
	public HrProcess find(Long processId) {
		return repository.findByProcessId(processId);
	}

	@Override
	public HrProcess findOrCreate(Long processId)
	{
		HrProcess pid = this.find(processId);
		if (pid == null) {
			pid = new HrProcess(processId);
			pid = repository.save(pid);
		}
		return pid;
	}
}
