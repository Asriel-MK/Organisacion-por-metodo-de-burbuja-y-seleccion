package actividad11_12;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
/*
Made by:
Fernando Núñez Bejarano 2758861
*/
public class Actividad11_12 {

    public static void main(String[] args) {
//-----------------------------------------------------------------------------------
        Random random = new Random();
        int[] numeros = random.ints(10000, 10,10000).toArray();
//-----------------------------------------------------------------------------------
        int contador = 0;
        int contador2 = 0;
        System.out.println("LISTA SIN ORGANIZAR");
        System.out.println("-------------------------------------------------------------------------------------------");
        while(contador <= 1000){
            System.out.print(numeros[contador] + ", ");
            if(contador2 == 20){
                System.out.println("");
                contador2 = 0;
            }
            contador2++;
            contador++;
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
//-----------------------------------------------------------------------------------     
        int coordenada1 = 0, coordenada2 = 1;
        int contadorext = 1000;
        while(contadorext != 0){
            
        while(contador <= 999){
            if(numeros[coordenada1] > numeros[coordenada2]){
                int num1 = numeros[coordenada1];
                int num2 = numeros[coordenada2];
                numeros[coordenada1] = num2;
                numeros[coordenada2] = num1;
            }
            coordenada1++;
            coordenada2++;
            contador++;
        }
        contadorext--;
        coordenada1 = 0;
        coordenada2 = 1;
        contador = 0;
        }

//-----------------------------------------------------------------------------------
System.out.println("");

        contador = 0;
        contador2 = 0;
        System.out.println("LISTA ORGANIZADA POR METODO DE BURBUJA");
        System.out.println("-------------------------------------------------------------------------------------------");
        while(contador <= 1000){
            System.out.print(numeros[contador] + ", ");
            if(contador2 == 20){
                System.out.println("");
                contador2 = 0;
            }
            contador2++;
            contador++;
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
//-----------------------------------------------------------------------------------
        int[] numeros2 = random.ints(10000, 10,10000).toArray();
//-----------------------------------------------------------------------------------
System.out.println("");
        contador = 0;
        contador2 = 0;
        System.out.println("SEGUNDA LISTA SIN ORGANIZAR");
        System.out.println("-------------------------------------------------------------------------------------------");
        while(contador <= 1000){
            System.out.print(numeros2[contador] + ", ");
            if(contador2 == 20){
                System.out.println("");
                contador2 = 0;
            }
            contador2++;
            contador++;
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
//-----------------------------------------------------------------------------------
        coordenada1 = 0;
        coordenada2 = 1;
        contador = 0;
        contadorext = 1001;
        while(contadorext != 0){
        while(contador <= 999){
            if(numeros2[coordenada1] <= numeros2[coordenada2]){
                int num1 = numeros2[coordenada1];
                int num2 = numeros2[coordenada2];
                numeros2[coordenada1] = num2;
                numeros2[coordenada2] = num1;
            }
            coordenada2++;
            contador++;
        }
        coordenada1++;
        coordenada2 = 0;
        contador = 0;
        contadorext--;
        }
//-----------------------------------------------------------------------------------
System.out.println("");

        contador = 0;
        contador2 = 0;
        System.out.println("SEGUDNA LISTA ORGANIZADA POR METODO DE SELECCIÓN");
        System.out.println("-------------------------------------------------------------------------------------------");
        while(contador <= 1000){
            System.out.print(numeros2[contador] + ", ");
            if(contador2 == 20){
                System.out.println("");
                contador2 = 0;
            }
            contador2++;
            contador++;
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

}
