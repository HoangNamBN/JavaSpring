package com.todo.task.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Builder
@Data
// Hàm tạo có đối
@AllArgsConstructor
// Hàm tạo không có đối
@NoArgsConstructor
public class RandomNumber {
    private int max;
    private int min;

    public int Random2So(int max, int min){
        Random random = new Random();
        return random.nextInt((max-min) + 1) + min;
    }
}
