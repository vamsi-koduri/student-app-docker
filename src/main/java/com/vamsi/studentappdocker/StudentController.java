package com.vamsi.studentappdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getstudents")
     public  List<Student> getStudents(){
//             return List.of(
//                     new Student(1,"vamsi",23),
//                     new Student(2,"hp",22),
//                     new Student(1,"apple",21)
//             );
             return repo.findAll();
    }


    @RequestMapping("/addstudent")
    public  void  addStudent(){
        Student s=new Student();
        s.setName("hihi");
        s.setAge(23);
        repo.save(s);
    }

}
