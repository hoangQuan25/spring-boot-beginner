package com.hoangquan.demo.rest;

import com.hoangquan.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    @PostConstruct // run only once when the program starts
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Johann", "Ackerman"));
        theStudents.add(new Student("Benedict", "Jay"));
    }

    // get all the students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents; // data in theStudents is only loaded once
    }

    // get one student by id
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // exception for studentId
        if (studentId >= theStudents.size() || studentId < 0) {
            // this only throws to the console, not http res
            throw new StudentNotFoundException("Student Id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }
}
