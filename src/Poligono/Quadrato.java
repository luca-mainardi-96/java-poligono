package Poligono;

public class Quadrato implements Poligono {

private int lato;
private int area;
private int perimetro;

public Quadrato(int lato){
    this.lato = lato;
}

public int calcolaArea(){
    area = lato * lato;
    return area;
}

public int calcolaPerimetro(){
    perimetro = lato * 4;
    return perimetro;
}

public int getArea() {
    return area;
}

public int getPerimetro(){
    return perimetro;
}

}
