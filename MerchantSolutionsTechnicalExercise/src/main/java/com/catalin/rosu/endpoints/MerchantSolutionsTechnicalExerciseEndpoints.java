package com.catalin.rosu.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.catalin.rosu.Application;

@RestController
public class MerchantSolutionsTechnicalExerciseEndpoints {
	
	@Autowired
	Application app;
	
	@RequestMapping(value = "/app", method = RequestMethod.GET)
	@ResponseBody
	public Integer runApplication(@RequestParam(required=true,defaultValue="1") Integer input){
	
		app.handleSignal(input);
		return input;
	}

}
