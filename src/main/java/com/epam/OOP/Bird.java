package com.epam.OOP;

public class Bird extends OOP.Animal {

    public Bird(){
        super("blue",2, false);
    }

    public String getDescription() {
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() +
                " paws and " + ( hasFur() ? "fur" : "no fur") +
                ". Moreover, it has 2 wings and can fly.";
    }


}
