package ouss.issib.impl;

import ouss.issib.strategy.FilterStrategy;

public class ImplNonStandardAdapter implements FilterStrategy {
    private ImplNonStandard adaptee;

    public ImplNonStandardAdapter(ImplNonStandard adaptee) {
        this.adaptee = new ImplNonStandard();
    }

    @Override
    public int[] filter(int[] data) {
        return adaptee.appliquerFiltre("FiltreAdapté", data);
    }
}

