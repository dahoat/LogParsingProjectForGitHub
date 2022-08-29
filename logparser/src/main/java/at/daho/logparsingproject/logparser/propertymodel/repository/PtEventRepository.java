package at.daho.logparsingproject.logparser.propertymodel.repository;

import at.daho.logparsingproject.logparser.propertymodel.model.PtEvent;
import at.daho.logparsingproject.logparser.repository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PtEventRepository extends GenericRepository<PtEvent>
{
}
