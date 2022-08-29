package at.daho.logparsingproject.logparser.runner;

import at.daho.logparsingproject.logparser.processor.PostfixConnectionLogProcessor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("import")
public class PostfixImportRunner implements CommandLineRunner {
	private final PostfixConnectionLogProcessor postfixConnectionLogProcessor;

	public PostfixImportRunner(PostfixConnectionLogProcessor postfixConnectionLogProcessor)
	{
		this.postfixConnectionLogProcessor = postfixConnectionLogProcessor;
	}

	@Override
	public void run(String... args)
	{
		//String logFileName = "logfiles/mail.log";
		String logFileName = "logfiles/mail_big.log";
		//String logFileName = "logfiles/mail_short.log";
		//postfixConnectionLogProcessor.process(logFileName);
		// postfixConnectionLogProcessor.process(logFileName, PostfixConnectionLogProcessor.TIMELINE_MODEL);
		postfixConnectionLogProcessor.process(logFileName, PostfixConnectionLogProcessor.HIERARCHICAL_MODEL);

	}
}
