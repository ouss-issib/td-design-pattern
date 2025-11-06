package ouss.issib.impl;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Ancien filtre utilisé : " + filterName);
        return data;
    }
}
