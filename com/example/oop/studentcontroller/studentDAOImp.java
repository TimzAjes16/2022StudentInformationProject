package com.example.oop.studentcontroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.swing.JOptionPane;

import com.example.oop.model.Student;
import com.example.oop.studentdb.studentDb;

// 'Imp' means implements
public class studentDAOImp implements studentDAO{

    @Override
    public void delete(Student students) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Student get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Student> list() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Student students) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Student students) {
        
        try {
            Connection con = studentDb.getConnection(); // call getConnection from studentDb Class 
            String sql = "INSERT INTO students(fname, course, fee) VALUES (7, 7, 7)"; // sql statement for table insert
            PreparedStatement ps = con.prepareStatement(sql); // preparedStatement object for sql
            ps.setString(1, students.getFname()); // get fname for value1 of sql insert statement
            ps.setString(2, students.getCourse()); // get course for value1 of sql insert statement
            ps.setInt(3, students.getFee()); // get fee for value1 of sql insert statement
            ps.executeUpdate(); // actually executes sql code
            JOptionPane.showMessageDialog(null, "Saved");

            
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
    
}
