package com.Kata.HighScoringWord;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HighScoringWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighScoringWordApplication.class, args);
	}

	public static String high(String s) {
		return Arrays.stream(s.split(" ")).max(Comparator.comparingInt(a -> a.chars().map(i -> i - 96).sum())).get();
	}
}