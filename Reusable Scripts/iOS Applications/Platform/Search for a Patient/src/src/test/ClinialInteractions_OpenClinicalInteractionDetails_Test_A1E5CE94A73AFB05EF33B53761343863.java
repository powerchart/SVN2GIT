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
public class ClinialInteractions_OpenClinicalInteractionDetails_Test_A1E5CE94A73AFB05EF33B53761343863 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public ClinialInteractions_OpenClinicalInteractionDetails_Test_A1E5CE94A73AFB05EF33B53761343863(IContainer container, String invocationId) {
		super(container, "ClinialInteractions_OpenClinicalInteractionDetails", invocationId, "A1E5CE94A73AFB05EF33B53761343863");
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
		     log("Test Execution: ClinialInteractions_OpenClinicalInteractionDetails_Test_A1E5CE94A73AFB05EF33B53761343863 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5CC4793A77E1ED9E8B43733386336");	
			vars[0] = new DataVar("Var_ClinicalInteraction", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Button identified by an image to the right of Label whose Text contains Var_ClinicalInteraction",
												  "A1E5D4EB66E5FDF5D596E36339376231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5D4EB66E5FDF5D596E36339376231\",\"id\":\"1\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"thinktime\":2000,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>2,000<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E5D4EB66E5FDF5D596E36339376231\",\"id\":\"2\",\"substitutionParameters\":[{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_ClinicalInteraction\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4EB66B43F87D596E36339376231\\/TPM:A1E5D4EB66B43F90D596E36339376231\\/WID:A1E5D4EB66B43F8BD596E36339376231\\/IDB:A1E5D4EB66B43F80D596E36339376231\",\"type\":\"TString\"}],\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> <img data=\\\"{&quot;aspectRatioTolerance&quot;:20,&quot;annids&quot;:[&quot;A1E5D4EC69649D00D596E36339376231&quot;],&quot;threshold&quot;:80}\\\"\\/>identified by an image to the right of Label whose <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4EB66B43F87D596E36339376231\\/TPM:A1E5D4EB66B43F90D596E36339376231\\/WID:A1E5D4EB66B43F8BD596E36339376231\\/IDB:A1E5D4EB66B43F80D596E36339376231\\\">Var_ClinicalInteraction<\\/subst><\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"click\"},\"object\":{\"id\":\"5\",\"locator\":{\"id\":\"10\",\"parameter\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"13\",\"parameter\":{\"$ref\":\"3\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TContains\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"identifier\":{\"expression\":\"getImage\",\"id\":\"6\",\"parameter\":{\"id\":\"7\",\"imageReferences\":{\"id\":\"8\",\"references\":[{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\",\"annotationId\":\"A1E5D4EC69649D00D596E36339376231\",\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAAgAAAANCAIAAAAboLhvAAAAuUlEQVR4nEWOSQqFMBBE+\\/63EhFnBHeuDLhQwVlEHPMfxK8NCXRV1yDHcSzLorW+rmtdV\\/0fUUolSdI0jdmhHyLPc9d10zQ1uk\\/Bq+vasqwwDMdx\\/Ai053nCeZ4H93oK4ca3KAo48vq+v+9bXi10VVXkBUGA7iFw45+mCZHjOFzItm24gXJFhu\\/7bduCCHagwzCA4lOW5Vd3nuc4jqMo6rqOlXOche5Atm3TGHTf90eRZZmpYYqZPOYHM+wid2jP+5EAAAAASUVORK5CYII=\"}],\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\",\"aspectRatioTolerance\":20,\"threshold\":80},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"image\",\"type\":\"TImage\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"image\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0}],\"timeout\":10,\"variables\":[{\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_ClinicalInteraction\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4EB66B43F87D596E36339376231\\/TPM:A1E5D4EB66B43F90D596E36339376231\\/WID:A1E5D4EB66B43F8BD596E36339376231\\/IDB:A1E5D4EB66B43F80D596E36339376231\"}]}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TLC:A1E5D4EB66B43F87D596E36339376231/TPM:A1E5D4EB66B43F90D596E36339376231/WID:A1E5D4EB66B43F8BD596E36339376231/IDB:A1E5D4EB66B43F80D596E36339376231", 0, 23, false, (IDCCoreVar)vars[0], false, "Var_ClinicalInteraction", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

}
