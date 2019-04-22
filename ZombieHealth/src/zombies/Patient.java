/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombies;

import interfaces.IPatient;
import interfaces.ITableProducer;

/**
 *
 * @author Matheus
 */
public class Patient implements IPatient {
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String UNKNOWN = "unknown";
    
    private String symptons[];

    @Override
    public String ask(String question) {
        if (question.equalsIgnoreCase("PARALYSIS"))
            return symptons[0];
        
        if (question.equalsIgnoreCase("YELLOW_TONG"))
            return symptons[1];
        
        if (question.equalsIgnoreCase("MEMBER_LOSS"))
            return symptons[2];
        
        if (question.equalsIgnoreCase("CHEST_PAIN"))
            return symptons[3];
        
        if (question.equalsIgnoreCase("TREMBLING_FINGER"))
            return symptons[4];
        
        if (question.equalsIgnoreCase("SEVERE_ANGER"))
            return symptons[5];
        
        if (question.equalsIgnoreCase("HISTORY_BACTERIA"))
            return symptons[6];
        
        return UNKNOWN;
    }

    @Override
    public boolean finalAnswer(String answer) {
        /*TODO*/
        return true;
    }
    
    @Override
    public void connect(ITableProducer producer) {
        /*TODO*/
    }
}
