package virtualpet;

public class virtualPet {

	private String name;
	private int hunger;
	private int thirst;
	private int waste;
	private int bored;
	private int health;
	
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
	
	public boolean getAlive () {
		if (hunger >= 0 && thirst >= 0 && health >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public virtualPet(String name, int hunger, int thirst, int waste, int bored, int health) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.bored = bored;
		this.health = health;
	}

	public int wasteDecreaseHealth() {
		if (waste >= 5) {
			health--;
		}
		return health;
	}

	public int feedPet() {
		hunger++; 
		return hunger;
	}

	public int giveMeds() {
		health++;
		return health;
	}

	public int giveWater() {
		thirst++;
		return thirst;
	}

	public int gettingBored() {
		bored++;
		return bored;
	}
	
	

}
