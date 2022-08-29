package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericService;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlTypeRepository;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlType;

public interface TlTypeService extends GenericService<TlType, Long, TlTypeRepository>
{

	TlType findByName(String name);

	TlType findOrCreateByName(String name);
}
