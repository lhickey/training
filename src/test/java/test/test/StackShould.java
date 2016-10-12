package test.test;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StackShould {
	
	@Test
	public void pop_object_from_top_of_stack(){
	
		Stack stack = new Stack();
		Object firstPushedObject = new Object();
		Object secondPushedObject = new Object();
		stack.push(firstPushedObject);
		stack.push(secondPushedObject);
		
		assertThat(stack.pop(), is(secondPushedObject));
		assertThat(stack.pop(), is(firstPushedObject));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void throw_an_exception_if_popped_when_empty(){
		
		Stack stack = new Stack();
		
		stack.pop();
		
	}
	
}
