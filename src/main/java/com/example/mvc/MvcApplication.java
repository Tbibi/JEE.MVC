package com.example.mvc;

import com.example.mvc.entities.Patient;
import com.example.mvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"AHmed",new Date(),false,99));
            patientRepository.save(new Patient(null,"ibra",new Date(),true,44));
            patientRepository.save(new Patient(null,"moha",new Date(),true,98));
            patientRepository.save(new Patient(null,"toto",new Date(),false,67));
            patientRepository.save(new Patient(null,"soso",new Date(),true,1));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };

    }


}
