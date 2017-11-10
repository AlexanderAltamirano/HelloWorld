/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;

import ec.edu.espe.arreglos.modelo.DotaHeroe;

/**
 *
 * @author jhony
 */
public class TestingDota 
{
    public static void main(String[] args) 
    {
        
        DotaHeroe[] Doto = new DotaHeroe[10];
        
        for(int i=0;i<10;i++)
        {
            if((i+1%2)==0)
             Doto[i]= new DotaHeroe(i+1,"Easy","Void "+(i+1));
            else
             Doto[i]= new DotaHeroe(i+1,"Medium","Void "+(i+1));
        }
 
        
        for(int j=0;j<10;j++)
        {
            System.out.println("El nombre del Heroe es: "+ Doto[j].getName());
            System.out.println("El Id del Heroe es: "+ Doto[j].getId());
            System.out.println("La dificultad del Heroe es: "+ Doto[j].getDifficulty());
        } 
    }
    
    
}
