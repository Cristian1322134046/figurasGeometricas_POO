package figurasGeometricas;

/*

CRISTIAN DANIEL ALVAREZ CERVANTES
GRUPO : 1223IS

*/
public class figuras {
    
    public double lado1;
    public double lado2;
    public double lado3;
    public double radio;
    public double result;
    public double area;
    public double perimetro;

    public figuras(double lado1, double lado2, double lado3, double radio, double result, double area, double perimetro) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.radio = radio;
        this.result = result;
        this.area = area;
        this.perimetro = perimetro;
    }

    public figuras() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    
    
    
}
