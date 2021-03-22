/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mlk
 */
public class ActionTest {

    /**
     * Test for constructor.
     */
    public void actionTestNullParameter() {
        
    }

    /**
     * Test .
     */
    public void actionTestInvalidParameter() {
    }

    /**
     * Test getter nom.
     */
    public final void testGetNom() {
        String actionName = "actionName";
        //Action action = new Action(actionName);
        //assertSame(actionName, action.getNom());
    }
    
    /**
     * Test
     */
    @org.junit.jupiter.api.Test
    public void testTrueEquals() {
        Action action = new ActionSimple("actionTest");
        Object obj = action;
        
        boolean result = action.equals(obj);
        
        assertSame(true, result);
        
    }
    
    /**
     * Test
     */
    @org.junit.jupiter.api.Test
    public void testHashCode() {
        
    }
    
    /**
     * Test
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        
    }

    @org.junit.Test
    public void testValeur() {
    }

    public class ActionImpl extends Action {

        public ActionImpl() {
            super("");
        }

        public float valeur(Jour j) {
            return 0.0F;
        }
    }
}
