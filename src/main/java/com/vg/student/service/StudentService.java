package com.vg.student.service;

import com.vg.student.dao.StudentRepository;
import com.vg.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents()
    {
        List<Student> students = new ArrayList<>();
         studentRepository.findAll().forEach(s -> students.add(s));
         return students;

    }

    public void saveStudent(Student student)
    {

        studentRepository.save(student);

    }


    public Student findStudent(int id)
    {

       return  studentRepository.findById(id).get();

    }



    public Student updateStudent(Student student)
    {

        return  studentRepository.save(student);

    }

    public String deleteStudent(int id)
    {

          studentRepository.delete(findStudent(id));
          return "Student "+id+" deleted";

    }

}
