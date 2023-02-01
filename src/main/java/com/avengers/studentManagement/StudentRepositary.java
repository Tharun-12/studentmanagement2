package com.avengers.studentManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentRepositary
{
    Map<Integer,Student> db = new HashMap<>();

    public Student getStudent(int id)
    {
        return db.get(id);
    }

    public String addStudent(Student student)
    {
        int id = student.getAdmnNo();
        db.put(id,student);
        return "Student Added Successfully";
    }

    public String deleteStudent(int id)
    {
        if(db.containsKey(id))
        {
            return "Invalid";
        }
        db.remove(id);
        return "Student remove Successfully";
    }

    public String updateStudent(@RequestParam("id") int id , @RequestParam int age)
    {
        if(!db.containsKey(id))
        {
            return "Invalid";
        }

        db.get(id).setAge(22);

        return "Age Updated Successfully";
    }


}
