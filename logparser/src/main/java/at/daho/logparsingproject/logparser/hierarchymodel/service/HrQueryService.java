package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;

import java.util.List;

public interface HrQueryService
{
	List<HrEvent> findAllConnect();
}
