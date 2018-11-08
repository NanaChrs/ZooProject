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
        // TODO code application logic here
        
        Employee Caissiere = new Cashier("Clara");
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Client> joueurs;
        joueurs = new ArrayList();
        boolean bool=false;
        int personnes=1;
        
        try{
            while(personnes!=0){
               
                Caissiere.talk("En premier lieu, quel est votre prénom ?");
                String line=keyboard.nextLine();
                Caissiere.talk("Deuxièmement, quel âge avez-vous ?");
                int age=keyboard.nextInt();
                keyboard.nextLine();
                Caissiere.talk("Et en dernier êtes vous étudiant ? Entrez 1 pour oui et 0 pour non.");
                int student=keyboard.nextInt();
                keyboard.nextLine();
                joueurs.add(new Client(isBoolean(student), age, line));
                Caissiere.talk("Y a-t-il d'autres personnes avec vous ? 1 pour oui et 0 pour non.");
                student=keyboard.nextInt();
                keyboard.nextLine();
                if (!isBoolean(student)){
                    personnes=0;
                    }
                else{
                    personnes++;
                    Caissiere.talk("Veuillez introduire la prochaine personne");
                }
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
