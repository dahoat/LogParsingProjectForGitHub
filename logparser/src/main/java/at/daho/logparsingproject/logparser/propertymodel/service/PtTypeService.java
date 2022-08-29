package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtType;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtTypeRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface PtTypeService extends GenericService<PtType, Long, PtTypeRepository>
{
	PtType findByName(String name);

	PtType findOrCreateByName(String name);
}
