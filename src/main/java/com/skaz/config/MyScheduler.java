package com.skaz.config;

import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(final DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Scheduled(fixedRate = 86400000)
	public void doSomething() {
		jdbcTemplate.execute("TRUNCATE TABLE post_ipaddress;");
		jdbcTemplate.execute("ALTER TABLE post_ipaddress AUTO_INCREMENT = 1");
		System.out.println("Table Cleared for "+LocalDateTime.now());
	}
}