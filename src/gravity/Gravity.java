package gravity;

import java.util.Random;
import java.util.Scanner;

public class Gravity {

    public static void main(String[] args) {
        
        Game game = new Game();
        game.initialize();
        char userChoice = 'X', compChoice = 'O';
        int userCol, compCol;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        /*
        game.putForceFully('X', 1,3);
        game.putForceFully('X', 1,4);
        game.putForceFully('X', 2,1);
        game.putForceFully('X', 2,2);
        game.putForceFully('X', 2,4);
        game.putForceFully('X', 3,1);        
        game.putForceFully('X', 3,2);
        game.putForceFully('X', 3,3);
        game.putForceFully('X', 4,1);
        game.putForceFully('X', 4,3);
        game.putForceFully('O', 0,1);
        game.putForceFully('O', 0,3);
        game.putForceFully('O', 0,4);
        game.putForceFully('O', 1,1);
        game.putForceFully('O', 2,3);
        game.putForceFully('O', 3,0);
        game.putForceFully('O', 3,4);
        game.putForceFully('O', 4,0);
        game.putForceFully('O', 4,2);
        game.putForceFully('O', 4,4);
        game.display();
        System.out.println(game.isWinner('O'));
        */
        while(game.remainingEntries() > 0){
            
            do{
                do{
                    System.out.println("Choose coloumn (0-4)");
                    userCol = scan.nextInt();
                }while((userCol < 0) || (userCol > 5));
            }while(!game.hasSpace(userCol));
            
            game.put(userChoice, userCol);
            if(game.isWinner(userChoice)){
                System.out.println("User Wins..!!");
                game.display();
                break;
            }
            if(game.remainingEntries() == 0){
                System.out.println("Game draw..!!");
                break;
            }
            do{
                compCol = rand.nextInt(5);
            }while(!game.hasSpace(compCol));
            
            game.put(compChoice, compCol);
            if(game.isWinner(compChoice)){
                System.out.println("Computer wins..!!");
                game.display();
                break;
            }
            game.display();
        }
    }
    
}
