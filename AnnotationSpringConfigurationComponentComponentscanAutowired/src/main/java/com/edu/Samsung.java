package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	MobileProcessor mcpu;

	
	public MobileProcessor getMcpu() {
		return mcpu;
	}



	public void setMcpu(MobileProcessor mcpu) {
		this.mcpu = mcpu;
	}



	public void phConfig() {
		System.out.println("128 mp Camera, 64 mb RAM ,Dual core");
		mcpu.processor();
	}

}


