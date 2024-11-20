/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CourseManager {
    private ArrayList<Course> courses;
    private Scanner scanner;
    
    CourseManager() {
        courses = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public Course findCourseById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
    
    public void addCourse() {
        System.out.println("--- ADD NEW COURSE ---");
        System.out.print("Enter Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        if (findCourseById(id) == null) {
            System.out.print("Enter Course Name: ");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                System.out.println("Invalid course name, please try again.");
                return;
            }
            System.out.print("Enter Course Teacher: ");
            String teacher = scanner.nextLine();
            if (teacher.isBlank()) {
                System.out.println("Invalid teacher name, please try again.");
                return;
            }
            System.out.print("Enter Duration: ");
            double duration = scanner.nextDouble();
            scanner.nextLine();
            if (duration <= 0) {
                System.out.println("Invalid duration, please try again.");
                return;
            }
            System.out.print("Enter Fee: ");
            double fee = scanner.nextDouble();
            scanner.nextLine();
            if (fee <= 0) {
                System.out.println("Invalid fee, please try again.");
                return;
            }
            
            courses.add(new Course(id, name, teacher, duration, fee));
            System.out.println("Course added successfully!");
        } else {
            System.out.println("Course ID is existing, please try an other ID.");
            return;
        }
    }
    
    public void displayCourses() {
        System.out.println("--- COURSES LIST ---");
        if (courses.isEmpty()) {
            System.out.println("No course to display!");
        } else {
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }
    
    public void searchCourseByTeacher() {
        System.out.println("--- SEARCH COURSE BY TEACHER ---");
        if (courses.isEmpty()) {
            System.out.println("No course to search!");
        } else {
            System.out.print("Enter Teacher Name: ");
            String teacher = scanner.nextLine().toLowerCase();
            
            boolean found = false;
            for (Course course : courses) {
                if (course.getTeacher().toLowerCase().contains(teacher)) {
                    System.out.println(course);
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("Cannot find course with teacher: " + teacher);
            }
        }
    }
    
    public void deleteCourse() {
        System.out.println("--- DELETE COURSE ---");
        if (courses.isEmpty()) {
            System.out.println("No course to delete!");
        } else {
            System.out.print("Enter Course ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            if (findCourseById(id) != null) {
                courses.remove(findCourseById(id));
                System.out.println("Course deleted successfully!");
            } else {
                System.out.println("Cannot find course with ID: " + id);
            }
        }
    }
    
    public void sortCourseByFee() {
        if (courses.isEmpty()) {
            System.out.println("No course to sort.");
            return;
        } else {
            courses.sort(Comparator.comparingDouble(Course::getFee));
            System.out.println("Course sorted by fee successfully!");
            displayCourses();
        }
    }
    
    public void sortCourseByDuration() {
        if (courses.isEmpty()) {
            System.out.println("No course to sort.");
            return;
        } else {
            courses.sort(Comparator.comparingDouble(Course::getDuration).reversed());
            System.out.println("Course sorted by duration successfully!");
            displayCourses();
        }
    }
    
    public void updateCourseById() {
        if (courses.isEmpty()) {
            System.out.println("No course to update.");
            return;
        } else {
            System.out.print("Enter Course ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            Course course = findCourseById(id);
            if (course == null) {
                System.out.println("Cannot find course with ID: " + id);
                return;
            } else {
                System.out.print("Enter New Name (leave blank to keep current name): ");
                String newName = scanner.nextLine();
                System.out.print("Enter New Teacher (leave blank to keep current teacher): ");
                String newTeacher = scanner.nextLine();
                System.out.print("Enter New Duration (type 0 to keep current duration): ");
                double newDuration = scanner.nextDouble();
                scanner.nextLine();
                if (newDuration < 0) {
                    System.out.println("Invalid duration, please try again.");
                    return;
                }
                System.out.print("Enter New Fee (type 0 to keep current fee): ");
                double newFee = scanner.nextDouble();
                scanner.nextLine();
                if (newFee < 0) {
                    System.out.println("Invalid fee, please try again.");
                    return;
                }
                
                if (!newName.isBlank()) {
                    course.setName(newName);
                }
                if (!newTeacher.isBlank()) {
                    course.setTeacher(newTeacher);
                }
                if (newDuration != 0) {
                    course.setDuration(newDuration);
                }
                if (newFee != 0) {
                    course.setFee(newFee);
                }
                System.out.println("Course updated successfully");
            }
        }
    }
    
    public void highestCourse() {
        if (courses.isEmpty()) {
            System.out.println("No course avaiable.");
        } else {
            Course highest = courses.stream().max(Comparator.comparingDouble(Course :: getFee)).orElse(null);
            System.out.println("The Highest Course: ");
            System.out.println(highest);
        }
    }
}
