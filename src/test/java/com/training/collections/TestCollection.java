package com.training.collections;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * This Test Class has different test cases of different Classes It checks
 * whether objects of classes entered into Collection or not
 * 
 * @author ksowmya
 *
 */

public class TestCollection {
	/**
	 * It Checks whether the Objects of laptops entered into collection or not Using
	 * List<>
	 */

	@Test
	public void testWhetherListIsEnteredOrNot() {
		Laptop lenovo = new Laptop("Lenovo", "pavilion", "Windows", "32-bit");
		Laptop hp = new Laptop("Hp", "Hp Pavilion", "Linux", "64-bit");
		Laptop dell = new Laptop("Dell", "L480", "Ubuntu", "32-bit");

		Collection<Laptop> list = new ArrayList<Laptop>();
		list.add(lenovo);
		list.add(hp);
		list.add(dell);

		Iterator<Laptop> it = list.iterator();
		assertEquals(lenovo, it.next());
		assertEquals(hp, it.next());
		assertEquals(dell, it.next());

	}

	/**
	 * It Checks whether the Objects of CellPhones entered into the Collection using
	 * List<>
	 */

	@Test
	public void testWhetherCellPhonesEnteredOrNot() {
		CellPhones mi = new CellPhones("MI", "Redmi 5A", "It is Android Phone", "Android", 11000);
		CellPhones samsung = new CellPhones("SAMSUNG", "m30", "It is the latest version with updated software",
				"Android", 15000);
		CellPhones onePlus = new CellPhones("ONEPLUS", "7Pro", "Advanced features", "Android", 30000);

		List<CellPhones> cells = new ArrayList<CellPhones>();
		cells.add(mi);
		cells.add(samsung);
		cells.add(onePlus);

		Iterator<CellPhones> it = cells.iterator();
		// while(it.hasNext())
		assertEquals(mi, it.next());
		assertEquals(samsung, it.next());
		assertEquals(onePlus, it.next());
	}

	@Test
	public void testWhetherCarsOrEnteredOrNot() {
		/**
		 * Created three Objects of Cars
		 */
		Cars maruti = new Cars("MARRUTI", "Baleno", "2000", 500000);
		Cars honda = new Cars("HONDA", "AMAZE", "2001", 600000);
		Cars hyundai = new Cars("HYUNDAI", "I10", "2002", 800000);

		/**
		 * Objects are added to collection
		 */
		List<Cars> cars = new ArrayList<Cars>();
		cars.add(maruti);
		cars.add(honda);
		cars.add(hyundai);

		Iterator<Cars> it = cars.iterator();
		assertEquals(maruti, it.next());
		assertEquals(honda, it.next());
		assertEquals(hyundai, it.next());

	}

	@Test
	public void testWhetherSchoolsEnteredOrNot() {
		Schools skts = new Schools("Sri Krishnaveni Talent School", "Sangareddy", "Sangareddy", "First");
		Schools goutham = new Schools("Goutham Model School", "sadasivpet", "sangareddy", "Second");
		Schools alpha = new Schools("Alpha Little High School", "malakpet", "Hyderabad", "third");

		List<Schools> school = new ArrayList<Schools>();
		school.add(skts);
		school.add(goutham);
		school.add(alpha);

		Iterator<Schools> it = school.iterator();
		assertEquals(skts, it.next());
		assertEquals(goutham, it.next());
		assertEquals(alpha, it.next());
	}

	@Test
	public void testWhetherTelivisionEnteresOrNot() {
		Television lg = new Television("LG", "LCD", "enabled", 10000);
		Television samsung = new Television("SAMSUNG", "LED", "not enabled", 12000);
		Television sony = new Television("SONY", "PLASMA", "enabled", 15000);

		List<Television> television = new ArrayList<Television>();
		television.add(lg);
		television.add(samsung);
		television.add(sony);

		Iterator<Television> it = television.iterator();
		assertEquals(lg, it.next());
		assertEquals(samsung, it.next());
		assertEquals(sony, it.next());

	}

	/**
	 * Test case is written to check whether names or entered in the order you
	 * entered
	 */
	@Test
	public void testStudentNamesAddedInCollectionOrNot() {
		/**
		 * Names are added into the list
		 */
		List<String> names = new ArrayList<String>();
		names.add("sowmya");
		names.add("mounika");
		names.add("swathi");
		names.add("priyanka");
		names.add("mansi");

		Iterator<String> it = names.iterator();
		assertEquals("sowmya", it.next());
		assertEquals("mounika", it.next());
		assertEquals("swathi", it.next());
		assertEquals("priyanka", it.next());
		assertEquals("mansi", it.next());
	}

	/**
	 * Test Case checks whether names are entered in natural order or not
	 */
	@Test
	public void testStudentNamesAreAddedInNaaturalOrderOrNot() {
		Set<String> names = new TreeSet<String>();
		names.add("sowmya");
		names.add("mamatha");
		names.add("arjun");
		names.add("manoj");

		// System.out.println(names);

		Iterator<String> it = names.iterator();
		assertEquals("arjun", it.next());

	}

	/**
	 * Creating a Map to store favourite fruits of students
	 */
	@Test
	public void testGetFavouriteFruitByGivingTheirName() {
		/**
		 * Adding Name as key and fruit as value into the map
		 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("sowmya", "apple");
		map.put("mounika", "mango");
		map.put("swathi", "banana");
		map.put("priyanka", "grapes");
		map.put("mansi", "melon");

		assertEquals("apple", map.get("sowmya"));
		assertEquals("grapes", map.get("priyanka"));
		assertEquals("melon", map.get("mansi"));
		assertEquals("banana", map.get("swathi"));
	}

}