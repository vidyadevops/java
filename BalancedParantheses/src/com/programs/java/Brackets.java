package com.programs.java;

import java.util.Scanner;

public class Brackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		try {
			while (tc > 0) {
				String parantheses = sc.nextLine();
				System.out.println(isBalanced(parantheses));
				tc--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	private static String isBalanced(String parantheses) throws Exception {
		Stack<Character> stack = new Stack<Character>(parantheses.length());
		for (int i = 0; i < parantheses.length(); i++) {
			char element = parantheses.charAt(i);

			switch (element) {
			case '[':
				stack.push(element);
				break;
			case '{':
				stack.push(element);
				break;
			case '(':
				stack.push(element);
				break;
			case ')':
				if (stack.isEmpty() || (stack.pop() != '('))
					return "NO";
				break;
			case '}':
				if (stack.isEmpty() || (stack.pop() != '{'))
					return "NO";
				break;
			case ']':
				if (stack.isEmpty() || (stack.pop() != '['))
					return "NO";
				break;
			}
		}
		if (stack.isEmpty())
			return "YES";
		return "NO";
	}
}
