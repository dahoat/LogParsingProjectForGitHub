package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtProcess;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtProcessRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PtProcessServiceImpl extends GenericServiceImpl<PtProcess, Long, PtProcessRepository> implements PtProcessService
{
	@Override
	public PtProcess find(Long processId) {
		return repository.findByProcessId(processId);
	}

	@Override
	public PtProcess findOrCreate(Long processId)
	{
		PtProcess process = this.find(processId);
		if (process == null) {
			process = new PtProcess(processId);
			process = repository.save(process);
		}
		return process;
	}
}
