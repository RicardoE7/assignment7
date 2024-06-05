package com.coderscampus.assignment7;

public class CustomArrayList<T> implements CustomList<T> {
	private int objectArraySize = 10;
	private int currentListSize;
	Object[] items = new Object[objectArraySize];

	@Override
	public boolean add(T item) {

		if (currentListSize < objectArraySize) {
			items[currentListSize] = item;
			currentListSize++;
			return true;
		} else if (currentListSize >= objectArraySize) {

			objectArraySize = objectArraySize * 2;

			Object[] increasedItems = new Object[objectArraySize];

			for (int i = 0; i < currentListSize; i++) {
				increasedItems[i] = items[i];
			}

			items = new Object[objectArraySize];

			for (int i = 0; i < currentListSize; i++) {
				items[i] = increasedItems[i];
			}

			items[currentListSize] = item;

			currentListSize++;
			return true;
		} else
			return false;
	}

	@Override
	public int getSize() {

		return currentListSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (currentListSize < index) {
			throw new IndexOutOfBoundsException();
		}
		if (currentListSize == objectArraySize) {
			objectArraySize = objectArraySize * 2;
			Object[] increasedItems = new Object[objectArraySize];
			for (int i = 0; i < currentListSize; i++) {
				increasedItems[i] = items[i];
				System.out.println("From increasedItems loop: " + increasedItems[i]);
			}

			items = new Object[objectArraySize];
			for (int i = 0; i < increasedItems.length; i++) {
				if (i < index) {
					items[i] = increasedItems[i];
				}
				if (index == i) {
					items[i] = item;
				}
				if (i > index) {
					items[i] = increasedItems[i - 1];
				}
			}
			currentListSize++;
			return true;
		}
		Object[] increasedItems = new Object[objectArraySize];
		for (int i = 0; i < currentListSize; i++) {
			increasedItems[i] = items[i];
		}
		for (int i = 0; i < index; i++) {
			if (i < index) {
				items[i] = increasedItems[i];
			}
			if (i == index) {
				items[i] = item;
			}
			if (i > index) {
				items[i] = increasedItems[i - 1];
			}
		}
		
		currentListSize++;

		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (currentListSize <= index) {
			throw new IndexOutOfBoundsException();
		}
		
		Object[] copyArray = new Object[objectArraySize];
		
		for (int i = 0; i < currentListSize; i++) {
			copyArray[i] = items[i];
		}
		
		items = new Object[objectArraySize];
		
		if(index == 0) {
			for(int i = 1; i < currentListSize; i++) {
				items[i-1] = copyArray[i];
			}
			currentListSize--;
			return (T) copyArray[index];
		}
		
		if(index == currentListSize - 1) {
			for(int i = 0; i < index; i++) {
				items[i] = copyArray[i];
			}
			currentListSize--;
			return (T) copyArray[index];
		}
		
		if(index != currentListSize - 1) {
			for(int i = 0; i < index; i++) {
				items[i] = copyArray[i];
			}
			for(int i = index; i < currentListSize; i++) {
				items[i] = copyArray[i+1];
			}
			currentListSize--;
			return (T) copyArray[index];
		}
		
		
		
		else
			
		return null;
	}

}
