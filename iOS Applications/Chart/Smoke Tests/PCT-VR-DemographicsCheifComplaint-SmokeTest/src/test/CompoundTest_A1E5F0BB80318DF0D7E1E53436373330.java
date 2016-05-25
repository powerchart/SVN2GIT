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
public class CompoundTest_A1E5F0BB80318DF0D7E1E53436373330 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5F0BB80318DF0D7E1E53436373330(IContainer parent,
			String name) {
		super(parent, "PCT-VR-DemographicsChiefComplaint-SmokeTest-iPad",
				"A1E5F0BB80318DF0D7E1E53436373330");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60C4E8B2C56A2FA95B46362333164");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Dismiss_Pin_Screen_Reminder_PopUp_iPad_iPhone_Test_A1E5D4F6B3A95310E21AB43837353866",
				"A1E60C4E8B2C56A7FA95B46362333164");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E60C4E8B2C56ACFA95B46362333164");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPad_A_Test_A1E606EF335F903CD8FBE63765636234",
				"A1E60C4E8B2C56B1FA95B46362333164");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60D2A105E6CB0EC04E26532653433", 20000));

		IContainer testMethod_5 = (IContainer) loadTest(
				this,
				"Open_Demographic_Details",
				"test.Open_DemographichDetails_Test_A1E606078CA57450D3D7B53535303465",
				"A1E60B9A2F8281D0F2A1B96264613263");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		this.add(new test.ExpandedDemographicsBanner_Verify_EncounterDetails_iPad_Test_A1E5F0B974D5C207D7E1E53436373330(
				this, "A1E5F0BBF921A330D7E1E53436373330") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Open_Demographic_Details",
				"test.Open_DemographichDetails_Test_A1E606078CA57450D3D7B53535303465",
				"A1E60B9A23169350F2A1B96264613263");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		this.add(new test.ExpandedDemographicsBanner_Verify_Patientdemographics_iPad_Test_A1E5F0B9752122D5D7E1E53436373330(
				this, "A1E5F0BBF92302C0D7E1E53436373330") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"Open_Demographic_Details",
				"test.Open_DemographichDetails_Test_A1E606078CA57450D3D7B53535303465",
				"A1E60B9A8BABCCA0F2A1B96264613263");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		this.add(new test.ExpandedDemographicsBanner_Verify_CareTeam_iPad_Test_A1E5F0B974B7B2ABD7E1E53436373330(
				this, "A1E5F0BBF9212E00D7E1E53436373330") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_8 = (IContainer) loadTest(
				this,
				"Open_Demographic_Details",
				"test.Open_DemographichDetails_Test_A1E606078CA57450D3D7B53535303465",
				"A1E60B9A95584D00F2A1B96264613263");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		this.add(new test.ExpandedDemographicsBanner_Verify_Familycontacts_iPad_Test_A1E5F0B974EF1642D7E1E53436373330(
				this, "A1E5F0BBF9223F70D7E1E53436373330") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_9 = (IContainer) loadTest(
				this,
				"Open_Demographic_Details",
				"test.Open_DemographichDetails_Test_A1E606078CA57450D3D7B53535303465",
				"A1E60B9AA12FEAC0F2A1B96264613263");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		this.add(new test.ExpandedDemographicsBanner_Verify_InsuranceInformation_iPad_Test_A1E5F0B9750891C7D7E1E53436373330(
				this, "A1E5F0BBF922B4A0D7E1E53436373330") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_10 = (IContainer) loadTest(
				this,
				"Open_Demographic_Details",
				"test.Open_DemographichDetails_Test_A1E606078CA57450D3D7B53535303465",
				"A1E60B9AA92BFC00F2A1B96264613263");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		this.add(new test.ExpandedDemographicsBanner_Verify_PreferredPharmacy_iPad_Test_A1E5F0B97544D76BD7E1E53436373330(
				this, "A1E5F0BBF9239F00D7E1E53436373330") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E5F0BC2E0474B0D7E1E53436373330", 20000));
		this.add(new test.ChartReview_VerifyChiefComplaint_Test_A1E5F0B973F5E93AD7E1E53436373330(
				this, "A1E5F0BBF91742F0D7E1E53436373330") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_11 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.LogOut_LogOut_iPad_Test_A1E5E630FDFFDB19D160B26464353566",
				"A1E60C4E8B2C56C0FA95B46362333164");
		testMethod_11.setRtbEnabled(false);
		this.add(testMethod_11);

		super.execute();
	}

}