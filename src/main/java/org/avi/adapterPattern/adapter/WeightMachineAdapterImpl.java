package org.avi.adapterPattern.adapter;

import org.avi.adapterPattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineApdapter {

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKgs() {
        return weightMachine.getWeightInPounds() * 0.45;
    }
}
