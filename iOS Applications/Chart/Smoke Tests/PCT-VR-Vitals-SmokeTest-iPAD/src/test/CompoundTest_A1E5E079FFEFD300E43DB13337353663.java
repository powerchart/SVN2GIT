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
public class CompoundTest_A1E5E079FFEFD300E43DB13337353663 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5E079FFEFD300E43DB13337353663(IContainer parent,
			String name) {
		super(parent, "PCT-VR-Vitals-SmokeTest_iPad",
				"A1E5E079FFEFD300E43DB13337353663");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60BC008B4C5B2DEDAB96135333238");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Dismiss_Pin_Screen_Reminder_PopUp_iPad_iPhone_Test_A1E5D4F6B3A95310E21AB43837353866",
				"A1E60BC008B4ECC2DEDAB96135333238");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E60BC008B4ECC7DEDAB96135333238");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPad_A_Test_A1E606EF335F903CD8FBE63765636234",
				"A1E60BC008B4ECCCDEDAB96135333238");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		this.add(new test.ChartReview_VerifyTemperature_Test_A1E60C3CD0473F03EE7FB16665633431(
				this, "A1E60C444671A060EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyHeartRate_Test_A1E60C3CD0F9C63FEE7FB16665633431(
				this, "A1E60C446867C780EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyRespiratoryRate_Test_A1E60C3CD16E5AA5EE7FB16665633431(
				this, "A1E60C446E4F50A0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyBloodPressure_Test_A1E60C3CCEA1F44FEE7FB16665633431(
				this, "A1E60C44784005F0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyHeight_Test_A1E60C3CD23D9228EE7FB16665633431(
				this, "A1E60C44847EF100EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyWeight_Test_A1E60C3CCD08902EEE7FB16665633431(
				this, "A1E60C448B8B4B10EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60D4376DA5990D8C2E53231303765", 20000));
		this.add(new test.VitalsProfileView_VerifyHeader_Test_A1E60C3CCDD79F06EE7FB16665633431(
				this, "A1E60C4591B5DB30EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsProfileView_VerifyTemperature_Test_A1E60C3CD0B4CDE5EE7FB16665633431(
				this, "A1E60C45971A78B0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsProfileView_VerifyHeartRate_Test_A1E60C3CCE1F07D9EE7FB16665633431(
				this, "A1E60D4A17AD4070D8C2E53231303765") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsProfileView_VerifyRespiratoryRate_Test_A1E60C3CD1602910EE7FB16665633431(
				this, "A1E60D4A1D8AB770D8C2E53231303765") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsProfileView_VerifyBloodPressure_Test_A1E60C3CCD67C760EE7FB16665633431(
				this, "A1E60D4A39C0DAA0D8C2E53231303765") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsProfileView_VerifyHeight_Test_A1E60C3CCE3E01D2EE7FB16665633431(
				this, "A1E60D4A3FF06940D8C2E53231303765") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsProfileView_VerifyWeight_Test_A1E60C3CD0CA2B3BEE7FB16665633431(
				this, "A1E60C45AE3A6C80EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_ClickOnCell_Test_A1E60C3CD11B0A4FEE7FB16665633431(
				this, "A1E60C46E6FEEF90EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_VerifyHeader_Test_A1E60C3CCD4B1677EE7FB16665633431(
				this, "A1E60C472ED76C20EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_VerifyTemperature_Test_A1E60C3CCEB9C134EE7FB16665633431(
				this, "A1E60C4738DFC820EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_VerifyHeartRate_Test_A1E60C3CCDACBE10EE7FB16665633431(
				this, "A1E60C4742D05660EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_VerifyRespiratoryRate_Test_A1E60C3CD076DBABEE7FB16665633431(
				this, "A1E60C4746438420EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_VerifyBloodPressure_Test_A1E60C3CD0936441EE7FB16665633431(
				this, "A1E60C47496F48A0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_VerifyHeight_Test_A1E60C3CCE6FE703EE7FB16665633431(
				this, "A1E60C474E6B1230EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.VitalsSplitView_VerifyWeight_Test_A1E60C3CD2176BF3EE7FB16665633431(
				this, "A1E60C4754DF23E0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60D438A2B9220D8C2E53231303765", 20000));
		this.add(new test.VitalsSplitView_VerifyPopOverDetails_Test_A1E60C3CCEF54611EE7FB16665633431(
				this, "A1E60C48EFA00880EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ChangePatientOrEncounter_PatB_Test_A1E60C3CD0559776EE7FB16665633431(
				this, "A1E60C495047FDA0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_5 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPad_B_Test_A1E60BBB6966E69CDF73E33863636361",
				"A1E60C4977283B10EE7FB16665633431");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		this.add(new test.ChartReview_VerifyTemperature_PatB_Test_A1E60C3CD01ED14AEE7FB16665633431(
				this, "A1E60C4EABAAD1E0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyHeartRate_PatB_Test_A1E60C3CD22F3914EE7FB16665633431(
				this, "A1E60C4ECB566CC0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyRespiratoryRate_PatB_Test_A1E60C3CCE0BF511EE7FB16665633431(
				this, "A1E60C4ED15CEF90EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyBloodPressure_PatB_Test_A1E60C3CD1082015EE7FB16665633431(
				this, "A1E60C4EE02803C0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyHeight_PatB_Test_A1E60C3CD132D8EEEE7FB16665633431(
				this, "A1E60C4EF7481EA0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyWeight_PatB_Test_A1E60C3CD141306DEE7FB16665633431(
				this, "A1E60C4EFCB3E810EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyHeadCircumference_Test_A1E60C3CD14F8900EE7FB16665633431(
				this, "A1E60C4F08B750C0EE7FB16665633431") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ChangePatientOrEncounter_PatB_Test_A1E60C3CD0559776EE7FB16665633431(
				this, "A1E60DD464C133F0F765B73037626462") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.LogOut_LogOut_iPad_Test_A1E5E630FDFFDB19D160B26464353566",
				"A1E60BC015FE6A02DEDAB96135333238");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		super.execute();
	}

}