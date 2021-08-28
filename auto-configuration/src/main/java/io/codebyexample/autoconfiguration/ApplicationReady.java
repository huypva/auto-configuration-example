package io.codebyexample.autoconfiguration;

import io.codebyexample.autoconfiguration.configuration.MyConf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Slf4j
@Component
public class ApplicationReady {

  @Autowired
  MyConf myConf;

  @EventListener(ApplicationReadyEvent.class)
  protected void readyProcess() {
    log.info("ApplicationReady readyProcess: " + myConf.toString());
  }
}
