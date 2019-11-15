package com.training.collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TestCollectionUsingHashSet {
	@Test
	public void testThereAreUniqueLaptopsOrNot() {
		Laptop lenovo = new Laptop("Lenovo", "pavilion", "Windows", "32-bit");
		Laptop hp = new Laptop("Hp", "Hp Pavilion", "Linux", "64-bit");
		Laptop dell = new Laptop("Dell", "L480", "Ubuntu", "32-bit");
		Laptop acer = new Laptop("Dell", "L480", "Ubuntu", "32-bit");
		
		/**
		 * Checked whether hashcode is unique or not
		 */
//		System.out.println(lenovo.hashCode());
//		System.out.println(hp.hashCode());
//		System.out.println(lenovo.hashCode());
//		System.out.println(acer.hashCode());
		
		Set<Laptop> set = new HashSet<Laptop>();
		set.add(lenovo);
		set.add(hp);
		set.add(dell);
		set.add(acer);
		/**
		 * Checks there are unique elements and size of set
		 */
		assertEquals(3, set.size());
	}
	
	@Test
	public void testThereAreUniqueCarsOrNot() {
		/**
		 * Created two objects with same data 
		 */
		Cars maruti = new Cars("MARRUTI", "Baleno", "2000", 500000);
		Cars honda = new Cars("HONDA", "AMAZE", "2001", 600000);
		Cars hyundai = new Cars("HONDA", "AMAZE", "2001", 600000);

		Set<Cars> cars = new HashSet<Cars>();
		cars.add(maruti);
		cars.add(honda);
		cars.add(hyundai);
		/**
		 * checking whether duplicate data entered or not 
		 */
		assertEquals(2, cars.size());
	}
	
	@Test
	public void testThereAreUniqueTelevisionsOrNot() {
		Television lg = new Television("LG","LCD","enabled",10000);
		Television samsung = new Television("LG","LCD","not enabled",10000);
		Television sony = new Television("SONY","PLASMA","enabled",15000);
		
		Set<Television> television = new HashSet<Television>();
		television.add(lg);
		television.add(samsung);
		television.add(sony);
		
		assertEquals(2, television.size());
	}
	
	@Test
	public void testThereAreUniqueCellPhonesOrNot() {
		/**
		 * Created three different objects
		 */
		CellPhones mi = new CellPhones("MI", "Redmi 5A", "It is Android Phone", "Android", 11000);
		CellPhones samsung = new CellPhones("SAMSUNG", "m30", "It is the latest version with updated software",
				"Android", 15000);
		CellPhones onePlus = new CellPhones("ONEPLUS", "7Pro", "Advanced features", "Android", 30000);
		
		/**
		 * Added into set
		 */
		Set<CellPhones> cells = new HashSet<CellPhones>();
		cells.add(mi);
		cells.add(samsung);
		cells.add(onePlus);
		/**
		 * Checking size of Set is three or not
		 */
		assertEquals(3, cells.size());
	}
	
	@Test
	public void testThereAreUniqueSchoolsOrNot() {
		Schools skts = new Schools("Sri Krishnaveni Talent School","Sangareddy","Sangareddy","First");
		Schools goutham = new Schools("Goutham Model School","sadasivpet","sangareddy","Second");
		Schools alpha = new Schools("Alpha Little High School","malakpet","Hyderabad","third");
		Schools geetham = new Schools("Alpha Little High School","malakpet","Hyderabad","third");
		
		List<Schools> school = new ArrayList<Schools>();
		school.add(skts);
		school.add(goutham);
		school.add(alpha);
		school.add(geetham);
		
		assertEquals(4, school.size());
	}

}
