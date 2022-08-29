package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtProcess;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtProcessRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface PtProcessService extends GenericService<PtProcess, Long, PtProcessRepository>
{
	PtProcess find(Long processId);

	PtProcess findOrCreate(Long processId);
}
