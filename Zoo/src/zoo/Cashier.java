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

    public Cashier(int heureDeb, int heureFin, Location lieu) {
        super(heureDeb, heureFin, lieu);
        talk(introduceSelf());
    }
    
    public Cashier(Location lieu){
        super(lieu);
        talk(introduceSelf());
    }
    
    public String introduceSelf(){
        return "Bonjour ! Voulez-vous acheter un ticket ? Pour se faire je dois savoir votre prénom, votre âge et si vous êtes étudiant ou non";
    }

   
    
    @Override
    public void talk(String string){
        System.out.println(this.getClass().getSimpleName()+": "+ string);
    }
    
    public int prix(Client client){
        if (client.getAge()<=18 || client.isStudent()==true){
            return 10;
        }
        else{
            return 20;
        }
    }
    
    
    
    
}
