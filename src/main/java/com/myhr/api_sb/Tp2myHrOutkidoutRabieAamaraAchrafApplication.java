package com.myhr.api_sb;

import com.myhr.api_sb.repository.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2myHrOutkidoutRabieAamaraAchrafApplication implements CommandLineRunner {

    @Autowired
    private CustomProperties customProperties;
    public static void main(String[] args) {
        SpringApplication.run(Tp2myHrOutkidoutRabieAamaraAchrafApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("le url de cette app et "+customProperties.getApiUrl());
    }
}
