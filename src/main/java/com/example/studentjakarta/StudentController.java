package com.example.studentjakarta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/students")
public class StudentController {


    private StudentService studentService;

    public StudentController() {
    }

    @Inject
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GET
//    @Path("/hello")
    public String sayHello() {
        return "Hello Students!";
    }
}
