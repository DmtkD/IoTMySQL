package ua.lviv.iot.lab4.model;

import lombok.Data;

@Data
public class Establishment {
    private Integer id;
    private String name;
    private Integer typeOfEstablishment;
    private float rating;
    private Integer streetId;
    private Integer InformationAboutOwnerId;
}
