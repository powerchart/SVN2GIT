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
public class CompoundTest_A1E60BB579E3FEF0E43EE13565353638 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E60BB579E3FEF0E43EE13565353638(IContainer parent,
			String name) {
		super(parent, "PCT-VR-VisitList-SmokeTest-iPhone",
				"A1E60BB579E3FEF0E43EE13565353638");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"MultipleProvision_SingleProvision",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60D493D1A5B50E43EE13565353638");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"RoleSelection",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E60BBF645722B0E43EE13565353638");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Patient-Search-Encounter-Tap-iPAD-iPHONE",
				"test.PatientSearch_EncounterTap_iPhone_A_Test_A1E60CB02D327F71E43EE13565353638",
				"A1E60D4933FCFB90E43EE13565353638");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"SelectPatient",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E60D4BE081A580E43EE13565353638");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.ChartReview_VerifyVisitListPreviousSectionIPHONE_Test_A1E5E869B0613B1AE45FB13334396164",
				"A1E60BC1D1127420E43EE13565353638");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.ChartReview_VerifyVisitListFutureSectionIPHONE_Test_A1E5E869B04E284CE45FB13334396164",
				"A1E60BC1D1100329E43EE13565353638");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.ChartReview_OpenVisitListIPHONE_Test_A1E5E869AFDE4E0AE45FB13334396164",
				"A1E60BC1D1100323E43EE13565353638");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		IContainer testMethod_8 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_VerifyPreviousSectionIPHONE_Test_A1E5E869B0F9D212E45FB13334396164",
				"A1E60BC1D127D0E0E43EE13565353638");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		IContainer testMethod_9 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_VerifyFutureSectionIPHONE_Test_A1E5E869B0E93040E45FB13334396164",
				"A1E60BC1D12315F3E43EE13565353638");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		IContainer testMethod_10 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitList_OpenModalFutureVisitIPHONE_Test_A1E5E869B0C7EB6DE45FB13334396164",
				"A1E60BC1D1127426E43EE13565353638");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		IContainer testMethod_11 = (IContainer) loadTest(
				this,
				"Visit_List",
				"test.VisitListPopoverModal_VerifyData_Test_A1E5E869B10A9A4EE45FB13334396164",
				"A1E60BC1D127D0E6E43EE13565353638");
		testMethod_11.setRtbEnabled(false);
		this.add(testMethod_11);

		IContainer testMethod_12 = (IContainer) loadTest(
				this,
				"Log_Out",
				"test.LogOut_LogOut_iPhone_Test_A1E5D4F6B5BFFE10E21AB43837353866",
				"A1E60BBF47E11050E43EE13565353638");
		testMethod_12.setRtbEnabled(false);
		this.add(testMethod_12);

		super.execute();
	}

}