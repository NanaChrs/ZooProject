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
public class Vet extends People implements Organism{
    Animal animal;

    public Vet(Animal animal, String name) {
        super(name);
        this.animal = animal;
    }
    
    
    
    public String introduceSelf(){
        return "Je suis le vétérinaire. Je m'occupe de "+this.animal.name;
    }
    
    @Override
    public String interact (Location lieu){
        if (this.animal.malade){
            this.soigner();
        }
        if (this.animal.faim){
            this.nourrir();
        }
    }
    
    public String soigner (){
        
    }
    
    public String nourrir (){
        
    }
}
