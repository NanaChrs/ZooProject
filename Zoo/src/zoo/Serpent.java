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
public class Serpent extends Animal{
    
    public Serpent(){
        sound = "Hissssssss";
    }
    
    @Override
    public void eat(){
        System.out.println("Le serpent a bien mangé un rat.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println("Serpent: " + sound + s);
    }
    
  /*  @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le serpent a faim! J'ai peur de lui.");
            this.parle(); 
        }
    }*/
    
    @Override
    public String toString(){
        return "Type d'animal = Serpent. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
    
}
