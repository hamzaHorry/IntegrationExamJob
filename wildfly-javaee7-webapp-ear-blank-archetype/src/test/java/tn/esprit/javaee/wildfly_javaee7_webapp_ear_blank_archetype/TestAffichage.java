package tn.esprit.javaee.wildfly_javaee7_webapp_ear_blank_archetype;

import junit.framework.TestCase;
import org.junit.Test;



public class TestAffichage extends TestCase {


	@Test
	public void test() {
		App junit = new App();
		String result = junit.Display();
		assertEquals("welcome to ic",result);
	}

}