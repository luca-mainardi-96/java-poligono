package Poligono;

public class Main {

    public static void main(String[] args) {
        
        Poligono p1 = new Quadrato(150);
        p1.calcolaArea();
        p1.calcolaPerimetro();
        Poligono p2 = new TriangoloRettangolo(125, 117,212);
        p2.calcolaArea();
        p2.calcolaPerimetro();

        System.out.println("L'area è: " + p1.getArea());
        System.out.println("Il perimetro è: " + p1.getPerimetro());
        System.out.println("\n\n\nL'area è: " + p2.getArea());
        System.out.println("Il perimetro è: " + p2.getPerimetro());

    }

}