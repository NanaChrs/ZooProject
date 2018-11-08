/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author mathi
 */
public abstract class Animal implements Talk {
    boolean faim;   //implement in subclass to get name of class 
    boolean soif;    
    boolean malade;  //vet has a method that can make animal well again
    boolean dormir;   
    boolean jouer;
    
    protected boolean getFaim(){
        return faim;
    }
    
    protected void setFaim(boolean f){
        faim = f;
        if(f == true){
            System.out.println("L'animal a faim.");
        }else{
            System.out.println("L'animal est mangé.");
        }   
    }
    
    protected boolean getSoif(){
        return soif;
    }
    
    protected void setSoif(boolean s){
        soif = s;
        if(s == true){
            System.out.println("L'animal a soif.");
        }else{
            System.out.println("L'animal a bu.");
        }   
    }
    
    protected boolean getMalade(){
        return malade;
    }
    
    protected void setMalade(boolean m){
        malade = m;
        if(m == true){
            System.out.println("L'animal est malade.");
        }else{
            System.out.println("L'animal est en bien santé.");
        } 
    }
    
    protected boolean getDormir(){
        return dormir;
    }
    
    protected void setDormir(boolean d){
        dormir = d;
        if(d == true){
            System.out.println("L'animal dort.");
        }else{
            System.out.println("L'animal est éveillé.");
        } 
    }
    
     protected boolean getJouer(){
        return jouer;
    }
    
    protected void setJouer(boolean j){
        jouer = j;
        if(j == true){
            System.out.println("L'animal joue.");
        }else{
            System.out.println("L'animal ne joue pas.");
        } 
    }
    
    public abstract String manger();
    public abstract void talk(String sentence);
    public abstract String interact(Location lieu);
}
