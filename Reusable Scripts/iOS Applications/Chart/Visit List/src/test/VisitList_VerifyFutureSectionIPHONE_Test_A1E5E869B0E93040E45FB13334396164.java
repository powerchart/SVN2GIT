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
public class VisitList_VerifyFutureSectionIPHONE_Test_A1E5E869B0E93040E45FB13334396164 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[6];
	
    
    
	
	public VisitList_VerifyFutureSectionIPHONE_Test_A1E5E869B0E93040E45FB13334396164(IContainer container, String invocationId) {
		super(container, "VisitList_VerifyFutureSectionIPHONE", invocationId, "A1E5E869B0E93040E45FB13334396164");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		
	
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
		     log("Test Execution: VisitList_VerifyFutureSectionIPHONE_Test_A1E5E869B0E93040E45FB13334396164 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5D00E522AE2D3F902E56335343263");	
			vars[0] = new DataVar("Var_FutureDTM", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[1] = new DataVar("Var_FutureReasonForVisit", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[2] = new DataVar("Var_FutureEncounterType", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[3] = new DataVar("Var_FutureLocation", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[4] = new DataVar("Var_FutureAttendingPhy", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[5] = new DataVar("Var_FutureRoom/Bed", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5D00E5242B090F902E56335343263",
												  "{\"variables\":[{\"id\":\"78\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureDTM\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D50A539331C5F7B03036336664\\/TPM:A1E5D4D50A53933AC5F7B03036336664\\/WID:A1E5D4D50A539335C5F7B03036336664\\/IDB:A1E5D4D50A53932AC5F7B03036336664\"},{\"id\":\"79\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureDTM\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D6DAC19E00C5F7B03036336664\"},{\"id\":\"80\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureReasonForVisit\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D508256877C5F7B03036336664\\/TPM:A1E5D4D508256880C5F7B03036336664\\/WID:A1E5D4D50825687BC5F7B03036336664\\/IDB:A1E5D4D508256870C5F7B03036336664\"},{\"id\":\"81\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureDTM\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D5085181FCC5F7B03036336664\\/TPM:A1E5D4D508518200C5F7B03036336664\"},{\"id\":\"82\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureReasonForVisit\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D70C4984B0C5F7B03036336664\"},{\"id\":\"83\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D506294AA3C5F7B03036336664\\/TPM:A1E5D4D506297156C5F7B03036336664\\/WID:A1E5D4D506297151C5F7B03036336664\\/IDB:A1E5D4D506294A9CC5F7B03036336664\"},{\"id\":\"84\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureReasonForVisit\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D50658E5F9C5F7B03036336664\\/TPM:A1E5D4D50658E5FDC5F7B03036336664\"},{\"id\":\"85\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D76F917910C5F7B03036336664\"},{\"id\":\"86\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureLocation\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D503B711C7C5F7B03036336664\\/TPM:A1E5D4D503B711D0C5F7B03036336664\\/WID:A1E5D4D503B711CBC5F7B03036336664\\/IDB:A1E5D4D503B711C0C5F7B03036336664\"},{\"id\":\"87\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D503BA4632C5F7B03036336664\\/TPM:A1E5D4D503BA4636C5F7B03036336664\"},{\"id\":\"88\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureLocation\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D77C989620C5F7B03036336664\"},{\"id\":\"89\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D501F38FD1C5F7B03036336664\\/TPM:A1E5D4D501F38FDAC5F7B03036336664\\/WID:A1E5D4D501F38FD5C5F7B03036336664\\/IDB:A1E5D4D501F368C0C5F7B03036336664\"},{\"id\":\"90\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureLocation\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D501F627F9C5F7B03036336664\\/TPM:A1E5D4D501F627FDC5F7B03036336664\"},{\"id\":\"91\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureAttendingPhy\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D877F0EA90C5F7B03036336664\"},{\"id\":\"92\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D500200857C5F7B03036336664\\/TPM:A1E5D4D500200860C5F7B03036336664\\/WID:A1E5D4D50020085BC5F7B03036336664\\/IDB:A1E5D4D500200850C5F7B03036336664\"},{\"id\":\"93\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureAttendingPhy\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D50020086DC5F7B03036336664\\/TPM:A1E5D4D500200871C5F7B03036336664\"},{\"id\":\"94\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureRoom\\/Bed\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D882E63EA0C5F7B03036336664\"},{\"id\":\"95\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureLocation\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D4F67360E7C5F7B03036336664\\/TPM:A1E5D4D4F67360F0C5F7B03036336664\\/WID:A1E5D4D4F67360EBC5F7B03036336664\\/IDB:A1E5D4D4F67360E0C5F7B03036336664\"},{\"id\":\"96\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureRoom\\/Bed\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D4F67360FDC5F7B03036336664\\/TPM:A1E5D4D4F6736101C5F7B03036336664\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> equals <b>Future<\\/b> on <b>Label<\\/b> <b>'Future'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D50A539331C5F7B03036336664\\/TPM:A1E5D4D50A53933AC5F7B03036336664\\/WID:A1E5D4D50A539335C5F7B03036336664\\/IDB:A1E5D4D50A53932AC5F7B03036336664\\\">Var_FutureDTM<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Future\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D50A567945C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D50A539331C5F7B03036336664\\/TPM:A1E5D4D50A53933AC5F7B03036336664\\/WID:A1E5D4D50A539335C5F7B03036336664\\/IDB:A1E5D4D50A53932AC5F7B03036336664\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureDTM\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Future\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D5085181FCC5F7B03036336664\\/TPM:A1E5D4D508518200C5F7B03036336664\\\">Var_FutureDTM<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D6DAC19E00C5F7B03036336664\\\">Var_FutureDTM<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D508256877C5F7B03036336664\\/TPM:A1E5D4D508256880C5F7B03036336664\\/WID:A1E5D4D50825687BC5F7B03036336664\\/IDB:A1E5D4D508256870C5F7B03036336664\\\">Var_FutureReasonForVisit<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"15\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D5085181F5C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D6DAC19E00C5F7B03036336664\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureDTM\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D508256877C5F7B03036336664\\/TPM:A1E5D4D508256880C5F7B03036336664\\/WID:A1E5D4D50825687BC5F7B03036336664\\/IDB:A1E5D4D508256870C5F7B03036336664\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D5085181FCC5F7B03036336664\\/TPM:A1E5D4D508518200C5F7B03036336664\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureDTM\"}],\"isWeb\":false,\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"13\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"14\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D50658E5F9C5F7B03036336664\\/TPM:A1E5D4D50658E5FDC5F7B03036336664\\\">Var_FutureReasonForVisit<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D70C4984B0C5F7B03036336664\\\">Var_FutureReasonForVisit<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D506294AA3C5F7B03036336664\\/TPM:A1E5D4D506297156C5F7B03036336664\\/WID:A1E5D4D506297151C5F7B03036336664\\/IDB:A1E5D4D506294A9CC5F7B03036336664\\\">Var_FutureEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"26\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D50658E5F2C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D70C4984B0C5F7B03036336664\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D506294AA3C5F7B03036336664\\/TPM:A1E5D4D506297156C5F7B03036336664\\/WID:A1E5D4D506297151C5F7B03036336664\\/IDB:A1E5D4D506294A9CC5F7B03036336664\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D50658E5F9C5F7B03036336664\\/TPM:A1E5D4D50658E5FDC5F7B03036336664\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureReasonForVisit\"}],\"isWeb\":false,\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"24\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"25\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D503BA4632C5F7B03036336664\\/TPM:A1E5D4D503BA4636C5F7B03036336664\\\">Var_FutureEncounterType<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D76F917910C5F7B03036336664\\\">Var_FutureEncounterType<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D503B711C7C5F7B03036336664\\/TPM:A1E5D4D503B711D0C5F7B03036336664\\/WID:A1E5D4D503B711CBC5F7B03036336664\\/IDB:A1E5D4D503B711C0C5F7B03036336664\\\">Var_FutureLocation<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"37\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D503BA462BC5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D76F917910C5F7B03036336664\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D503B711C7C5F7B03036336664\\/TPM:A1E5D4D503B711D0C5F7B03036336664\\/WID:A1E5D4D503B711CBC5F7B03036336664\\/IDB:A1E5D4D503B711C0C5F7B03036336664\",\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureLocation\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D503BA4632C5F7B03036336664\\/TPM:A1E5D4D503BA4636C5F7B03036336664\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"}],\"isWeb\":false,\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"36\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D501F627F9C5F7B03036336664\\/TPM:A1E5D4D501F627FDC5F7B03036336664\\\">Var_FutureLocation<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D77C989620C5F7B03036336664\\\">Var_FutureLocation<\\/subst>'<\\/b> below Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D501F38FD1C5F7B03036336664\\/TPM:A1E5D4D501F38FDAC5F7B03036336664\\/WID:A1E5D4D501F38FD5C5F7B03036336664\\/IDB:A1E5D4D501F368C0C5F7B03036336664\\\">Var_FutureEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"48\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"55\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D501F627F2C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D77C989620C5F7B03036336664\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureLocation\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D501F38FD1C5F7B03036336664\\/TPM:A1E5D4D501F38FDAC5F7B03036336664\\/WID:A1E5D4D501F38FD5C5F7B03036336664\\/IDB:A1E5D4D501F368C0C5F7B03036336664\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D501F627F9C5F7B03036336664\\/TPM:A1E5D4D501F627FDC5F7B03036336664\",\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureLocation\"}],\"isWeb\":false,\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"46\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"47\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"54\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"53\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D50020086DC5F7B03036336664\\/TPM:A1E5D4D500200871C5F7B03036336664\\\">Var_FutureAttendingPhy<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D877F0EA90C5F7B03036336664\\\">Var_FutureAttendingPhy<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D500200857C5F7B03036336664\\/TPM:A1E5D4D500200860C5F7B03036336664\\/WID:A1E5D4D50020085BC5F7B03036336664\\/IDB:A1E5D4D500200850C5F7B03036336664\\\">Var_FutureEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"59\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"66\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D500200866C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D877F0EA90C5F7B03036336664\",\"id\":\"57\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureAttendingPhy\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D500200857C5F7B03036336664\\/TPM:A1E5D4D500200860C5F7B03036336664\\/WID:A1E5D4D50020085BC5F7B03036336664\\/IDB:A1E5D4D500200850C5F7B03036336664\",\"id\":\"58\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D50020086DC5F7B03036336664\\/TPM:A1E5D4D500200871C5F7B03036336664\",\"id\":\"59\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureAttendingPhy\"}],\"isWeb\":false,\"id\":\"56\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"57\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"61\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"60\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"63\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"58\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"65\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"64\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"62\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D4F67360FDC5F7B03036336664\\/TPM:A1E5D4D4F6736101C5F7B03036336664\\\">Var_FutureRoom\\/Bed<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D882E63EA0C5F7B03036336664\\\">Var_FutureRoom\\/Bed<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D4F67360E7C5F7B03036336664\\/TPM:A1E5D4D4F67360F0C5F7B03036336664\\/WID:A1E5D4D4F67360EBC5F7B03036336664\\/IDB:A1E5D4D4F67360E0C5F7B03036336664\\\">Var_FutureLocation<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"70\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"77\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D4F67360F6C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D882E63EA0C5F7B03036336664\",\"id\":\"68\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureRoom\\/Bed\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D4F67360E7C5F7B03036336664\\/TPM:A1E5D4D4F67360F0C5F7B03036336664\\/WID:A1E5D4D4F67360EBC5F7B03036336664\\/IDB:A1E5D4D4F67360E0C5F7B03036336664\",\"id\":\"69\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureLocation\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D4F67360FDC5F7B03036336664\\/TPM:A1E5D4D4F6736101C5F7B03036336664\",\"id\":\"70\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureRoom\\/Bed\"}],\"isWeb\":false,\"id\":\"67\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"68\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"72\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"71\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"74\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"69\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"76\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"75\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"73\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TLC:A1E5D4D50A539331C5F7B03036336664/TPM:A1E5D4D50A53933AC5F7B03036336664/WID:A1E5D4D50A539335C5F7B03036336664/IDB:A1E5D4D50A53932AC5F7B03036336664", 0, 13, false, (IDCCoreVar)vars[0], false, "Var_FutureDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/IDB:A1E5D4D6DAC19E00C5F7B03036336664", 0, 13, false, (IDCCoreVar)vars[0], false, "Var_FutureDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TLC:A1E5D4D508256877C5F7B03036336664/TPM:A1E5D4D508256880C5F7B03036336664/WID:A1E5D4D50825687BC5F7B03036336664/IDB:A1E5D4D508256870C5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[1], false, "Var_FutureReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TEX:A1E5D4D5085181FCC5F7B03036336664/TPM:A1E5D4D508518200C5F7B03036336664", 0, 13, false, (IDCCoreVar)vars[0], false, "Var_FutureDTM_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/IDB:A1E5D4D70C4984B0C5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[1], false, "Var_FutureReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TLC:A1E5D4D506294AA3C5F7B03036336664/TPM:A1E5D4D506297156C5F7B03036336664/WID:A1E5D4D506297151C5F7B03036336664/IDB:A1E5D4D506294A9CC5F7B03036336664", 0, 23, false, (IDCCoreVar)vars[2], false, "Var_FutureEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TEX:A1E5D4D50658E5F9C5F7B03036336664/TPM:A1E5D4D50658E5FDC5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[1], false, "Var_FutureReasonForVisit_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/IDB:A1E5D4D76F917910C5F7B03036336664", 0, 23, false, (IDCCoreVar)vars[2], false, "Var_FutureEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	
	ISubRule sub_8 = new SubRule("MOEB_FIELD/TLC:A1E5D4D503B711C7C5F7B03036336664/TPM:A1E5D4D503B711D0C5F7B03036336664/WID:A1E5D4D503B711CBC5F7B03036336664/IDB:A1E5D4D503B711C0C5F7B03036336664", 0, 18, false, (IDCCoreVar)vars[3], false, "Var_FutureLocation", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/TEX:A1E5D4D503BA4632C5F7B03036336664/TPM:A1E5D4D503BA4636C5F7B03036336664", 0, 23, false, (IDCCoreVar)vars[2], false, "Var_FutureEncounterType_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
	
	ISubRule sub_10 = new SubRule("MOEB_FIELD/IDB:A1E5D4D77C989620C5F7B03036336664", 0, 18, false, (IDCCoreVar)vars[3], false, "Var_FutureLocation", null, 0, false);
	subContainer_1.addSubInstruction(sub_10);
	
	ISubRule sub_11 = new SubRule("MOEB_FIELD/TLC:A1E5D4D501F38FD1C5F7B03036336664/TPM:A1E5D4D501F38FDAC5F7B03036336664/WID:A1E5D4D501F38FD5C5F7B03036336664/IDB:A1E5D4D501F368C0C5F7B03036336664", 0, 23, false, (IDCCoreVar)vars[2], false, "Var_FutureEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_11);
	
	ISubRule sub_12 = new SubRule("MOEB_FIELD/TEX:A1E5D4D501F627F9C5F7B03036336664/TPM:A1E5D4D501F627FDC5F7B03036336664", 0, 18, false, (IDCCoreVar)vars[3], false, "Var_FutureLocation_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_12);
	
	ISubRule sub_13 = new SubRule("MOEB_FIELD/IDB:A1E5D4D877F0EA90C5F7B03036336664", 0, 22, false, (IDCCoreVar)vars[4], false, "Var_FutureAttendingPhy", null, 0, false);
	subContainer_1.addSubInstruction(sub_13);
	
	ISubRule sub_14 = new SubRule("MOEB_FIELD/TLC:A1E5D4D500200857C5F7B03036336664/TPM:A1E5D4D500200860C5F7B03036336664/WID:A1E5D4D50020085BC5F7B03036336664/IDB:A1E5D4D500200850C5F7B03036336664", 0, 23, false, (IDCCoreVar)vars[2], false, "Var_FutureEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_14);
	
	ISubRule sub_15 = new SubRule("MOEB_FIELD/TEX:A1E5D4D50020086DC5F7B03036336664/TPM:A1E5D4D500200871C5F7B03036336664", 0, 22, false, (IDCCoreVar)vars[4], false, "Var_FutureAttendingPhy_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_15);
	
	ISubRule sub_16 = new SubRule("MOEB_FIELD/IDB:A1E5D4D882E63EA0C5F7B03036336664", 0, 18, false, (IDCCoreVar)vars[5], false, "Var_FutureRoom/Bed", null, 0, false);
	subContainer_1.addSubInstruction(sub_16);
	
	ISubRule sub_17 = new SubRule("MOEB_FIELD/TLC:A1E5D4D4F67360E7C5F7B03036336664/TPM:A1E5D4D4F67360F0C5F7B03036336664/WID:A1E5D4D4F67360EBC5F7B03036336664/IDB:A1E5D4D4F67360E0C5F7B03036336664", 0, 18, false, (IDCCoreVar)vars[3], false, "Var_FutureLocation", null, 0, false);
	subContainer_1.addSubInstruction(sub_17);
	
	ISubRule sub_18 = new SubRule("MOEB_FIELD/TEX:A1E5D4D4F67360FDC5F7B03036336664/TPM:A1E5D4D4F6736101C5F7B03036336664", 0, 18, false, (IDCCoreVar)vars[5], false, "Var_FutureRoom/Bed_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_18);
	


		return stepBatch;
	}

}
