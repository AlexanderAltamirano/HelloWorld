/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.analyzer;

import ec.edu.espe.model.Analyst;
import ec.edu.espe.model.History;

/**
 *
 * @author LABS-DECC
 */
public class Comparer 
{
    public static void main(String[] args) 
    {
        Analyst analyst = new Analyst("Jonathan","nuevo analyst",new History());
        System.out.println(analyst.getName());
    }
}
