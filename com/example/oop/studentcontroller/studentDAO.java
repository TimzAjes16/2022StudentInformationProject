package com.example.oop.studentcontroller;

import java.util.List;

import com.example.oop.model.Student;

public interface studentDAO {
    
    public void save(Student students);
    public void update(Student students);
    public void delete(Student students);
    public Student get(int id);
    public List<Student> list();


}
