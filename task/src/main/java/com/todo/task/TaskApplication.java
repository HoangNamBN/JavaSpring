package com.todo.task;

import com.todo.task.TuHoc.Dress;
import com.todo.task.TuHoc.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.sound.midi.Soundbank;

//thêm dòng annotation này để tìm kiếm các bean trong đường dẫn đó
//@ComponentScan("com.example.demo") // trong dấu "" là đường dẫn
// muốn tìm các bean ở nhiều class giới hạn khác thì dùng dấu {},
//@ComponentScan({"com.example.demo"},{})
// annotation SpringBootApplocation
@SpringBootApplication
public class TaskApplication {
    public static void main(String[] args) {
        // TashApplication.class là tên class chính
        SpringApplication.run(TaskApplication.class, args);
        // Bean thực chất là object java
        // biến này dùng để lấy ra hứng kết quả trả về của hàm run
//        ApplicationContext context = SpringApplication.run(TaskApplication.class, args);
//        Outfit outfit = context.getBean(Outfit.class);
//        System.out.println("Insstance: " + outfit);
//        outfit.wear();
    }
}
