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
public class PCT_Basic_Script_Template_iPhone_CompoundTest_A1E606E9C22A2F70D8FBE63765636234
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public PCT_Basic_Script_Template_iPhone_CompoundTest_A1E606E9C22A2F70D8FBE63765636234(
			IContainer parent, String name) {
		super(parent, "PCT_Basic_Script_Template_iPhone",
				"A1E606E9C22A2F70D8FBE63765636234");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Multiple_Single_PersonalProvision_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60799D76303C0E1DFE13465623538");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Dismiss_Pin_Screen_Reminder_PopUp_iPad_iPhone_Test_A1E5D4F6B3A95310E21AB43837353866",
				"A1E607A6AD6BAF60D141B43761356163");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E606EBF880CA50D8FBE63765636234");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPhone_Test_A1E606EF336D2484D8FBE63765636234",
				"A1E607AA352DFD60D141B43761356163");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E607A33A3F27E0E1DFE13465623538");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.EstablishRelationShipWindowiPhone_Test_A1E5E0300DB18D20F51BB03534313832",
				"A1E607AA25A27F60D141B43761356163");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.LogOut_LogOut_iPhone_Test_A1E5D4F6B5BFFE10E21AB43837353866",
				"A1E607A9C26BC910D141B43761356163");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		super.execute();
	}

}