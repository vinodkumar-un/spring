package com.ip.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({ @PropertySource("classpath:com/ip/test/players.properties") })
@Import({ PlayerConfig.class })
@ComponentScan("com.ip.test")
public class RootAppConfig {

}
