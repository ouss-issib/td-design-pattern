package ouss.issib;

import ouss.issib.context.ImageProcessor;
import ouss.issib.impl.CompressionTemplate;
import ouss.issib.impl.ImplNonStandard;
import ouss.issib.strategy.FilterStrategy;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] image = {1,2,3,4,5};

        System.out.println("Entrez le nom de la classe FilterStrategy à utiliser :");
        String filterClass = sc.nextLine();

        System.out.println("Entrez le nom de la classe CompressionTemplate à utiliser :");
        String compressionClass = sc.nextLine();

        // Chargement dynamique
//        FilterStrategy filter = (FilterStrategy) Class.forName("ouss.issib.impl."+filterClass).newInstance();
        Class<?> c = Class.forName("ouss.issib.impl."+filterClass);
        Constructor<?> cons = c.getConstructor(ImplNonStandard.class);
        FilterStrategy filter = (FilterStrategy) cons.newInstance(new ImplNonStandard());

        CompressionTemplate compression = (CompressionTemplate) Class.forName("ouss.issib.impl."+compressionClass).newInstance();

        ImageProcessor processor = new ImageProcessor(filter, compression);

        System.out.println("=== Filtrage ===");
        processor.filter(image);

        System.out.println("=== Compression ===");
        processor.compresser(image);
    }
}