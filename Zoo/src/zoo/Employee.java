/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 * Abstract class Employee that implements the talk method since the Employees have no name thay all talk the same way
 * @author mathi
 */
public abstract class Employee extends People{
    /*protected int heureDeb;
    protected int heureFin;*/

    public Employee(Location lieu) {
        super(lieu);
    }
    
    /**
     * Void method that make the Employees talk like "name_of_the_class: say"
     * @param say 
     */
    @Override
    public void talk(String say){
        System.out.println(this.getClass().getSimpleName()+": "+say);
    }
    /*
    public Employee(int heureDeb, int heureFin, Location lieu) {
        super(lieu);
        this.heureDeb = heureDeb;
        this.heureFin = heureFin;
    }  */ 
    
    public abstract String introduceSelf();
}
