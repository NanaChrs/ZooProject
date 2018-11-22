/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 * Client is a class which inheritate from People directly. It also have parameters in addition like a boolean student to know if the Client is a student or no, an int age to know the age of the Client and his name (a String)
 * @author mathi
 */
public class Client extends People implements Talk, Interactions{
    boolean student;
    private int age;
    String name;

    public Client(boolean student, int age, String name, Location pos) {
        super(pos);
        this.name=name;
        this.student = student;
        this.age = age;
        this.talk(introduceSelf());
    }

    /**
     * Getter of the student attribute
     * @return 
     */
    public boolean getStudent() {
        return student;
    }

    /**
     * Setter of the student attribute
     * @param student 
     */
    public void setStudent(boolean student) {
        this.student = student;
    }

    /**
     * Getter of the Age attribute
     * @return 
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter of the age attribute
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * getter of the Name atribute
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of the Name attribute
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * the talk method for client is overriden : if the client's age is below 3 the person will only talk saying "gaga" otherwise it will talk like that : "Name: say"
     * @param say 
     */
    @Override
    public void talk(String say){
        if(this.age>3){
            System.out.println(this.getName()+": "+say);
        }
        else{
            System.out.println(this.getName()+": Gaga! ");
        }
        
    }
    
    /**
     * The introduceSelf method returns a string that depends on the age, the name and the student boolean
     * @return 
     */
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
    
    /** 
     * Method that permits to change the location of a client
     * @param lieu 
     */
    @Override
    public void move(Location lieu) {
        this.lieu=lieu;
    }
    
    /**
     * Void that permits to say which amount of money the client has to pay
     * @param Montant 
     */
    public void payer(int Montant){
        this.talk("Here's the "+Montant+"€ for my ticket.");
    }

    /**
     * Void that permits to do the action of taking a selfie. Different if you're old
     */
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
    
    /**
     * Void that make the client talk whenever it's at the restaurant
     */
    public void manger(){
        this.talk("Ohhh! I'm hungry and this meal looks great!");
    }
    
