import java.util.ArrayList;
import java.util.Scanner;
public class TasksProgram {
    //Array list objects
    ArrayList<String> tasks = new ArrayList<String>();
    
    public static void main(String [] args) {
    
   
        //Instance variable of TasksProgram
        TasksProgram taskmanager = new TasksProgram();
        Scanner keyboard = new Scanner(System.in);

        //repeats the main program indefinitely 
        while (true) { 
            
            System.out.println("Axel's To-Do List");
            System.out.println("1) Add Tasks \n2) Show Tasks \n3) Remove Tasks \n4) Quit" );
            
            
         

            
        

            int num = keyboard.nextInt();
            keyboard.nextLine();

            switch (num) {
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
                    System.out.println("Just type 'yes': ");
                    task = keyboard.nextLine();
                    } while (!task.equals("yes"));
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
                    String userint;
                    System.out.println("");
                    System.out.println("You sure you want to exit?");
                    System.out.println("Type in 'yes'");
                    userint = keyboard.nextLine();
                    while (userint.equals("yes")) {
                        keyboard.close();
                        System.exit(0);
                    }
                }
            }
    
        }
    }

    //no arg constructor for making object arraylist
    public TasksProgram() {
        this.tasks = new ArrayList<>();
    }

    //Adds the new user input task to the arraylist, task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added: " +  task);
    }

    
//displays the tasks itself
public void showTasks() {
    for (int i = 0; i < tasks.size(); i++) {
        System.out.println(i+1 + ". " + tasks.get(i));
    }

}
//Checks to see arraylist and inputs what to delete
public void RemoveTask(int i) {
    if (i >= 0 && i < tasks.size() ) {
        String deleted = tasks.remove(i);
        System.out.println("Removed: " + deleted);
    } else { 
        System.out.println("No task needs to be deleted ");

    }
    
}

}

        

