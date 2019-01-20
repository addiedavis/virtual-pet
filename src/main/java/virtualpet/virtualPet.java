package virtualpet;

public class virtualPet {

	private String name;
	private int hunger;
	private int thirst;
	private int waste;
	private int bored;
	private int health;

	public boolean getAlive() {
		if (hunger > 0 && thirst > 0 && health > 0) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public int getHungerLevel() {
		return hunger;
	}

	public int getThirstLevel() {
		return thirst;
	}

	public int getWasteLevel() {
		return waste;
	}

	public int getBoredLevel() {
		return bored;
	}

	public int getHealthLevel() {
		return health;
	}

	public int feedPet() {
		hunger++;
		return hunger;
	}

	public int gettingHungry() {
		hunger--;
		return hunger;
	}

	public int wasteIncrease() {
		waste++;
		return waste;
	}

	public int washPet() {
		if (waste > 0) {
			waste--;
		} else {
			waste = 0;
		}
		return waste;
	}

	public int giveMeds() {
		if (health < 10) {
			health++;
		} else {
			health = health - 3;
		}
		return health;
	}

	public int wasteDecreaseHealth() {
		if (waste >= 10) {
			health = health - 2;
		} else if (waste >= 5) {
			health--;
		}
		return health;
	}

	public int giveWater() {
		thirst++;
		return thirst;
	}

	public int gettingThirsty() {
		thirst--;
		return thirst;
	}

	public int playWithPet() {
		if (bored > 0) {
			bored--;
		} else {
			bored = 0;
		}
		return bored;
	}

	public int gettingBored() {
		if (bored < 10) {
			bored++;
		} else {
			bored = 10;
		}
		return bored;
	}

	public virtualPet(String name, int hunger, int thirst, int waste, int bored, int health) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.bored = bored;
		this.health = health;
	}

}
