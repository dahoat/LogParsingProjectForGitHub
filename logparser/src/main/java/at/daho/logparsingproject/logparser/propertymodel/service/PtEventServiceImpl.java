package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtEvent;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtEventRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PtEventServiceImpl extends GenericServiceImpl<PtEvent, Long, PtEventRepository> implements PtEventService
{
}
