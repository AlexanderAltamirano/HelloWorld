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
public class PurchaseShare 
{

    private int dateTime;
    private int sharePriceOffer;
    private int transFee;

    public PurchaseShare() {
    }
    
    /**
     * @return the dateTime
     */
    public int getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return the sharePriceOffer
     */
    public int getSharePriceOffer() {
        return sharePriceOffer;
    }

    /**
     * @param sharePriceOffer the sharePriceOffer to set
     */
    public void setSharePriceOffer(int sharePriceOffer) {
        this.sharePriceOffer = sharePriceOffer;
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
