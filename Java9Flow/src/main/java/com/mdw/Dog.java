package com.mdw;

import java.time.LocalDate;
import java.util.Date;

public class Dog {
    private String name;
    private Date time;

    public Dog(String name,  Date time) {
        this.name = name;
        this.time = time;
    }

    public static Dog create(String name) {
        Date timeNow = new Date();
        return new Dog(name, timeNow );
    }

    public String getName(){
        return this.name;
    }


    public long getTimeNow(){
        return this.time.getTime();
    }
    
}
