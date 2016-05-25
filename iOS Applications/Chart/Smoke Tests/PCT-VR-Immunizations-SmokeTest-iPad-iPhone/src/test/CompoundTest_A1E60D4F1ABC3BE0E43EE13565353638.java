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
public class CompoundTest_A1E60D4F1ABC3BE0E43EE13565353638 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E60D4F1ABC3BE0E43EE13565353638(IContainer parent,
			String name) {
		super(parent, "PCT-VR-Immunizations-SmokeTest-iPad",
				"A1E60D4F1ABC3BE0E43EE13565353638");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"MultipleProvision_SingleProvision",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60D5144519C50E43EE13565353638");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"RoleSelection",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E60D73A9FAE0D0EC3AB93061623331");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Patient-Search-Encounter-Tap-iPAD-iPHONE",
				"test.PatientSearch_EncounterTap_iPad_A_Test_A1E60CB02D2909F0E43EE13565353638",
				"A1E60D5164B22F50E43EE13565353638");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"SelectPatient",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E60D519BE5F5B0E43EE13565353638");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_NoImmunForThisPat_Test_A1E5DC9AB5529270CBFFB83930633666",
				"A1E60D5226A81D90E43EE13565353638");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.SearchForAndSelectPatient2_IPAD_Test_A1E5DCA4961D7BE7CBFFB83930633666",
				"A1E60D5680CA7800E43EE13565353638");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"SelectPatient",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E60D51CBB975A0E43EE13565353638");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		IContainer testMethod_8 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_VerifyImmunizationOrderIPAD_Test_A1E5E214DBE4B49DF050B86436346262",
				"A1E60D5226F94AD0E43EE13565353638");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		IContainer testMethod_9 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_VerifyImmunizationCard1IPAD_Test_A1E5DCA2A3CA884CCBFFB83930633666",
				"A1E60D5226DF0C10E43EE13565353638");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		IContainer testMethod_10 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_VerifyImmunDoseGivenInd1IPAD_Test_A1E5EC7452E3CBD1F3A5E46232373631",
				"A1E60D5226C98840E43EE13565353638");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		IContainer testMethod_11 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ChartReview_OpenImmunizationSplitViewIPAD_Test_A1E5DCA94F3D28DECBFFB83930633666",
				"A1E60D5226BFEB50E43EE13565353638");
		testMethod_11.setRtbEnabled(false);
		this.add(testMethod_11);

		IContainer testMethod_12 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationSplitView_VerifyHeaderIPAD_Test_A1E5E493A7EED3E7FC52E36463376639",
				"A1E60D52276468B0E43EE13565353638");
		testMethod_12.setRtbEnabled(false);
		this.add(testMethod_12);

		IContainer testMethod_13 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationSplitView_VerifyMasterSideOrderIPAD_Test_A1E5DCAA1D3FCEC8CBFFB83930633666",
				"A1E60D5227777B80E43EE13565353638");
		testMethod_13.setRtbEnabled(false);
		this.add(testMethod_13);

		IContainer testMethod_14 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationSplitView_VerifyDetailsSideIPAD_Test_A1E5E49441995B9DFC52E36463376639",
				"A1E60D52274C9AF0E43EE13565353638");
		testMethod_14.setRtbEnabled(false);
		this.add(testMethod_14);

		IContainer testMethod_15 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationSplitView_VerifyDetailsSideTimelineIPAD_Test_A1E5F200EABDB531FDFDE46264633562",
				"A1E60D52275D3CC0E43EE13565353638");
		testMethod_15.setRtbEnabled(false);
		this.add(testMethod_15);

		IContainer testMethod_16 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationSplitView_OpenDetailsPopoverIPAD_Test_A1E5DCAD21AD0C35CBFFB83930633666",
				"A1E60D5227456F00E43EE13565353638");
		testMethod_16.setRtbEnabled(false);
		this.add(testMethod_16);

		IContainer testMethod_17 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationDetailsPopoverModal_VerifyData_Test_A1E5DCAFE32C5931CBFFB83930633666",
				"A1E60D52270EA790E43EE13565353638");
		testMethod_17.setRtbEnabled(false);
		this.add(testMethod_17);

		IContainer testMethod_18 = (IContainer) loadTest(
				this,
				"Immunization",
				"test.ImmunizationSplitView_ClosePopoverIPAD_Test_A1E5F106D4CF9621F55CB63630613030",
				"A1E60D522734CD30E43EE13565353638");
		testMethod_18.setRtbEnabled(false);
		this.add(testMethod_18);

		IContainer testMethod_19 = (IContainer) loadTest(
				this,
				"Log_Out",
				"test.LogOut_LogOut_iPad_Test_A1E5E630FDFFDB19D160B26464353566",
				"A1E60D520A3DF210E43EE13565353638");
		testMethod_19.setRtbEnabled(false);
		this.add(testMethod_19);

		super.execute();
	}

}