package com.metrics.social.twetter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.metrics")
@PropertySource({ "file:///home/mh/twitter.properties" })
public class TwitterConfig {
    
}