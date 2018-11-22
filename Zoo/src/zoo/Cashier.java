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
public class Cashier extends Employee{
    
    public Cashier(Location lieu){
        super(lieu);
        talk(introduceSelf());
    }
    
    /**
     * The methode introduceSelf permits to return a String for the person to introduce itself and asking the player its infos
     * @return 
     */
    public String introduceSelf(){
        return "Hello! Would you like to buy a ticket? If so, I need to know your name, your age, and if you are a student or not.";
    }

    /**
     * Gets the infos from the player and return a price for the ticket
     * @param client
     * @return 
     */
    public int prix(Client client){
        if (client.getAge()<=18 || client.getStudent()==true){
            return 10;
        }
        else{
            return 20;
        }
    }
}
