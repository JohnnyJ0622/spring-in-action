package com.springinaction.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Listing 1.4 To test BraveKnight, inject it with a mock Quest.
 * Created by Johnny on 11/3/2016.
 */

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}