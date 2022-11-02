/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Price {
    private String priceNumber;

    public Price() {
    }

    public String getPriceNumber() {
        return priceNumber;
    }

    public void setPriceNumber(String pricenumber) {
        this.priceNumber = priceNumber;
    }
    
    @Override
    public String toString() {
        return "Price{" + "priceNumber=" + priceNumber +'}';
    }
    
    
}
