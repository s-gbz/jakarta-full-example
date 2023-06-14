package com.example.studentjakarta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@ApplicationScoped
@Named("studentService")
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService() {
    }

    @Inject
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> list() {
        return studentRepository.list();
    }

    public Student get(String id) {
        return studentRepository.get(id);
    }

    public void add(Student student) {
        studentRepository.add(student);
    }

    public void remove(String id) {
        studentRepository.remove(id);
    }

    public void update(Student student) {
        studentRepository.update(student);
    }
}