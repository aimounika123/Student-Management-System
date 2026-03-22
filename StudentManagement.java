import java.util.*;
class Student{
    int id;
    String name;
    int marks;

    Student(int id,String name,int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }  
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}
    

    public class StudentManagement{
        public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            ArrayList<Student> students = new ArrayList<>();
            while(true) {
                System.out.println("\n1.Add Student");
                System.out.println("2.View Students");
                System.out.println("3.Delete Student");
                System.out.println("4.Exit");
                System.err.println("5.Search Student");
                System.out.println("6.Update Student");
                System.out.println("Enter choice: ");
                     int choice = sc.nextInt();
                     switch (choice) {
                         case 1:
                            System.out.print("Enter ID:");
                           int id = sc.nextInt();
                           sc.nextLine();

                           System.out.print("Enter name: ");
                           String name = sc.nextLine();
                           System.out.print("Enter Marks: ");
                           int marks = sc.nextInt();

                           students.add(new Student(id,name,marks));
                           System.out.println("Student Added!");
                           break;

                           case 2:
                            if(students.isEmpty()) {
                                System.out.println("No students found.");
                            } else {
                                for(Student s: students) {
                                    System.out.println("ID:"+ s.id + ",Name: " + s.name + ", Marks: " + s.marks);
                                }
                            }
                            break;
                            
                            case 3:
                                System.out.println("Enter ID to delete: ");
                                int deleteID = sc.nextInt();
                                students.removeIf(s -> s.id == deleteID);
                                System.out.println("Students Deleted!");
                                break;
                                
                                case 5:
                                    System.out.print("Enter ID to search");
                                    int searchID = sc.nextInt();
                                    boolean foundSearch = false;
                                    for(Student s: students) {
                                        if(s. id == searchID) {
                                            System.out.println("Student found:");
                                            s.display();
                                            foundSearch = true;
                                            break;
                                        }
                                    }
                                    if(! foundSearch) {
                                        System.out.println("Student not found!");
                                    }
                                        break;

                                        case 6:
                                            System.out.println("Enter ID to updated");
                                            int updateId = sc.nextInt();
                                            sc.nextLine();
                                            boolean found = false;
                                            for(Student s : students) {
                                                if(s.id == updateId) {
                                                    System.out.println("Enter new name: ");
                                                    s.name = sc.nextLine();
                                                    System.out.println("Enter new marks");
                                                    s.marks = sc.nextInt();
                                                    System.out.println("Student Updated!");
                                                    found = true;
                                                    break;
                                                }
                                            }
                                            if(!found) {
                                                System.out.println("Student not found!");
                                            }
                                        break;
                                                

                                            

                                    
                                case 4:
                                    System.out.println("Exiting...");
                                    return;
                                    default:
                                        System.out.println("Invalid choice!");
                        }
                    }
                }
            }
            
