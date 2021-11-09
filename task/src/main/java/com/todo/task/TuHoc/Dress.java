package com.todo.task.TuHoc;

import org.springframework.stereotype.Component;

// đánh dấu là bean
@Component
public class Dress implements Outfit{
    @Override
    public void wear(){
        System.out.println("Đang mặc váy");
    }
}
