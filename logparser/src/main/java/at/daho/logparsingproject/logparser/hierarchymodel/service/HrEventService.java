package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrProcess;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrEventRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrEventService extends GenericService<HrEvent, Long, HrEventRepository>
{
	HrEvent findLastEvent(HrProcess processId);
}
