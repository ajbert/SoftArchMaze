import java.util.Scanner;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

import static java.lang.Thread.sleep;

    public class Main {



        public static void main(String[] args) throws InterruptedException {



            Maze maze = new Maze();
            Scanner input = new Scanner(System.in);

            // I removed some flavor text that had been in the main and put it in the Prologue
            Prologue prologue = new Prologue();

            prologue.getPrologue(input);

            do {
                System.out.println("You're in the " + maze.currentRoom.getName());
                System.out.println(maze.currentRoom.getDescription());
                System.out.println(maze.currentRoom.getExits());

                System.out.print(">>");
                char dir = input.next().charAt(0);

                switch (dir) {
                    case 'n':
                        maze.move('n');
                        break;
                    case 's':
                        maze.move('s');
                        break;
                    case 'e':
                        maze.move('e');
                        break;
                    case 'w':
                        maze.move('w');
                        break;
                    case 'u':
                        maze.move('u');
                        break;
                    case 'd':
                        maze.move('d');
                        break;
                    case 'l':
                        maze.currentRoom.lootStrategy.lootAttempt();
                        System.out.println(maze.lootCurrentRoom());
                        break;
                    case 'i':
                        System.out.println(maze.interactWithCurrentRoom());
                        break;
                    case 'v':
                        System.out.println( maze.getPlayerInventory());
                        break;
                    case 'x':

                        System.out.println(maze.exitCurrentRoom());
                        if (maze.currentRoom instanceof Exitable) {
                            maze.isFinished = true;
                        }
                        break;
                    case 'h':
                        System.out.println("Help Directory");
                        System.out.println("Move directions: north, east, south, west, up, down ");
                        System.out.println("Player interaction: l : loot room, i : interact with room, v : view inventory, x  : exit ");
                        System.out.println();
                        break;

                    default: System.out.println("Try again!");

                }

            } while (!maze.isFinished);

            System.out.println("Your Score: " + maze.player.getScore());
        }
    }


