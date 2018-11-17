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
        ArrayList<Location> lieux =new ArrayList(14);
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
        ArrayList<Animal> aquarium;
        ArrayList<Animal> oiseaux;
        ArrayList<Animal> pandas;
        ArrayList<Animal> suricates;
        ArrayList<Animal> elephants;
        ArrayList<Animal> singes;
        ArrayList<Animal> zebras;
        ArrayList<Animal> girafes;
        ArrayList<Animal> lions;
        ArrayList<Animal> serpents;
       
        
        //Initialisation des personnes
        Employee Caissiere;
        Caissiere = new Cashier(lieux.get(0));
        Scanner keyboard = new Scanner(System.in);
        Client joueur;
        
        
        try{               
            //Arrivée dans le zoo (à la caisse)
            Caissiere.talk("En premier lieu, quel est votre prénom ?");
            String line=keyboard.nextLine();
            Caissiere.talk("Deuxièmement, quel âge avez-vous ?");
            int age=keyboard.nextInt();
            keyboard.nextLine();
            Caissiere.talk("Et en dernier êtes vous étudiant ? Entrez 1 pour oui et 0 pour non.");
            int student=keyboard.nextInt();
            keyboard.nextLine();
            joueur=new Client(isBoolean(student), age, line, lieux.get(1));
            Caissiere.talk("Nous vous souhaitons un agréable passage au zoo ! J'espère que vous allez vous amuser. Bonne journée !");
            
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
