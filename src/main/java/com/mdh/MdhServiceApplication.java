package com.mdh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author madonghao
 */
@SpringBootApplication
@EnableScheduling
@EnableCaching
public class MdhServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdhServiceApplication.class, args);
	}
}
