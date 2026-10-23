package ru.ranepa;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    private Student findStudentById(long id){
        for (Student student: students ){
            if (student.getStudentID() == id){
                return student;
            }
        }
        return null;
    }
    public void addGrade(long id, int grade) {
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
        System.out.println("The student "+ student.getName() +" has been expelled.");
    }
    
    public void transferToNextCourse(long id){
        Student student = findStudentById(id);
        if (student == null) {
            throw new RuntimeException("Student not found");
        }
        if (!student.getState().equals(State.ACTIVE)){
            throw new RuntimeException("Student not active");
        }
        if (student.average() <= 2.5) {
            System.out.println("The student "+ student.getName() +" was expelled due to poor academic performance!");
            student.setState(State.DISMISSED);
            return;
        }
        if (student.getCourse() == 4){
            System.out.println("The student "+ student.getName() +" has completed the 4th year, and now he is graduated.");
            student.setState(State.GRADUATED);
            return;
        }
        System.out.println("The student "+ student.getName() +" is eligible to move on to the next course!");
        student.setCourse(student.getCourse()+1);
    }

    public Student enroll(String name){
        Student student = Student.create(name);
        students.add(student);
        return student;
    }


    public void report(){
        for (Student studentCatalog:students){
            studentCatalog.printReport();
        }

    }





}



