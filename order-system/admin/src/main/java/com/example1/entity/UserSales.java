package com.example1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserSales {
    private Integer userId;

    private String username;

    private String password;

    private String portrait;

    private Integer role;

    private String phone;

    private Float salary;

    private Float bonus;

    private Integer sales;
}
