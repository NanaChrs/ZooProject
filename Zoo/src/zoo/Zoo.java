/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        //COMMENT AJOUTER DES ARRAYLISTS À LES ÉLÉMENTS DE LIEUX???????
        
        //Ajouter des animaux à chaque ArrayList
        Poisson flounder = new Poisson();
        flounder.setName("Flounder");
        aquarium.add(flounder);
        Poisson nemo = new Poisson();
        nemo.setName("Nemo");
        aquarium.add(nemo);
        
        Oiseau tweety = new Oiseau();
        tweety.setName("Tweety");
        oiseaux.add(tweety);
        Oiseau tator = new Oiseau();
        tator.setName("Tator");
        oiseaux.add(tator);
        Oiseau tot = new Oiseau();
        tot.setName("Tot");
        oiseaux.add(tot);
        Oiseau donald = new Oiseau();
        donald.setName("Donald");
        oiseaux.add(donald);
        Oiseau daisy = new Oiseau();
        daisy.setName("Daisy");
        oiseaux.add(daisy);
        
        Panda beibei = new Panda();
        beibei.setName("Bei Bei");
        pandas.add(beibei);
        Panda baobao = new Panda();
        baobao.setName("Bao Bao");
        pandas.add(baobao);
        
        Suricate timon = new Suricate();
        timon.setName("Timon");
        suricates.add(timon);
        Suricate max = new Suricate();
        max.setName("Max");
        suricates.add(max);
        
        Éléphant dumbo = new Éléphant();
        dumbo.setName("Dumbo");
        elephants.add(dumbo);
        Éléphant horton = new Éléphant();
        horton.setName("Horton");
        elephants.add(horton);
        
        Singe rafiki = new Singe();
        rafiki.setName("Rafiki");
        singes.add(rafiki);
        Singe abu = new Singe();
        abu.setName("Abu");
        singes.add(abu);
        Singe george = new Singe();
        george.setName("Curious George");
        singes.add(george);
        
        Zèbra marty = new Zèbra();
        marty.setName("Marty");
        zebras.add(marty);
        Zèbra stripes = new Zèbra();
        stripes.setName("Stripes");
        zebras.add(stripes);
        
        Girafe gigi = new Girafe();
        gigi.setName("Gigi");
        //System.out.println(gigi.toString());
        girafes.add(gigi);
        Girafe joe = new Girafe();
        gigi.setName("Joe");
        girafes.add(joe);
        
        Lion simba = new Lion();
        simba.setName("Simba");
        lions.add(simba);
        Lion mufasa = new Lion();
        mufasa.setName("Mufasa");
        lions.add(mufasa);
        Lion nala = new Lion();
        nala.setName("Nala");
        lions.add(nala);
        Lion scar = new Lion();
        scar.setName("Scar");
        lions.add(scar);
        Lion kiara = new Lion();
        kiara.setName("Kiara");
        lions.add(kiara);
        
        Serpent nagini = new Serpent();
        nagini.setName("Nagini");
        serpents.add(nagini);
        Serpent basilisk = new Serpent();
        basilisk.setName("Basilisk de Serpentard");
        serpents.add(basilisk);
        
        //Initialisation des personnes
        Cashier caissiere;
        caissiere = new Cashier(lieux.get(0));
        Scanner keyboard = new Scanner(System.in);
        Client joueur;
        
        lieux.get(1).animals=oiseaux;
        lieux.get(2).animals=pandas;
        lieux.get(3).animals=suricates;
        lieux.get(4).animals=serpents;
        lieux.get(6).animals=lions;
        lieux.get(7).animals=girafes;
        lieux.get(8).animals=zebras;
        lieux.get(9).animals=singes;
        lieux.get(10).animals=elephants;
        lieux.get(11).animals=aquarium;
        
        
        try{               
            //Arrivée dans le zoo (à la caisse)
            caissiere.talk("En premier lieu, quel est votre prénom ?");
            String line=keyboard.nextLine();
            caissiere.talk("Deuxièmement, quel âge avez-vous ?");
            int age=keyboard.nextInt();
            keyboard.nextLine();
            caissiere.talk("Et en dernier êtes vous étudiant ? Entrez 1 pour oui et 0 pour non.");
            int student=keyboard.nextInt();
            keyboard.nextLine();
            joueur=new Client(isBoolean(student), age, line, lieux.get(1));
            caissiere.talk("Dans ce cas vous nous devez:"+caissiere.prix(joueur)+" €.");
            joueur.talk("Et voici !");
            caissiere.talk("Nous vous souhaitons un agréable passage au zoo ! J'espère que vous allez vous amuser. Bonne journée !");
            
            //Jeu
            
            /*System.out.println(lieux.get(1));
            System.out.println(joueur.lieu.position);*/
            String choix="";
            
            while(!choix.toLowerCase().equals("x")){
                joueur.printAndGetChoices("", lieux);
                choix=keyboard.nextLine();
                joueur.printAndGetChoices(choix, lieux);
                
                              
                
            }
                
            
        }
        catch (InputMismatchException e){
            System.out.println(e+": Vous n'avez pas entré le bon type demandé");
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
