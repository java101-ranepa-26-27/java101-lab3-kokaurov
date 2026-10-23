package ru.ranepa;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    private Student findStudentById(long id){
        for (Student student: students ){
            if (Student.id == id){
                return student;
            }
        }
        return null;
    }
    public void addGrades(long id, int grade) {
        Student student = findStudentById(id);
        if (student == null) {
            throw new RuntimeException("Student not found");
        }
        student.getGrades().add(grade);
    }



    public void exclude(long id){
        Student student = findStudentById(id);
        if (student == null) {
            throw new RuntimeException("Student not found");
        }
        if (!student.getState().equals(State.ACTIVE)){
            throw new RuntimeException("Student not active");
        }
        student.setState(State.DISMISSED);
    }








}



