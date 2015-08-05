package sumas;

import javax.swing.JOptionPane;
public class Sumas {

public static void main(String[] args) {
// Definicion de variables del programa.
// Programacion Orientada a Objetos FI
    
    
int num1 = 5 , num2 = 3 , resta;
double dato1 = 2, dato2 = 3;
double suma, multiplicacion, division, x,y,h;

double Raíz1,Raíz2 ;
suma = dato1 + dato2;
System.out.println("suma  " + suma);


resta  = num1 - num2;
System.out.println("resta: "+resta);

multiplicacion = num1 * num2;
System.out.println("Multiplicacion: "+multiplicacion);


Raíz1 = Math.sqrt(dato1);
Raíz2 = Math.sqrt(dato2);
/*-------------------------------*/
System.out.println("La raíz de 2 es "+Raíz1);
System.out.println("La raíz de 3 es "+Raíz2);
/*-------------------------------*/

division = dato1 / dato2;

System.out.println("la division de datos 1 & 2 es = "+ division);

/*-------Hipotenusa----------*/
x = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Cateto x:","triangulo",1));

y = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Cateto y:","triangulo",1));

h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

JOptionPane.showMessageDialog(null, "Cateto X="+x+"\nCateto Y="+y+"\nHipotenusa="+h);
/*-------Hipotenusa----------*/

System.out.println("La hipotenusa es "+h);
    }
    
}
