package at.daho.logparsingproject.logparser.timelinemodel.repository;

import at.daho.logparsingproject.logparser.repository.GenericRepository;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlEvent;
import org.springframework.stereotype.Repository;

@Repository
public interface TlEventRepository extends GenericRepository<TlEvent>
{
}
