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
public class CompoundTest_A1E5F658A2D12A80EB21B53231396130 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5F658A2D12A80EB21B53231396130(IContainer parent,
			String name) {
		super(parent, "RFT-P-PCT-VR-Allergies-SmokeTest-iPhone",
				"A1E5F658A2D12A80EB21B53231396130");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E60C42457DB562C1FCE33362383431");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.Dismiss_Pin_Screen_Reminder_PopUp_iPad_iPhone_Test_A1E5D4F6B3A95310E21AB43837353866",
				"A1E60C42457DB567C1FCE33362383431");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230",
				"A1E60C42457DB56CC1FCE33362383431");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPhone_A_Test_A1E606EF336D2484D8FBE63765636234",
				"A1E60C42457DB571C1FCE33362383431");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(this,
				"Reusable Functions",
				"test.Test_A1E5E0300DB18D20F51BB03534313832",
				"A1E60C42457DDC72C1FCE33362383431");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_DecisionSupportOverride_Test_A1E5ED4723752A08FDEBB23439646537",
				"A1E60C42457DDC77C1FCE33362383431");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		this.add(new test.ChartReveiew_Verify_NAR_iPhone_Test_A1E5F19D7ECE0AA0FB5EB16565353433(
				this, "A1E5F6591F18CF30EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60DFA5A659290C1FCE33362383431", 20000));
		this.add(new test.AddAllergy_from_ChartReview_iPhone_Test_A1E5F1A320C5B7E0FFF1E36662663130(
				this, "A1E5F6592D4B4CE0EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60DFD82279D20C1FCE33362383431", 20000));
		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F6595956C850EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddNonMultumAllegyfromSplitScreen_iPhone_Test_A1E5F1A64FBEAEF0FFF1E36662663130(
				this, "A1E5F65982853B80EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F6598F3A40F0EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddMul_Allergy_SplitScreen_Test_A1E5F59E16518FB0EB21B53231396130(
				this, "A1E5F6599E4DCFD0EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Allergies_SaveButton_SplitScreen_iPhone_Test_A1E60ADDD550528CE4C8B53064663364(
				this, "A1E60ADDF432A9F0E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F659AE6C3F00EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddMul_Allergy_SplitScreen_Test_A1E5F59E16518FB0EB21B53231396130(
				this, "A1E5F722C7F6B0D0EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Allergies_SaveButton_SplitScreen_iPhone_Test_A1E60ADDD550528CE4C8B53064663364(
				this, "A1E60ADDFB5AA250E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F659B704B750EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddMul_Allergy_SplitScreen_Test_A1E5F59E16518FB0EB21B53231396130(
				this, "A1E5F722FA04DE80EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Allergies_SaveButton_SplitScreen_iPhone_Test_A1E60ADDD550528CE4C8B53064663364(
				this, "A1E60ADE061ADCA0E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F659C52310C0EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddMul_Allergy_SplitScreen_Test_A1E5F59E16518FB0EB21B53231396130(
				this, "A1E5F724EF4ECB70EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Allergies_SaveButton_SplitScreen_iPhone_Test_A1E60ADDD550528CE4C8B53064663364(
				this, "A1E60ADE0EE98020E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F65A02AB2BD0EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddMul_Allergy_SplitScreen_Test_A1E5F59E16518FB0EB21B53231396130(
				this, "A1E5F724FF2F2030EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Allergies_SaveButton_SplitScreen_iPhone_Test_A1E60ADDD550528CE4C8B53064663364(
				this, "A1E60ADE1592D2A0E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F65A18A4A100EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddMul_Allergy_SplitScreen_Test_A1E5F59E16518FB0EB21B53231396130(
				this, "A1E5F72AD10A7A00EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Allergies_SaveButton_SplitScreen_iPhone_Test_A1E60ADDD550528CE4C8B53064663364(
				this, "A1E60ADE1B748F60E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Add_button_SplitScreen_Test_A1E5F59C4B94BB90EB21B53231396130(
				this, "A1E5F65A15C94670EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.AddMul_Allergy_SplitScreen_Test_A1E5F59E16518FB0EB21B53231396130(
				this, "A1E5F72F78D05170EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Allergies_SaveButton_SplitScreen_iPhone_Test_A1E60ADDD550528CE4C8B53064663364(
				this, "A1E60ADE214C3A00E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.NavigateBack_ReviewScreen_Test_A1E5F65843F85010EB21B53231396130(
				this, "A1E5F65A550A0E00EB21B53231396130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.TaponButton_Test_A1E5FA20D9788580DB24B66662626364(
				this, "A1E5FA2139074270DB24B66662626364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPhone_B_Test_A1E60BBC22C98C50DF73E33863636361",
				"A1E60C4263775A80C1FCE33362383431");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60DFF27A5FCF0C1FCE33362383431", 20000));
		this.add(new test.ChartReveiew_Verify_NKA_iPhone_Test_A1E60ADD36E02C38E4C8B53064663364(
				this, "A1E60ADD4E95D030E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.TaponButton_Test_A1E5FA20D9788580DB24B66662626364(
				this, "A1E5FA2133308230DB24B66662626364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_8 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPhone_C_Test_A1E60BBC27F9105BDF73E33863636361",
				"A1E60C427410C610C1FCE33362383431");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60DFF0C790C60C1FCE33362383431", 20000));
		this.add(new test.Step15_Verify_Allergy_Test_A1E5F73430B81A80DB24B66662626364(
				this, "A1E5F735FEA1EBA0DB24B66662626364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.TaponButton_Test_A1E5FA20D9788580DB24B66662626364(
				this, "A1E5FA21219250D0DB24B66662626364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_9 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.PatientSearch_EncounterTap_iPhone_D_Test_A1E60BBC2C68512FDF73E33863636361",
				"A1E60C427DE3E140C1FCE33362383431");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		this.add(new KDelay(this, "Delay (20 sec.)",
				"A1E60DFF137CB3E0C1FCE33362383431", 20000));
		this.add(new test.ChartReveiew_Verify_NMA_iPhone_Test_A1E60ADCAF469460E4C8B53064663364(
				this, "A1E60ADD12A12660E4C8B53064663364") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_10 = (IContainer) loadTest(
				this,
				"Reusable Functions",
				"test.LogOut_LogOut_iPhone_Test_A1E5D4F6B5BFFE10E21AB43837353866",
				"A1E60ADC81CFA212E4C8B53064663364");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		super.execute();
	}

}