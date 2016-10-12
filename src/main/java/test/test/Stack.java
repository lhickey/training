package test.test;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> stack;
	
	public Stack(){
		stack = new ArrayList<Object>();
	}
	
	public void push(Object object){
		stack.add(object);
	}
	
	public Object pop(){
		return stack.remove(stack.size()-1);
	}
	
}
