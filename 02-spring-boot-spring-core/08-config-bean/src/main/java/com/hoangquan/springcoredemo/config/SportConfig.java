package com.hoangquan.springcoredemo.config;

import com.hoangquan.springcoredemo.common.Coach;
import com.hoangquan.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("swim")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
