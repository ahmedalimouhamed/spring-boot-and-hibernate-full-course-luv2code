package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice your backhand volley";
    }
}
