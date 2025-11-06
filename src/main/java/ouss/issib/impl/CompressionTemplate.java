package ouss.issib.impl;

public abstract class CompressionTemplate {
    public final int[] compresser(int[] data) {
        data = step1(data);
        data = step2(data);
        return data;
    }

    protected abstract int[] step1(int[] data);
    protected abstract int[] step2(int[] data);
}
