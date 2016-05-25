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
public class CompoundTest_A1E5E0894CDB25C0E409B16130646437 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5E0894CDB25C0E409B16130646437(IContainer parent,
			String name) {
		super(parent, "PCT-VR-Platform-Smoke-iPad",
				"A1E5E0894CDB25C0E409B16130646437");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(this,
				"CreateProvisions",
				"test.Test_A1E60BCA98703BC3E5CFE23930393162",
				"A1E60BCDE3B303E0F901B46562656266");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Log_In",
				"test.LogIn_LogInSharedBadge_Test_A1E5D4F6B7D6A94AE21AB43837353866",
				"A1E5E089CC048DA0E409B16130646437");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		IContainer testMethod_3 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINSetupCreate_Test_A1E5D73A7E4B7F60E86BE36132613164",
				"A1E5E08A251D3D10E409B16130646437");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue2_Test_A1E5CC34A0C1A98FEB16E13034386232",
				"A1E5E08A52AE2000E409B16130646437");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue0_Test_A1E5D677D400266BEB8DB43334313765",
				"A1E5E08A54E32870E409B16130646437");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		IContainer testMethod_6 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue0_Test_A1E5D677D400266BEB8DB43334313765",
				"A1E5E08A590DE660E409B16130646437");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		IContainer testMethod_7 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue4_Test_A1E5CC34CD2B9A85EB16E13034386232",
				"A1E5E08A5B21D240E409B16130646437");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		IContainer testMethod_8 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue2_Test_A1E5CC34A0C1A98FEB16E13034386232",
				"A1E5E08AC1D52C32E409B16130646437");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		IContainer testMethod_9 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue0_Test_A1E5D677D400266BEB8DB43334313765",
				"A1E5E08AC1D52C37E409B16130646437");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		IContainer testMethod_10 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue0_Test_A1E5D677D400266BEB8DB43334313765",
				"A1E5E08AC1D52C3CE409B16130646437");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		IContainer testMethod_11 = (IContainer) loadTest(this, "EnterPIN",
				"test.PINValue4_Test_A1E5CC34CD2B9A85EB16E13034386232",
				"A1E5E08AC1D52C41E409B16130646437");
		testMethod_11.setRtbEnabled(false);
		this.add(testMethod_11);

		IContainer testMethod_12 = (IContainer) loadTest(
				this,
				"CreatePinSuccessScreen",
				"test.CreatePinSuccessScreen_Test_A1E5E09A28EC7AFFC530B26266646631",
				"A1E5E09A4FB1B5A0E4DCB63462303335");
		testMethod_12.setRtbEnabled(false);
		this.add(testMethod_12);

		IContainer testMethod_13 = (IContainer) loadTest(this,
				"GuidedTour_iPhone",
				"test.GuidedTour_iPad_Test_A1E5E49B6FC2D08FD19AB66237346161",
				"A1E5E49BFDFF9F00D19AB66237346161");
		testMethod_13.setRtbEnabled(false);
		this.add(testMethod_13);

		IContainer testMethod_14 = (IContainer) loadTest(
				this,
				"eVisit",
				"test.EVisit_Verification_Schedule_View_Test_A1E5E0AE77DF6EBBC85EB03433326630",
				"A1E5E0B40A56BD60C85EB03433326630");
		testMethod_14.setRtbEnabled(false);
		this.add(testMethod_14);

		IContainer testMethod_15 = (IContainer) loadTest(
				this,
				"SelectPatientFromSchedule",
				"test.SelectPatientA_FromSchedule_Test_A1E5DF2C082DEB10FC26E56139323963",
				"A1E5E0A0DA576D20E4DCB63462303335");
		testMethod_15.setRtbEnabled(false);
		this.add(testMethod_15);

		IContainer testMethod_16 = (IContainer) loadTest(
				this,
				"Denial_Of_Access",
				"test.DofaPopoverOverride_Test_A1E5DBF4706CCE56CB4DE66664656365",
				"A1E5E0A865C22CE0DCE3E43138613331");
		testMethod_16.setRtbEnabled(false);
		this.add(testMethod_16);

		IContainer testMethod_17 = (IContainer) loadTest(
				this,
				"Denial_Of_Access",
				"test.DofaOverrideScreenOverrideReason_Test_A1E5DBF4CB19156ACB4DE66664656365",
				"A1E5E0A8AAC605A0F9B9E66238373132");
		testMethod_17.setRtbEnabled(false);
		this.add(testMethod_17);

		IContainer testMethod_18 = (IContainer) loadTest(
				this,
				"Denial_Of_Access",
				"test.DofaOverrideScreenContinue_Test_A1E5DBF492349196CB4DE66664656365",
				"A1E5E0A8FDBC1EC0CED7B86138623839");
		testMethod_18.setRtbEnabled(false);
		this.add(testMethod_18);

		IContainer testMethod_19 = (IContainer) loadTest(
				this,
				"ConfiPopoverContinue",
				"test.Confedential_Level_PopupContinue_Test_A1E5E0A6B65BF233E4DCB63462303335",
				"A1E5E0AB63D3EA10CED7B86138623839");
		testMethod_19.setRtbEnabled(false);
		this.add(testMethod_19);

		this.add(new KDelay(this, "Delay (3000 ms.)",
				"A1E6059DBCD1A8C2E6E7B46564356236", 3000));

		IContainer testMethod_20 = (IContainer) loadTest(
				this,
				"EstablishRelationOnlyPPR1",
				"test.VerifyPPR1Displays_PPR2NotDisplays_Test_A1E605976F53508BD8A0E26239656262",
				"A1E6059DB11CFC50E6E7B46564356236");
		testMethod_20.setRtbEnabled(false);
		this.add(testMethod_20);

		IContainer testMethod_21 = (IContainer) loadTest(
				this,
				"EstablishRelationOnlyPPR1",
				"test.EstablishRelationWindow_Test_A1E5E16E6F7097E7DA2CB76363653537",
				"A1E5E23FD50D64F0CF81E36566393637");
		testMethod_21.setRtbEnabled(false);
		this.add(testMethod_21);

		IContainer testMethod_22 = (IContainer) loadTest(
				this,
				"EURwithOverrideReason",
				"test.EURwithOverrideReason_Test_A1E5E16E7E9E6615DA2CB76363653537",
				"A1E5E23FDCA4C0F0CF81E36566393637");
		testMethod_22.setRtbEnabled(false);
		this.add(testMethod_22);

		IContainer testMethod_23 = (IContainer) loadTest(
				this,
				"EURwithOverrideReason",
				"test.EURTapContinueButton_Test_A1E600B0B783A205D08AE43132383034",
				"A1E60D5D012FAC80D704B13535613839");
		testMethod_23.setRtbEnabled(false);
		this.add(testMethod_23);

		IContainer testMethod_24 = (IContainer) loadTest(
				this,
				"Discern_Alert",
				"test.Decision_Support_Override_Test_A1E5E0B45F308B52C85EB03433326630",
				"A1E5E0B505EED9F0C85EB03433326630");
		testMethod_24.setRtbEnabled(false);
		this.add(testMethod_24);

		this.add(new KDelay(this, "Delay (3000 ms.)",
				"A1E600C04A654350D08AE43132383034", 3000));

		IContainer testMethod_25 = (IContainer) loadTest(
				this,
				"eVisit",
				"test.EVisit_VerificationChart_Test_A1E5E0AF00529960C85EB03433326630",
				"A1E5E0BAC5790610C85EB03433326630");
		testMethod_25.setRtbEnabled(false);
		this.add(testMethod_25);

		IContainer testMethod_26 = (IContainer) loadTest(this,
				"SelectUserMenu", "test.Test_A1E5E2415E1A6D50CF81E36566393637",
				"A1E5E2478BE05B40CF81E36566393637");
		testMethod_26.setRtbEnabled(false);
		this.add(testMethod_26);

		IContainer testMethod_27 = (IContainer) loadTest(
				this,
				"Remove_PIN",
				"test.Remove_PIN_Select_From_User_Menu_Test_A1E5E23A00DAAECECF81E36566393637",
				"A1E5E2479C164A10CF81E36566393637");
		testMethod_27.setRtbEnabled(false);
		this.add(testMethod_27);

		IContainer testMethod_28 = (IContainer) loadTest(
				this,
				"Remove_PIN",
				"test.Remove_PIN_Click_Remove_PIN_Button_Test_A1E5E23A42FE9913CF81E36566393637",
				"A1E5E2479F4B0F40CF81E36566393637");
		testMethod_28.setRtbEnabled(false);
		this.add(testMethod_28);

		IContainer testMethod_29 = (IContainer) loadTest(
				this,
				"Log_Out",
				"test.LogOut_LogOut_iPad_From_Schedule_View_Test_A1E5E62FABFC7C64D160B26464353566",
				"A1E5E630E979A3F0D160B26464353566");
		testMethod_29.setRtbEnabled(false);
		this.add(testMethod_29);

		IContainer testMethod_30 = (IContainer) loadTest(
				this,
				"ClickChangeFromLogIn",
				"test.ClickChangeFromLogIn_Test_A1E5D98363D49F02C663B86234396139",
				"A1E5E4A3C9C0DC10FD0EE23130663439");
		testMethod_30.setRtbEnabled(false);
		this.add(testMethod_30);

		IContainer testMethod_31 = (IContainer) loadTest(
				this,
				"DeleteProvision",
				"test.DeletingPersonalProvision_Test_A1E5D98335D4F65BC663B86234396139",
				"A1E5E4A36D3AF250FD0EE23130663439");
		testMethod_31.setRtbEnabled(false);
		this.add(testMethod_31);

		super.execute();
	}

}