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
public class ExpandedDemographicsBanner_Verify_CareTeam_iPad_Test_A1E5F0B974B7B2ABD7E1E53436373330 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[3];
	
    
    
	
	public ExpandedDemographicsBanner_Verify_CareTeam_iPad_Test_A1E5F0B974B7B2ABD7E1E53436373330(IContainer container, String invocationId) {
		super(container, "ExpandedDemographicsBanner_Verify_CareTeam_iPad", invocationId, "A1E5F0B974B7B2ABD7E1E53436373330");
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
		     log("Test Execution: ExpandedDemographicsBanner_Verify_CareTeam_iPad_Test_A1E5F0B974B7B2ABD7E1E53436373330 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5E108E2BFD993DB93B83565626163");	
			vars[0] = new DataVar("Var_Pediatrician_value", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[1] = new DataVar("Var_Family Physician_value", null, IDataArea.VIRTUALUSER, "INFO", true, false);

	
		vars[2] = new DataVar("Var_Primary Care Physician_value", null, IDataArea.VIRTUALUSER, "INFO", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory",
												  "A1E5E11B96DA3E80D175E46437306234",
												  "{\"variables\":[{\"id\":\"92\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pediatrician value\",\"key\":\"MOEB_FIELD\\/STL:A1E5F00EBB4C3455C4DFB46533363364\\/TPM:A1E5F00EBB4C345BC4DFB46533363364\\/WID:A1E5F00EBB4C5B28C4DFB46533363364\\/IDB:A1E5F00EBB4C5B34C4DFB46533363364\"},{\"id\":\"93\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pediatrician value\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F00EBB4C5B70C4DFB46533363364\"},{\"id\":\"94\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pediatrician value\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F00EBB4C8234C4DFB46533363364\\/TPM:A1E5F00EBB4C823AC4DFB46533363364\"},{\"id\":\"95\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pediatrician value\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F00EBB4CA95FC4DFB46533363364\\/TPM:A1E5F00EBB4CA965C4DFB46533363364\\/WID:A1E5F00EBB4CA96FC4DFB46533363364\\/IDB:A1E5F00EBB4CA979C4DFB46533363364\"},{\"id\":\"96\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Family Physician value\",\"key\":\"MOEB_FIELD\\/STL:A1E5F00EBB4CA985C4DFB46533363364\\/TPM:A1E5F00EBB4CA98BC4DFB46533363364\\/WID:A1E5F00EBB4CA995C4DFB46533363364\\/IDB:A1E5F00EBB4CD053C4DFB46533363364\"},{\"id\":\"97\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Family Physician value\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F00EBB4CF773C4DFB46533363364\"},{\"id\":\"98\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Family Physician value\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F00EBB4D1E73C4DFB46533363364\\/TPM:A1E5F00EBB4D1E79C4DFB46533363364\"},{\"id\":\"99\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Primary Care Physician value\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F00EBB4D93BFC4DFB46533363364\\/TPM:A1E5F00EBB4D93C5C4DFB46533363364\\/WID:A1E5F00EBB4D93CFC4DFB46533363364\\/IDB:A1E5F00EBB4D93D9C4DFB46533363364\"},{\"id\":\"100\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Family Physician value\",\"key\":\"MOEB_FIELD\\/STL:A1E5F00EBB4D93E5C4DFB46533363364\\/TPM:A1E5F00EBB4D93EBC4DFB46533363364\\/WID:A1E5F00EBB4D93F5C4DFB46533363364\\/IDB:A1E5F00EBB4D9401C4DFB46533363364\"},{\"id\":\"101\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Primary Care Physician value\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F00EBB4D4593C4DFB46533363364\"},{\"id\":\"102\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Primary Care Physician value\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F00EBB4D45C5C4DFB46533363364\\/TPM:A1E5F00EBB4D45CBC4DFB46533363364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> equals <b>Pediatrician<\\/b> on <b>Label<\\/b> <b>'Pediatrician'<\\/b> to the right of Label <b>'Encounter Details'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F00EBB4C3455C4DFB46533363364\\/TPM:A1E5F00EBB4C345BC4DFB46533363364\\/WID:A1E5F00EBB4C5B28C4DFB46533363364\\/IDB:A1E5F00EBB4C5B34C4DFB46533363364\\\">Pediatrician value<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pediatrician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EBB4C3413C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F00EBB4C3455C4DFB46533363364\\/TPM:A1E5F00EBB4C345BC4DFB46533363364\\/WID:A1E5F00EBB4C5B28C4DFB46533363364\\/IDB:A1E5F00EBB4C5B34C4DFB46533363364\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pediatrician value\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pediatrician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Encounter Details\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F00EBB4C8234C4DFB46533363364\\/TPM:A1E5F00EBB4C823AC4DFB46533363364\\\">Pediatrician value<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F00EBB4C5B70C4DFB46533363364\\\">Pediatrician value<\\/subst>'<\\/b> below Label <b>'Pediatrician'<\\/b> and above Label <b>'Family Physician'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"19\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EBB4C5B60C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F00EBB4C5B70C4DFB46533363364\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pediatrician value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F00EBB4C8234C4DFB46533363364\\/TPM:A1E5F00EBB4C823AC4DFB46533363364\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pediatrician value\"}],\"isWeb\":false,\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"18\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pediatrician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b>Family Physician<\\/b> on <b>Label<\\/b> <b>'Family Physician'<\\/b> below Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F00EBB4CA95FC4DFB46533363364\\/TPM:A1E5F00EBB4CA965C4DFB46533363364\\/WID:A1E5F00EBB4CA96FC4DFB46533363364\\/IDB:A1E5F00EBB4CA979C4DFB46533363364\\\">Pediatrician value<\\/subst>'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F00EBB4CA985C4DFB46533363364\\/TPM:A1E5F00EBB4CA98BC4DFB46533363364\\/WID:A1E5F00EBB4CA995C4DFB46533363364\\/IDB:A1E5F00EBB4CD053C4DFB46533363364\\\">Family Physician value<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EBB4CA943C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F00EBB4CA95FC4DFB46533363364\\/TPM:A1E5F00EBB4CA965C4DFB46533363364\\/WID:A1E5F00EBB4CA96FC4DFB46533363364\\/IDB:A1E5F00EBB4CA979C4DFB46533363364\",\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pediatrician value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F00EBB4CA985C4DFB46533363364\\/TPM:A1E5F00EBB4CA98BC4DFB46533363364\\/WID:A1E5F00EBB4CA995C4DFB46533363364\\/IDB:A1E5F00EBB4CD053C4DFB46533363364\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician value\"}],\"isWeb\":false,\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"34\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F00EBB4D1E73C4DFB46533363364\\/TPM:A1E5F00EBB4D1E79C4DFB46533363364\\\">Family Physician value<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F00EBB4CF773C4DFB46533363364\\\">Family Physician value<\\/subst>'<\\/b> below Label <b>'Family Physician'<\\/b> and above Label <b>'Primary Care Physician'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"51\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"64\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EBB4CF763C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F00EBB4CF773C4DFB46533363364\",\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F00EBB4D1E73C4DFB46533363364\\/TPM:A1E5F00EBB4D1E79C4DFB46533363364\",\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician value\"}],\"isWeb\":false,\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"50\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"53\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"60\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"63\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Primary Care Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"62\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"61\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"59\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"55\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"58\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"57\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"56\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"54\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b>Primary Care Physician<\\/b> on <b>Label<\\/b> <b>'Primary Care Physician'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F00EBB4D93BFC4DFB46533363364\\/TPM:A1E5F00EBB4D93C5C4DFB46533363364\\/WID:A1E5F00EBB4D93CFC4DFB46533363364\\/IDB:A1E5F00EBB4D93D9C4DFB46533363364\\\">Primary Care Physician value<\\/subst>'<\\/b> and below Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F00EBB4D93E5C4DFB46533363364\\/TPM:A1E5F00EBB4D93EBC4DFB46533363364\\/WID:A1E5F00EBB4D93F5C4DFB46533363364\\/IDB:A1E5F00EBB4D9401C4DFB46533363364\\\">Family Physician value<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"80\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Primary Care Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"79\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EBB4D93A3C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F00EBB4D93BFC4DFB46533363364\\/TPM:A1E5F00EBB4D93C5C4DFB46533363364\\/WID:A1E5F00EBB4D93CFC4DFB46533363364\\/IDB:A1E5F00EBB4D93D9C4DFB46533363364\",\"id\":\"66\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Primary Care Physician value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F00EBB4D93E5C4DFB46533363364\\/TPM:A1E5F00EBB4D93EBC4DFB46533363364\\/WID:A1E5F00EBB4D93F5C4DFB46533363364\\/IDB:A1E5F00EBB4D9401C4DFB46533363364\",\"id\":\"67\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Family Physician value\"}],\"isWeb\":false,\"id\":\"65\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"70\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Primary Care Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"69\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"76\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"67\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"78\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"77\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"75\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"},\"id\":\"68\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"72\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"66\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"74\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"73\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"71\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F00EBB4D45C5C4DFB46533363364\\/TPM:A1E5F00EBB4D45CBC4DFB46533363364\\\">Primary Care Physician value<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F00EBB4D4593C4DFB46533363364\\\">Primary Care Physician value<\\/subst>'<\\/b> below Label <b>'Primary Care Physician'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"83\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"91\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EBB4D4583C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F00EBB4D4593C4DFB46533363364\",\"id\":\"82\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Primary Care Physician value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F00EBB4D45C5C4DFB46533363364\\/TPM:A1E5F00EBB4D45CBC4DFB46533363364\",\"id\":\"83\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Primary Care Physician value\"}],\"isWeb\":false,\"id\":\"81\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"82\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"85\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"84\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"87\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"90\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Primary Care Physician\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"89\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"88\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"86\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/STL:A1E5F00EBB4C3455C4DFB46533363364/TPM:A1E5F00EBB4C345BC4DFB46533363364/WID:A1E5F00EBB4C5B28C4DFB46533363364/IDB:A1E5F00EBB4C5B34C4DFB46533363364", 0, 18, false, (IDCCoreVar)vars[0], false, "Pediatrician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/IDB:A1E5F00EBB4C5B70C4DFB46533363364", 0, 18, false, (IDCCoreVar)vars[0], false, "Pediatrician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TEX:A1E5F00EBB4C8234C4DFB46533363364/TPM:A1E5F00EBB4C823AC4DFB46533363364", 0, 18, false, (IDCCoreVar)vars[0], false, "Pediatrician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E5F00EBB4CA95FC4DFB46533363364/TPM:A1E5F00EBB4CA965C4DFB46533363364/WID:A1E5F00EBB4CA96FC4DFB46533363364/IDB:A1E5F00EBB4CA979C4DFB46533363364", 0, 18, false, (IDCCoreVar)vars[0], false, "Pediatrician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/STL:A1E5F00EBB4CA985C4DFB46533363364/TPM:A1E5F00EBB4CA98BC4DFB46533363364/WID:A1E5F00EBB4CA995C4DFB46533363364/IDB:A1E5F00EBB4CD053C4DFB46533363364", 0, 22, false, (IDCCoreVar)vars[1], false, "Family Physician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/IDB:A1E5F00EBB4CF773C4DFB46533363364", 0, 22, false, (IDCCoreVar)vars[1], false, "Family Physician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TEX:A1E5F00EBB4D1E73C4DFB46533363364/TPM:A1E5F00EBB4D1E79C4DFB46533363364", 0, 22, false, (IDCCoreVar)vars[1], false, "Family Physician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/TLC:A1E5F00EBB4D93BFC4DFB46533363364/TPM:A1E5F00EBB4D93C5C4DFB46533363364/WID:A1E5F00EBB4D93CFC4DFB46533363364/IDB:A1E5F00EBB4D93D9C4DFB46533363364", 0, 28, false, (IDCCoreVar)vars[2], false, "Primary Care Physician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	
	ISubRule sub_8 = new SubRule("MOEB_FIELD/STL:A1E5F00EBB4D93E5C4DFB46533363364/TPM:A1E5F00EBB4D93EBC4DFB46533363364/WID:A1E5F00EBB4D93F5C4DFB46533363364/IDB:A1E5F00EBB4D9401C4DFB46533363364", 0, 22, false, (IDCCoreVar)vars[1], false, "Family Physician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/IDB:A1E5F00EBB4D4593C4DFB46533363364", 0, 28, false, (IDCCoreVar)vars[2], false, "Primary Care Physician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
	
	ISubRule sub_10 = new SubRule("MOEB_FIELD/TEX:A1E5F00EBB4D45C5C4DFB46533363364/TPM:A1E5F00EBB4D45CBC4DFB46533363364", 0, 28, false, (IDCCoreVar)vars[2], false, "Primary Care Physician value", null, 0, false);
	subContainer_1.addSubInstruction(sub_10);
	


		return stepBatch;
	}

}
