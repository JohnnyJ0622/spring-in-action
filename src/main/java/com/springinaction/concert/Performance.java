package com.springinaction.concert;

/**
 * Created by Johnny on 11/22/2016.
 */
public class Performance implements IPerformance{
    public void perform() {
        System.out.println("The play is performing.");
    }

    public void anotherPerform() {
        System.out.println("The play is another performing.");
    }
}
