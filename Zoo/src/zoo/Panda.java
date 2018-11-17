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
public class Panda extends Animal{
    
    public Panda(){
        sound = "*bruit de panda*";
    }
        
    @Override
    public void eat(){
        System.out.println("Le panda a bien mangé du bambou.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println("Panda: " + sound + s);
    }
    
   /* @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le panda a faim, mais il reste toujours mignant!");
            this.parle(); 
        }
    }*/
    
    @Override
    public String toString(){
        return "Type d'animal = Panda. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ". En Colère = " + getEnColère() + ".";
    }
}
