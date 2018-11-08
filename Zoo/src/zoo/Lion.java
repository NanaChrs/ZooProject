/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author mathi
 */
public class Lion extends Animal {
    public Lion(){
        
    }
    
    @Override
    public String manger(){
        System.out.println("Le lion a bien mangé du viande.");
        faim = false;
    }
    
    public void talk(){
        System.out.println("Roar!");
    }
    @Override
    public String interact(Location lieu){
        if(faim == true){
            return "Ohh la! Le lion a faim et il essaie de manger des gens!";
            
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Lion. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }

    @Override
    public void talk(String sentence) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
