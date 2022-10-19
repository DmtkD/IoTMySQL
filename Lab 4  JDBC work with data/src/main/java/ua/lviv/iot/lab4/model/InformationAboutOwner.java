package ua.lviv.iot.lab4.model;

import lombok.Data;

@Data
public class InformationAboutOwner {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private Integer fortunes;
}
