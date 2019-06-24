package com.agileware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.agileware.model.DateService;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private DateService dateService;

    @Override
    public void run(String...args) throws Exception {
    	dateService.convertCollectionDates();

    }
}