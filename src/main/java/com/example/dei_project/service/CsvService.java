package com.example.dei_project.service;

import com.example.dei_project.model.employee;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.List;

@Service
public class CsvService {

    public List<employee> readEmployeesFromCsv(String filePath) {
        try {
            return new CsvToBeanBuilder<employee>(new FileReader(filePath))
                    .withType(employee.class) // Maps to the employee class
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading CSV file: " + e.getMessage());
        }
    }
}

