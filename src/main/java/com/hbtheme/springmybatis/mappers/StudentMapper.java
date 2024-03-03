package com.hbtheme.springmybatis.mappers;

import com.hbtheme.springmybatis.models.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAllStudents();
    Student findStudentById(Integer id);
    void insertStudent(Student student);
    void updateStudent(Student student, Integer id);
    void deleteStudent(Integer id);
}
