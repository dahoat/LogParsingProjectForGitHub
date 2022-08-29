package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtAttacker;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtAttackerRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PtAttackerServiceImpl extends GenericServiceImpl<PtAttacker, Long, PtAttackerRepository> implements PtAttackerService
{
}
