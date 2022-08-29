package at.daho.logparsingproject.logparser.service;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.io.Serializable;

public interface GenericService<T, ID extends Serializable, REPO extends Neo4jRepository<T, ID>>
{
	Iterable<T> findAll();

	T save(T entity);

	void deleteAll();

	T findById(ID id);
}
