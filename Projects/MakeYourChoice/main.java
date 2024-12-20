import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
		// TODO Auto-generated method stub

        // This allows the player to enter their character's name
        System.out.print("Enter your Character's name: ");
        String name = scanner.nextLine();

        //This makes a new character with an attribute of their name
        Characters player = new Characters(name);
        
        System.out.println("Character created! Name: " + player.getName() + ", HP: " + player.getHp() + "\n");
        System.out.println("Your car broke down! Make your next decision.");

        // This boolean is meant as a tester for the while loop to see if the game has ended
        boolean gameOver = false;
       
        // This while loop starts the game and ends it when gameOver is true
        while (!gameOver) 
        {
            // This starts Scene 1
            System.out.println("a. Walk into the woods\nb. Stay by the car\nc. Call for help\nd. Search your car for supplies");
            char choice = getValidChoice();
            
            // This is for when  the  player chooses a for scene 1
            if (choice == 'a') 
            {
                System.out.println("\nYou walk into the woods and hear noises");
                player.updateHp(-10);
                System.out.println("a. Investigate the noise\nb. Keep walking\nc. Hide\nd. Return to the car");
                choice = getValidChoice();                
                if (choice == 'a') 
                {
                    System.out.println("\nYou get attacked by a tiny puppy");
                    player.updateHp(-20);
                } 
                else if (choice == 'b') 
                {
                    System.out.println("\nYou go deeper into the woods");
                } 
                else if (choice == 'c') 
                {
                    System.out.println("\nYou hide behind a tree and the noise disappears");
                } 
                else 
                {
                    System.out.println("\nYou return to the car");
                }
            } 
            
            // This is for when  the  player chooses b for scene 1
            else if (choice == 'b') 
            {
                System.out.println("\nIt starts to get cold");
                player.updateHp(-15);
               
                System.out.println("a. Search the car for tools\nb. Wait for help\nc. Build a signal fire\nd. Look for a nearby road");
                choice = getValidChoice();                
                
                if (choice == 'a') 
                {
                    System.out.println("\nYou find tools and fix your car, but it still doesn't work");
                    player.updateHp(+10);
                } 
                else if (choice == 'b') 
                {
                    System.out.println("\nYou wait, but no one comes. It starts to get cold");
                    player.updateHp(-10);
                } 
                else if (choice == 'c') 
                {
                    System.out.println("\nYou start a fire and warm yourself");
                    player.updateHp(+5);
                } 
                else 
                {
                    System.out.println("\nYou find a road but you tear your achilles walking");
                    player.updateHp(-10);
                }
            } 
            
            // This is for when  the  player chooses c for scene 1
            else if (choice == 'c') 
            {
                System.out.println("\nYou call for help, but nobody answers");
                player.updateHp(-5);
            } 
           
            // This is for when  the  player chooses d for scene 1
            else 
            {
                System.out.println("\nYou find some supplies in the car");
                player.updateHp(+10);
            }

            System.out.println("Current HP: " + player.getHp());

            // This starts Scene 2
            System.out.println("a. Continue deeper into the woods\nb. Look for shelter\nc. Try to start a fire\nd. Look for food");
            choice = getValidChoice();                

            // This is for when  the  player chooses a for scene 2
            if (choice == 'a') 
            {
                System.out.println("\nYou continue deeper and find a creepy cabin.");
                player.updateHp(-10);
                System.out.println("a. Enter the cabin\nb. Walk around it\nc. Search for supplies nearby\nd. Find a different path");
                choice = getValidChoice();
                
                if (choice == 'a') 
                {
                    System.out.println("\nYou enter the cabin and find an old man who offers you help.");
                    player.updateHp(+10);
                    
                    //This calls the oldManINteraction method to where the player could choose to accept or deny the mans help
                    oldManInteraction(player); 
                } 
                else if (choice == 'b') 
                {
                    System.out.println("\nYou find a hidden trapdoor leading underground.");
                    System.out.println("\nYou descend and discover an underground bunker with supplies.");
                    player.updateHp(+20);
                } 
                else if (choice == 'c') 
                {
                    System.out.println("\nYou find tools and canned food nearby.");
                    player.updateHp(+15);
                } 
                else 
                {
                    System.out.println("\nYou mark the location and decide to come back later.");
                }
                
            } 
            
            
            // This is for when  the  player chooses b for scene 2
            else if (choice == 'b') 
            {
                System.out.println("\nYou find an abandoned cabin. It offers some protection.");
                player.updateHp(+10);
                System.out.println("a. Search the cabin\nb. Rest in the cabin\nc. Barricade the doors\nd. Look for a water source");
                choice = getValidChoice();                
                
                
                
                if (choice == 'a') 
                {
                    System.out.println("\nYou find a first aid kit and use it.");
                    player.updateHp(+20);
                } 
                else if (choice == 'b') 
                {
                    System.out.println("\nYou rest and regain some energy.");
                    player.updateHp(+10);
                } 
                else if (choice == 'c') 
                {
                    System.out.println("\nYou fortify the cabin against intruders.");
                    player.updateHp(+5);
                } 
                else 
                {
                    System.out.println("\nYou find a stream of fresh water nearby.");
                    player.updateHp(+10);
                }
                
                
            // This is for when  the  player chooses c for scene 2   
            } 
            else if (choice == 'c') 
            {
                System.out.println("\nYou successfully start a fire and stay warm.");
                player.updateHp(+5);
            } 
            
            // This is for when  the  player chooses d for scene 2
            else 
            {
                System.out.println("\nYou find berries, but they're poisonous! You lose HP.");
                player.updateHp(-20);
            }
            
            
            // This prints out the players updated health
            System.out.println("Current HP: " + player.getHp());

            // This scene 3 where the player encounters the monster
            System.out.println("\nAs you rest, a monster appears and growls \"" + player.getName() + " I have been waiting for you\"");
            System.out.println("a. Fight the monster\nb. Run away\nc. Hide in the cabin\nd. Try to befriend the monster");
            choice = getValidChoice();                

            
            // This is for when  the  player chooses a for scene 3 which lets them fight the monster
            if (choice == 'a') 
            {
                gameOver = fightMonster(player);
            } 
            
            // This is for when  the  player chooses b for scene 3 which lets them run away the monster
            else if (choice == 'b') 
            {
                gameOver = tryToRunAway(player);
               
            // This is for when  the  player chooses c for scene 3 which lets them hide in a cabin 
            } 
            else if (choice == 'c') 
            {
                System.out.println("\nYou hide in the cabin and the monster eventually leaves");
            } 
            
            // This is for when  the  player chooses d for scene 3 which lets them befriend the monster
            else 
            {
                System.out.println("\nThe monster accepts your friendship");
                player.updateHp(+20);
            }

            // This checks if the player's health is 0 which means they die and end the game
            if (player.getHp() <= 0) 
            {
                System.out.println("\nYou died. RIP" + player.getName());
                gameOver = true;
            }
            
            // This checks if the player's health is above 50 which means they survive and end the game

            if (player.getHp() > 50) 
            {
                System.out.println("\nYou survive the night. Well done, " + player.getName());
                gameOver = true;
            } 
            
            // This checks if the player's health is between 0 and 50 which means they barely survive and end the game

            else if (player.getHp() > 0 && player.getHp() <= 50) 
            {
                System.out.println("\nYou barely survive. Be careful next time " + player.getName());
                gameOver = true;
            }
        }
        // This closes the scanner
        scanner.close();
    }

    
    
 // -------------------------------------------------------------------------------------------------------------------------------------------------------------------	
    
    
    // This Method is how the player makes choices

    private static char getValidChoice() 
    {
        // This creates an empty char for choice  and a test boolean for the while loop
        char choice = ' ';
        boolean test = false;
        
        // This while loop sees if the player types a valid letter (a, b, c or d)  and if not it prompts them to try again
        while (!test) 
        {
            System.out.print("Enter your choice (a-d): ");
            String input = scanner.nextLine();
            if (input.length() == 1 && (input.equals("a") || input.equals("b") || input.equals("c") || input.equals("d"))) 
            {
                choice = input.charAt(0);
                test = true;
            } 
            else 
            {
                System.out.println("Invalid input. Please enter a choice between 'a' and 'd'.");
            }
        }
        return choice;
    }

    

 // -------------------------------------------------------------------------------------------------------------------------------------------------------------------	

    
    
    // T

    private static void oldManInteraction(Characters player) 
    {
        System.out.println("\nYou find an old man who offers you food.");
        System.out.println("a. Accept the food\nb. Deny the food");
        char choice = getValidChoice();

        if (choice == 'a') 
        {
            System.out.println("\nYou accept the food...");
            double randomChance = (Math.random()*10+1);
            if (randomChance == 1 || randomChance == 2 || randomChance == 3) 
            {
                // You gain health
                int healthGain = (int) (Math.random()*20+10); // Random HP gain between 10 and 30
                player.updateHp(healthGain);
                System.out.println("The food helps you, and you regain " + healthGain + " HP!");
            } 
            else 
            {
                // You lose health
                int healthLoss = (int) (Math.random()*20+10); // Random HP loss between 10 and 30
                player.updateHp(-healthLoss);
                System.out.println("The food is spoiled! You feel sick and lose " + healthLoss + " HP.");
            }
        } 
        else 
        {
            System.out.println("\nYou politely decline the food and continue your journey.");
        }
        System.out.println("Current HP: " + player.getHp());
    }

    
    
 // -------------------------------------------------------------------------------------------------------------------------------------------------------------------	
  
    
    // This method is for when the player fights the monster
    
    public static boolean fightMonster(Characters player) 
    {
        // This sets an HP for the monster
        int monsterHp = 100; 
        System.out.println("\nYou decide to fight the monster.");

        // This makes a round limit for the fight to 5 rounds
        int maxRounds = 5;

        // This is a for loop for the fight which adds rounds and ends when the monster or player dies or when the round limit is reached
        for (int round = 1; round <= maxRounds; round++) 
        {
            System.out.println("\nRound " + round + ": Monster HP = " + monsterHp);
            System.out.println("a. Attack\nb. Defend\nc. Try to run away");
            char choice = getValidChoice();

            // This is for when the  player  chooses a and attacks the monster
            if (choice == 'a') 
            {
                monsterHp = attackMonster(player, monsterHp);
            } 
            // This is for when the  player  chooses b and defends themselves from the monster
            else if (choice == 'b') 
            {
                 defendYourself(player);
            }             
            // This is for when the  player  chooses c and tries to run away

            else if (choice == 'c') 
            {
                return tryToRunAway(player);
            }
            
            
            // This is for when the  player's health is  0 or  below  which  means they  died
            if (player.getHp() <= 0) 
            {
                System.out.println("\nYou have been defeated by the monster!");
                return true;
            }
            // This is for when the  monster's health is  0 or  below  which  means they beat  the  monster
            if (monsterHp <= 0) 
            {
                System.out.println("\nYou defeated the monster!");
                return false;
            }
            System.out.println("Current HP: " + player.getHp());
        }
        
        // This is for when neither  the monster  or player's health reach 0 or below which means it ends in a draw
        System.out.println("\nThe fight ended in a draw. The monster escaped.");
        return false;
    }



 // -------------------------------------------------------------------------------------------------------------------------------------------------------------------	

    
	// This method is for when the player attacks the monster
    private static int attackMonster(Characters player, int monsterHp) 
    {
    	// This creates  a randomizer which randomizes a numner from 1-5 and the player has a 1/5 chance to defeat the monster.
    	
        int random = (int)(Math.random()*5+1);
        if (random == 1) 
        {
            System.out.println("\nYou attack the monster and deal a fatal blow! You defeated the monster!");
            monsterHp = 0;
        } 
        else 
        {
        	// This creates  a randomizer which randomizes the amount of health the player loses. 
        	
            int damage = (int) (Math.random()*30+10);
            System.out.println("\nYou attack the monster, but it fights back!");
            player.updateHp(-damage);
            System.out.println("The monster fights back and you lose " + damage + " HP.");
        }
        return monsterHp;
    }

    
    
 // -------------------------------------------------------------------------------------------------------------------------------------------------------------------	

    
	// This method is for when the player defends from the monster
    public static void defendYourself(Characters player) 
    {
    	// This creates  a randomizer which randomizes the amount of health the player gains from 5-15. 
        int healthGain = (int) (Math.random()*10+5); 
        player.updateHp(healthGain);
        System.out.println("\nYou defend yourself and gain " + healthGain + " HP.");
    }
    
    
    

 // -------------------------------------------------------------------------------------------------------------------------------------------------------------------	

    
    
	// This method is for when the player tries to run away from the  monster
    public static boolean tryToRunAway(Characters player) 
    {
    	
    	// This creates  a randomizer which randomizes a  number from 1-3  and  the  player has a 1/3 chance to survive
        int random = (int) (Math.random()*3+1);
        if (random == 1) 
        {
            System.out.println("\nYou successfully escaped the monster!");
            return true;
        } 
        
        // This is for when the player  doesnt  make it
        else 
        {
            System.out.println("\nThe monster catches you and kills you!");
            player.updateHp(-player.getHp());
            return true;
        }
    }
}
