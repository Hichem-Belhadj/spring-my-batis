package com.hbtheme.springmybatis.controllers;

import com.hbtheme.springmybatis.mappers.StudentMapper;
import com.hbtheme.springmybatis.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentMapper studentMapper;

    public StudentController(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping("/findAll")
    public List<Student> findAllStudents() {
        return studentMapper.findAllStudents();
    }
    @GetMapping("/findById/{id}")
    public Student findStudentById(@PathVariable Integer id) {
        return studentMapper.findStudentById(id);
    }
    @PostMapping("/insert")
    public void insertStudent(@RequestBody Student student) {
        studentMapper.insertStudent(student);
    }
    @PutMapping("/update/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable("id") Integer id) {
        studentMapper.updateStudent(student, id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentMapper.deleteStudent(id);
    }
}
