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
public class Client extends People implements Organism{
    boolean student;
    private int age;
    

    public Client(boolean student, int age, String name) {
        super(name);
        this.student = student;
        this.age = age;
        talk(introduceSelf());
    }

    
    public int prix(){
        if (this.age<=18 || this.student==true){
            return 10;
        }
        else{
            return 20;
        }
    }
    
    
    public String introduceSelf(){
        return "Bonjour ! Je m'appelle "+this.getNom()+" et j'ai "+this.age+ " ans";
    }
    
    @Override
    public String interact(Location lieu){
        return "";
    }
    
}
