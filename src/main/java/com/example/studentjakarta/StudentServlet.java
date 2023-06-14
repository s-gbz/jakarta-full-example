package com.example.studentjakarta;

import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

    private final StudentService studentService;

    @Inject
    public StudentServlet(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON);

        response.getWriter().println(studentService.list());
    }
}
