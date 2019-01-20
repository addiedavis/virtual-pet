package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int action = 1;
		String actionYN = "";
		int putToSleep = 0;
		String typedIn = "";

		System.out.println("Welcome to Virtual Pet!");
		System.out.println("We currently have healthy pet rocks available!");
		System.out.println("What would you like to name your pet rock?");
		String name = input.nextLine();
		if (name.toLowerCase().equals("quit")) {
			System.out.println("Well, we will keep the rocks then...\nGoodbye.");
			System.exit(0);
		}
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		System.out.println("Take good care of " + name + "!");
		// create pet object
		virtualPet newpet = new virtualPet(name, 10, 10, 10, 0, 10);
		boolean itsAlive = newpet.getAlive();

		while (action != 0) {
//			System.out.println("Pet is alive");
			System.out.println(
					"\nWhat would you like to do?\n1 --> Check pet\n2 --> Feed pet\n3 --> Give pet water\n4 --> Clean pet\n5 --> Play with pet\n6 --> Give pet medicine\n7 --> Put pet to sleep");
			boolean validInput = false;
			while (!validInput) {
				try {
					typedIn = input.nextLine();
					if (typedIn.toLowerCase().equals("quit")) {
						System.out.println("You abandoned " + name + "...");
						System.exit(0);
					}
					Integer.parseInt(typedIn);
					validInput = true;
				} catch (NumberFormatException e) {
					System.out.println("Please enter a whole number");
				}
			}
			action = Integer.parseInt(typedIn);
			if (action == 1) {
				System.out.println("Name:" + newpet.getName());
				System.out.println("Hunger:" + newpet.getHungerLevel());
				System.out.println("Thirst:" + newpet.getThirstLevel());
				System.out.println("Waste:" + newpet.getWasteLevel());
				System.out.println("Bored:" + newpet.getBoredLevel());
				System.out.println("Health:" + newpet.getHealthLevel());
			} else if (action == 2) {
				newpet.feedPet();
			} else if (action == 3) {
				newpet.giveWater();
			} else if (action == 4) {
				newpet.washPet();
			} else if (action == 5) {
				newpet.playWithPet();
			} else if (action == 6) {
				newpet.giveMeds();
			} else if (action == 7) {
				System.out.println("Are you sure? Y/N");
				actionYN = input.nextLine();
				if (actionYN.toLowerCase().equals("y")) {
					System.out.println("You take " + name + " to the vet and put " + name + " to sleep.");
					action = 0;
					putToSleep = 1;
				} else {
					System.out.println("Ok, cool... you might want to check your pet.");
				}
			} else {
				System.out.println("That didn't make sense... you might want to check your pet.");
				action = 8;
			}

			newpet.wasteDecreaseHealth();
			newpet.gettingBored();
			if (newpet.getAlive() == false) {
				action = 0;
			}

		}

		if (putToSleep != 1) {
			System.out.println(name + " has died due to neglect.");
		}

		System.out.println("RIP " + name);

	}

}
