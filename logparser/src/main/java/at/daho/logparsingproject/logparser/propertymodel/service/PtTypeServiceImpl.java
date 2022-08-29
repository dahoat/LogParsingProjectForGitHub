package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtType;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtTypeRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PtTypeServiceImpl extends GenericServiceImpl<PtType, Long, PtTypeRepository> implements PtTypeService
{
	@Override
	public PtType findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public PtType findOrCreateByName(String name)
	{
		PtType type = this.findByName(name);
		if (type == null) {
			type = new PtType(name);
			type = repository.save(type);
		}
		return type;
	}
}
