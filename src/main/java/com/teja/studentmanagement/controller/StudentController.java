package com.teja.studentmanagement.controller;

import com.teja.studentmanagement.entity.Student;
import com.teja.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    // Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    // Get only student we want
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentRepository.findById(id).get();
        return  student;
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudents(@PathVariable int id) {
        Student student = studentRepository.findById(id).get();
        student.setName("Poorna");
        student.setPercentage(90);
        student.setBranch("CSE");
        studentRepository.save(student);
        return student;
    }

    @DeleteMapping("student/delete/{id}")
    public void removeStudent(@PathVariable int id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
    }
}
