/*package com.example.dei_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeiProjectApplication.class, args);
    }

}*/
package com.example.dei_project;

import com.example.dei_project.model.employee;
import com.example.dei_project.service.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DeiProjectApplication implements CommandLineRunner {

    @Autowired
    private CsvService csvService;

    public static void main(String[] args) {
        SpringApplication.run(DeiProjectApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Path to your CSV file
        String filePath = "src/main/data/DEI.csv";

        // Use CsvService to read the CSV file
        List<employee> employees = csvService.readEmployeesFromCsv(filePath);

        // Print the data to verify
        //employees.forEach(System.out::println);
        employees.stream()
                .limit(5) // Limits to the first 5 records
                .forEach(System.out::println);
    }
}

