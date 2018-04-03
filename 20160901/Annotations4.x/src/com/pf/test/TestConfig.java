package com.pf.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/pf/test/test-db.properties")
@Profile("test")
public class TestConfig {

}
