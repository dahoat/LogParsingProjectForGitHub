package at.daho.logparsingproject.logparser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.io.Serializable;

public class GenericServiceImpl<T, ID extends Serializable, REPO extends Neo4jRepository<T, ID>> implements GenericService<T, ID, REPO>
{

	@Autowired
	protected REPO repository;

	@Override
	public Iterable<T> findAll()
	{
		return repository.findAll();
	}

	@Override
	public T save(T entity)
	{
		return repository.save(entity);
	}

	@Override
	public void deleteAll()
	{
		repository.deleteAll();
	}

	@Override
	public T findById(ID id) {
		return repository.findById(id).orElseThrow();
	}


}
