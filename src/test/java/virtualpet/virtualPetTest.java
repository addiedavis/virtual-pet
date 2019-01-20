package virtualpet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class virtualPetTest {

	virtualPet underTest = new virtualPet("Rock", 10, 10, 0, 0, 9);

	@Test
	public void doGettersWork() {
		virtualPet underTest = new virtualPet("Rock", 100, 50, 0, 10, 110);
		String expectedName = underTest.getName();
		assertThat(expectedName, is("Rock"));
		int expectedHunger = underTest.getHungerLevel();
		assertThat(expectedHunger, is(100));
		int expectedThirst = underTest.getThirstLevel();
		assertThat(expectedThirst, is(50));
		int expectedWaste = underTest.getWasteLevel();
		assertThat(expectedWaste, is(0));
		int expectedBored = underTest.getBoredLevel();
		assertThat(expectedBored, is(10));
		int expectedHealth = underTest.getHealthLevel();
		assertThat(expectedHealth, is(110));
	}

	@Test
	public void isPetAlive() {
		// hunger > 0 && thirst > 0 && health > 0
		boolean expected = underTest.getAlive();
		assertThat(expected, is(true));
	}

	@Test 
	public void isPetGettingHungry() {
		int expected = underTest.gettingHungry();
		assertThat(expected, is(9));
	}

	@Test
	public void isPetHungryFeedPlus1() {
		int expected = underTest.feedPet();
		assertThat(expected, is(11));
	}

	@Test
	public void isPetGettingThirsty() {
		int expected = underTest.gettingThirsty();
		assertThat(expected, is(9));
	}

	@Test
	public void isPetThirstyGiveWaterPlus1() {
		int expected = underTest.giveWater();
		assertThat(expected, is(11));
	}

	@Test
	public void isPetGettingBored() {
		int expected = underTest.gettingBored();
		assertThat(expected, is(1));
	}

	@Test
	public void isPetBoredPlayMinus1() {
		virtualPet underTest = new virtualPet("Rock", 10, 10, 10, 10, 10);
		int expected = underTest.playWithPet();
		assertThat(expected, is(9));
	}

	@Test
	public void isPetSuperBored() {
		virtualPet underTest = new virtualPet("Rock", 10, 10, 10, 10, 10);
		int expected = underTest.gettingBored();
		assertThat(expected, is(10));
	}

	@Test
	public void isPetSuperBored10MaxedOut() {
		virtualPet underTest = new virtualPet("Rock", 10, 10, 10, 11, 10);
		int expected = underTest.gettingBored();
		assertThat(expected, is(10));
	}

	@Test
	public void isPetUnhealthyMedsPlus1() {
		int expected = underTest.giveMeds();
		assertThat(expected, is(10));
	}

	@Test
	public void isPetHealthyGiveMedsBadMinus3() {
		virtualPet underTest = new virtualPet("Rock", 10, 10, 10, 11, 10);
		int expected = underTest.giveMeds();
		assertThat(expected, is(7));
	}

	@Test
	public void isPetMessyRemoveHealthBy1() {
		virtualPet underTest = new virtualPet("Rock", 5, 5, 5, 0, 5);
		int expected = underTest.wasteDecreaseHealth();
		assertThat(expected, is(4));
	}

	@Test
	public void isPetSuperMessyRemoveHealthBy2() {
		virtualPet underTest = new virtualPet("Rock", 10, 10, 10, 0, 10);
		int expected = underTest.wasteDecreaseHealth();
		assertThat(expected, is(8));
	}
	
	@Test
	public void isPestIncreaseWaste() {
		int expected = underTest.wasteIncrease();
		assertThat(expected, is(1));
	}
	
	@Test
	public void isPetGettingClean() {
		virtualPet underTest = new virtualPet("Rock", 10, 10, 10, 10, 10);
		int expected = underTest.washPet();
		assertThat(expected, is(9));
	}
	
	@Test
	public void isPetGettingAlreadyClean() {
		int expected = underTest.washPet();
		assertThat(expected, is(0));
	}
	
}
