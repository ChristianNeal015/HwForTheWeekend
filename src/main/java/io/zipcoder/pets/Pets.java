package io.zipcoder.pets;

import javax.swing.*;

public class Pets {

    private String name;

    public Pets(String name) {
        this.name = name;
    }
    public String speak(){
        return "Finally";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
