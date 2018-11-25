/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *  The vet is as its name indicates the child class from Employee which redefines the interact method interact and move + talk
 * @author mathi
 */
public class Vet extends Employee implements Interactions{

    public Vet(Location lieu) {
        super(lieu);
    }
    
    /**
     * return a string especial for the vet to introduce itself
     * @return 
     */
    public String introduceSelf(){
        return "Somebody called... a vet ?";
    }
    
    /**
     * method that cure all the animals in a location
     */
    @Override
    public void interact (){
        for (Animal animal: this.lieu.animals){
            if (animal.malade){
                animal.malade=false;
                this.talk("I cured "+animal.name+". It was in a bad state.");
                
            }
            if (animal.faim){
                animal.faim=false;
                this.talk("I have fed "+animal.name+". Pfew it only had skin on its bones.");
                animal.eat();
            }
            if (animal.soif){
                animal.soif=false;
                this.talk("I have given "+animal.name+" a drink. Wow ! Such a thirsty animal.");
                
            }
        }
        this.talk("Once again the super Vet did its job ! Call me when you need me... I'll be... around...");
        
    }
    
    /**
     * Method that permits the vet to move and immediately introduce itself
     * @param lieu 
     */
    @Override
    public void move(Location lieu){
        this.lieu=lieu;
        this.talk(introduceSelf());
    }

    /**
     * Method that permits to the vet to speak
     * @param say 
     */
    @Override
    public void talk(String say){
        System.out.println("Super "+ this.getClass().getSimpleName()+": "+say+" *wink wink*");
    }
    
}
