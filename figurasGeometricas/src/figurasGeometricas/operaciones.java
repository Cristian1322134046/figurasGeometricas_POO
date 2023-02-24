package figurasGeometricas;
public class operaciones {
    
    public double result;
    public double tipo;
    public double pi = 3.14;
    
    //Calculo de areas
    public void areaCirculo(double radio){
        result = pi * (radio * radio);
    }
    
    public void areaCuadrado(double lad){
        result = lad * lad;
    }
    
    public void areaTriangulo(double base, double high){
        result = (base * high) / 2;
    }
    
    public void areaRectangulo(double base1, double high2){
        result = base1 * high2;
    }
    
    //calculo perimetros
    public void perimetroCirculo(double radio){
        result = pi * radio * 2;
    }
    
    public void perimetroCuadrado(double lad){
        result = lad * 4;
    }
    
    public void perimetroTriangulo(double lad1, double lad2, double lad3){
        result = lad1 + lad2 + lad3;
    }
    
    public void perimetroRectangulo(double base, double altura){
        result = (2 * base) + (2 * altura);
    }
    
    //Determinar tipo de triangulo
    public void trianguloTipo(double ld1, double ld2, double ld3){
        if (ld1 > ld2 && ld1 > ld3) {
            if(ld2 > ld3 || ld3 > ld2){
                tipo = 2.0;
            }
        }
            
        if (ld2 > ld3 && ld2 > ld1){
            if(ld1 > ld3 || ld3 > ld1){
                tipo = 2.0;
            }
        }
            
        if (ld3 > ld2 && ld3 > ld1) {
            if (ld2 > ld1 || ld1 > ld2) {
                tipo = 2.0;
            }
        }else if(ld1 == ld2 && ld1 == ld3){
            tipo = 3.0;
        }else{
            tipo = 1.0;
        }
    }
    
    //Calcular hipotenusa
    public void hipotenusa(double ca, double co){
        result = Math.sqrt(((ca * ca) + (co * co)));
    }
    
}
