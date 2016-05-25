/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Test Workbench
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class VitalsProfileView_VerifyHeight_Test_A1E60C3CCE3E01D2EE7FB16665633431 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[5];
	
    
    
	
	public VitalsProfileView_VerifyHeight_Test_A1E60C3CCE3E01D2EE7FB16665633431(IContainer container, String invocationId) {
		super(container, "VitalsProfileView_VerifyHeight", invocationId, "A1E60C3CCE3E01D2EE7FB16665633431");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of datapool reached"), 1, "End of datapool reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: VitalsProfileView_VerifyHeight_Test_A1E60C3CCE3E01D2EE7FB16665633431 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E5DFB2A836940CC6A9B33064353938");	
			vars[0] = new DataVar("Var_ProfileView_TodayHeight", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[1] = new DataVar("Var_ProfileView_PreviousHeight", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[2] = new DataVar("Var_ProfileView_PrevPreviousHeight", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[3] = new DataVar("Var_ProfileView_PreviousHeight_Units", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[4] = new DataVar("Var_ProfileView_PrevPreviousHeight_Units", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory",
												  "A1E5EA788D7972F0CC60B03461646165",
												  "{\"variables\":[{\"id\":\"87\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_TodayHeight\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F0E0BD8E2C60E38BB86436663538\"},{\"id\":\"88\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_TodayHeight\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F0E0BA519F24E38BB86436663538\\/TPM:A1E5F0E0BA519F28E38BB86436663538\"},{\"id\":\"89\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PreviousHeight\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F0E0E4E2AF70E38BB86436663538\"},{\"id\":\"90\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PreviousHeight\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F0E0E1DFF700E38BB86436663538\\/TPM:A1E5F0E0E1DFF704E38BB86436663538\"},{\"id\":\"91\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PreviousHeight_Units\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F0E11DF12940E38BB86436663538\"},{\"id\":\"92\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PreviousHeight\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F0E11B830F9BE38BB86436663538\\/TPM:A1E5F0E12102AF00E38BB86436663538\\/WID:A1E5F0E12102AF04E38BB86436663538\\/IDB:A1E5F0E122CB8820E38BB86436663538\"},{\"id\":\"93\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PreviousHeight_Units\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F0E11B830FB0E38BB86436663538\\/TPM:A1E5F0E11B830FB4E38BB86436663538\"},{\"id\":\"94\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PrevPreviousHeight\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F0E13FB39630E38BB86436663538\"},{\"id\":\"95\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PrevPreviousHeight\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F0E13D78C1AEE38BB86436663538\\/TPM:A1E5F0E13D78E870E38BB86436663538\"},{\"id\":\"96\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PrevPreviousHeight_Units\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F0E16A334180E38BB86436663538\"},{\"id\":\"97\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PrevPreviousHeight\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F0E16702740CE38BB86436663538\\/TPM:A1E5F0E167027415E38BB86436663538\\/WID:A1E5F0E167027410E38BB86436663538\\/IDB:A1E5F0E167027405E38BB86436663538\"},{\"id\":\"98\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"ProfileView_PrevPreviousHeight_Units\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F0E1673BACC2E38BB86436663538\\/TPM:A1E5F0E1673BACC6E38BB86436663538\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F0E0ABEA7CC7E38BB86436663538\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>Height<\\/b> on <b>Label<\\/b> <b>'Height'<\\/b> below Label <b>'Blood Pressure'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Blood Pressure\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F0E0BA519F24E38BB86436663538\\/TPM:A1E5F0E0BA519F28E38BB86436663538\\\">ProfileView_TodayHeight<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F0E0BD8E2C60E38BB86436663538\\\">ProfileView_TodayHeight<\\/subst>'<\\/b> to the right of Label <b>'Height'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"14\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F0E0BA519F1DE38BB86436663538\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F0E0BD8E2C60E38BB86436663538\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_TodayHeight\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F0E0BA519F24E38BB86436663538\\/TPM:A1E5F0E0BA519F28E38BB86436663538\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_TodayHeight\"}],\"isWeb\":false,\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"13\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F0E0E1DFF700E38BB86436663538\\/TPM:A1E5F0E0E1DFF704E38BB86436663538\\\">ProfileView_PreviousHeight<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F0E0E4E2AF70E38BB86436663538\\\">ProfileView_PreviousHeight<\\/subst>'<\\/b> to the right of Label <b>'Height'<\\/b> and below Label <b>'Previous'<\\/b> to the right of Label <b>'Today'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"25\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F0E0E1DFF6FAE38BB86436663538\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F0E0E4E2AF70E38BB86436663538\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PreviousHeight\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F0E0E1DFF700E38BB86436663538\\/TPM:A1E5F0E0E1DFF704E38BB86436663538\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PreviousHeight\"}],\"isWeb\":false,\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"24\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Previous\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Today\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"},\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F0E11B830FB0E38BB86436663538\\/TPM:A1E5F0E11B830FB4E38BB86436663538\\\">ProfileView_PreviousHeight_Units<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F0E11DF12940E38BB86436663538\\\">ProfileView_PreviousHeight_Units<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F0E11B830F9BE38BB86436663538\\/TPM:A1E5F0E12102AF00E38BB86436663538\\/WID:A1E5F0E12102AF04E38BB86436663538\\/IDB:A1E5F0E122CB8820E38BB86436663538\\\">ProfileView_PreviousHeight<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"47\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"54\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F0E11B830FAAE38BB86436663538\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F0E11DF12940E38BB86436663538\",\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PreviousHeight_Units\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F0E11B830F9BE38BB86436663538\\/TPM:A1E5F0E12102AF00E38BB86436663538\\/WID:A1E5F0E12102AF04E38BB86436663538\\/IDB:A1E5F0E122CB8820E38BB86436663538\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PreviousHeight\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F0E11B830FB0E38BB86436663538\\/TPM:A1E5F0E11B830FB4E38BB86436663538\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PreviousHeight_Units\"}],\"isWeb\":false,\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"45\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"46\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"53\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F0E13D78C1AEE38BB86436663538\\/TPM:A1E5F0E13D78E870E38BB86436663538\\\">ProfileView_PrevPreviousHeight<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F0E13FB39630E38BB86436663538\\\">ProfileView_PrevPreviousHeight<\\/subst>'<\\/b> to the right of Label <b>'Height'<\\/b> and below Label <b>'Previous'<\\/b> below Label <b>'US'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"57\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"75\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F0E13D78C1A8E38BB86436663538\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F0E13FB39630E38BB86436663538\",\"id\":\"56\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PrevPreviousHeight\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F0E13D78C1AEE38BB86436663538\\/TPM:A1E5F0E13D78E870E38BB86436663538\",\"id\":\"57\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PrevPreviousHeight\"}],\"isWeb\":false,\"id\":\"55\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"56\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"59\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"66\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"69\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Previous\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"68\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"67\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"71\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"74\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"US\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"73\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"72\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"70\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},\"id\":\"65\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"},\"id\":\"58\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"61\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"64\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"63\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"62\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"60\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F0E1673BACC2E38BB86436663538\\/TPM:A1E5F0E1673BACC6E38BB86436663538\\\">ProfileView_PrevPreviousHeight_Units<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F0E16A334180E38BB86436663538\\\">ProfileView_PrevPreviousHeight_Units<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F0E16702740CE38BB86436663538\\/TPM:A1E5F0E167027415E38BB86436663538\\/WID:A1E5F0E167027410E38BB86436663538\\/IDB:A1E5F0E167027405E38BB86436663538\\\">ProfileView_PrevPreviousHeight<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"79\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"86\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F0E1673BACBBE38BB86436663538\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F0E16A334180E38BB86436663538\",\"id\":\"77\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PrevPreviousHeight_Units\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F0E16702740CE38BB86436663538\\/TPM:A1E5F0E167027415E38BB86436663538\\/WID:A1E5F0E167027410E38BB86436663538\\/IDB:A1E5F0E167027405E38BB86436663538\",\"id\":\"78\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PrevPreviousHeight\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F0E1673BACC2E38BB86436663538\\/TPM:A1E5F0E1673BACC6E38BB86436663538\",\"id\":\"79\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ProfileView_PrevPreviousHeight_Units\"}],\"isWeb\":false,\"id\":\"76\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"77\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"81\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"80\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"83\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"78\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"85\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"84\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"82\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/IDB:A1E5F0E0BD8E2C60E38BB86436663538", 0, 23, false, (IDCCoreVar)vars[0], false, "ProfileView_TodayHeight", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TEX:A1E5F0E0BA519F24E38BB86436663538/TPM:A1E5F0E0BA519F28E38BB86436663538", 0, 23, false, (IDCCoreVar)vars[0], false, "ProfileView_TodayHeight_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/IDB:A1E5F0E0E4E2AF70E38BB86436663538", 0, 26, false, (IDCCoreVar)vars[1], false, "ProfileView_PreviousHeight", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TEX:A1E5F0E0E1DFF700E38BB86436663538/TPM:A1E5F0E0E1DFF704E38BB86436663538", 0, 26, false, (IDCCoreVar)vars[1], false, "ProfileView_PreviousHeight", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/IDB:A1E5F0E11DF12940E38BB86436663538", 0, 32, false, (IDCCoreVar)vars[3], false, "ProfileView_PreviousHeight_Units", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TLC:A1E5F0E11B830F9BE38BB86436663538/TPM:A1E5F0E12102AF00E38BB86436663538/WID:A1E5F0E12102AF04E38BB86436663538/IDB:A1E5F0E122CB8820E38BB86436663538", 0, 26, false, (IDCCoreVar)vars[1], false, "ProfileView_PreviousHeight", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TEX:A1E5F0E11B830FB0E38BB86436663538/TPM:A1E5F0E11B830FB4E38BB86436663538", 0, 32, false, (IDCCoreVar)vars[3], false, "ProfileView_PreviousHeight_Units_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/IDB:A1E5F0E13FB39630E38BB86436663538", 0, 30, false, (IDCCoreVar)vars[2], false, "ProfileView_PrevPreviousHeight", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	
	ISubRule sub_8 = new SubRule("MOEB_FIELD/TEX:A1E5F0E13D78C1AEE38BB86436663538/TPM:A1E5F0E13D78E870E38BB86436663538", 0, 30, false, (IDCCoreVar)vars[2], false, "ProfileView_PrevPreviousHeight", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/IDB:A1E5F0E16A334180E38BB86436663538", 0, 36, false, (IDCCoreVar)vars[4], false, "ProfileView_PrevPreviousHeight_Units", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
	
	ISubRule sub_10 = new SubRule("MOEB_FIELD/TLC:A1E5F0E16702740CE38BB86436663538/TPM:A1E5F0E167027415E38BB86436663538/WID:A1E5F0E167027410E38BB86436663538/IDB:A1E5F0E167027405E38BB86436663538", 0, 30, false, (IDCCoreVar)vars[2], false, "ProfileView_PrevPreviousHeight", null, 0, false);
	subContainer_1.addSubInstruction(sub_10);
	
	ISubRule sub_11 = new SubRule("MOEB_FIELD/TEX:A1E5F0E1673BACC2E38BB86436663538/TPM:A1E5F0E1673BACC6E38BB86436663538", 0, 36, false, (IDCCoreVar)vars[4], false, "ProfileView_PrevPreviousHeight_Units", null, 0, false);
	subContainer_1.addSubInstruction(sub_11);
	


		return stepBatch;
	}

}
