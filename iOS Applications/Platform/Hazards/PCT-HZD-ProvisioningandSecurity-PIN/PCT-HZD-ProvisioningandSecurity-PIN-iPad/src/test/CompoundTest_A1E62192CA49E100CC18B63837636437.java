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
public class CompoundTest_A1E62192CA49E100CC18B63837636437 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E62192CA49E100CC18B63837636437(IContainer parent,
			String name) {
		super(parent, "PCT-HZD-ProvisionandSecurity-PIN-iPad",
				"A1E62192CA49E100CC18B63837636437");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"PowerChartTouch",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E62192D30BDA50CC18B63837636437");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E621969707CA60CC18B63837636437", 5000));
		this.add(new test.Verify_PINSetupReminderScreen_iPad_Test_A1E62174485CC0FBDADBE56366396439(
				this, "A1E6219319C97100CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PINSetupScreenDismiss_AfterTapping_Cancel_FromPINReminderScreen_Test_A1E6217738B80F0BDADBE56366396439(
				this, "A1E6219399593BD0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_UserMenu_FromScheduleViewScreen_iPad_Test_A1E6217704ACFF94DADBE56366396439(
				this, "A1E62193D7C3C7A0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (3 sec.)",
				"A1E62196B7663A80CC18B63837636437", 3000));
		this.add(new test.Verify_SecurtiyOption_inUserMenuScreen_iPad_Test_A1E6217CA9CFD4B1DADBE56366396439(
				this, "A1E621943B0A0E50CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Securityoption_FromUserMenuScreen_Test_A1E6217D5CC3E82DDADBE56366396439(
				this, "A1E62194424D2FD0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (4 sec.)",
				"A1E62196BEC7E080CC18B63837636437", 4000));
		this.add(new test.Verify_CreatePINText_inSecuritySettingScreen_Test_A1E6217DC75CB9ADDADBE56366396439(
				this, "A1E6219451CAF230CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_CreatePIN_fromSecuritySettingScreen_iPad_Test_A1E6218522F7F0C9DADBE56366396439(
				this, "A1E6219484C5A2C0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (4 sec.)",
				"A1E62196C70C6C70CC18B63837636437", 4000));
		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E6219488EF4F40CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_LogOut_fromCreatePINScreen_Test_A1E62186282FE3DDDADBE56366396439(
				this, "A1E62194E3305210CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (2 sec.)",
				"A1E62196D11564B0CC18B63837636437", 2000));
		this.add(new test.Verify_LogOutText_AfterTappingon_LogoutfromCreatePINScreen_Test_A1E621866627623EDADBE56366396439(
				this, "A1E62194E6EF2ED0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Logout_fromLogoutSegment_Test_A1E621872467E9C2DADBE56366396439(
				this, "A1E621950E0A7970CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E62196F80A1480CC18B63837636437", 5000));
		this.add(new test.Test_A1E6218738E5E2ABDADBE56366396439(this,
				"A1E6219512487140CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"PowerChartTouch",
				"test.Multiple_Single_PersonalProvision_B_Test_A1E60BB95A196D90DF73E33863636361",
				"A1E6219543CD98D0CC18B63837636437");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E6219708979930CC18B63837636437", 5000));

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"PowerChartTouch",
				"test.Dismiss_Pin_Screen_Reminder_PopUp_iPad_Test_A1E5F12A1230B44CC4FAE63733663237",
				"A1E6219714688030CC18B63837636437");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		this.add(new KDelay(this, "Delay (3 sec.)",
				"A1E621971AC623B0CC18B63837636437", 3000));
		this.add(new test.Tap_UserMenu_FromScheduleViewScreen_iPad_Test_A1E6217704ACFF94DADBE56366396439(
				this, "A1E62195A445F272CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (2 sec.)",
				"A1E6219730F88330CC18B63837636437", 2000));
		this.add(new test.Verify_SecurtiyOption_inUserMenuScreen_iPad_Test_A1E6217CA9CFD4B1DADBE56366396439(
				this, "A1E62195AC8E27E2CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Securityoption_FromUserMenuScreen_Test_A1E6217D5CC3E82DDADBE56366396439(
				this, "A1E62195B29769D2CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (3 sec.)",
				"A1E62197382ED370CC18B63837636437", 3000));
		this.add(new test.Verify_CreatePINText_inSecuritySettingScreen_Test_A1E6217DC75CB9ADDADBE56366396439(
				this, "A1E62195B81BEB60CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_CreatePIN_fromSecuritySettingScreen_iPad_Test_A1E6218522F7F0C9DADBE56366396439(
				this, "A1E621AF10FCDFA2CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E621AF21B4F6C2CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Enter_TwoDigitPIN_fromCreatePINScreen_Test_A1E621985E43196DCC18B63837636437(
				this, "A1E6219889531D50CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_PINScreen_AfterEnteringTwoDigit_Test_A1E62198F86DF5E0CC18B63837636437(
				this, "A1E62198FFE59380CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Delete_fromCreatePINScreen_Test_A1E6219974ABD629CC18B63837636437(
				this, "A1E621997B936930CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_PINScreen_AfterTappingDeleteTwice_fromCreatePINScreen_Test_A1E62199FB150415CC18B63837636437(
				this, "A1E6219A01DA6930CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Cancel_fromCreatePINScreen_Test_A1E6219B282B1C7ACC18B63837636437(
				this, "A1E6219B357AB320CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (4 sec.)",
				"A1E621B026E6CF00CC18B63837636437", 4000));
		this.add(new test.Verify_UserNavigateToPreviousScreen_AfterTappingCancel_fromCreatePINScreen_Test_A1E6219B86299C83CC18B63837636437(
				this, "A1E6219B8DF267A0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_CreatePIN_fromSecuritySettingScreen_iPad_Test_A1E6218522F7F0C9DADBE56366396439(
				this, "A1E6219C0F38E322CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (3 sec.)",
				"A1E6219C48634960CC18B63837636437", 3000));
		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E6219C19462122CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437(
				this, "A1E6219C93C00AB0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_ObviousPINWindow_AfterEntering_1111PIN_intoCreatePINPadScreen_Test_A1E6219D3EFDC8C3CC18B63837636437(
				this, "A1E6219D44F86390CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Continue_fromObviousPIN_PopUpScreen_Test_A1E6219E2475112ECC18B63837636437(
				this, "A1E6219E2ABBA9F0CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E6219E4FF403C2CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437(
				this, "A1E621ADCD73DC82CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_ObviousPINWindow_AfterEntering_1234PIN_intoCreatePINPadScreen_Test_A1E621A4A8F74843CC18B63837636437(
				this, "A1E621A4EF81E780CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Continue_fromObviousPIN_PopUpScreen_Test_A1E6219E2475112ECC18B63837636437(
				this, "A1E621A4FB264042CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E621A50C5F9552CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437(
				this, "A1E621ADD21B6B92CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_ObviousPINWindow_AfterEntering_2580PIN_intoCreatePINPadScreen_Test_A1E621A58F218E99CC18B63837636437(
				this, "A1E621A59517BC60CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Continue_fromObviousPIN_PopUpScreen_Test_A1E6219E2475112ECC18B63837636437(
				this, "A1E621A5EA20AFF2CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E621A5ED9ABB82CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437(
				this, "A1E621ADD7EF1E92CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_ObviousPINWindow_AfterEntering_5683PIN_intoCreatePINPadScreen_Test_A1E621A64F889FBECC18B63837636437(
				this, "A1E621A65482BA00CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Continue_fromObviousPIN_PopUpScreen_Test_A1E6219E2475112ECC18B63837636437(
				this, "A1E621A698AB7502CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E621A6A6809072CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437(
				this, "A1E621ADDC1EE592CC18B63837636437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}