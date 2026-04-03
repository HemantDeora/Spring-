package com.training.dao;

import java.util.*;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.training.entities.Student;

@Transactional
public class StudentDao {

    // ✅ Correct spelling
    private HibernateTemplate hibernateTemplate;

    // ✅ Getter
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    // ✅ Setter (MOST IMPORTANT)
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // Save student
    public int insert(Student student) {
        return (int) this.hibernateTemplate.save(student);
    }

    // Get single student
    public Student getStudent(int studentId) {
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    // Delete
    public void deleteStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        this.hibernateTemplate.delete(student);
    }

    // Update
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }
}