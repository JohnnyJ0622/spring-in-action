package com.springinaction.knights;

/**
 * Listing 1.3 A BraveKnight is flexible enough to take on any Quest he’s given.
 * Created by Johnny on 11/3/2016.
 */
public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
