
package com.mycompany.calculadora;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el num1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el num2: "));
        
        Operaciones op=new Operaciones();
        op.suma(n1,n2);
        op.resta(n1,n2);
        op.multiplicacion(n1,n2);
        op.division(n1,n2);
        op.mostrarresultado();
    }
}
