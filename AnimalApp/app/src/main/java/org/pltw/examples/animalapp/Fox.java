package org.pltw.examples.animalapp;

/**
 * Created by yu55547 on 2/1/2018.
 */

//Step 29
public class Fox extends Animal implements Fun {
    public Fox() {

    }

    public String say() {
        return "Woof";
    }

    public String animal() {
        return "Fox";
    }

    public String play() {
        return "The fox chases mice and digs holes!";
    }
}
