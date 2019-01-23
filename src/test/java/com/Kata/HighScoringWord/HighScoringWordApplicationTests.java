package com.Kata.HighScoringWord;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HighScoringWordApplicationTests {

	@Test
	public void high_scoring_word_expecting_zuknkizfedioxtqdi_test() {
		String s = "ndauhyprfsihsgerml zuknkizfedioxtqdi";
		String results = HighScoringWordApplication.high(s);

		assertEquals("zuknkizfedioxtqdi", results);
	}

	@Test
	public void high_scoring_word_expecting_piuoqaccjjnorcndxhd_test() {
		String s = "qkmuzmdajzzqx piuoqaccjjnorcndxhd";
		String results = HighScoringWordApplication.high(s);

		assertEquals("piuoqaccjjnorcndxhd", results);
	}

	@Test
	public void high_scoring_word_expecting_nothing_test() {
		String s = "";
		String results = HighScoringWordApplication.high(s);

		assertEquals("", results);
	}

	@Test
	public void high_scoring_word_expecting_taxi_test() {
		String s = "man i need a taxi up to ubud";
		String results = HighScoringWordApplication.high(s);

		assertEquals("taxi", results);
	}

	@Test
	public void high_scoring_word_expecting_volcano_test() {
		String s = "what time are we climbing up to the volcano";
		String results = HighScoringWordApplication.high(s);

		assertEquals("volcano", results);
	}

	@Test
	public void high_scoring_word_expecting_semynak_test() {
		String s = "take me to semynak";
		String results = HighScoringWordApplication.high(s);

		assertEquals("semynak", results);
	}

}
