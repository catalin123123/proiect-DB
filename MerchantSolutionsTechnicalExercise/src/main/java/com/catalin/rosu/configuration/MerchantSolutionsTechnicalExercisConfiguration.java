package com.catalin.rosu.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.catalin.rosu.Algo;

@Configuration
public class MerchantSolutionsTechnicalExercisConfiguration {

	@Bean
	public Algo createAlgo() {
		return new Algo();
		
	}
}
