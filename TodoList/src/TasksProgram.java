import java.util.ArrayList;
import java.util.Scanner;
public class TasksProgram {
    ArrayList<String> tasks = new ArrayList<String>();
    

    public TasksProgram() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added: " +  task);
    }

    

public void showTasks() {
    for (int i = 0; i < tasks.size(); i++) {
        System.out.println(i+1 + ") " + tasks.get(i));
    }

}

public void RemoveTask(int i) {
    if (i >= 0 && i < tasks.size() ) {
        String deleted = tasks.remove(i);
        System.out.println("Removed: " + deleted);
    } else { 
        System.out.println("No task needs to be added");

    }
    
}
public static void main(String [] args) {
    
   
        
        TasksProgram taskmanager = new TasksProgram();
        Scanner keyboard = new Scanner(System.in);

        while (true) { 
            
            System.out.println("Axel's To-Do List");
            System.out.println("""
                               1) Add Tasks
                               
                               2) Show Tasks
                               
                               3) Remove Tasks
                               
                               4) Quit  
                               
                               
                               """
                                
                               );
            
            
         

            
        

            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Add your task: ");
                    String task1 = keyboard.nextLine();
                    taskmanager.addTask(task1);
                    System.out.println("Task added: " + task1);

                    break;
                }
                case 2 -> { 
                  String task;  
                 do { 
                
                    taskmanager.showTasks();
                    System.out.println("Exit?");
                    System.out.println("Just Click Enter: ");
                    task = keyboard.nextLine();
                    } while (task.equals(""));
                    break;
                  
                }
                case 3 -> {
                    System.out.println("Enter the number listed to delete the task ");
                    taskmanager.showTasks();
                    int deletenum = keyboard.nextInt() - 1;
                    taskmanager.RemoveTask(deletenum);
                    break;
                }
                case 4 -> {
                    System.out.println("System closing");
                    System.exit(0);
                }
            }
    
        }
    }
}

        

