package com.agileware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.agileware.model.DateService;
import com.agileware.model.ImportData;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private DateService dateService;
//    @Autowired
//    private ImportData importdata;

    @Override
    public void run(String...args) throws Exception {
    dateService.convertCollectionDates();
    dateService.convertSubjectDates();
    
//    	importdata.importCollectionData();

    }
}