package ru.ranepa;

public class Main {
    public static void main(String[] args) {
        University hogvarts = new University();
        Student student1 = hogvarts.enroll("Daniil Kokaurov");
        hogvarts.addGrade(student1.getStudentID(),5);
        hogvarts.addGrade(student1.getStudentID(),5);
        hogvarts.addGrade(student1.getStudentID(),4);
        hogvarts.addGrade(student1.getStudentID(),4);
        hogvarts.transferToNextCourse(student1.getStudentID());

        Student student2 = hogvarts.enroll("Kirill Anicimov");
        hogvarts.addGrade(student2.getStudentID(),3);
        hogvarts.addGrade(student2.getStudentID(),3);
        hogvarts.addGrade(student2.getStudentID(),4);
        hogvarts.addGrade(student2.getStudentID(),5);
        student2.setCourse(4);
        hogvarts.transferToNextCourse(student2.getStudentID());

        Student student3 = hogvarts.enroll("Harry Potter");
        hogvarts.addGrade(student3.getStudentID(),2);
        hogvarts.addGrade(student3.getStudentID(),2);
        hogvarts.addGrade(student3.getStudentID(),3);
        hogvarts.addGrade(student3.getStudentID(),3);
        try {
            hogvarts.transferToNextCourse(student3.getStudentID());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        Student student4 = hogvarts.enroll("Ron Weasley");
        hogvarts.addGrade(student4.getStudentID(),2);
        hogvarts.addGrade(student4.getStudentID(),2);
        hogvarts.addGrade(student4.getStudentID(),3);
        hogvarts.addGrade(student4.getStudentID(),3);

        hogvarts.exclude(student4.getStudentID());

        hogvarts.report();
        // TODO: создать университет
        // TODO: зачислить 2–3 студентов и поставить оценки
        // TODO: перевести студента со средним баллом больше 2.5
        // TODO: перевести студента со средним баллом 2.5 или меньше
        // TODO: перевести студента с 4 курса
        // TODO: отчислить студента и показать отказ
        // TODO: [вариант N] — выполнить свой кейс, строки начинать с [вариант N]
        // TODO: напечатать сводку — в ней должна быть информация из кейса
    }
}
