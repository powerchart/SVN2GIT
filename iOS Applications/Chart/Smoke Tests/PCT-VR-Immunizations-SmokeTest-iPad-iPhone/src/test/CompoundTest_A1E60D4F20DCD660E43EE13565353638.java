/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class CompoundTest_A1E60D4F20DCD660E43EE13565353638 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E60D4F20DCD660E43EE13565353638(IContainer parent,
			String name) {
		super(parent, "PCT-VR-Immunizations-SmokeTest-iPhone",
				"A1E60D4F20DCD660E43EE13565353638");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"MultipleProvision_SingleProvision",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60D7360ADECB0EC3AB93061623331");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"RoleSelection",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E60D7450701930EC3AB93061623331");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Patient-Search-Encounter-Tap-iPAD-iPHONE",
				"test.PatientSearch_EncounterTap_iPhone_A_Test_A1E60CB02D327F71E43EE13565353638",
				"A1E60D73727E9FC0EC3AB93061623331");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"SelectPatient",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E60D737C407CE0EC3AB93061623331");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_NoImmunForThisPat_Test_A1E5DC9AB5529270CBFFB83930633666",
				"A1E60D7471059EE0EC3AB93061623331");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.SearchForAndSelectPatient2_IPHONE_Test_A1E5EB8C3945C4ACE415B66466626561",
				"A1E60D73CB6039A0EC3AB93061623331");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"SelectPatient",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E60D737FFC7370EC3AB93061623331");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		IContainer testMethod_8 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_VerifyImmunizationOrderIPHONE_Test_A1E5EB93B7ADFB4AE415B66466626561",
				"A1E60D7471247180EC3AB93061623331");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		IContainer testMethod_9 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_VerifyImmunizationCard1IPHONE_Test_A1E5EBA088B5D43CE415B66466626561",
				"A1E60D7471188AA3EC3AB93061623331");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		IContainer testMethod_10 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_VerifyImmunDoseGivenInd1IPHONE_Test_A1E5EBAEBFDF3261E415B66466626561",
				"A1E60D74710CA3C6EC3AB93061623331");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		IContainer testMethod_11 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_OpenImmunizationResultsViewIPHONE_Test_A1E5EBB06742096CE415B66466626561",
				"A1E60D7471059EE3EC3AB93061623331");
		testMethod_11.setRtbEnabled(false);
		this.add(testMethod_11);

		IContainer testMethod_12 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationResultsView_VerifyHeaderIPHONE_Test_A1E5EC45C4E04DEDE415B66466626561",
				"A1E60D747139F550EC3AB93061623331");
		testMethod_12.setRtbEnabled(false);
		this.add(testMethod_12);

		IContainer testMethod_13 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationResultsView_VerifyDetailsIPHONE_Test_A1E5EC56244A28ACE415B66466626561",
				"A1E60D7471378450EC3AB93061623331");
		testMethod_13.setRtbEnabled(false);
		this.add(testMethod_13);

		IContainer testMethod_14 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationResultsView_OpenDetailsModalIPhone_Test_A1E5F10DDF05B558C014E66363376235",
				"A1E60D7471305863EC3AB93061623331");
		testMethod_14.setRtbEnabled(false);
		this.add(testMethod_14);

		IContainer testMethod_15 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationDetailsPopoverModal_VerifyData_Test_A1E5DCAFE32C5931CBFFB83930633666",
				"A1E60D7471305860EC3AB93061623331");
		testMethod_15.setRtbEnabled(false);
		this.add(testMethod_15);

		IContainer testMethod_16 = (IContainer) loadTest(
				this,
				"Log_Out",
				"test.LogOut_LogOut_iPhone_Test_A1E5D4F6B5BFFE10E21AB43837353866",
				"A1E60D73537A4160EC3AB93061623331");
		testMethod_16.setRtbEnabled(false);
		this.add(testMethod_16);

		super.execute();
	}

}