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
public class Éléphant extends Animal{
    
    public Éléphant(){
        sound = "*bruit d'éléphant*";
    }
    
    @Override
    public void eat(){
        System.out.println("Éléphant: J'ai un apitit enorme ! Donnez-moi quelque chose à manger s'il vous plaît. N'importe quoi. \n Mmmm c'est delicieux ! Merci beaucoup !");
        System.out.println("L'éléphant a bien mangé des grandes feuilles.");
        faim = false;
    }
    
    @Override
    public void talk(String s){
        System.out.println("Éléphant: " + sound + s);
    }
    
 /*   @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("L'éléphant a faim. Il a un appétit enorme!");
            this.parle(); 
        }
    }*/
    
    @Override
    public String toString(){
        return "Type d'animal = Éléphant. Nom = " + getName() + ". Sound = " + getSound() + ". Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ". En Colère = " + getEnColère() + ".";
    }
}
