package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrType;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrTypeRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HrTypeServiceImpl extends GenericServiceImpl<HrType, Long, HrTypeRepository> implements HrTypeService
{
	@Override
	public HrType findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public HrType findOrCreateByName(String name)
	{
		HrType type = this.findByName(name);
		if (type == null) {
			type = new HrType(name);
			type = repository.save(type);
		}
		return type;
	}
}
