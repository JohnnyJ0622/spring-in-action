package com.springinaction.concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Johnny on 11/22/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformanceConfig.class)
public class PerformanceTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private Performance performance;

    @Test
    public void perform() {
        performance.perform();
        assertEquals(
                "Silencing cell phones\n" +
                        "Taking seats\n" +
                        "The play is performing.\n" +
                        "CLAP CLAP CLAP!!!\n",
                systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void anotherPerform() {
        performance.anotherPerform();
        assertEquals(
                "Silencing cell phones\n" +
                        "Taking seats\n" +
                        "The play is another performing.\n" +
                        "CLAP CLAP CLAP!!!\n",
                systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
