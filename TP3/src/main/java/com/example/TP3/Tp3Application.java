package com.example.TP3;

import com.example.TP3.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//@RestController
public class Tp3Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);
	}
@GetMapping
	public List<Student> hello(){
		return List.of(new Student(1L, "Mariem", "mariem@gmail.com" , LocalDate.of(2001, Month.MAY,2),22));

}
}
