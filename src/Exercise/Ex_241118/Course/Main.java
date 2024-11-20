/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Course;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseManager course = new CourseManager();
        int pick, pick5;
        
        do {
            System.out.println("===== COURSE MANAGEMENT =====");
            System.out.println("1. Add Course");
            System.out.println("2. Display Course List");
            System.out.println("3. Search Course By Teacher");
            System.out.println("4. Delete Course");
            System.out.println("5. Sort Course");
            System.out.println("6. Update Course");
            System.out.println("7. Highest Course");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    course.addCourse();
                    break;
                case 2:
                    course.displayCourses();
                    break;
                case 3:
                    course.searchCourseByTeacher();
                    break;
                case 4:
                    course.deleteCourse();
                    break;
                case 5:
                    do {
                        System.out.println("-----\nSORT COURSE: ");
                        System.out.println("a. Sort By Fee");
                        System.out.println("b. Sort By Duration");
                        System.out.println("c. Back");
                        System.out.print("Choose an option: ");
                        pick5 = scanner.next().charAt(0);
                        
                        switch (pick5) {
                            case 'a':
                                course.sortCourseByFee();
                                break;
                            case 'b':
                                course.sortCourseByDuration();
                                break;
                            case 'c':
                                break;
                            default:
                                System.out.println("Invalid chosen, please try again");
                        }
                    } while (pick5 != 'c');
                    break;
                case 6:
                    course.updateCourseById();
                    break;
                case 7:
                    course.highestCourse();
                    break;
                case 8:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid chosen, please try again.");
            }
        } while (pick != 8);
        
        scanner.close();
    }
}
