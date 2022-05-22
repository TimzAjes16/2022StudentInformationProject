package com.example.oop.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {
    
    @Test
    public void testStudent(){
        Student Sally = new Student();
        Sally.setFname("Sally");

        // Test for Sally Object
        assertSame("Sally", Sally.getFname());

    }
}
