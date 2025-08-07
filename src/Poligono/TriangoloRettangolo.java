package Poligono;

public class TriangoloRettangolo implements Poligono{

    private int cateto1;
    private int cateto2;
    private int ipotenusa;
    private int area;
    private int perimetro;

   public TriangoloRettangolo(int cateto1, int cateto2, int ipotenusa){
    this.cateto1 = cateto1;
    this.cateto2 = cateto2;
    this.ipotenusa = ipotenusa;  
   }

   public int calcolaArea(){
    area = cateto1*cateto2/2;
    return area;
   }

   public int calcolaPerimetro(){
    perimetro = cateto1+cateto2+ipotenusa;
    return area;
   }

    public int getArea() {
        return area;
    }

   public int getPerimetro(){
    return perimetro;
   }
}
