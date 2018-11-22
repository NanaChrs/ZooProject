/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 * The interface Interactions is used by Vet and Client -- They're the only one able to move and interact with their location
 * @author mathi
 */
public interface Interactions {
    public void move(Location lieu);
    public void interact();
}
