package com.training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.StudentDao;
import com.training.entities.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDao studentDAO = context.getBean("sDAO", StudentDao.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;

        while (flag) {
            try {
                System.out.println("\nPress 1 For new Student");
                System.out.println("Press 2 For display all Students");
                System.out.println("Press 3 For getDetails of Single Student");
                System.out.println("Press 4 For Delete Students");
                System.out.println("Press 5 For Update Students");
                System.out.println("Press 6 for Exit");

                System.out.println("Enter your Choice");
                int inp = Integer.parseInt(br.readLine());

                switch (inp) {

                case 1:
                    // Insert
                    System.out.println("Enter user id");
                    int uID = Integer.parseInt(br.readLine());

                    System.out.println("Enter name");
                    String name = br.readLine();

                    System.out.println("Enter city");
                    String city = br.readLine();

                    Student s = new Student();
                    s.setId(uID);
                    s.setName(name);
                    s.setStudentCity(city);

                    int r = studentDAO.insert(s);
                    System.out.println("Data Inserted: " + r);
                    break;

                case 2:
                    // Display All
                    List<Student> students = studentDAO.getAllStudents();
                    for (Student st : students) {
                        System.out.println("ID: " + st.getId());
                        System.out.println("Name: " + st.getName());
                        System.out.println("City: " + st.getStudentCity());
                        System.out.println("----------------------");
                    }
                    break;

                case 3:
                    // Get Single
                    System.out.println("Enter Student ID");
                    int id = Integer.parseInt(br.readLine());

                    Student student = studentDAO.getStudent(id);

                    if (student != null) {
                        System.out.println("ID: " + student.getId());
                        System.out.println("Name: " + student.getName());
                        System.out.println("City: " + student.getStudentCity());
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    // Delete
                    System.out.println("Enter Student ID to delete");
                    int delId = Integer.parseInt(br.readLine());

                    studentDAO.deleteStudent(delId);
                    System.out.println("Deleted successfully!");
                    break;

                case 5:
                    // Update
                    System.out.println("Enter Student ID to update");
                    int upId = Integer.parseInt(br.readLine());

                    System.out.println("Enter new name");
                    String newName = br.readLine();

                    System.out.println("Enter new city");
                    String newCity = br.readLine();

                    Student upStudent = new Student();
                    upStudent.setId(upId);
                    upStudent.setName(newName);
                    upStudent.setStudentCity(newCity);

                    studentDAO.updateStudent(upStudent);
                    System.out.println("Updated successfully!");
                    break;

                case 6:
                    // Exit
                    flag = false;
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}