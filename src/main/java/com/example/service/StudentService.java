package com.example.service;

import com.example.model.Course;
import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.service.Interface.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository StudentRepository;

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        StudentRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public List<Class> getAllClassesOfStudentByID(int studentId) {
        return null;
    }

    @Override
    public List<Class> getAllSchedules(int studentId) {
        return null;
    }

    @Override
    public List<Course> getAllCoursesByDepartmentID(int departmentId) {
        return null;
    }

    @Override
    public List<Class> getClassesOfUserDepartmentById(int studentId, int department) {
        return null;
    }

    @Override
    public List<Course> GetAllMajorsByDepartmentId(int department) {
        return null;
    }

}
