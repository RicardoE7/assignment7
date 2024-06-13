package com.coderscampus.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.assignment7.CustomArrayList;
import com.coderscampus.assignment7.CustomList;

public class CustomArrayApplicationTest {
	@Test
	void should_add_one_item_to_list() {

		// Arrange
		CustomList<Integer> customList = new CustomArrayList<>();

		// Act
		customList.add(10);
		Integer expectedResult = customList.get(0);
		// Assert

		assertEquals(10, expectedResult);
		assertEquals(1, customList.getSize());
	}

	@Test
	void should_add_21_items_to_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 1; i < 22; i++) {
			sut.add(i);
		}

		// Assert
		for (int i = 0; i < 21; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(21, sut.getSize());
	}

	@Test
	void should_add_item_to_specified_index() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 22; i++) {
			sut.add(i);
		}
		int initialSize = sut.getSize();

		sut.add(3, 10);

		// Assert

		assertEquals(10, sut.get(3));
		assertEquals(initialSize + 1, sut.getSize());

	}

	@Test
	void should_return_size_of_array() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 5; i++) {
			sut.add(i);
		}

		// Assert

		assertEquals(5, sut.getSize());

	}

	@Test
	void should_remove_item_from_array() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 1; i < 7; i++) {
			sut.add(i);
		}

		sut.remove(3);
		sut.remove(3);
		// Assert

		assertEquals(4, sut.getSize());
		assertEquals(6, sut.get(3));

	}

}
