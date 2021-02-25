package org.example;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface Employee {
 
    String name();
    int age();
    String department();
    
    class Builder extends Employee_Builder {
    }
}