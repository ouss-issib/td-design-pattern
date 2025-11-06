package ouss.issib.impl;

import ouss.issib.strategy.FilterStrategy;

public class DefaultFilter implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Default Filter applied .");
        return data;
    }
}
