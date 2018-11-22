
package zoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.io.BufferedReader; 
/**
 *
 * @author mathi
 */
public class Zoo {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // Initialisation du lieu
        ArrayList<Location> lieux = new ArrayList(14);
        lieux.add(new Location(Position.Caisse));
        lieux.add(new Location(Position.Oiseaux));
        lieux.add(new Location(Position.Pandas));
        lieux.add(new Location(Position.Suricates));
        lieux.add(new Location(Position.Serpents));
        lieux.add(new Location(Position.Restaurant));
        lieux.add(new Location(Position.Lions));
        lieux.add(new Location(Position.Girafes));
        lieux.add(new Location(Position.Toilettes));
        lieux.add(new Location(Position.Zebras));
        lieux.add(new Location(Position.Singes));
        lieux.add(new Location(Position.Elephants));
        lieux.add(new Location(Position.Aquarium));
        lieux.add(new Location(Position.Sortie));
        
        
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
        
        Éléphant dumbo = new Éléphant("Dumbo");
        elephants.add(dumbo);
        Éléphant horton = new Éléphant("Horton");
        elephants.add(horton);
        
        Singe rafiki = new Singe("Rafiki");
        singes.add(rafiki);
        Singe abu = new Singe("Abu");
        singes.add(abu);
        Singe george = new Singe("Curious George");
        singes.add(george);
        
        Zèbra marty = new Zèbra("Stripes");
        zebras.add(marty);
        Zèbra stripes = new Zèbra("Marty");
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
        
        //change one animal in each habitat at random to either be hungry, thirsty, or sick
        lieux.get(1).setAnimalAttributes();
        lieux.get(2).setAnimalAttributes();
        lieux.get(3).setAnimalAttributes();
        lieux.get(4).setAnimalAttributes();
        lieux.get(6).setAnimalAttributes();
        lieux.get(7).setAnimalAttributes();
        lieux.get(9).setAnimalAttributes();
        lieux.get(10).setAnimalAttributes();
        lieux.get(11).setAnimalAttributes();
        lieux.get(12).setAnimalAttributes();
        
        /*
        //try to read in animals
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } finally {
            br.close();
}       */
        
        
        
        try{               
            //Arrivée dans le zoo (à la caisse)
            caissiere.talk("In the first place, what's your name?");
            String line=keyboard.nextLine();
            caissiere.talk("Secondly, how old are you? (in numerals please)");
            //maybe add here if numbers are not given, have an exception that will say it doesn't understand the input
            int age=keyboard.nextInt();
            keyboard.nextLine();
            caissiere.talk("Lastly, are you a student? Enter 1 for yes or 0 for no.");
            int student=keyboard.nextInt();
            keyboard.nextLine();
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
                joueur.printAndGetChoices("", lieux, superVet);
                choix=keyboard.nextLine();
                keepGoingOn=joueur.printAndGetChoices(choix, lieux, superVet);             
                
            }   
        }
        catch (InputMismatchException e){
            System.out.println(e+": You have not given the correct input type. Please try again.");
        }
        catch (Exception e){
            System.out.println(e);
        } 
    }
    
    public static boolean isBoolean(int bool){
        if (bool==1){return true;}
        else{return false;}
    }
    
}
