/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Alain Unico
 */


public class HomeItem implements Serializable {
    
    private String item;
    private int price;
    
    public HomeItem(){
        
    }
    
    public HomeItem(String item, int price){
        this.item = item;
        this.price = price;
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


