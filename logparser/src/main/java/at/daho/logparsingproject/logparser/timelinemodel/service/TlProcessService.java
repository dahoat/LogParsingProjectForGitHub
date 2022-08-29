package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericService;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlProcess;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlProcessRepository;

public interface TlProcessService extends GenericService<TlProcess, Long, TlProcessRepository>
{
	TlProcess findByProcessId(Long processId);

	TlProcess findOrCreate(Long processId);
}
