package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Listing 1.5 SlayDragonQuest is a Quest to be injected into BraveKnight
 * Created by Johnny on 11/3/2016.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
