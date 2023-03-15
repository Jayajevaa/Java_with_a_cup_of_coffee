import java.util.Scanner;
import college.book;
public class Library { 
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
          
        try (
               
        
        Scanner input = new Scanner(System.in)) {
            
            System.out.println(
                "---------------------WELCOME TO LIBRARY---------------------");
            System.out.println(
                "                  Select From The Following Options:               ");
            System.out.println(
                "-----------------------------------------------------------------------");
 
            
            books ob = new books();
            
            students obStudent = new students();
 
            int choice;
            int searchChoice;
 
            
            
            do {
 
                ob.dispMenu();
                choice = input.nextInt();
 
                
                switch (choice) {
 
                    
                case 1:
                
                    book b = new book();
                    ob.addBook(b);
                    break;
                    
 
                    
                case 2:
                    ob.upgradeBookQty();
                    break;
 
                
                case 3:
 
                    System.out.println(
                        "press 1 to Search with Book Serial No.");
                    System.out.println(
                        "press 2 to Search with Book's Author Name.");
                    searchChoice = input.nextInt();
 
                   
                    switch (searchChoice) {
 
                       
                    case 1:
                        ob.searchBySno();
                        break;
 
                      
                    case 2:
                        ob.searchByAuthorName();
                    }
                    break;
 
                    
                case 4:
                    ob.showAllBooks();
                    break;
 
                   
                case 5:
                    student s = new student();
                    obStudent.addStudent(s);
                    break;
 
                    
                case 6:
                    obStudent.showAllStudents();
                    break;
 
                   
                case 7:
                    obStudent.checkOutBook(ob);
                    break;
 
                   
                case 8:
                    obStudent.checkInBook(ob);
                    break;
                default:
                    System.out.println("THANK YOU");
                }
            }
            while (choice != 0);
        }
    }
}