package com.avengers.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService
{
    @Autowired
   StudentRepositary studentRepositary;

   public String addStudent(Student student)
   {
       return studentRepositary.addStudent(student);
   }

   public String deleteStudent(int id)
   {
       return studentRepositary.deleteStudent(id);
   }

   public String updateStudent(int id,int age)
   {
       return studentRepositary.updateStudent(id,age);
   }

   public Student getStudent(int id)
   {
       return studentRepositary.getStudent(id);
   }
}
