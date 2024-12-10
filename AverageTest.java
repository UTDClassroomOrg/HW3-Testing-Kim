package com.testing.average;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTest {

	// Valid Test Cases
	@Test
	public void kIsLessThanTheArraySize() {
		Average avg = new Average();
		assertEquals(3, avg.average(4, new int[] {2,4,3,3,5,3}));
		System.out.println("TC1:");
		System.out.println("Expected Output: 3");
		System.out.println("Actual Output: " + avg.average(4, new int[] {2,4,3,3,5,3}));
	}

	@Test
	public void kIsGreaterThanTheArraySize() {
		Average avg = new Average();
		assertEquals(3, avg.average(20, new int[] {2,4,3,3,5,3}));
		System.out.println("TC2:");
		System.out.println("Expected Output: 3");
		System.out.println("Actual Output: " + avg.average(20, new int[] {2,4,3,3,5,3}));
	}
	
	@Test
	public void kEqualsToTheArraySize() {
		Average avg = new Average();
		assertEquals(3, avg.average(4, new int[] {2,4,3,3}));	
		System.out.println("TC3:");
		System.out.println("Expected Output: 3");
		System.out.println("Actual Output: " + avg.average(4, new int[] {2,4,3,3}));
	}
	
	// Invalid Test Cases
	@Test
	public void kIsZero() {
		Average avg = new Average();
		assertEquals(0, avg.average(0, new int[] {2,4,3,3,5,3}));
		System.out.println("TC4:");
		System.out.println("Expected Output: 0");
		System.out.println("Actual Output: " + avg.average(0, new int[] {2,4,3,3,5,3}));
	}
	
	@Test
	public void kIsNegative() {
		Average avg = new Average();
		assertEquals(0, avg.average(-1, new int[] {2,4,3,3,5,3}));
		System.out.println("TC5:");
		System.out.println("Expected Output: 0");
		System.out.println("Actual Output: " + avg.average(-1, new int[] {2,4,3,3,5,3}));
	}
	
	@Test
	public void ArrayIsEmpty() {
		Average avg = new Average();
		assertEquals(0, avg.average(4, new int[] {}));
		System.out.println("TC6:");
		System.out.println("Expected Output: 0");
		System.out.println("Actual Output: " + avg.average(4, new int[] {}));
	}
	
}
