/*
 *  NOT "true table"
 *  ___________________
 *  |    p   | not(p) |
 *  |--------|--------|
 *  |  true  | false  |
 *  |  false | true   |
 *
 * Representation: 
 * not(p)
 * ¬p
 * ˜p
 * !p
 */
package com.tcarvi.aiquarkustemplate.ambient.operator.data;

// long Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

public class UnaryNot {
    public long not(long booleanos) {
        // TODO
        return booleanos; 
    }
}