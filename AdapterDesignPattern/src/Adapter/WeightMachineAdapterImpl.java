package Adapter;

import Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
	
	WeightMachine WeightMachine;
	
	public WeightMachineAdapterImpl(WeightMachine WeightMachine) {
		this.WeightMachine = WeightMachine;
	}
	@Override
	public double getWeightInKg() {
		double weightInPound  = WeightMachine.getWeightInPound();
		
		double weightInKg = weightInPound * .45;
		return weightInKg;
	}
}
