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
public abstract class People implements Organism {
    protected String name;
    

    public People(String name) {
        this.name = name;
        
    }
    
    public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }
    
    @Override
    public void talk(String say){
        System.out.println(this.name+": "+say+".");
    }
    
    public abstract String introduceSelf();
    /*public void move(String lieu){
        String lieuActuel=lieu;
        System.out.println("Je suis dans :"+lieuActuel);
        
    }*/
    
    
}
