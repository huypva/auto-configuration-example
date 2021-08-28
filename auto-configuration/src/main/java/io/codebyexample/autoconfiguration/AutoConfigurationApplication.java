package io.codebyexample.autoconfiguration;

import io.codebyexample.autoconfiguration.configuration.MyConf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

/**
 * @author huypva
 */
@Slf4j
@SpringBootApplication
public class AutoConfigurationApplication {

	@Autowired
	MyConf myConf;

	@EventListener(ApplicationReadyEvent.class)
	protected void readyProcess() {
		System.out.println("Id: " + myConf.getId());
		System.out.println("Value: " + myConf.getValue());
	}

	public static void main(String[] args) {
		SpringApplication.run(AutoConfigurationApplication.class, args);
	}

}
