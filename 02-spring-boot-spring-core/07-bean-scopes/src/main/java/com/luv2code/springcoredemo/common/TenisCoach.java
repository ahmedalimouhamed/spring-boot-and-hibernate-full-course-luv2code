package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{
    public TenisCoach() {
        System.out.println("in constructor : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice your backhand volley";
    }
}
