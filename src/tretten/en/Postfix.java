package tretten.en;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Postfix {
	static Stack<Integer> stack;
	private static boolean solved = true; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		stack = new Stack<Integer>();

		System.out.print("Skriv en postfix-setning: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String operation = null;

		try {
			operation = br.readLine();
		} catch (IOException e) {
			System.out.println("Klarte ikke lese inn setningen.");
			System.exit(1);
		}

		char[] ops = operation.toCharArray();
		int i = 0;

		while (i < ops.length) {
			try {
				eval(""+ops[i]);
			} catch(EmptyStackException e) {
				solved = false;
				System.out.println("Uttrykket er ikke korrekt utformet.");
			}
			i++;
		}

		if (solved) System.out.println(stack.pop());
	}

	/*
	 * Evaluer Postfix-setningen
	 */
	public static void eval(String c) {
		if (c.equals("+"))
			stack.push(stack.pop() + stack.pop());
		else if (c.equals("-"))
			stack.push(stack.pop() - stack.pop());
		else if (c.equals("*"))
			stack.push(stack.pop() * stack.pop());
		else if (c.equals("/"))
			stack.push(stack.pop() / stack.pop());
		else if (c.equals("%"))
			stack.push(stack.pop() % stack.pop());
		else
			stack.push(Integer.parseInt(c));
	}

}
