package com.mycompany.td2bisproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vincent.vidal
 */
public class EntierContraint {
    public EntierContraint(int min, int max, int val){
        if(min<=max){
            this.min=min;
            this.max=max;
        }
        else
        {
            System.out.println("valeurs min et max inversées!");
            this.max=min;
            this.min=max;
        }
        if(val < this.min){
            System.out.println("valeur mis à la borne min");
            this.val=this.min;
        }
        else if(val > this.max){
            System.out.println("valeur mis à la borne max");
            this.val = this.max;
        }
        else
            this.val = val;
    }
    
    public EntierContraint(int min, int max){
        //this(min, max, min);
        if(min<=max){
            this.min=min;
            this.max=max;
        }
        else
        {
            System.out.println("valeurs min et max inversées!");
            this.max=min;
            this.min=max;
        }
        this.val = this.min; 
    }
    
    public void affiche()
    {
        System.out.println(val + " dans ["+this.min+","+this.max+"]");
    }
    
    public void saisir()
    {
        int val_s;
        do{
            System.out.println("Saisir une valeur dans ["+this.min+","+this.max+"]: ");
            val_s=Clavier.lireInt();
        }while(val_s<this.min || val_s>this.max);
        
        this.val=val_s;
    }
    
    public int incr(int i){/// post-incrémentation
        int tmp = this.val;
        if(this.val+i>this.max)
            this.val = this.max;
        else
             if(this.val+i<this.min)
                 this.val=this.min;
             else
                 this.val = this.val + i;
        
        return tmp;     
    }
    
    public int getVal() { return val; }
    public int getMin() { return min; }
    public int getMax() { return max; }
    
    public void setVal(int newVal) { 
        if(newVal>=min && newVal<=max) 
            val = newVal; 
        else
            System.out.println("Valeur "+newVal+ " pas dans l'intervalle ["+min+";"+max+"]");}
    
    private final int min, max;
    private int val;
}
