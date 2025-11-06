package ouss.issib.impl;

public class CompressionConcret extends CompressionTemplate{
    @Override
    protected int[] step1(int[] data) {
        System.out.println("Compression step 1");
        return data;
    }

    @Override
    protected int[] step2(int[] data) {
        System.out.println("Compression step 2");
        return data;
    }
}
