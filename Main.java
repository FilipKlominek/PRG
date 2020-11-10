package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tasks = new String[10];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = "";
        }

        int select;
        int taskCount;
        int mainMenu = 1;
        int mode;
        boolean full;

        while (mainMenu == 1) {
            full = false;
            taskCount = 0;
            for (int i = 0; i < tasks.length; i++) {
                if (!tasks[i].equals("")) taskCount = taskCount + 1;

            }
            System.out.println("-----------------------------------------------------");
            System.out.println("You can have up to 10 tasks.");
            System.out.println("You have " + taskCount + "/10");

            for (int i = 0; i < tasks.length; i++) {
                if (!tasks[i].equals("")) System.out.println("Task #" + (i + 1) + ": " + tasks[i]);
            }

            System.out.println("-----------------------------------------------------");
            System.out.println("1) Manage tasks");
            System.out.println("2) Exit");

            mainMenu = Integer.parseInt(sc.nextLine());

            if (mainMenu == 1) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Task management");
                System.out.println("-----------------------------------------------------");
                System.out.println("1) Create a new task");
                System.out.println("2) Update a task");
                System.out.println("3) Delete a task");
                System.out.println("4) Main menu");

                mode = Integer.parseInt(sc.nextLine());
                if (mode == 1) {
                    full = true;
                    for (int i = 0; i < tasks.length; i++) {
                        if (tasks[i].equals("")) {
                            full = false;
                            break;
                        }
                    }
                    if (!full) {
                        for (int i = 0; i < tasks.length; i++) {
                            if (tasks[i].equals("")) {
                                System.out.println("Enter new task:");
                                tasks[i] = sc.nextLine();
                                break;
                            }
                        }
                    }
                    else System.out.println("Your tasks are full. Delete a task or update an existing one.");
                } else if (mode == 2) {
                    System.out.println("Which task to update?");
                    select = Integer.parseInt(sc.nextLine()) - 1;
                    if (tasks[select].equals(""))
                        System.out.println("This task is empty, enter new task at this position:");
                    else System.out.println("Enter updated task:");
                    tasks[select] = sc.nextLine();
                } else if (mode == 3) {
                    System.out.println("Which task to Delete?");
                    tasks[Integer.parseInt(sc.nextLine()) - 1] = "";
                }
                else if (mode != 1 && mode != 2 && mode != 3 && mode != 4) System.out.println("Invalid input");
            }
            if (mainMenu != 1 && mainMenu != 2) System.out.println("Invalid input");
        }
    }
}