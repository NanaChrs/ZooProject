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
public class Zèbra extends Animal{
    
    public Zèbra(){
        sound = "*bruit de zèbra*";
    }
    
    @Override
    public void eat(){
        System.out.println("Le zèbra a bien mangé des herbes.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println("Zébra: " + sound + s);
    }
    
  /*  @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le zébra a faim.");
            this.parle(); 
        }
    }*/
    
    @Override
    public String toString(){
        return "Type d'animal = Zèbra. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ". En Colère = " + getEnColère() + ".";
    }
}
