package com.example.TP3;



import com.example.TP3.Model.Student;
import com.example.TP3.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student folla = new Student(
                    "Mariam",
                    "tlatli.mariem@gmail.com",
                    LocalDate.of(2001, Month.OCTOBER,11),
                    23);

            Student chaima = new Student(
                    "Rim",
                    "rima@gmail.com",
                    LocalDate.of(2001, Month.OCTOBER,7),
                    23);
            repository.saveAll(List.of(chaima,folla));
        };


    }

}