package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws NoStudentIDFoundException {
    if (Student.getValueOf(studentID) == null) {
      throw new NoStudentIDFoundException("Could not find student with ID " + studentID);
    } else {
      return Student.getValueOf(studentID);
    }

  }

  public static void main(String[] args) throws NoStudentIDFoundException {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      try {
        Student student = manager.find(1000);
        System.out.println("Student name " + student.getName());

      } catch (NoStudentIDFoundException e) {
        System.err.print(e);
      }
    }
  }
}
