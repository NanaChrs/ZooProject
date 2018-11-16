/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.Scanner;

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
        talk(introduceSelf());
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
        return "Bonjour ! Je m'appelle "+this.getName()+" et j'ai "+this.getAge()+ " ans";
    }
    

    @Override
    public void move(Location lieu) {
        this.lieu=lieu;
    }
    
    public void payer(int Montant){
        talk("Voici "+Montant+"€ pour mon ticket.");
    }

    public void takeSelfie(){
        if (this.age<40){
            talk("Et si on prenait un selfie avec le*a*s "+this.lieu.animals.get(0).getClass());
            System.out.println("*clicks*");
            talk("Wow mangifaïque ma chérie");
        }
        else{
            talk("Mais pourquoi l'appareil photo me prend moi et pas les animaux !! JACQUELINE AIDE MOI STP J'Y COMPRENDS RIEN MOI!");
        }
        
    }
    
    public void manger(){
        talk("Hmm ce plat est très bon !");
    }
    
    public void takePhoto(){
        talk("Prenons une photo de "+this.lieu.animals.get(0).getClass());
        System.out.println("*clicks*");
        talk("Wow ! Cette photo est tellement belle !");
    }
    
    public void observer(){
        //System.out.println("là");
        if (this.lieu.position==Position.Aquarium){
            talk("Woooooow !!! L'aquarium est tellement grand ! Regarde ces vitres et ces poissons !!");
        }
        else if (this.lieu.position==Position.Elephants){
            talk("Ces éléphants sont tellement impressionnants et grands !! Je n'en avais jamais vu d'aussi beaux");
        }
        else if(this.lieu.position==Position.Girafes){
            talk("Cette girafe est tellement grand que sa tête est au dessus des nuages !! WOOOOOOOOOOOOOW!");
        }
        else if (this.lieu.position==Position.Lions){
            talk("Ces lions font tellement peurs on dirait qu'ils vont me tuer... J'ai peur mais j'aimerais bien les caresser");
        }
        else if(this.lieu.position==Position.Oiseaux){
            talk("Oh lala c'est tellement bruyant de voir des poules...");
        }
        else if (this.lieu.position==Position.Pandas){
            talk("Ils sont tellement mignoooons !! Je veux lui faire un câlin");
        }
        else if(this.lieu.position==Position.Serpents){
            talk("Brr les serpents sotn assez répugnants ");
        }
        else if(this.lieu.position==Position.Singes){
            talk("haha les singes sont tellement drôles... Mais... Mais qu'est-ce qu'ils font ces 2 singes là ?");
        }
        else if(this.lieu.position==Position.Suricates){
            talk("Mooooh trop chou ces petits suricaaaates !!");
        }
        else if (this.lieu.position==Position.Zebras){
            talk("Wow on dirait de gros poneys noirs et blancs");
        }
        else if(this.lieu.position==Position.Restaurant){
            manger();
        }
        else if (this.lieu.position==Position.Toilettes){
            talk("Je dois trop faire pipiiii !!!");
        }
        else if (this.lieu.position==Position.Sortie){
            talk("Oh mince on est déjà arrivés à la sortie ?!");
        }
        
        
    }
    
    public boolean interact(){
        if (this.lieu.isSomeoneSick()){
            talk("Oh non ! Un animal est malade !! Il faut appeler le vétérinaire !");
            return true;
        }
        else if (this.lieu.isSomeoneAngry()){
            talk("Oh lala !! On dirait qu'un des animaux a faim... J'espère qu'il ne va pas nous manger !!");
            return true;
        }
        else if (this.age<=10 && !this.lieu.animals.isEmpty()){
            if (this.lieu.position!=Position.Aquarium)
                talk("Héhé je vais embêter le*a*s "+this.lieu.animals.get(0).getClass()+" et lui jeter des bonbons à la figure");
                this.lieu.animals.get(0).talk("");
                talk("Oh j'ai eu peur je ne referais plus ça !!!");
            return true;
        }
        return false;
        
    }
    
    public void printAndGetChoices(String choix, ArrayList<Location> lieu){
            String choixBis=choix.toUpperCase();
            boolean youGotHere=false;
            //System.out.println(choixBis);
            if (choixBis.equals("") || choixBis.equals("C") || choixBis.equals("M")){
                System.out.println("You're at "+this.lieu.position+". What do you want to do now "+this.name+" ?");
                System.out.println("- Move (F)orward");
                System.out.println("- Move (B)ackward");
                System.out.println("- (I)nteract with the location you're at");
                System.out.println("- (O)bserve the place you're at");
                System.out.println("E(x)it");
            }
            else if (choixBis.equals("O")){
                //System.out.println("jsuislà");
                this.observer();
            }
            else if (choixBis.equals("F") && this.lieu.position!=Position.Sortie){
                move(this.lieu=lieu.get(lieu.indexOf(this.lieu)+1));
            }
            else if(choixBis.equals("B") && this.lieu.position!=Position.Oiseaux){
                move(this.lieu=lieu.get(lieu.indexOf(this.lieu)-1));
            }
            else if (choixBis.equals("I")){
                if (!this.lieu.animals.isEmpty()){
                    this.interact();
                    Scanner scanner = new Scanner(System.in);
                    System.out.flush();
                    System.out.println("You can :");
                    System.out.println("- Take a (P)hoto");
                    System.out.println("- Take a (S)elfie");
                    System.out.println("- Return to the (M)ain menu");
                    while(true){
                    String interaction=scanner.nextLine();
                    interaction.toUpperCase();
                        if (interaction.equals("P")){
                            takePhoto();
                            break;

                        }
                        else if (interaction.equals("S")){
                            takeSelfie();
                            break;

                        }
                        else if(interaction.equals("M")){
                            break;
                        }
                    } 
                }
                else{
                    talk("Bah y a rien ici...");
                }
                   
            }
            else if(choixBis.equals("X")){
                //System.out.flush();
                System.out.println("Nous espérons que vous avez aimé jouer à notre jeu ! Si vous avez joué en tant qu'adulte, certaines interactions sont chnageantes en fonction de l'âge n'hésitez pas essayer en créant d'autres personnages !");
            }
            else{
                System.out.println("Invalid action");
            }
                   
        
        
    }
}
