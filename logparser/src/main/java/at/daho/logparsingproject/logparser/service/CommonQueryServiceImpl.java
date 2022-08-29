package at.daho.logparsingproject.logparser.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CommonQueryServiceImpl implements CommonQueryService
{
	private final JdbcTemplate jdbcTemplate;

	public CommonQueryServiceImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void clearDatabase()
	{
		jdbcTemplate.execute("MATCH (n) DETACH DELETE (n)");
	}
}
