package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrAttacker;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrAttackerRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HrAttackerServiceImpl extends GenericServiceImpl<HrAttacker, Long, HrAttackerRepository> implements HrAttackerService
{
}
