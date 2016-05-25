package forQuickSwipe;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import javax.swing.JOptionPane;



/**
 * @author unknown
 */
public class Class implements
		com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Class() {
		
		
		JOptionPane.showMessageDialog(null, "Test playback paused...If necessary tap on the patient's chart to bring it into foucus. Next preform a quick view swipe from right to left and then click the 'OK' button to continue testing. ");
		
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		
		return null;
	}

}

