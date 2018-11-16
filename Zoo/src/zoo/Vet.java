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
public class Vet extends People implements Talk, Interactions{

    public Vet(Location lieu) {
        super(lieu);
    }
    
    public String introduceSelf(){
        return "Je suis le vétérinaire. Je m'occupe de des animaux du zoo";
    }
    

    public void soingerNourrir (){
        int i=0;
        int j=0;
        for (Animal animal: this.lieu.animals){
            if (animal.malade){
                animal.malade=false;
                this.talk("J'ai soigné le"+animal.getClass());
                i++;
            }
            if (animal.faim){
                animal.faim=false;
                this.talk("J'ai donné à manger au"+animal.getClass());
            }
        }
        if (i==0 && j==0){
            this.talk("AH! On dirait bien qu'on a pas besoin de moi ici. Je me ferais bien une petite pause moi...");
        }
    }
    
    @Override
    public void move(Location lieu){
        this.lieu=lieu;
    }
    
}
