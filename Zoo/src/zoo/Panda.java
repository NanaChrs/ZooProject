
package zoo;

import java.util.Random;

/**
 *
 * @author storyd
 */
public class Panda extends Animal{
    
    /**
     * This constructor initializes the following attributes randomly:
     * faim, soif, malade, jouer, encolère, malade
     * This allows each experience with the program to be unique.
     * 
     * @param n the String for the animal's name attribute
     * 
     * However, it would not make sense for an animal to be either playing or
     * angry while it is sleeping. To make this zoo more interactive (one
     * where not few animals are sleeping) after the attributes are assigned,
     * if both the jouer and encolère attribute are false, the dormir attribute
     * is randomly assigned to true or false. In the case that either jouer 
     * or encolère is true, dormir is automatically assigned to false.
     * 
     * Finally, the sound attribute is unique to this animal.
     */
    public Panda(String n){
        name = n;
        Random random = new Random();
        /*faim = random.nextBoolean();   
        soif = random.nextBoolean();    
        malade = random.nextBoolean(); */
        jouer = random.nextBoolean();
        angry = random.nextBoolean();
        //malade = random.nextBoolean();
        if(jouer == false && angry == false)
            dormir = random.nextBoolean();
        else
            dormir = false;
        sound = "*panda noise*";
    }
       
    /**
     * This method allows a user to change the animal's faim attribute
     * from true to false
     * 
     */
    @Override
    public void eat(){
        System.out.println("Le panda a bien mangé du bambou.");
        faim = false;
    }
    
    /**
     * This method allows the animal to speak by printing out the type of animal, it's name, and a given String
     * @param s the String the animal will say
     * 
     */
    @Override
    public void talk(String s){
        System.out.println(this.getClass().getSimpleName()+"("+this.name+"): "+s+ sound);
    }
    
    /**
     * This method displays all of the animal's attributes
     * @return Class, name, sound, faim, soif, malade, dormir, jouer, and encolère,
     */
    @Override
    public String toString(){
        return "Type of animal = "+this.getClass().getSimpleName()+" Name = " + getName() + ". Sound = " + getSound() + ". Hungry = " + getFaim() + ". Thirsty = " + getSoif() + ". Sick = " + getMalade() + ". Sleeping = " + getDormir() + ". Playing = " + getJouer() + ". Angry = " + getEnColère() + ".";
    }
}
