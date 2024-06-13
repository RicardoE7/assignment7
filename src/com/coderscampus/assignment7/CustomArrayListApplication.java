package com.coderscampus.assignment7;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> customStringList = new CustomArrayList<>();

		customStringList.add("a");
		customStringList.add("b");
		customStringList.add("c");
		customStringList.add("d");
		customStringList.add("e");
		customStringList.add("f");
		customStringList.add("g");
		customStringList.add("h");
		customStringList.add("i");
		customStringList.add("j");
		customStringList.add("j");
		customStringList.add("a");
		customStringList.add("b");
		customStringList.add("c");
		customStringList.add("d");
		customStringList.add("e");
		customStringList.add("f");
		customStringList.add("g");
		customStringList.add("h");
		customStringList.add("i");
		customStringList.add("final");

		for (int i = 0; i < customStringList.getSize(); i++) {
			System.out.println(customStringList.get(i));
			// System.out.println(customStringList.getSize());
		}

		System.out.println("Get index 0: " + customStringList.get(0));

		System.out.println("---------------");

		customStringList.add(3, "added");

		for (int i = 0; i < customStringList.getSize(); i++) {
			System.out.println(customStringList.get(i));
			// System.out.println(customStringList.getSize());
		}

		System.out.println(customStringList.getSize());

		System.out.println("--------------");

//		customStringList.remove(20);
//		customStringList.remove(0);
//		customStringList.remove(2);
		System.out.println(customStringList.getSize() + " Before add method");

		// customStringList.add(19, "added");

		for (int i = 0; i < customStringList.getSize(); i++) {
			System.out.println(customStringList.get(i));
			// System.out.println(customStringList.getSize());
		}

		System.out.println(customStringList.getSize());

	}

}
