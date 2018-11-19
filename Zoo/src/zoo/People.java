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
public abstract class People implements Talk {
    public Location lieu;

    public People(Location lieu) {
        this.lieu=lieu;
    }
    
    
    @Override
    public void talk(String say){
        System.out.println(this.getClass().getSimpleName()+": "+say);
    }

    public Location getLieu() {
        return lieu;
    }

    public void setLieu(Location lieu) {
        this.lieu = lieu;
    }
    
    public abstract String introduceSelf();
    /*public void move(String lieu){
        String lieuActuel=lieu;
        System.out.println("Je suis dans :"+lieuActuel);
        
    }*/
    
    
}
