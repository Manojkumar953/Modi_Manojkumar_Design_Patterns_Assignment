package com.epam.DesignPatterns.DesignPatterns.BridgePattern;
abstract class TV {
	  Remote remote;
	  
	  TV(Remote r) {
	    this.remote = r;
	  }
	  
	  abstract void on();
	  abstract void off();
	  abstract void volumeUp();
	  abstract void volumeDown();
	}
