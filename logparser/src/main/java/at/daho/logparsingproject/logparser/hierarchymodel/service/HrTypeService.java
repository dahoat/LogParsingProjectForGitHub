package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrType;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrTypeRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrTypeService extends GenericService<HrType, Long, HrTypeRepository>
{
	HrType findByName(String name);

	HrType findOrCreateByName(String name);
}
