package org.avi.adapterPattern;

import org.avi.adapterPattern.adaptee.WeightMachineImpl;
import org.avi.adapterPattern.adapter.WeightMachineAdapterImpl;
import org.avi.adapterPattern.adapter.WeightMachineApdapter;

public class Main {
    public static void main(String[] args) {
        WeightMachineApdapter weightMachineApdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(weightMachineApdapter.getWeightInKgs());
    }
}
