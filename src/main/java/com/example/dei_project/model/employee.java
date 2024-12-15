package com.example.dei_project.model;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class employee { // Lowercase "e" for class name
    @CsvBindByName(column = "Id")
    private String id;

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Surname")
    private String surname;

    @CsvBindByName(column = "Division")
    private String division;

    @CsvBindByName(column = "Manager")
    private String manager;

    @CsvBindByName(column = "Gender")
    private String gender;

    @CsvBindByName(column = "Ethnicity")
    private String ethnicity;

    @CsvBindByName(column = "Disability")
    private String disability;

    @CsvBindByName(column = "Veteran")
    private String veteran;

    @CsvBindByName(column = "Age")
    private int age;

    @CsvBindByName(column = "Nationality")
    private String nationality;

    @Override
    public String toString() {
        return "employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", division='" + division + '\'' +
                ", manager='" + manager + '\'' +
                ", gender='" + gender + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", disability='" + disability + '\'' +
                ", veteran='" + veteran + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
