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
public class CompoundForClinicalInteractions_CompoundTest_A1E5CE9A96762A00EF33B53761343863
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundForClinicalInteractions_CompoundTest_A1E5CE9A96762A00EF33B53761343863(
			IContainer parent, String name) {
		super(parent, "compound for clinical interactions",
				"A1E5CE9A96762A00EF33B53761343863");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"Select_a_badge",
				"test.SelectASharedBadge_Test_A1E5CB779D404831C8C0B83030646433",
				"A1E5CE9D2D7221F0EF33B53761343863");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Log_In",
				"test.LogInWithSharedBadge_Test_A1E5CB825FF88F4BC8C0B83030646433",
				"A1E5CE9C99DF81D0EF33B53761343863");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		this.add(new KDelay(this, "Delay (50000 ms.)",
				"A1E5CE9AAD694170EF33B53761343863", 50000));
		this.add(new test.OpenClinicalInteraction_Test_A1E5CE93FA4813D6EF33B53761343863(
				this, "A1E5CE9ABFC71950EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.RemoveInClinicalInteraction_Test_A1E5CE944FC2181EEF33B53761343863(
				this, "A1E5CE9AA52E7980EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (10000 ms.)",
				"A1E5CE9AC40670B0EF33B53761343863", 10000));
		this.add(new test.OpenClinicalInteraction_Test_A1E5CE93FA4813D6EF33B53761343863(
				this, "A1E5CE9AA52C0886EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.NavigateToClinicalInteractionDetails_Test_A1E5CE94A73AFB05EF33B53761343863(
				this, "A1E5CE9AA52C0880EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.NavigateBackFromClinicalInteractionDetails_Test_A1E5CE9557A4DFD7EF33B53761343863(
				this, "A1E5CE9AA529BE90EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.NavigateToOverrideReasons_Test_A1E5CE96383EBCF7EF33B53761343863(
				this, "A1E5CE9AA52C0883EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SelectAnOverrideReason_Test_A1E5CE9716C152C7EF33B53761343863(
				this, "A1E5CE9AA530EA80EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.NavigateBackFromClinicalInteractionDetails_Test_A1E5CE9557A4DFD7EF33B53761343863(
				this, "A1E5CE9AD90F6B62EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.CompleteInClinicalInteraction_Test_A1E5CE9482847AC2EF33B53761343863(
				this, "A1E5CE9AA5274D90EF33B53761343863") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}