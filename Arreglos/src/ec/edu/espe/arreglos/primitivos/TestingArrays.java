/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.primitivos;

/**
 *
 * @author LABS-DECC
 */
public class TestingArrays 
{

    public static void main(String[] args) 
    {
        int[] enteros = new int[10];
        float[] flotante = new float[5];
        int[] otrosEnteros = {8,11,2017};

        for (int i = 0; i < enteros.length; i++) 
        {
            enteros[i] = i + 1;
        }
        for (int j = 0; j < flotante.length; j++) 
        {
            flotante[j]= 1+(float)(j+1)/10;
        }
         for (int entero:enteros) 
        {
            System.out.print(entero+",");
        }
        System.out.println("");
        for (float flotanten:flotante) 
        {
             System.out.print(flotanten+",");
        }
        System.out.println(""); 
        for (int anotherint:otrosEnteros)
        {
             System.out.print(anotherint+ ",");
        }

    }

}
