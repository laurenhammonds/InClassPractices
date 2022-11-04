package school.datadase.util;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import school.database.util.EmailValidation;

public class EmailValidationTest {

	@Test
	public void isEmailValidTest() {
		EmailValidation ev = new EmailValidation();
		
		// false
		Assertions.assertFalse(ev.isValidEmail(null));
		// false
		Assertions.assertFalse(ev.isValidEmail(""));
		// true
		Assertions.assertTrue(ev.isValidEmail("eric@seriesreminder.com"));
		// false
		Assertions.assertFalse(ev.isValidEmail("er#ic@seriesreminder.com"));
		// false
		Assertions.assertFalse(ev.isValidEmail("eric@seriesreminder.co"));
}
}
