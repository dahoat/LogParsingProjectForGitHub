package at.daho.logparsingproject.logparser.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface GenericRepository<E> extends Neo4jRepository<E, Long>
{
	void deleteAll();
}
