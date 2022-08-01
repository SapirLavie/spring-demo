package com.example.springdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
                       Student tom =  new Student(
                                "Tom",
                                "tom99@gmail.com",
                                LocalDate.of(2000, APRIL, 5)
                        );
            Student israel =  new Student(
                    "Israel",
                    "israel76@gmail.com",
                    LocalDate.of(2005, MARCH, 5)

            );
            repository.saveAll(
                    List.of(tom, israel)
            );
        };
    }
}
