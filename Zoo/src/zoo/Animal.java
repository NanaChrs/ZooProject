/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author storyd
 */
public abstract class Animal implements Talk {
    boolean faim;   
    boolean soif;    
    boolean malade;  //vet has a method that can make animal well again
    boolean dormir;   
    boolean jouer;
    boolean encolère;
    String name = "";
    String sound = "";
    
    /**
     * This method allows a user to get the animal's faim attribute
     * @return faim
     */
    protected boolean getFaim(){
        return faim;
    }
    
    /**
     * This method allows a user to set the animal's faim attribute
     * 
     */
    protected void setFaim(boolean f){
        faim = f;
        if(f == true){
            System.out.println("L'animal a faim.");
        }else{
            System.out.println("L'animal est mangé.");
        }   
    }
    
    /**
     * This method allows a user to get the animal's soif attribute
     * @return soif
     */
    protected boolean getSoif(){
        return soif;
    }
    
    /**
     * This method allows a user to set the animal's soif attribute
     * 
     */
    protected void setSoif(boolean s){
        soif = s;
        if(s == true){
            System.out.println("L'animal a soif.");
        }else{
            System.out.println("L'animal a bu.");
        }   
    }
    
    /**
     * This method allows a user to get the animal's malade attribute
     * @return malade
     */
    protected boolean getMalade(){
        return malade;
    }
    
    /**
     * This method allows a user to set the animal's malade attribute
     * 
     */
    protected void setMalade(boolean m){
        malade = m;
        if(m == true){
            System.out.println("L'animal est malade.");
        }else{
            System.out.println("L'animal est en bien santé.");
        } 
    }
    
    /**
     * This method allows a user to get the animal's dormir attribute
     * @return dormir
     */
    protected boolean getDormir(){
        return dormir;
    }
    
    /**
     * This method allows a user to set the animal's dormir attribute
     * 
     */
    protected void setDormir(boolean d){
        dormir = d;
        if(d == true){
            System.out.println("L'animal dort.");
        }else{
            System.out.println("L'animal est éveillé.");
        } 
    }
    
    /**
     * This method allows a user to get the animal's jouer attribute
     * @return jouer
     */
    protected boolean getJouer(){
        return jouer;
    }
    
    /**
     * This method allows a user to set the animal's jouer attribute
     * 
     */
    protected void setJouer(boolean j){
        jouer = j;
        if(j == true){
            System.out.println("L'animal joue.");
        }else{
            System.out.println("L'animal ne joue pas.");
        } 
    }
     
    /**
     * This method allows a user to get the animal's faim attribute
     * @return encolère
     */
    protected boolean getEnColère(){
        return encolère;
    }
    
    /**
     * This method allows a user to set the animal's encolère attribute
     * 
     */
    protected void setEnColère(boolean c){
        encolère = c;
        if(c == true){
            System.out.println("L'animal est en colère.");
        }else{
            System.out.println("L'animal est tranquil.");
        } 
    }
    
    /**
     * This method allows a user to get the animal's faim attribute
     * @return name
     */
    protected String getName(){
        return name;
    }
    
    /**
     * This method allows a user to set the animal's name attribute
     * @param n the new String that will be set as the animal's name
     */
    protected void setName(String n){
        System.out.println("Maintenant, il s'appelle " + name + ".");
        name = n; 
    }
    
    /**
     * This method allows a user to get the animal's faim attribute
     * @return sound
     */
    protected String getSound(){
        return sound;
    }
    
    /**
     * This method allows a user to set the animal's sound attribute
     * 
     */
    protected void setSound(String s){
        sound = s;
        System.out.println("Maintenant, il dit " + sound + ".");
    }
    
    /**
     * This abstract method allows a user to change the animal's faim attribute
     * from true to false
     * 
     */
    public abstract void eat();

}
