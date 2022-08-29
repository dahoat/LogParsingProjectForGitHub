package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrProcess;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrEventRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HrEventServiceImpl extends GenericServiceImpl<HrEvent, Long, HrEventRepository> implements HrEventService
{
	@Override
	public HrEvent findLastEvent(HrProcess processId)
	{
		return repository.findLastEvent(processId.getProcessId());
	}
}
