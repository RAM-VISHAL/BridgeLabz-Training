package com.java_json_practice;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
    public static void main(String[] args) throws Exception {

        Car car = new Car("Tesla", 2024);
        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(car);
        System.out.println(json);
    }
}