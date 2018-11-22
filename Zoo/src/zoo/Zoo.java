
package zoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mathi
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialisation du lieu
        ArrayList<Location> lieux = new ArrayList(14);
        lieux.add(new Location(Position.Checkout));
        lieux.add(new Location(Position.Birds));
        lieux.add(new Location(Position.Pandas));
        lieux.add(new Location(Position.Meerkat));
        lieux.add(new Location(Position.Snakes));
        lieux.add(new Location(Position.Restaurant));
        lieux.add(new Location(Position.Lions));
        lieux.add(new Location(Position.Giraffes));
        lieux.add(new Location(Position.Toilets));
        lieux.add(new Location(Position.Zebras));
        lieux.add(new Location(Position.Monkeys));
        lieux.add(new Location(Position.Elephants));
        lieux.add(new Location(Position.Aquarium));
        lieux.add(new Location(Position.Exit));
        
        
        //Initialisation des animaux
        ArrayList<Animal> aquarium = new ArrayList<>();
        ArrayList<Animal> oiseaux = new ArrayList<>();
        ArrayList<Animal> pandas = new ArrayList<>();
        ArrayList<Animal> suricates = new ArrayList<>();
        ArrayList<Animal> elephants = new ArrayList<>();
        ArrayList<Animal> singes = new ArrayList<>();
        ArrayList<Animal> zebras = new ArrayList<>();
        ArrayList<Animal> girafes = new ArrayList<>();
        ArrayList<Animal> lions = new ArrayList<>();
        ArrayList<Animal> serpents = new ArrayList<>();
                
        //Ajouter des animaux à chaque ArrayList
        Poisson flounder = new Poisson("Flounder");
        aquarium.add(flounder);
        Poisson nemo = new Poisson("Nemo");
        aquarium.add(nemo);
        
        Oiseau tweety = new Oiseau("Tweety");
        oiseaux.add(tweety);
        Oiseau tator = new Oiseau("Tator");
        oiseaux.add(tator);
        Oiseau tot = new Oiseau("Tot");
        oiseaux.add(tot);
        Oiseau donald = new Oiseau("Donald");
        oiseaux.add(donald);
        Oiseau daisy = new Oiseau("Daisy");
        oiseaux.add(daisy);
        
        Panda beibei = new Panda("Bei Bei");
        pandas.add(beibei);
        Panda baobao = new Panda("Bao Bao");
        pandas.add(baobao);

        Suricate timon = new Suricate("Timon");
        suricates.add(timon);
        Suricate max = new Suricate("Max");
        suricates.add(max);
       
        Elephant dumbo = new Elephant("Dumbo");
        elephants.add(dumbo);
        Elephant horton = new Elephant("Horton");
        elephants.add(horton);
        
        Singe rafiki = new Singe("Rafiki");
        singes.add(rafiki);
        Singe abu = new Singe("Abu");
        singes.add(abu);
        Singe george = new Singe("Curious George");
        singes.add(george);
        
        Zebra marty = new Zebra("Stripes");
        zebras.add(marty);
        Zebra stripes = new Zebra("Marty");
        zebras.add(stripes);
        
        Girafe gigi = new Girafe("Gigi");
        girafes.add(gigi);
        Girafe joe = new Girafe("Joe");
        girafes.add(joe);
        
        Lion simba = new Lion("Simba");
        lions.add(simba);
        Lion mufasa = new Lion("Mufasa");
        lions.add(mufasa);
        Lion nala = new Lion("Nala");
        lions.add(nala);
        Lion scar = new Lion("Scar");
        lions.add(scar);
        Lion kiara = new Lion("Kiara");
        lions.add(kiara);
        
        Serpent nagini = new Serpent("Nagini");
        serpents.add(nagini);
        Serpent basilisk = new Serpent("Basilisk de Serpentard");
        serpents.add(basilisk);
        
        //Initialisation des personnes
        Cashier caissiere;
        Vet superVet = new Vet(lieux.get(0));
        caissiere = new Cashier(lieux.get(0));
        Scanner keyboard = new Scanner(System.in);
        Client joueur;
        
        lieux.get(1).animals=oiseaux;
        lieux.get(2).animals=pandas;
        lieux.get(3).animals=suricates;
        lieux.get(4).animals=serpents;
        //il faut ne utilise pas 5 car c'est cet endroit est pour le resteraunt (donc, nous ne voulons qu'ils mangent nos répas ! 
        lieux.get(6).animals=lions;
        lieux.get(7).animals=girafes;
        //il faut ne utilise pas 8 car c'est cet endroit est pour les toilettes (donc, rien des animaux là-bas, nous esperons ! 
        lieux.get(9).animals=zebras;
        lieux.get(10).animals=singes;
        lieux.get(11).animals=elephants;
        lieux.get(12).animals=aquarium;
        
                   
            //Arrivée dans le zoo (à la caisse)
            caissiere.talk("In the first place, what's your name?");
            String line=keyboard.nextLine();
            boolean loopTry=true;
            int age=0;
            while (loopTry){
                try{
                    loopTry=false;
                    caissiere.talk("Deuxièmement, quel âge avez-vous ?");
                    age=keyboard.nextInt();
                }
                catch(InputMismatchException e){
                    caissiere.talk("You didn't enter an integer. Please try again.");
                    loopTry=true;
                    keyboard.nextLine();
                }
                catch (Exception e){
                    System.out.println(e);
                    loopTry=true;
                    keyboard.nextLine();
                }
            }
            loopTry=true;
            String student="";
            keyboard.nextLine();
            caissiere.talk("Finally, are you a student ? Enter yes if you are and no if you're not");
            while (loopTry){
                student=keyboard.nextLine();
                if (student.toUpperCase().equals("YES") || student.toUpperCase().equals("NO")){
                    loopTry=false;
                }
                else{
                    caissiere.talk("Please answer to this question by yes or no.");
                }
            }
            
            //keyboard.nextLine();
            joueur=new Client(isBoolean(student), age, line, lieux.get(1));
            caissiere.talk("Thanks for the information! You owe: "+caissiere.prix(joueur)+" €.");
            joueur.talk("Here you go !");
            caissiere.talk("We hope you have a great time at the zoo toay! Have fun!");
            
            //Jeu
            
            /*System.out.println(lieux.get(1));
            System.out.println(joueur.lieu.position);*/
            String choix="";
            boolean keepGoingOn=true;
            while(keepGoingOn){
                System.out.println("");
                System.out.println("");
                joueur.printAndGetChoices("", lieux, superVet);
                choix=keyboard.nextLine();
                keepGoingOn=joueur.printAndGetChoices(choix, lieux, superVet);             
                
            }   
        }

        
    
    /**
     * function that test an int and if the int is equal to 1 return true otherwise return false
     * @param bool
     * @return bool
     */
    public static boolean isBoolean(int bool){
        return bool==1;
    }
    
    /**
     * function that test a String and return true if the String is equal to yes or oui
     * @param bool
     * @return 
     */
    public static boolean isBoolean(String bool){
        return bool.toUpperCase().equals("OUI") || bool.toUpperCase().equals("YES");
    }
    
}
