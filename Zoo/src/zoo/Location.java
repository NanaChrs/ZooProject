/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;

/**
 *
 * @author mathi
 */
public class Location {
        //attributes
    public Position position; //corresponds to Location Enum
    //protected boolean broken; //0 = false, 1 = true
    protected ArrayList<Animal> animals = new ArrayList<Animal>();

    public Location(Position position) {
        this.position = position;
        //this.broken = broken;
    }
    
    
    
    
    //default constructor
 /*   public Location(){
        position = 0;
        broken = false; 
    }
*/    

    
    
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
            System.out.println("Un "+animal.getClass().getSimpleName()+" qui s'appelle "+animal.name+".");
            if (animal.faim){
                animal.talk("*hungry*");
            }
            if (animal.soif){
                animal.talk("*thirsty*");
            }
            if (animal.malade){
                animal.talk("*sick*");
            }
            if (animal.encolère){
                animal.talk("*angry*");
            }
            if (animal.jouer){
                animal.talk("*playing*");
            }
            if (animal.dormir){
                animal.talk("zzzzz");
            }
            
        }
    }
    
    /*
    public String[][] getNameAndAttributes(){
        int length=animals.size();
        String[][] liste = new String[length][7];
        int i=0;
        for (Animal animal: animals){
            liste[i][0]=animal.name;
            liste[i][1]=String.valueOf(animal.malade);
            liste[i][2]=String.valueOf(animal.faim);
            liste[i][3]=String.valueOf(animal.soif);
            liste[i][4]=String.valueOf(animal.dormir);
            liste[i][5]=String.valueOf(animal.jouer);
            liste[i][6]=String.valueOf(animal.encolère);
        }
        return liste;
    }*/
    
    
    
}
