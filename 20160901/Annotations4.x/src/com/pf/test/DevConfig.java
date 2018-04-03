package com.pf.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/pf/test/dev-db.properties")
@Profile("dev")
public class DevConfig {

}
