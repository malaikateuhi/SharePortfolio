/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10.metier;

/**
 *
 * @author perussel
 */
public abstract class Action {

    /**
     * Name of the action.
     */
    private final String nom;

    /**
     * Get the value of nom.
     *
     * @return the value of nom
     */
    public final String getNom() {
        return nom;
    }

    /**
     * Build an object of class Action from a name.
     *
     * @param nom name of the action
     */
    protected Action(final String nom) {
        this.nom = nom;
    }

    /**
     * Get the value of an action for a given day.
     *
     * @param j the given day
     * @return the value of the action
     */
    public abstract float valeur(Jour j);

    /**
     *
     * @param obj
     * @return boolean 
     */
    @Override
    public final boolean equals(final Object obj) {
        Action actionAComparer = null;

        if (obj.getClass() != Action.class) {
            Exception ex = new Exception("Object is not an instance of class Action");
        } else {
            actionAComparer = (Action) obj;
        }
        return (this.getNom().compareToIgnoreCase(actionAComparer.getNom()) == 0);
    }

    @Override
    public final int hashCode() {
        return this.getNom().toUpperCase().hashCode();
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
