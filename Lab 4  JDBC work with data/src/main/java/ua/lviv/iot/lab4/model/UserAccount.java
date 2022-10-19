package ua.lviv.iot.lab4.model;

import lombok.Data;

@Data
public class UserAccount {
    private String nickname;
    private String name;
    private String surname;
    private Integer credentialId;
}
