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
public class Lion extends Animal {
    public Lion(){
        sound = "Roar!";
    }
    
    @Override
    public void eat(){
        System.out.println("Le lion a bien mangé du viande.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println("Lion: " + sound + s);
    }
    
 /*   @Override
    public String interact(){
        if(faim == true){
            return "Je suis un faim lion et je vais essaie de manger des gens si personne ne me donne pas du viande vitement!";
            
        }
    }*/
    
    @Override
    public String toString(){
        return "Type d'animal = Lion. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ". En Colère = " + getEnColère() + ".";
    }

    
}
