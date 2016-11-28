package com.springinaction.soundsystem.config;

import com.springinaction.soundsystem.CDPlayer;
import com.springinaction.soundsystem.CompactDisc;
import com.springinaction.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Listing 2.3 @ComponentScan enables component scanning
 * Created by Johnny on 11/11/2016.
 */
@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}
