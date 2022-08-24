package com.sankar.demo.controller;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {

    private long id;
    private String name;

}
