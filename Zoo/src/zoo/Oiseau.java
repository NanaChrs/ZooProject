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
public class Oiseau extends Animal{
    
    public Oiseau(){
        sound = "*Chirp! Chirp! Chirp!*";
    }
    
     @Override
    public void eat(){
        System.out.println("Le oiseau a bien mangé des graines.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println(this.getClass().getSimpleName()+"("+this.name+"): "+s+ sound);
    }
    
   /* @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le oiseau a faim. Jetez des graines pour lui.");
            this.parle(); 
        }
    }*/
    
    @Override
    public String toString(){
        return "Type d'animal = Oiseau. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ". En Colère = " + getEnColère() + ".";
    }
}
