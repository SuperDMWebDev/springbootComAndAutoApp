package com.example.springbootComAndAuto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    private int id;
    private String title;
    private String detail;

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
