package com.springinaction.concert;

import com.springinaction.concert.config.PerformanceConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Johnny on 11/24/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformanceConfig.class)
public class EncoreIntroducerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private IPerformance musicPerformance;

    @Test
    public void testEncore() {
        Encoreable encoreable = (Encoreable) musicPerformance;
        encoreable.performEncore();
        assertEquals(
                "perform the encore!\n",
                systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
