package com.todo.task.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// thay cho các hàm getter, setter
@Builder
@Data
// Hàm tạo có đối
@AllArgsConstructor
// Hàm tạo không có đối
@NoArgsConstructor

// tạo ra 1 đối tượng Student
public class Student {
    private int id;
    private int age;
    private String name;
}
