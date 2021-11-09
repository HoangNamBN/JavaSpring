package com.todo.task.controller;

import com.todo.task.model.BaseResponse;
import com.todo.task.model.timSoLonNhat;
import com.todo.task.model.RandomNumber;
import com.todo.task.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nam")
public class DemoApplication {
    // trinh duyệt chạy method là Get
    @GetMapping("/helloworld")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/random")
    public int ResultRandom() {
        RandomNumber randomNumber = new RandomNumber();
        int result = randomNumber.Random2So(10, 1);
        return result;
    }

    @PostMapping("/helloworld1")
    // dạng 1: dạng Json
    public Student hello1() {
        Student student = Student.builder().id(1).age(10).name("name").build();
        return student;
    }

    @PostMapping("/helloworld3")
    // dạng 1: dạng Json
    public int timMax() {
        int [] arr = new int[]{1, 4, 2, 10, 3, 8, 7, 9};
        timSoLonNhat max = new timSoLonNhat();
        int kq  = max.TimMax(arr);
        return kq;
    }

    // dạng 2:
    @PostMapping("/helloworld2")
    public ResponseEntity<BaseResponse> hello2(){
        BaseResponse baseResponse = BaseResponse.builder().code(0).message("Đây là một mô tả lỗi cho người dùng").build();
        return ResponseEntity.badRequest().body(baseResponse);
    }
}