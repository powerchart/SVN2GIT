/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class Test_CompoundTest_A1E5ED47E06B56A0FDEBB23439646537 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Test_CompoundTest_A1E5ED47E06B56A0FDEBB23439646537(
			IContainer parent, String name) {
		super(parent, "test", "A1E5ED47E06B56A0FDEBB23439646537");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"SelectBadge",
				"test.Location_SelectPersonalBadge_Test_A1E5EB9BD7432C5FF86DB76434653162",
				"A1E5ED47E64F0F30FDEBB23439646537");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		this.add(new KDelay(this, "Delay (20000 ms.)",
				"A1E5ED47F9ACCAE0FDEBB23439646537", 20000));
		this.add(new test.PatientSearch_DecisionSupportOverride_TestVersion_Test_A1E5ED4723752A08FDEBB23439646537(
				this, "A1E5ED47F759DA30FDEBB23439646537") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}