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
        return "Somebody called... a vet ?";
    }
    
    @Override
    public void interact (){
        for (Animal animal: this.lieu.animals){
            if (animal.malade){
                animal.malade=false;
                this.talk("I cured "+animal.name+". It was in a bad aspect.");
                
            }
            if (animal.faim){
                animal.faim=false;
                this.talk("I have fed "+animal.name+". Pfew it only had skin on its bones.");
            }
            if (animal.soif){
                animal.soif=false;
                this.talk("I have given water to"+animal.name+". It was almost becoming dust !");
            }
        }
        this.talk("Once again the super Vet did its job ! Call me when you need me... I'll be... around");
        
    }
    
    @Override
    public void move(Location lieu){
        this.lieu=lieu;
        this.talk(introduceSelf());
    }
    
    @Override
    public void talk(String say){
        System.out.println(this.getClass().getSimpleName()+": "+say+"*wink wink*");
    }
    
}
