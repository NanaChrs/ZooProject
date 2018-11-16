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
public abstract class Employee extends People{
    protected int heureDeb;
    protected int heureFin;

    public Employee(Location lieu) {
        super(lieu);
        this.heureDeb=9;
        this.heureFin=18;
    }
    

    public Employee(int heureDeb, int heureFin, Location lieu) {
        super(lieu);
        this.heureDeb = heureDeb;
        this.heureFin = heureFin;
    }   
    
    public abstract String introduceSelf();
}
