
package com.mycompany.calculadora;

public class Operaciones {
    int resta;
    int multiplicacion;
    int division;
    int suma;
    
    public void suma  (int numero1, int numero2) {
        suma=numero1 + numero2;
    }
    
    public void resta  (int numero1, int numero2) {
        resta=numero1 - numero2;
    }
    
    public void multiplicacion  (int numero1, int numero2) {
        multiplicacion=numero1 * numero2;
    }
        
    public void division  (int numero1, int numero2) {
        division=numero1 / numero2;
    }
    
    public void mostrarresultado() {
        System.out.println("la suma es"+suma);
        System.out.println("la resta es"+resta);
        System.out.println("la multiplicacion es"+multiplicacion);
        System.out.println("la division es"+division);
    }
}
