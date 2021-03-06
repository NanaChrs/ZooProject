/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mathi
 */
public class Location {
        //attributes
    protected Position position; //corresponds to Location Enum
    //protected boolean broken; //0 = false, 1 = true
    protected ArrayList<Animal> animals = new ArrayList<Animal>();

    public Location(Position position) {
        this.position = position;
        //this.broken = broken;
    }
 
    public boolean isSomeoneSick(){
        for (Animal animal : animals){
            if (animal.malade){
                return true;
            }
        }
        return false;
    }
    
    public boolean isSomeoneHungryOrThirsty(){
        for (Animal animal : animals){
            if (animal.faim||animal.soif){
                return true;
            }
        }
        return false;
    }
    
    public void info(){
        for (Animal animal: animals){
            System.out.println("One "+animal.getClass().getSimpleName()+" named "+animal.name+".");
            if (animal.faim){
                animal.talk("*hungry* ");
            }
            if (animal.soif){
                animal.talk("*thirsty* ");
            }
            if (animal.malade){
                animal.talk("*sick* ");
            }
            if (animal.angry){
                animal.talk("*angry* ");
            }
            if (animal.jouer){
                animal.talk("*playing* ");
            }
            if (animal.dormir){
                animal.talk("*zzzzz* ");
            }
            
        }
    }
    
    public void setAnimalAttributes(){
        Random random = new Random();
        //choose a random animal in the 
        int whichAnimal = random.nextInt(this.animals.size()); 
        //because size() gives the number of elements in the ArrayList, but we want to use the indicies
        //whichAnimal = whichAnimal--;
        //pick either hungry, thirsty, or sick 
        int whichAttribute = random.nextInt(4); //because we want values between 1 & 3
        
        //switch case: 1 = faim, 2 = soif, 3 = malade
        switch(whichAttribute){
            case 1:
                animals.get(whichAnimal).setFaim(true);
                //System.out.println(animals.get(whichAnimal).getClass().getSimpleName() + ": " + animals.get(whichAnimal).getName() + " = faim");
                break;
            case 2:
                animals.get(whichAnimal).setSoif(true);
                //System.out.println(animals.get(whichAnimal).getClass().getSimpleName() + ": " + animals.get(whichAnimal).getName() + " = soif");
                break;
            case 3:
                animals.get(whichAnimal).setMalade(true); 
                //System.out.println(animals.get(whichAnimal).getClass().getSimpleName() + ": " + animals.get(whichAnimal).getName() + " = malade");
                break;
        }
    }
 
}
