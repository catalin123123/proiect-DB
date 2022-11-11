package com.catalin.rosu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* This is your teams code and should be changed as you see fit.
*/
@Component
public class Application implements SignalHandler {
	
	@Autowired
	Algo algo;
	
    public void handleSignal(int signal) {

        switch (signal) {
            case 1:
                algo.setUp();
                algo.setAlgoParam(1,60);
                algo.performCalc();
                algo.submitToMarket();
                break;

            case 2:
                algo.reverse();
                algo.setAlgoParam(1,80);
                algo.submitToMarket();
                break;

            case 3:
                algo.setAlgoParam(1,90);
                algo.setAlgoParam(2,15);
                algo.performCalc();
                algo.submitToMarket();
                break;

            default:
                algo.cancelTrades();
                break;
        }

        algo.doAlgo();
    }
}