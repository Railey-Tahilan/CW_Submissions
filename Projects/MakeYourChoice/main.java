import java.util.Scanner;
public class Game {


		// TODO Auto-generated method stub
		private static Scanner scanner = new Scanner(System.in);

	    	    public static void main(String[] args) {
	    	   
	    	    
	    	    	        // Create Characters
	    	    	        System.out.print("Enter your Character's name: ");
	    	    	        String name = scanner.nextLine();

	    	    	        int age = 0;
	    	    	        while (true) {
	    	    	            System.out.print("Enter your Character's age: ");
	    	    	            String input = scanner.nextLine();
	    	    	            if (input.matches("\\d+")) {
	    	    	                age = Integer.parseInt(input);
	    	    	                if (age > 0) break; // Valid age
	    	    	                else System.out.println("Please enter a positive number.");
	    	    	            } else {
	    	    	                System.out.println("Invalid input. Please enter a number.");
	    	    	            }
	    	    	        }

	    	    	        Characters player = new Characters(name, age);
	    	    	        System.out.println("Character created! Name: " + player.getName() + ", Age: " + player.getAge() + ", HP: " + player.getHp());

	    	    	        // Story Begins
	    	    	        System.out.println("Your car has broken down in the middle of nowhere. You must venture into the woods to survive.");

	    	    	        // Decision 1
	    	    	        System.out.println("1. Walk into the woods\n2. Stay by the car\n3. Call for help\n4. Search the car for supplies");
	    	    	        int choice = getValidChoice();

	    	    	        if (choice == 1) {
	    	    	            System.out.println("You walk into the woods and hear strange noises.");
	    	    	            player.updateHp(-10);
	    	    	            // Branch 1
	    	    	            System.out.println("1. Investigate the noise\n2. Ignore and keep walking");
	    	    	            choice = getValidChoice();
	    	    	            if (choice == 1) {
	    	    	                System.out.println("You find a wild animal. It attacks you.");
	    	    	                player.updateHp(-20);
	    	    	            } else {
	    	    	                System.out.println("You safely move deeper into the woods.");
	    	    	            }
	    	    	        } else if (choice == 2) {
	    	    	            System.out.println("You stay by the car, but it gets colder. You lose HP.");
	    	    	            player.updateHp(-15);
	    	    	            // New branch to fix the car
	    	    	            System.out.println("1. Search the car for tools\n2. Wait for help\n3. Build a signal fire\n4. Look for a nearby road");
	    	    	            choice = getValidChoice();
	    	    	            if (choice == 1) {
	    	    	                System.out.println("You find tools and manage to fix part of the car.");
	    	    	                player.updateHp(+10);
	    	    	            } else if (choice == 2) {
	    	    	                System.out.println("You wait, but no one comes. The cold affects you.");
	    	    	                player.updateHp(-10);
	    	    	            } else if (choice == 3) {
	    	    	                System.out.println("You build a signal fire and warm yourself.");
	    	    	                player.updateHp(+5);
	    	    	            } else {
	    	    	                System.out.println("You find a road but twist your ankle walking.");
	    	    	                player.updateHp(-10);
	    	    	            }
	    	    	        } else if (choice == 3) {
	    	    	            System.out.println("Your phone has no signal. You waste time and lose HP.");
	    	    	            player.updateHp(-5);
	    	    	        } else {
	    	    	            System.out.println("You find some supplies in the car, including food and a flashlight.");
	    	    	            player.updateHp(+10);
	    	    	        }

	    	    	        System.out.println("Current HP: " + player.getHp());

	    	    	        // Decision 2
	    	    	        System.out.println("1. Continue deeper into the woods\n2. Look for shelter\n3. Try to start a fire\n4. Look for food");
	    	    	        choice = getValidChoice();

	    	    	        if (choice == 1) {
	    	    	            System.out.println("You continue deeper and find a creepy cabin.");
	    	    	            player.updateHp(-10);
	    	    	            // Branch 2
	    	    	            System.out.println("1. Enter the cabin\n2. Walk around it\n3. Search for supplies nearby\n4. Mark the location and leave");
	    	    	            choice = getValidChoice();
	    	    	            if (choice == 1) {
	    	    	                System.out.println("You enter the cabin and find an old man who offers you help.");
	    	    	                player.updateHp(+10);
	    	    	                oldManInteraction(player); // Call the old man's interaction here
	    	    	            } else if (choice == 2) {
	    	    	                System.out.println("You find a hidden trapdoor leading underground.");
	    	    	                System.out.println("You descend and discover an underground bunker with supplies.");
	    	    	                player.updateHp(+20);
	    	    	            } else if (choice == 3) {
	    	    	                System.out.println("You find tools and canned food nearby.");
	    	    	                player.updateHp(+15);
	    	    	            } else {
	    	    	                System.out.println("You mark the location and decide to come back later.");
	    	    	            }
	    	    	        } else if (choice == 2) {
	    	    	            System.out.println("You find an abandoned cabin. It offers some protection.");
	    	    	            player.updateHp(+10);
	    	    	            // New supplies scenario
	    	    	            System.out.println("1. Search the cabin\n2. Rest in the cabin\n3. Barricade the doors\n4. Look for a water source");
	    	    	            choice = getValidChoice();
	    	    	            if (choice == 1) {
	    	    	                System.out.println("You find a first aid kit and use it.");
	    	    	                player.updateHp(+20);
	    	    	            } else if (choice == 2) {
	    	    	                System.out.println("You rest and regain some energy.");
	    	    	                player.updateHp(+10);
	    	    	            } else if (choice == 3) {
	    	    	                System.out.println("You fortify the cabin against intruders.");
	    	    	                player.updateHp(+5);
	    	    	            } else {
	    	    	                System.out.println("You find a stream of fresh water nearby.");
	    	    	                player.updateHp(+10);
	    	    	            }
	    	    	        } else if (choice == 3) {
	    	    	            System.out.println("You successfully start a fire and stay warm.");
	    	    	            player.updateHp(+5);
	    	    	        } else {
	    	    	            System.out.println("You find berries, but they're poisonous! You lose HP.");
	    	    	            player.updateHp(-20);
	    	    	        }

	    	    	        System.out.println("Current HP: " + player.getHp());

	    	    	        // Encounter Monster
	    	    	        System.out.println("As you rest, a monster appears and growls: '" + player.getName() + "... I have been waiting for you!'");
	    	    	        System.out.println("1. Fight the monster\n2. Run away\n3. Hide in the cabin\n4. Try to befriend the monster");
	    	    	        choice = getValidChoice();

	    	    	        if (choice == 1) {
	    	    	            fightMonster(player);
	    	    	        } else if (choice == 2) {
	    	    	        	tryToRunAway(player);
	    	    	        } else if (choice == 3) {
	    	    	            System.out.println("You hide in the cabin and the monster eventually leaves.");
	    	    	        } else {
	    	    	            System.out.println("The monster accepts your friendship and offers you protection.");
	    	    	            player.updateHp(+20);
	    	    	        }

	    	    	        System.out.println("Final HP: " + player.getHp());

	    	    	        // Ending
	    	    	        if (player.getHp() > 50) {
	    	    	            System.out.println("You survive the night and find your way back to safety. Well done, " + player.getName() + "!");
	    	    	        } else if (player.getHp() > 0) {
	    	    	            System.out.println("You barely survive but are severely injured. A lesson in caution for " + player.getName() + ".");
	    	    	        } else {
	    	    	            System.out.println("You have succumbed to your injuries. Rest in peace, brave " + player.getName() + ".");
	    	    	        }

	    	    	        scanner.close();
	    	    	    }

