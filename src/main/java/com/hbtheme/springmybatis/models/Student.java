package com.hbtheme.springmybatis.models;

import lombok.*;

@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