    /**
     * Void that takes a photo of the chosen animal (needs to put enter an integer to chose which animal you want to take a photo of. The photo will have diffenrent outputs depending of the attributes of the animal
     */
    public void takePhoto(){
        System.out.println("You would like to take a picture of which animal?");
        for (int i=0; i<this.getLieu().animals.size();i++){
            System.out.println("Type "+ String.valueOf(i) + " to take a picture of " + this.lieu.animals.get(i).name + ".");
        }
        
        int nimal=-1;
        while (nimal<0 || nimal>this.getLieu().animals.size()-1){
            try{
                Scanner keyboard = new Scanner(System.in);
                nimal=keyboard.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("You did not enter an Integer please enter a number between 0 and "+(this.getLieu().animals.size()-1)+". Please try again.");
            }
            catch (Exception e){
                System.out.println("An error occured. Please try again.");
            }
            
        }
       
        Animal toto=this.getLieu().animals.get(nimal);
        talk("Ohh I'm taking a photo of "+toto.getName());
        System.out.println("*cliiiiick*");
        if (toto.getDormir()){
            this.talk("Mooooh !"+toto.getName()+" is so cute when sleeping *-*");
        }
        else if(toto.getEnColère()){
            this.talk("Ouhlala !!!"+toto.getName()+" seems angry... I hope it's not my fault...");
        }
        else if(toto.getFaim()){
            this.talk("What is the terrible zoo??? "+toto.getName()+" looks famished.");
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
    
    /**
     * Void that outputs the info of all the animals (who is who and how is it) and output different things depending on where the client is at
     */
    public void observer(){
        System.out.println("In the "+this.getLieu().position+" exhibit, there are:");
        this.getLieu().info();
        if (null!=this.getLieu().position)switch (this.getLieu().position) {
            case Aquarium:
                talk("Woooooow !!! The aquarium is so big ! Look at that glass and those fish !!");
                break;
            case Elephants:
                talk("Those elephants are so big !! I have never seen elephants so beautiful.");
                break;
            case Giraffes:
                talk("It's so big it looks like it could touch the clouds in the sky !! WOOOOOOOOOOOOOW!");
                break;
            case Lions:
                talk("Those lions are so scaryyy... I'm so scared, but I'd like to pet it.");
                break;
            case Birds:
                talk("Chickens are sooooo loud...");
                break;
            case Pandas:
                talk("They're such cuties!! I want to hug it so baaad.");
                break;
            case Snakes:
                talk("Brr I'm so scared of snakes.");
                break;
            case Monkeys:
                talk("Haha those monekeys are so funny... But... But what are these two doing over there ?");
                break;
            case Meerkat:
                talk("Mooooh these little meerkats are so cuuuute!!");
                break;
            case Zebras:
                talk("Wow they look like little white and black horses.");
                break;
            case Restaurant:
                manger();
                break;
            case Toilets:
                talk("I need to pee so baaad!!!");
                break;
            case Exit:
                talk("Oh noooo is it already the exit ?!");
                break;
            default:
                break;
        }
        
        
    }
    
    
    /**
     * Void that permits interactions between the age of the client
     */
    @Override
    public void interact(){
        if (this.age<=10 && !this.getLieu().animals.isEmpty()){
            if (this.getLieu().position!=Position.Aquarium){
                this.talk("Niark Niark I'm going to disturbed those poor "+this.getLieu().animals.get(0).getClass().getSimpleName()+" and throw candies at their faces *evil laugh*");
                this.getLieu().animals.get(0).talk("");
                this.getLieu().animals.get(0).setEnColère(true);
                this.talk("I'm so scared I should never have done that !!");
                    }
            else{
                this.talk("Niark Niark I'm going to disturbed those poor "+this.getLieu().animals.get(0).getClass().getSimpleName()+" and throw candies at their faces *evil laugh*");
                System.out.println("*poke poke crack*");
                this.talk("OUCH !!! I forgot I was at the aquarium... It huuuurts !");
            }
                
        }
    }
    
    /**
     * Void that permits to print the choices you can get (the menu in fact). You need to enter the character between two parentheses for it to work (if you write another character it will just write the menu back).
     * It returns a boolean : if you exite the game it'll be false otherwise it'll be true.
     * This function calls every other methods in the zoo project. It's the main function
     * @param choix
     * @param lieu
     * @param superVet
     * @return 
     */
    public boolean printAndGetChoices(String choix, ArrayList<Location> lieu, Vet superVet){
            String choixBis=choix.toUpperCase();
            
            //System.out.println(choixBis);
            if (choixBis.equals("") || choixBis.equals("C") || choixBis.equals("M")){
                System.out.println("You're at the "+this.getLieu().position+". What do you want to do now, "+this.name+" ?");
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
            else if (choixBis.equals("F") && this.getLieu().position!=Position.Exit){
                move(lieu.get(lieu.indexOf(this.getLieu())+1));
                return true;
            }
            else if(choixBis.equals("B") && this.getLieu().position!=Position.Birds){
                move(lieu.get(lieu.indexOf(this.getLieu())-1));
                return true;
                    
            }
            else if (choixBis.equals("I")){
                if (!this.getLieu().animals.isEmpty()){
                    this.interact();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("You can :");
                    System.out.println("- Take a (P)hoto");
                    System.out.println("- Take a (S)elfie");
                    if (this.getLieu().isSomeoneSick()||this.getLieu().isSomeoneHungryOrThirsty()){
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
                        else if (this.getLieu().isSomeoneHungryOrThirsty() || this.getLieu().isSomeoneSick()){
                            if (interaction2.equals("V")){
                                this.talk("An animal is not well treated I need to find a vet so he or she can treat him");
                                superVet.move(this.getLieu());
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
