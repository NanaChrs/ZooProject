/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author mathi
 */
public class Client extends People implements Talk, Interactions{
    boolean student;
    private int age;
    String name;

    public Location getLieu() {
        return lieu;
    }

    public void setLieu(Location lieu) {
        this.lieu = lieu;
    }

    public Client(boolean student, int age, String name, Location pos) {
        super(pos);
        this.name=name;
        this.student = student;
        this.age = age;
        this.talk(introduceSelf());
    }

    
    

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public void talk(String say){
        if(this.age>3){
            System.out.println(this.getName()+": "+say);
        }
        else{
            System.out.println(this.getName()+": Gaga! ");
        }
        
    }
    
    
    public String introduceSelf(){
        String sentence="Hello! My name is "+this.getName()+". I'm "+this.getAge()+ " years old";
        if (this.student){
            sentence+=" and I'm a student.";
        }
        else{
            sentence+=".";
        }
        return sentence;
    }
    

    @Override
    public void move(Location lieu) {
        this.lieu=lieu;
    }
    
    public void payer(int Montant){
        this.talk("Here's the "+Montant+"€ for my ticket.");
    }

    public void takeSelfie(){
        if (this.age<40){
            this.talk("And if we take a selfie ?");
            System.out.println("*clicks*");
            this.talk("Wow that's magnificent, my dear!!");
        }
        else{
            this.talk("Why is it taking a picture of me and not the animals!! JACQUELIIIIINE HELP ME PLEASE! I DON'T UNDERSTAND THIS NEWFANGLED TECHNOLOGY");
        }
        
    }
    
    public void manger(){
        this.talk("Ohhh! I'm hungry and this meal looks great!");
    }
    
    public void takePhoto(){
        System.out.println("You would like to take a picture of which animal?");
        for (int i=0; i<this.lieu.animals.size();i++){
            System.out.println("Type "+ String.valueOf(i) + " to take a picture of " + this.lieu.animals.get(i).name + ".");
        }
        
        int nimal=-1;
        while (nimal<0 || nimal>this.lieu.animals.size()-1){
            Scanner keyboard = new Scanner(System.in);
            nimal=keyboard.nextInt();
        }
       
        Animal toto=this.lieu.animals.get(nimal);
        talk("Ohh I'm taking a photo of "+toto.getName());
        System.out.println("*cliiiiick*");
        if (toto.getDormir()){
            this.talk("Mooooh !"+toto.getName()+" is so cute when sleeping *-*");
        }
        else if(toto.getEnColère()){
            this.talk("Ouhlala !!!"+toto.getName()+" seems angry... I hope it's not my fault...");
        }
        else if(toto.getFaim()){
            this.talk("What is the terrible zoo??? "+toto.getName()+" looks famished. I'm calling WWF!");
        }
        else if (toto.getSoif()){
            this.talk("Aww look at "+ toto.getName()+" the poor animal is so thirsty...");
        }
        else if(toto.getMalade()){
            this.talk("What are the vets even doing??? "+toto.getName()+" is sick and could start vomiting any minute!!");
        }
        else{
            this.talk("This picture of "+toto.getName()+ " est ma-gni-fi-cent!! I'm going to frame it when I get home!");
        }
        
    }
    
    public void observer(){
        System.out.println("In the "+this.lieu.position+" exhibit, there are:");
        this.lieu.info();
        if (null!=this.lieu.position)switch (this.lieu.position) {
            case Aquarium:
                talk("Woooooow !!! The aquarium is so big ! Look at that glass and those fish !!");
                break;
            case Elephants:
                talk("Those elephants are so big !! I have never seen elephants so beautiful.");
                break;
            case Girafes:
                talk("It's so big it looks like it could touch the clouds in the sky !! WOOOOOOOOOOOOOW!");
                break;
            case Lions:
                talk("Those lions are so scaryyy... I'm so scared, but I'd like to pet it.");
                break;
            case Oiseaux:
                talk("Chickens are sooooo loud...");
                break;
            case Pandas:
                talk("They're such cuties!! I want to hug it so baaad.");
                break;
            case Serpents:
                talk("Brr I'm so scared of snakes.");
                break;
            case Singes:
                talk("Haha those monekeys are so funny... But... But what are these two doing over there ?");
                break;
            case Suricates:
                talk("Mooooh these little meerkats are so cuuuute!!");
                break;
            case Zebras:
                talk("Wow they look like little white and black horses.");
                break;
            case Restaurant:
                manger();
                break;
            case Toilettes:
                talk("I need to pee so baaad!!!");
                break;
            case Sortie:
                talk("Oh noooo is it already the exit ?!");
                break;
            default:
                break;
        }
        
        
    }
    
    public void interact(){
        if (this.age<=10 && !this.lieu.animals.isEmpty()){
            if (this.lieu.position!=Position.Aquarium){
                this.talk("Niark Niark I'm going to disturbed those poor "+this.lieu.animals.get(0).getClass().getSimpleName()+" and throw candies at their faces *evil laugh*");
                this.lieu.animals.get(0).talk("");
                this.lieu.animals.get(0).setEnColère(true);
                this.talk("I'm so scared I should never have done that !!");
                    }
            else{
                this.talk("Niark Niark I'm going to disturbed those poor "+this.lieu.animals.get(0).getClass().getSimpleName()+" and throw candies at their faces *evil laugh*");
                System.out.println("*poke poke crack*");
                this.talk("OUCH !!! I forgot I was at the aquarium... It huuuurts !");
            }
                
        }
    }
    
