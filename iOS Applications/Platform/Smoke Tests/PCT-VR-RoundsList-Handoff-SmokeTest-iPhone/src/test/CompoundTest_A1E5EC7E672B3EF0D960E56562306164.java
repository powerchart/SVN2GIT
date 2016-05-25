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
public class CompoundTest_A1E5EC7E672B3EF0D960E56562306164 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5EC7E672B3EF0D960E56562306164(IContainer parent,
			String name) {
		super(parent, "PCT-VR-RoundsList-Handoff-SmokeTest-iPhone",
				"A1E5EC7E672B3EF0D960E56562306164");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(
				this,
				"SelectBadge",
				"test.Location_SelectPersonalBadge_Test_A1E5FC39344E73A9CF24E33162643339",
				"A1E5FC3939804070CF24E33162643339");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		IContainer testMethod_2 = (IContainer) loadTest(
				this,
				"Log_In",
				"test.LogIn_LogInPersonalBadge_Test_A1E5D4F6B2198B50E21AB43837353866",
				"A1E5FC34EF578F20D127B63634636438");
		testMethod_2.setRtbEnabled(false);
		this.add(testMethod_2);

		this.add(new KDelay(this, "Delay (5000 ms.)",
				"A1E5F76EBB66AE00D0B3E46664333534", 5000));

		IContainer testMethod_3 = (IContainer) loadTest(
				this,
				"Inpatient_Rounds_List",
				"test.Rounds_List_Click_Lists_Button_Test_A1E5EBB1328A969FE7C6B43964653561",
				"A1E5FC252089A7F0D127B63634636438");
		testMethod_3.setRtbEnabled(false);
		this.add(testMethod_3);

		IContainer testMethod_4 = (IContainer) loadTest(
				this,
				"Inpatient_List-View",
				"test.List_View_Sort_By_Status_Test_A1E5EBB11E741237E7C6B43964653561",
				"A1E5FC2537B4E660D127B63634636438");
		testMethod_4.setRtbEnabled(false);
		this.add(testMethod_4);

		IContainer testMethod_5 = (IContainer) loadTest(this,
				"Inpatient_List-View",
				"test.Test_A1E5FB45A0CBE3F2E46FE46466363365",
				"A1E5FC25449149F0D127B63634636438");
		testMethod_5.setRtbEnabled(false);
		this.add(testMethod_5);

		this.add(new KDelay(this, "Delay (5000 ms.)",
				"A1E5F1E386B49540DD65B36365376636", 5000));

		IContainer testMethod_6 = (IContainer) loadTest(
				this,
				"Rounds_List_Status_Verification_PatientDEF",
				"test.Rounds_List_Status_Verification_Test_A1E5FAA937442CE0FF33B93563383430",
				"A1E5FAA6B961FCF0FF33B93563383430");
		testMethod_6.setRtbEnabled(false);
		this.add(testMethod_6);

		this.add(new KDelay(this, "Delay (5000 ms.)",
				"A1E5FDB318D5DB70F3AFE26431626230", 5000));

		IContainer testMethod_7 = (IContainer) loadTest(
				this,
				"Rounds_List_Status_Verification_PatientDEF",
				"test.Rounds_List_Status_Verification_PatientDEF_Test_A1E5FAA0935746B0FF33B93563383430",
				"A1E5FC257401C250D127B63634636438");
		testMethod_7.setRtbEnabled(false);
		this.add(testMethod_7);

		IContainer testMethod_8 = (IContainer) loadTest(
				this,
				"Rounds_List_Status_Verification_PatientDEF",
				"test.Rounds_List_Click_Lists_Button_Test_A1E5FAA49474A0C0FF33B93563383430",
				"A1E5FC258EFB1FC0D127B63634636438");
		testMethod_8.setRtbEnabled(false);
		this.add(testMethod_8);

		IContainer testMethod_9 = (IContainer) loadTest(
				this,
				"Inpatient_List-View",
				"test.List_View_Sort_By_Location_Test_A1E5EBB11E65E167E7C6B43964653561",
				"A1E5FC37464B02B0CF24E33162643339");
		testMethod_9.setRtbEnabled(false);
		this.add(testMethod_9);

		IContainer testMethod_10 = (IContainer) loadTest(this,
				"Inpatient_List-View",
				"test.List_View_Save_Test_A1E5EBB11E60FED2E7C6B43964653561",
				"A1E5FC25A8AB3450D127B63634636438");
		testMethod_10.setRtbEnabled(false);
		this.add(testMethod_10);

		this.add(new KDelay(this, "Delay (5000 ms.)",
				"A1E5FC25ADEEDC50D127B63634636438", 5000));

		IContainer testMethod_11 = (IContainer) loadTest(
				this,
				"Rounds_List_Facility_Name_Verification_iPhone",
				"test.Rounds_List_Location_Verification_iPhone_Test_A1E5FDC60AAF7110F3AFE26431626230",
				"A1E5FDC76CD6E4D0F3AFE26431626230");
		testMethod_11.setRtbEnabled(false);
		this.add(testMethod_11);

		IContainer testMethod_12 = (IContainer) loadTest(
				this,
				"Inpatient_Rounds_List",
				"test.Rounds_List_Indicator_Select_Test_A1E5EBB132A019B3E7C6B43964653561",
				"A1E5EC7EA65C00F0D960E56562306164");
		testMethod_12.setRtbEnabled(false);
		this.add(testMethod_12);

		IContainer testMethod_13 = (IContainer) loadTest(
				this,
				"Discern_Alert",
				"test.Decision_Support_Override_Test_A1E5E0B45F308B52C85EB03433326630",
				"A1E5F1ED8F558D80DD65B36365376636");
		testMethod_13.setRtbEnabled(false);
		this.add(testMethod_13);

		IContainer testMethod_14 = (IContainer) loadTest(
				this,
				"Inpatient_Handoff",
				"test.Handoff_Patient_Summary_Enter_Text_Test_A1E5EBB10E15B3DFE7C6B43964653561",
				"A1E5EC7EAF4E5910D960E56562306164");
		testMethod_14.setRtbEnabled(false);
		this.add(testMethod_14);

		IContainer testMethod_15 = (IContainer) loadTest(
				this,
				"Inpatient_Handoff",
				"test.Handoff_Actions_Enter_Text_Test_A1E5EBB117BD7971E7C6B43964653561",
				"A1E5EC7EC11E48D0D960E56562306164");
		testMethod_15.setRtbEnabled(false);
		this.add(testMethod_15);

		IContainer testMethod_16 = (IContainer) loadTest(
				this,
				"Inpatient_Handoff",
				"test.Handoff_Situational_Awareness_Enter_Text_Test_A1E5EBB10E240BE1E7C6B43964653561",
				"A1E5EC7EC592E100D960E56562306164");
		testMethod_16.setRtbEnabled(false);
		this.add(testMethod_16);

		IContainer testMethod_17 = (IContainer) loadTest(this, "Done_Keyboard",
				"test.Done_Keyboard_Test_A1E5EC75C52B5C98D960E56562306164",
				"A1E5EC7ED835FF40D960E56562306164");
		testMethod_17.setRtbEnabled(false);
		this.add(testMethod_17);

		IContainer testMethod_18 = (IContainer) loadTest(
				this,
				"Inpatient_Handoff",
				"test.Handoff_Click_Save_Test_A1E5EBB10E0E87C2E7C6B43964653561",
				"A1E5EC7EDD4A32D0D960E56562306164");
		testMethod_18.setRtbEnabled(false);
		this.add(testMethod_18);

		IContainer testMethod_19 = (IContainer) loadTest(
				this,
				"Inpatient_Rounds_List",
				"test.Rounds_List_Click_Plus_Test_A1E5EBB13291C282E7C6B43964653561",
				"A1E5EC7EE506CA10D960E56562306164");
		testMethod_19.setRtbEnabled(false);
		this.add(testMethod_19);

		IContainer testMethod_20 = (IContainer) loadTest(
				this,
				"Inpatient_My_Lists",
				"test.My_Lists_Select_List_Test_A1E5EBB12F2F5DD8E7C6B43964653561",
				"A1E5EC7EF73AF9E0D960E56562306164");
		testMethod_20.setRtbEnabled(false);
		this.add(testMethod_20);

		this.add(new KDelay(this, "Delay (5000 ms.)",
				"A1E5F1ED35660610DD65B36365376636", 5000));

		IContainer testMethod_21 = (IContainer) loadTest(
				this,
				"Inpatient_My_Lists",
				"test.MyLists_Custom_List_Verification_Test_A1E5EBB12F38D373E7C6B43964653561",
				"A1E5EC7EFB0150B0D960E56562306164");
		testMethod_21.setRtbEnabled(false);
		this.add(testMethod_21);

		IContainer testMethod_22 = (IContainer) loadTest(
				this,
				"Tapping_Individual_Circle",
				"test.Tapping_Individual_Circle_Test_A1E5EB9A92578E75FC6EE66433326363",
				"A1E5EC7F02BB4FE0D960E56562306164");
		testMethod_22.setRtbEnabled(false);
		this.add(testMethod_22);

		IContainer testMethod_23 = (IContainer) loadTest(
				this,
				"Inpatient_Rounds_List",
				"test.Rounds_List_Select_Patient_Test_A1E5EBB132A4D5C4E7C6B43964653561",
				"A1E5EC7F09F41120D960E56562306164");
		testMethod_23.setRtbEnabled(false);
		this.add(testMethod_23);

		IContainer testMethod_24 = (IContainer) loadTest(
				this,
				"Discern_Alert",
				"test.Decision_Support_Override_Test_A1E5E0B45F308B52C85EB03433326630",
				"A1E5F1ED96970150DD65B36365376636");
		testMethod_24.setRtbEnabled(false);
		this.add(testMethod_24);

		IContainer testMethod_25 = (IContainer) loadTest(
				this,
				"Inpatient_Handoff",
				"test.Handoff_Quick_View_Swipe_Test_A1E5EBB10E1CDFC8E7C6B43964653561",
				"A1E5EC7F12E46D70D960E56562306164");
		testMethod_25.setRtbEnabled(false);
		this.add(testMethod_25);

		IContainer testMethod_26 = (IContainer) loadTest(
				this,
				"Tapping_Delete_Assignment_iPhone",
				"test.Tapping_Delete_Assignment_iPhone_Test_A1E5ECB1002D8DB1DD3DB23633626338",
				"A1E5ECB1A9DB8290DD3DB23633626338");
		testMethod_26.setRtbEnabled(false);
		this.add(testMethod_26);

		IContainer testMethod_27 = (IContainer) loadTest(
				this,
				"Tapping_Done_Handoff",
				"test.Tapping_Done_Handoff_Test_A1E5EB99C5294DACFC6EE66433326363",
				"A1E5EC7F2EDDAEB0D960E56562306164");
		testMethod_27.setRtbEnabled(false);
		this.add(testMethod_27);

		IContainer testMethod_28 = (IContainer) loadTest(
				this,
				"ClickOnButton_iPhone",
				"test.ClickOnButton_iPhone_Test_A1E5E2969A777684DB4CB23663313336",
				"A1E5EC822023D130D960E56562306164");
		testMethod_28.setRtbEnabled(false);
		this.add(testMethod_28);

		IContainer testMethod_29 = (IContainer) loadTest(
				this,
				"Navigate_To_RoundsList_iPhone",
				"test.Navigate_To_RoundsList_iPhone_Test_A1E5EC7F7826AB51D960E56562306164",
				"A1E5EC7FC286BD00D960E56562306164");
		testMethod_29.setRtbEnabled(false);
		this.add(testMethod_29);

		this.add(new KDelay(this, "Delay (10000 ms.)",
				"A1E5F1EF4FF433B0DD65B36365376636", 10000));

		IContainer testMethod_30 = (IContainer) loadTest(
				this,
				"Verify_PatientB_notDisplay",
				"test.Verify_PatientB_notDisplay_Test_A1E5F0FE3D99D7C0DCEAB93034336262",
				"A1E5F1047F296290DCEAB93034336262");
		testMethod_30.setRtbEnabled(false);
		this.add(testMethod_30);

		IContainer testMethod_31 = (IContainer) loadTest(
				this,
				"Click_On_Patient_iPhone",
				"test.Click_On_Patient_iPhone_Test_A1E5EC812D02C285D960E56562306164",
				"A1E5EC8502108230D960E56562306164");
		testMethod_31.setRtbEnabled(false);
		this.add(testMethod_31);

		IContainer testMethod_32 = (IContainer) loadTest(
				this,
				"Inpatient_Handoff",
				"test.Handoff_Quick_View_Swipe_Test_A1E5EBB10E1CDFC8E7C6B43964653561",
				"A1E5EC7FD7B39360D960E56562306164");
		testMethod_32.setRtbEnabled(false);
		this.add(testMethod_32);

		IContainer testMethod_33 = (IContainer) loadTest(
				this,
				"Tapping_AssignToMe",
				"test.Tapping_AssignToMe_Test_A1E5EBA51B37C880FC6EE66433326363",
				"A1E5EC7FEA4A5590D960E56562306164");
		testMethod_33.setRtbEnabled(false);
		this.add(testMethod_33);

		IContainer testMethod_34 = (IContainer) loadTest(
				this,
				"Tapping_Done_Handoff",
				"test.Tapping_Done_Handoff_Test_A1E5EB99C5294DACFC6EE66433326363",
				"A1E5EC7FF0D15300D960E56562306164");
		testMethod_34.setRtbEnabled(false);
		this.add(testMethod_34);

		IContainer testMethod_35 = (IContainer) loadTest(
				this,
				"ClickOnButton_iPhone",
				"test.ClickOnButton_iPhone_Test_A1E5E2969A777684DB4CB23663313336",
				"A1E5EC8555F95FC0D960E56562306164");
		testMethod_35.setRtbEnabled(false);
		this.add(testMethod_35);

		IContainer testMethod_36 = (IContainer) loadTest(
				this,
				"Navigate_To_RoundsList_iPhone",
				"test.Navigate_To_RoundsList_iPhone_Test_A1E5EC7F7826AB51D960E56562306164",
				"A1E5EC7FF8AF7C00D960E56562306164");
		testMethod_36.setRtbEnabled(false);
		this.add(testMethod_36);

		this.add(new KDelay(this, "Delay (10000 ms.)",
				"A1E5F1EF5901B4F0DD65B36365376636", 10000));

		IContainer testMethod_37 = (IContainer) loadTest(
				this,
				"Inpatient_Rounds_List",
				"test.Rounds_List_Click_Lists_Button_Test_A1E5EBB1328A969FE7C6B43964653561",
				"A1E5EC8026C2AE50D960E56562306164");
		testMethod_37.setRtbEnabled(false);
		this.add(testMethod_37);

		IContainer testMethod_38 = (IContainer) loadTest(
				this,
				"Inpatient_List-View",
				"test.List_View_Sort_By_Name_Test_A1E5EBB11E6F56BEE7C6B43964653561",
				"A1E5EC802F1CE520D960E56562306164");
		testMethod_38.setRtbEnabled(false);
		this.add(testMethod_38);

		IContainer testMethod_39 = (IContainer) loadTest(this,
				"Inpatient_List-View",
				"test.List_View_Save_Test_A1E5EBB11E60FED2E7C6B43964653561",
				"A1E5EC8033FD3770D960E56562306164");
		testMethod_39.setRtbEnabled(false);
		this.add(testMethod_39);

		IContainer testMethod_40 = (IContainer) loadTest(
				this,
				"Inpatient_Rounds_List",
				"test.Rounds_List_Alpha_Verification_Test_A1E5EBB13285DBBAE7C6B43964653561",
				"A1E5EC803D007F80D960E56562306164");
		testMethod_40.setRtbEnabled(false);
		this.add(testMethod_40);

		IContainer testMethod_41 = (IContainer) loadTest(
				this,
				"Inpatient_Rounds_List",
				"test.Rounds_List_Click_Lists_Button_Test_A1E5EBB1328A969FE7C6B43964653561",
				"A1E5EC8066977880D960E56562306164");
		testMethod_41.setRtbEnabled(false);
		this.add(testMethod_41);

		IContainer testMethod_42 = (IContainer) loadTest(
				this,
				"Tapping_Remove_Dischaged",
				"test.Tapping_Remove_Dischaged_Test_A1E5ED263C1334E0C48FB53734386563",
				"A1E5ED42BEE21460C48FB53734386563");
		testMethod_42.setRtbEnabled(false);
		this.add(testMethod_42);

		IContainer testMethod_43 = (IContainer) loadTest(
				this,
				"Click_Ok_On_Discharged_Popover",
				"test.Click_Ok_On_Discharged_Popover_Test_A1E5ED420FE5A307C48FB53734386563",
				"A1E5ED42DE767DC0C48FB53734386563");
		testMethod_43.setRtbEnabled(false);
		this.add(testMethod_43);

		this.add(new KDelay(this, "Delay (5000 ms.)",
				"A1E5F770297B1C40D0B3E46664333534", 5000));

		IContainer testMethod_44 = (IContainer) loadTest(
				this,
				"Click_Ok_On_Discharged_Popover",
				"test.Verify_RemoveDischage_Is_Dithered_Test_A1E5ED425CDE122CC48FB53734386563",
				"A1E5ED42E1549770C48FB53734386563");
		testMethod_44.setRtbEnabled(false);
		this.add(testMethod_44);

		IContainer testMethod_45 = (IContainer) loadTest(
				this,
				"ClickOnSettings_iPhone",
				"test.ClickOnSetting_iPhone_Test_A1E5E29537897DA9DB4CB23663313336",
				"A1E5F770884B6B30D0B3E46664333534");
		testMethod_45.setRtbEnabled(false);
		this.add(testMethod_45);

		IContainer testMethod_46 = (IContainer) loadTest(
				this,
				"Log_Out",
				"test.LogOut_LogOut_iPhone_Test_A1E605A6984C35EBD8A0E26239656262",
				"A1E5F770AD16F970D0B3E46664333534");
		testMethod_46.setRtbEnabled(false);
		this.add(testMethod_46);

		super.execute();
	}

}