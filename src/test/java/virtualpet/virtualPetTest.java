package virtualpet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class virtualPetTest {
	virtualPet underTest = new virtualPet("Rock");

	@Test
	public void shouldNamePet() {
		String expected = underTest.getName();
		assertThat(expected, is("Rock"));
	}
	


}
