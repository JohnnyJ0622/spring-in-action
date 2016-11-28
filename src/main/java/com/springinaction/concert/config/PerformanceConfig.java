package com.springinaction.concert.config;

import com.springinaction.concert.Audience;
import com.springinaction.concert.EncoreableIntroducer;
import com.springinaction.concert.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Johnny on 11/22/2016.
 */
@Configuration
@EnableAspectJAutoProxy
public class PerformanceConfig {
    @Bean
    public Performance perform() {
        return new Performance();
    }

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return  new EncoreableIntroducer();
    }
}
