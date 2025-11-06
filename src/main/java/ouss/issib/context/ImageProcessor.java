package ouss.issib.context;

import ouss.issib.impl.CompressionTemplate;
import ouss.issib.strategy.FilterStrategy;

public class ImageProcessor {

    private FilterStrategy filterStrategy;
    private CompressionTemplate compressionAlgorithm;

    public ImageProcessor(FilterStrategy strategy, CompressionTemplate compression) {
        this.filterStrategy = strategy;
        this.compressionAlgorithm = compression;
    }

    public void setFilterStrategy(FilterStrategy strategy) {
        this.filterStrategy = strategy;
    }

    public int[] filter(int[] data) {
        return filterStrategy.filter(data);
    }

    public int[] compresser(int[] data) {
        return compressionAlgorithm.compresser(data);
    }
}
