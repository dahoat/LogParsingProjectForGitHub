package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlAttacker;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlAttackerRepository;
import org.springframework.stereotype.Service;

@Service
public class TlAttackerServiceImpl extends GenericServiceImpl<TlAttacker, Long, TlAttackerRepository> implements TlAttackerService
{

}
