package testNg;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test1 {
	
	@Test
	public void testcase1() {
		Assert.assertTrue(true);
		System.out.println("I am running number One");
	}
}
