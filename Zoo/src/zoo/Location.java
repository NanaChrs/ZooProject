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
    Position position; //corresponds to Location Enum
    boolean broken; //0 = false, 1 = true
    ArrayList<Animal> animals = new ArrayList<Animal>();
    
    //default constructor
 /*   public Location(){
        position = 0;
        broken = false; 
    }
*/    
    // constructor
    public Location(Position p){
        position= p;
        broken = false; 
    }
    
    public boolean isSomeoneSick(){
        for (Animal animal : animals){
            if (animal.malade){
                return true;
            }
        }
        return false;
    }
    
    public boolean isSomeoneAngry(){
        for (Animal animal : animals){
            if (animal.faim){
                return true;
            }
        }
        return false;
    }
    
    
    
}
