package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlType;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class TlTypeServiceImpl extends GenericServiceImpl<TlType, Long, TlTypeRepository> implements TlTypeService
{
	@Override
	public TlType findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public TlType findOrCreateByName(String name)
	{
		TlType type = this.findByName(name);
		if (type == null) {
			type = new TlType(name);
			type = repository.save(type);
		}
		return type;
	}
}
