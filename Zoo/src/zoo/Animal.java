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
    String name = "L'animal n'est pas encore un nom. Utilise setName() de lui nommer ";
    String sound;
    
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
     
    protected boolean getEnColère(){
        return encolère;
    }
    
    protected void setEnColère(boolean c){
        encolère = c;
        if(c == true){
            System.out.println("L'animal est en colère.");
        }else{
            System.out.println("L'animal est tranquil.");
        } 
    }
    
    protected String getName(){
        return name;
    }
    
    protected void setName(String n){
        if(name != "L'animal n'est pas encore un nom. Utilise setName() de lui nommer "){
           System.out.println("Maintenant, il s'appelle " + name + ".");
        }
        name = n; 
    }
    
    protected String getSound(){
        return sound;
    }
    
    protected void setSound(String s){
        sound = s;
        System.out.println("Maintenant, il dit " + sound + ".");
    }
    
    public abstract void eat();
  //  public abstract void talk(String sentence);
  //  public abstract String interact(Employee person);
}
