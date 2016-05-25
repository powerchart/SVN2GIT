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
public class CompoundTest_A1E6216EA3C1E010DADBE56366396439 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E6216EA3C1E010DADBE56366396439(IContainer parent,
			String name) {
		super(parent, "PCT-HZD-ProvisionandSecurity-PIN-iPad",
				"A1E6216EA3C1E010DADBE56366396439");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"PowerChartTouch",
				"test.Multiple_Single_PersonalProvision_A_Test_A1E6057604251E28D8A0E26239656262",
				"A1E62170D3E98890DADBE56366396439");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		this.add(new KDelay(this, "Delay (6 sec.)",
				"A1E621878F668120DADBE56366396439", 6000));
		this.add(new test.Verify_PINSetupReminderScreen_iPad_Test_A1E62174485CC0FBDADBE56366396439(
				this, "A1E62174F0909930DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PINSetupScreenDismiss_AfterTapping_Cancel_FromPINReminderScreen_Test_A1E6217738B80F0BDADBE56366396439(
				this, "A1E621788DD69020DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_UserMenu_FromScheduleViewScreen_iPad_Test_A1E6217704ACFF94DADBE56366396439(
				this, "A1E6217C420D0670DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (2 sec.)",
				"A1E62187A8D12840DADBE56366396439", 2000));
		this.add(new test.Verify_SecurtiyOption_inUserMenuScreen_iPad_Test_A1E6217CA9CFD4B1DADBE56366396439(
				this, "A1E6217CB6D2FA00DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Securityoption_FromUserMenuScreen_Test_A1E6217D5CC3E82DDADBE56366396439(
				this, "A1E6217D61F60300DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (3 sec.)",
				"A1E62187B20B85E0DADBE56366396439", 3000));
		this.add(new test.Verify_CreatePINText_inSecuritySettingScreen_Test_A1E6217DC75CB9ADDADBE56366396439(
				this, "A1E6217DCE86ACE0DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_CreatePIN_fromSecuritySettingScreen_iPad_Test_A1E6218522F7F0C9DADBE56366396439(
				this, "A1E621852E4AA670DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (3 sec.)",
				"A1E62187BB0EA6E0DADBE56366396439", 3000));
		this.add(new test.Verify_CreatePINPadDisplays_AfterTappingonCreatePIN_fromSecuritySettingScreen_Test_A1E62185D0B4900BDADBE56366396439(
				this, "A1E62185D86ABE60DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_LogOut_fromCreatePINScreen_Test_A1E62186282FE3DDDADBE56366396439(
				this, "A1E621866BB2C0F0DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Verify_LogOutText_AfterTappingon_LogoutfromCreatePINScreen_Test_A1E621866627623EDADBE56366396439(
				this, "A1E621866F534040DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Tap_Logout_fromLogoutSegment_Test_A1E621872467E9C2DADBE56366396439(
				this, "A1E621873D0220B0DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (4 sec.)",
				"A1E62187C50D65F0DADBE56366396439", 4000));
		this.add(new test.Test_A1E6218738E5E2ABDADBE56366396439(this,
				"A1E6218743EC25B0DADBE56366396439") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}