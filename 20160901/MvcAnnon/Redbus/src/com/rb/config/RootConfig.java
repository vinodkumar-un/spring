package com.rb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(PersistenceConfig.class)
@EnableTransactionManagement(proxyTargetClass = true)
@ComponentScan(basePackages = { "com.rb.dao", "com.rb.service" })
public class RootConfig {

}
