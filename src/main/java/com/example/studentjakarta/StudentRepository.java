package com.example.studentjakarta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@ApplicationScoped
@Named("studentRepository")
public class StudentRepository {

    private List<Student> students = List.of(
            new Student("1", "Anna", "Computer Science"),
            new Student("2", "Bob", "Mathematics"),
            new Student("3", "Clarissa", "Physics")
    );

    public StudentRepository() { }

    public List<Student> list() {
        return students;
    }

    public Student get(String id) {
        return students.stream()
                .filter(student -> student.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(String id) {
        students.removeIf(student -> student.id().equals(id));
    }

    public void update(Student student) {
        remove(student.id());
        add(student);
    }
}