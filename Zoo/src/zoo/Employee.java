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
    protected double salaire;

    public Employee(String name) {
        super(name);
        this.heureDeb=9;
        this.heureFin=18;
        introduceSelf();
    }

    public Employee(int heureDeb, int heureFin,  String name) {
        super(name);
        this.heureDeb = heureDeb;
        this.heureFin = heureFin;
        talk(introduceSelf());
    }   
    
    public abstract String introduceSelf();
}
