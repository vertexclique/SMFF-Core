package test.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	private static Log logger = LogFactory.getLog(AppTest.class);

	/**
	 * Create the test case
	 * 
	 * @param testName
	 *          name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		 //BasicConfigurator.configure(); 
		System.out.println(System.getProperty("log4j.configuration"));
		logger.info("Will return the test suite.");
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("log4j.configuration"));
		BasicConfigurator.configure(); 
		logger.info("Will return the test suite.");
  }
}
