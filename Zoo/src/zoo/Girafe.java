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
public class Girafe extends Animal{
    
    public Girafe(){
        sound = "*bruit de girafe*";
    }
    
    @Override
    public void eat(){
        System.out.println("Le girafe a bien mangé des feuilles au haut de l'arbre.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println("Girafe: " + sound + s);
    }
    
 /*   @Override
    public void interact(){ 
        String s = "Je suis content, merci !";
        if(getFaim() == true){
            s += "J'ai faim."; 
        }else{
            s += "Je n'ai pas faim."; 
        }
        if(getSoif() == true){
            s += "J'ai soif."; 
        }else{
            s += "Je n'ai pas soif."; 
        }
        if(getMalade() != true){
            s += "Je ne suis pas malade.";
        }else{
            s += "Je suis malade. Aide-moi !";
        }
        if(getDormir() == true){
            s += "Shhhh ! Je dors."; 
        }else{
            s += "Je ne dors pas."; 
        }
        if(getJouer() == true){
            s += "Je joue.";
        }else{
            s += "Je ne joue pas.";
        }
        talk("Je suis un girafe et " + s);
    }
*/    
    @Override
    public String toString(){
        return "Type d'animal = Girafe. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
    
}

