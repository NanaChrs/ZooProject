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
public class Poisson extends Animal{
    
    public Poisson(){
        sound = "Glub Blub";
    }
    
    @Override
    public void eat(){
        System.out.println("Le poisson a bien mangé du plancton.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println("Poisson: " + sound + s);
    }
    
 /*   @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le poisson a faim. Je suis heureux qu'il n'est pas un shark!");
            this.parle(); 
        }
    }*/
    
    @Override
    public String toString(){
        return "Type d'animal = Poisson. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ". En Colère = " + getEnColère() + ".";
    }
    
}

