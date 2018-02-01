package org.pltw.examples.animalapp;

import java.util.ArrayList;

/**
 * Created by yu55547 on 1/31/2018.
 */

public class Seal extends Animal implements Fun {

    public Seal() {

    }

    public String say() {

        return "Arf";
    }

    //Step 22-23 declaration of animal
    public String animal() {
        return "Seal";
    }

    public String play() {
        return "The seal bounces a ball off its nose.";
    }

}
