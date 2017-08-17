package es.david.strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal implements CommandLineRunner
{
	private static Logger log = LoggerFactory.getLogger(Principal.class);

	public static void main(String[] args)
	{
		SpringApplication.run(Principal.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		log.info("INI Principal");
		
		// mvn spring-boot:run
		System.out.println("Hola Spring");

	}

}
