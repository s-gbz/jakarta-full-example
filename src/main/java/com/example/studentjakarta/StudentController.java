package com.example.studentjakarta;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/students")
public class StudentController {

    private final StudentService studentService;

    @Inject
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GET
    public List<Student> getAllStudents() {
        return studentService.list();
    }

    @POST
    public Response add(@Valid Student student) {
        studentService.add(student);
        return Response.status(201).build();
    }
}