    public boolean printAndGetChoices(String choix, ArrayList<Location> lieu, Vet superVet){
            String choixBis=choix.toUpperCase();
            
            //System.out.println(choixBis);
            if (choixBis.equals("") || choixBis.equals("C") || choixBis.equals("M")){
                System.out.println("You're at "+this.lieu.position+". What do you want to do now, "+this.name+" ?");
                System.out.println("- Move (F)orward");
                System.out.println("- Move (B)ackward");
                System.out.println("- (I)nteract with your current location");
                System.out.println("- (O)bserve your current location");
                System.out.println("E(x)it");
                System.out.println("");
                return true;
            }
            else if (choixBis.equals("O")){
                //System.out.println("jsuislà");
                this.observer();
                return true;
            }
            else if (choixBis.equals("F") && this.lieu.position!=Position.Sortie){
                move(this.lieu=lieu.get(lieu.indexOf(this.lieu)+1));
                return true;
            }
            else if(choixBis.equals("B") && this.lieu.position!=Position.Oiseaux){
                move(this.lieu=lieu.get(lieu.indexOf(this.lieu)-1));
                return true;
                    
            }
            else if (choixBis.equals("I")){
                if (!this.lieu.animals.isEmpty()){
                    this.interact();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("You can :");
                    System.out.println("- Take a (P)hoto");
                    System.out.println("- Take a (S)elfie");
                    if (this.lieu.isSomeoneSick()||this.lieu.isSomeoneHungryOrThirsty()){
                        System.out.println("Since an animal is sick or hungry/thristy you can also:");
                        System.out.println("- Call a (V)et");
                        System.out.println("- Call (W)WF");
                    }
                    System.out.println("- Return to the (M)ain menu");
                    String interaction=scanner.nextLine();
                    //System.out.println(interaction);
                    String interaction2=interaction.toUpperCase();
                    while(true){
                        
                        
                        System.out.println(interaction);
                        if (interaction2.equals("P")){
                            this.takePhoto();
                            return true;

                        }
                        else if (interaction2.equals("S")){
                            this.takeSelfie();
                            return true;

                        }
                        else if(interaction2.equals("M")){
                            return true;
                        }
                        else if (interaction2.equals("X")){
                                if(getAge() >= 17)
                                    System.out.println("We hope that you enjoy our little game! If you enjoyed it as an adult, some functionalities might have been hiden for you so don't hesitate to try with another player");
                                else
                                    System.out.println("We hope that you enjoy our little game! If you enjoyed it as a kid, some functionalities might have been hiden for you so don't hesitate to try with another player");
                            return false;
                        }
                        else if (this.lieu.isSomeoneHungryOrThirsty() || this.lieu.isSomeoneSick()){
                            if (interaction2.equals("V")){
                                this.talk("An animal is not well treated I need to find a vet so he or she can treat him");
                                superVet.move(this.lieu);
                                System.out.println("A wild vet appears");
                                superVet.talk("I am the super vet what can I do for you?");
                                this.talk("Please treat it and feed it, this animal is getting me sad");
                                superVet.interact();
                                this.talk("Thanks super Vet ! You saved the all planet and the zoo and this animal !");
                                return true;
                            }
                            else if(interaction2.equals("W")){
                                this.talk("I'm calling WWF we need to shut down this zoo!!!");
                                for (int i=0; i<5;i++){
                                    this.talk("NO MORE ANIMAL ABUSE!");
                                }
                                choixBis="X";

                                this.talk("I'm getting out of this zoo before I break anything !!! ");
                                if(getAge() >= 10)
                                    System.out.println("We hope that you enjoy our little game ! If you enjoyed it as an adult, some functionalities might have been hiden for you so don't hesitate to try with another player");
                                else
                                    System.out.println("We hope that you enjoy our little game! If you enjoyed it as a kid, some functionalities might have been hiden for you so don't hesitate to try with another player");

                                return false;
                            }
                            else{
                                System.out.println("Invalid action. Try something else.");
                                return true;
                            }
                        }
                        else {
                            System.out.println("Invalid action. Try something else.");
                            return true;
                        }
                    } 
                }
                else{
                    talk("Nothing to see here...");
                    return true;
                }
                   
            }
            else if(choixBis.equals("X")){
                //System.out.flush();
                if(getAge() >= 17)
                    System.out.println("We hope that you enjoy our little game! If you enjoyed it as an adult, some functionalities might have been hiden for you so don't hesitate to try with another player");
                else
                    System.out.println("We hope that you enjoy our little game! If you enjoyed it as a kid, some functionalities might have been hiden for you so don't hesitate to try with another player");
                return false;
            }
            else{
                System.out.println("Invalid action. Try something else.");
                return true;
            }
                   
        
        
    }
}