	    	    	    private static int getValidChoice() {
	    	    	        int choice = 0;
	    	    	        while (true) {
	    	    	            System.out.print("Enter your choice (1-4): ");
	    	    	            String input = scanner.nextLine();
	    	    	            if (input.matches("[1-4]")) {
	    	    	                choice = Integer.parseInt(input);
	    	    	                break;
	    	    	            } else {
	    	    	                System.out.println("Invalid input. Please enter a number between 1 and 4.");
	    	    	            }
	    	    	        }
	    	    	        return choice;
	    	    	    }

	    	    	    private static void oldManInteraction(Characters player) {
	    	    	        System.out.println("You find an old man who offers you food.");
	    	    	        System.out.println("1. Accept the food\n2. Deny the food");
	    	    	        int choice = getValidChoice();

	    	    	        if (choice == 1) {
	    	    	            System.out.println("You accept the food...");
	    	    	            double randomChance = Math.random();
	    	    	            if (randomChance < 0.5) {
	    	    	                // You gain health
	    	    	                int healthGain = (int) (Math.random() * 20) + 10; // Random HP gain between 10 and 30
	    	    	                player.updateHp(healthGain);
	    	    	                System.out.println("The food helps you, and you regain " + healthGain + " HP!");
	    	    	            } else {
	    	    	                // You lose health
	    	    	                int healthLoss = (int) (Math.random() * 20) + 10; // Random HP loss between 10 and 30
	    	    	                player.updateHp(-healthLoss);
	    	    	                System.out.println("The food is spoiled! You feel sick and lose " + healthLoss + " HP.");
	    	    	            }
	    	    	        } else {
	    	    	            System.out.println("You politely decline the food and continue your journey.");
	    	    	        }
	    	    	        System.out.println("Current HP: " + player.getHp());
	    	    	    }

