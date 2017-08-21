package com.londonappbrewery.flashchatnewfirebase;

/**
 * Created by suraj on 09-08-2017.
 */

public class Bean {
private String mesage;
    private String name;

    public Bean(String mesage, String name) {
        this.mesage = mesage;
        this.name = name;
    }

    public Bean() {
    }

    public String getMesage() {
        return mesage;
    }

    public String getName() {
        return name;
    }
}
