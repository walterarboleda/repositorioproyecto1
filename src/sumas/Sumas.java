package sumas;

public class Sumas {

public static void main(String[] args) {
// Definicion de variables del programa.
// Programacion Orientada a Objetos FI
    
    
int num1 = 5 , num2 = 3 , resta;
double dato1 = 2, dato2 = 3;
double suma, multiplicacion, division;

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


    }
    
}