	    	    	    private static void fightMonster(Characters player) {
	    	    	        int monsterHp = 100; // Monster's initial health
	    	    	        System.out.println("You decide to fight the monster.");

	    	    	        for (int i = 1; ; i++) {
	    	    	            System.out.println("Round " + i + ": Monster HP = " + monsterHp);
	    	    	            System.out.println("1. Attack\n2. Defend\n3. Try to run away");
	    	    	            int fightChoice = getValidChoice();

	    	    	            if (fightChoice == 1) {
	    	    	                monsterHp = attackMonster(player, monsterHp); // Update monster HP after attack
	    	    	            } else if (fightChoice == 2) {
	    	    	                defend(player); // Defending gives the player random HP recovery
	    	    	            } else if (fightChoice == 3) {
	    	    	                tryToRunAway(player); // Player can try to run away
	    	    	            }

	    	    	            if (player.getHp() <= 0) {
	    	    	                System.out.println("You have been defeated by the monster.");
	    	    	                break;
	    	    	            }
	    	    	            if (monsterHp <= 0) {
	    	    	                System.out.println("You defeated the monster after a tough battle!");
	    	    	                break;
	    	    	            }
	    	    	            System.out.println("Current HP: " + player.getHp());
	    	    	        }
	    	    	    }

	    	    	    private static int attackMonster(Characters player, int monsterHp) {
	    	    	        double randomChance = Math.random();
	    	    	        if (randomChance < 0.7) {
	    	    	            System.out.println("You attack the monster and deal a fatal blow! You defeated the monster!");
	    	    	            monsterHp = 0; // Monster is defeated
	    	    	        } else {
	    	    	            int damage = (int) (Math.random() * 20) + 10; // Random damage dealt to player
	    	    	            System.out.println("You attack the monster, but it fights back fiercely!");
	    	    	            player.updateHp(-damage); // The player takes damage
	    	    	            System.out.println("The monster fights back and you lose " + damage + " HP.");
	    	    	        }
	    	    	        return monsterHp; // Return the updated monster HP
	    	    	    }

	    	    	    private static void defend(Characters player) {
	    	    	        int healthGain = (int) (Math.random() * 10) + 5; // Random HP gain between 5 and 15
	    	    	        player.updateHp(healthGain);
	    	    	        System.out.println("You defend yourself, reducing the damage taken and gaining " + healthGain + " HP.");
	    	    	    }

	    	    	    private static void tryToRunAway(Characters player) {
	    	    	        double randomChance = Math.random();
	    	    	        if (randomChance > 0.5) {
	    	    	            System.out.println("You successfully escape the monster!");
	    	    	        } else {
	    	    	            System.out.println("The monster catches you and you lose all your HP!");
	    	    	            player.updateHp(-player.getHp()); // Set HP to 0
	    	    	        }
	    	    	    }
	    	    	}
