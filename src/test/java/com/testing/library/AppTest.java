package com.testing.library;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	boolean val = false;
    	int num = App.countBook();
    	if(num>1000) {
			val = true;
		}
        assertEquals(true,val);
        System.out.println("Number of Tamil books present are: "+num);
    }
    
}
