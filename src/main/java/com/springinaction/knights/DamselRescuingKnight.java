package com.springinaction.knights;

/**
 * Listing 1.2 A DamselRescuingKnight can only embark on RescueDamselQuests.
 * Created by Johnny on 11/3/2016.
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
