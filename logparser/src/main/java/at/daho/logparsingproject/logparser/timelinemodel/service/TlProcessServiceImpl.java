package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlProcess;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlProcessRepository;
import org.springframework.stereotype.Service;

@Service
public class TlProcessServiceImpl extends GenericServiceImpl<TlProcess, Long, TlProcessRepository> implements TlProcessService
{
	@Override
	public TlProcess findByProcessId(Long processId) {
		return repository.findByProcessId(processId);
	}

	@Override
	public TlProcess findOrCreate(Long processId)
	{
		TlProcess process = this.findByProcessId(processId);
		if (process == null) {
			process = new TlProcess(processId);
			process = repository.save(process);
		}
		return process;
	}
}
