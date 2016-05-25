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
public class Remodeled_Visit_List_CompoundTest_A1E60ADB3DB75740E43EE13565353638
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Remodeled_Visit_List_CompoundTest_A1E60ADB3DB75740E43EE13565353638(
			IContainer parent, String name) {
		super(parent, "Remodeled_Visit_List",
				"A1E60ADB3DB75740E43EE13565353638");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"MultipleProvision_SingleProvision",
				"test.Multiple_Single_PersonalProvision_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60ADC95CB9990E43EE13565353638");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"RoleSelection",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E60ADD0DD175E0E43EE13565353638");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Patient-Search-Encounter-Tap-iPAD-iPHONE",
				"test.PatientSearch_EncounterTap_iPad_Test_A1E606EF335F903CD8FBE63765636234",
				"A1E60ADE64D4E470E43EE13565353638");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"SelectPatient",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E60ADED4AD3F40E43EE13565353638");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.ChartReview_VerifyVisitListPreviousSectionIPAD_Test_A1E5E869FCD0F3D7E45FB13334396164",
				"A1E60AE5284B2260E43EE13565353638");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.ChartReview_VerifyVisitListFutureSectionIPAD_Test_A1E5E869FCC50B94E45FB13334396164",
				"A1E60AE52848D873E43EE13565353638");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.ChartReview_OpenVisitListIPAD_Test_A1E5E869FCB92420E45FB13334396164",
				"A1E60AE528466770E43EE13565353638");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		IContainer testMethod_8 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_VerifyFutureSectionIPAD_Test_A1E5E869FD13A21FE45FB13334396164",
				"A1E60AE5284FDD50E43EE13565353638");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		IContainer testMethod_9 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_VerifyPreviousSectionIPAD_Test_A1E5E869FD21D370E45FB13334396164",
				"A1E60AE528524E50E43EE13565353638");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		IContainer testMethod_10 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_VerifyTimeLineIPAD_Test_A1E5E87BDDA3FA4EC810B03838373766",
				"A1E60AE52854BF50E43EE13565353638");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		IContainer testMethod_11 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_OpenPopoverFutureVisitIPAD_Test_A1E5E869FD0A0354E45FB13334396164",
				"A1E60AE5284D9366E43EE13565353638");
		testMethod_11.setRtbEnabled(false);
		this.add(testMethod_11);

		IContainer testMethod_12 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitListPopoverModal_VerifyData_Test_A1E5E869B10A9A4EE45FB13334396164",
				"A1E60AE52854BF53E43EE13565353638");
		testMethod_12.setRtbEnabled(false);
		this.add(testMethod_12);

		IContainer testMethod_13 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_ClosePopover_Test_A1E5F11A313C7F04D892E63663313530",
				"A1E60AE5284B2266E43EE13565353638");
		testMethod_13.setRtbEnabled(false);
		this.add(testMethod_13);

		IContainer testMethod_14 = (IContainer) loadTest(
				this,
				"Log_Out",
				"test.LogOut_LogOut_iPad_Test_A1E5E630FDFFDB19D160B26464353566",
				"A1E60ADEF88AEB10E43EE13565353638");
		testMethod_14.setRtbEnabled(false);
		this.add(testMethod_14);

		super.execute();
	}

}