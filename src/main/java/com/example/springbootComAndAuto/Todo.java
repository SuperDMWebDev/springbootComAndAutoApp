package com.example.springbootComAndAuto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    public String title;
    public String detail;

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
