package com.example.adp1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreloadDatabase {
    @Bean
    CommandLineRunner initDatabase(PojoRepository pojoRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                MyPOJO[] pojos = new MyPOJO[] {
                        new MyPOJO("Albus","Dumbledore",0),
                        new MyPOJO("Minerva","McGonagall",0),
                        new MyPOJO("Severus","Snape",0)
                };
                for(MyPOJO pojo : pojos) {
                    pojoRepository.save(pojo);
                }
            }
        };
    }

}
