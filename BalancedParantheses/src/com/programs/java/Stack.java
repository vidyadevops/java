package com.programs.java;

public class Stack<J> {
	private int cursor = -1;
	private int capacity;
	private J[] data;

	public Stack(int capacity) {
		this.capacity = capacity;
		data = (J[]) new Object[this.capacity];
	}

	public void push(J element) throws Exception {
		if (cursor < capacity - 1) {
			cursor++;
			data[cursor] = element;
		} else
			throw new Exception("Stack is full");
	}

	public J pop() throws Exception {
		if (cursor >= 0) {
			J element = data[cursor];
			cursor--;
			return element;
		}
		throw new Exception("Stack is empty");
	}

	public boolean isEmpty() {
		return !(cursor >= 0);
	}
}
