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

    public Cashier(int heureDeb, int heureFin, String name) {
        super(heureDeb, heureFin, name);
        this.lieu.position=Position.Caisse;
        talk(introduceSelf());
    }
    
    public String introduceSelf(){
        return "Bonjour ! Voulez-vous acheter un ticket ? Pour se faire je dois savoir votre prénom, votre âge et si vous êtes étudiant ou non";
    }

   
    
    @Override
    public void talk(String string){
        System.out.println(this.getClass()+": "+ string);
    }
    
    public int prix(Client client){
        if (client.getAge()<=18 || client.isStudent()==true){
            return 10;
        }
        else{
            return 20;
        }
    }
    
    public int calculerPrix(int Montant){
        
    }
    
    
    
}
