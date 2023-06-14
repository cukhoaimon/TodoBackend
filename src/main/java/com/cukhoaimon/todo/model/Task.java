package com.cukhoaimon.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
    private String name;
    private String status;


    public Task() {
    }
}
