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
public class Printers_CompoundTest_A1E5D4F27E118640D596E36339376231 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Printers_CompoundTest_A1E5D4F27E118640D596E36339376231(
			IContainer parent, String name) {
		super(parent, "printers", "A1E5D4F27E118640D596E36339376231");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"Select_a_badge",
				"test.Location_SelectSharedBadge_Test_A1E5CB779D404831C8C0B83030646433",
				"A1E5D4F31AE7D2D0D596E36339376231");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		this.add(new KDelay(this, "Delay (30000 ms.)",
				"A1E5D4F2AD27D0B0D596E36339376231", 30000));
		this.add(new test.OrderDetails_OpenPrescriptionRouting_Test_A1E5D5815A9FD611E992B63938316434(
				this, "A1E5D59544BF0182E992B63938316434") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PrescriptionRouting_SelectSearchForPharmacy_Test_A1E5D5AC41DB999DE992B63938316434(
				this, "A1E5D5ACD44C2780E992B63938316434") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PharmacySearch_SelectAPharmacy_Test_A1E5D5AB0D904370E992B63938316434(
				this, "A1E5D5AB1E2281D0E992B63938316434") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}