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
public class Company 
{
    private String symbol;
    private int valueCompany;
    private int shareQuantity;
    Share[] sharePriceCompany;

    public Company(String symbol, int valueCompany, int shareQuantity, Share[] sharePriceCompany) {
        this.symbol = symbol;
        this.valueCompany = valueCompany;
        this.shareQuantity = shareQuantity;
        this.sharePriceCompany = sharePriceCompany;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValueCompany() {
        return valueCompany;
    }

    public void setValueCompany(int valueCompany) {
        this.valueCompany = valueCompany;
    }

    public int getShareQuantity() {
        return shareQuantity;
    }

    public void setShareQuantity(int shareQuantity) {
        this.shareQuantity = shareQuantity;
    }

    public Share[] getSharePriceCompany() {
        return sharePriceCompany;
    }

    public void setSharePriceCompany(Share[] sharePriceCompany) {
        this.sharePriceCompany = sharePriceCompany;
    }
        
}
