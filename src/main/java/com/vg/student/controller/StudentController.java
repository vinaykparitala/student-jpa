package com.vg.student.controller;

import com.vg.student.model.Student;
import com.vg.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/students")
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> getName()
    {
        return studentService.getAllStudents();
       // List<Student> sList = new ArrayList<>();
      //  sList.add(new Student(1,"Vinay"));
       // sList.add(new Student(2,"Sai"));

       // return sList;
    }

    @PostMapping
    public String addStudent(@RequestBody Student s)
    {
        studentService.saveStudent(s);

        return "Student Created";
    }


    @GetMapping("{id}")
    public Student addStudent(@PathVariable("id") int studentId)
    {
        return studentService.findStudent(studentId);


    }

    @PutMapping("{id}")
    public Student updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);


    }

    @DeleteMapping("{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return studentService.deleteStudent(id);

    }


}
