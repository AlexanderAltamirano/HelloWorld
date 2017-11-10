/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;
import ec.edu.espe.arreglos.modelo.Animal;//control +shit+i importar librerias


/**
 *
 * @author LABS-DECC
 */
public class TestingAnimals {
    
    public static void main(String[] args) 
    {
        
        Animal[] animal = new Animal[10];
        
        for(int i=0;i<10;i++)
        {
            if((i+1%2)==0)
             animal[i]= new Animal(i+1,"Black eyes","lucy "+(i+1));
            else
             animal[i]= new Animal(i+1,"Brown eyes","lucy "+(i+1));
        }
 
        
        for(int j=0;j<10;j++)
        {
            System.out.println("El nombre de la gallina es: "+ animal[j].getName());
            System.out.println("El Id de la gallina es: "+ animal[j].getId());
            System.out.println("El color de ojos de la gallina es: "+ animal[j].getAges());
        }         
    }
}
