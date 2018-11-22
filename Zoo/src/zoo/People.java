/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 * The class People is the mother class of Employees and Client it is an abstract class giving the parameter location to these ones.
 * The parameter location is used to know where are the people created and permits them to move also (some cannot move like the Cashier). It is implemented by the talk interface since all people can talk. To construct you just need to give a location in parameter
 * @author mathi
 */
public abstract class People implements Talk {
    protected Location lieu;

    public People(Location lieu) {
        this.lieu=lieu;
    }
    
    
    
    /**
     * Getter of the location of People
     * @return 
     */
    public Location getLieu() {
        return lieu;
    }
    
    
    /**
     * Gives the String that every people needs to say to introduce himself/herself
     * @return 
     */
    public abstract String introduceSelf();
    /*public void move(String lieu){
        String lieuActuel=lieu;
        System.out.println("Je suis dans :"+lieuActuel);
        
    }*/
    
    
}
