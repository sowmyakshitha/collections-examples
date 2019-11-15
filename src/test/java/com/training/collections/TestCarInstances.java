package com.training.collections;

import static org.junit.Assert.assertEquals;

/**
 * This test class created Objects of CarInstances and added to collection
 * Comparing the values according to the CompareTo();
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestCarInstances {
	
	/**
	 * This Test case compares the values based on price of the car and
	 * Print them in ascending order
	 */

	@Test
	public void testOrderBasedOnPriceIsInAscendingOrNot() {
		CarInstances maruti = new CarInstances("MARUTI", "Baleno", "2000", 900000);
		CarInstances honda = new CarInstances("MARUTI", "AMAZE", "2001", 1200000);
		CarInstances hyundai = new CarInstances("HYUNDAI", "I10", "2002", 800000);

		// Set<CarInstances> cars = new TreeSet<CarInstances>();
		List<CarInstances> cars = new ArrayList<CarInstances>();
		cars.add(maruti);
		cars.add(honda);
		cars.add(hyundai);

		// System.out.println(cars);

		Collections.sort(cars);
		System.out.println(cars);

		Iterator<CarInstances> it = cars.iterator();
		assertEquals(hyundai, it.next());
		assertEquals(maruti, it.next());
		assertEquals(honda, it.next());

	}

}
