package com.catalin.rosu;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import nl.altindag.console.ConsoleCaptor;

@SpringBootTest
class MerchantSolutionsTechnicalExerciseApplicationTests {
	
	@Autowired
	Application testInstanceApplication;

	@Test
	void contextLoads() {
		
	}
	
	
	@Test
	void compute(){
		ConsoleCaptor consoleCaptor = new ConsoleCaptor();
		testInstanceApplication.handleSignal(1);
		assertThat(consoleCaptor.getStandardOutput()).contains("setAlgoParam 1,60");
		
	}
	
}
