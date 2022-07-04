/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Alain Unico
 */


public class HomeItem implements Serializable {
    
    private String category;
    private String item;
    private int price;
    
    public HomeItem(){
        
    }
    
    public HomeItem(String category, String item, int price){
        this.category = category;
        this.item = item;
        this.price = price;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public String getItem(){
        return item;
    }
    
    public void setItem(String item){
        this.item = item;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }

}


