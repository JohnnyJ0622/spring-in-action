package com.springinaction.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by Johnny on 11/24/2016.
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.springinaction.concert.IPerformance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
