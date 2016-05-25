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
public class RoleSelection_displays_Yes_No_CompoundTest_A1E600E719902020E49BB63436366230
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public RoleSelection_displays_Yes_No_CompoundTest_A1E600E719902020E49BB63436366230(
			IContainer parent, String name) {
		super(parent, "RoleSelection_displays_Yes_No",
				"A1E600E719902020E49BB63436366230");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"SelectBadge",
				"test.Location_SelectPersonalBadge_Test_A1E5FC39344E73A9CF24E33162643339",
				"A1E600E7CDFD8C50E49BB63436366230");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Log_In",
				"test.LogIn_LogInPersonalBadge_Test_A1E5D4F6B2198B50E21AB43837353866",
				"A1E600E7215B8470E49BB63436366230");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		this.add(new test.If_RoleSelection_Displays_NotDisplays_Test_A1E600E4F4B07F90E49BB63436366230(
				this, "A1E600E72D1C65E0E49BB63436366230") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Log_Out",
				"test.LogOut_LogOut_iPhone_Test_A1E5D4F6B5BFFE10E21AB43837353866",
				"A1E600E73A2F69D0E49BB63436366230");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		super.execute();
	}

}