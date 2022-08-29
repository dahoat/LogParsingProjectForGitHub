package at.daho.logparsingproject.database.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Neo4jRunner implements ApplicationRunner
{
	private final File databaseDirectory;

	public Neo4jRunner(@Value("database") String databaseDirectory)
	{

		this.databaseDirectory = new File(databaseDirectory);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		System.out.println(new File( databaseDirectory +"/conf/neo4j.conf" ).toURI().toURL());
	}

}
