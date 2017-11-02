/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author jhony
 */
public class Broker 
{

    private String pruchaseSale;
    private int transFee;

    public Broker() 
    {
    
    }
    
    public void defineFee()
    {
        
    }

    /**
     * @return the pruchaseSale
     */
    public String getPruchaseSale() {
        return pruchaseSale;
    }

    /**
     * @param pruchaseSale the pruchaseSale to set
     */
    public void setPruchaseSale(String pruchaseSale) {
        this.pruchaseSale = pruchaseSale;
    }

    /**
     * @return the transFee
     */
    public int getTransFee() {
        return transFee;
    }

    /**
     * @param transFee the transFee to set
     */
    public void setTransFee(int transFee) {
        this.transFee = transFee;
    }
         
}
