package com.mdw;

import java.time.LocalDate;

public class Dog {
    private String name;
    private LocalDate date;

    public Dog(String name, LocalDate now) {
        this.name = name;
        this.date = now;
    }

    public static Dog create(String name) {

        return new Dog(name, LocalDate.now());
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getDate(){
        return this.date;
    }
    
}
