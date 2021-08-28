package io.codebyexample.autoconfiguration.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author huypva
 */
@ToString
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "my-config")
public class MyConf {

  public int id;
  public String value;

}
