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

import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;

@SuppressWarnings("all")
public class EVisit_Verification_Schedule_View_Test_A1E5E0AE77DF6EBBC85EB03433326630 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	
	
	
    
    
	
	public EVisit_Verification_Schedule_View_Test_A1E5E0AE77DF6EBBC85EB03433326630(IContainer container, String invocationId) {
		super(container, "eVisit_Verification_Schedule_View", invocationId, "A1E5E0AE77DF6EBBC85EB03433326630");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		
	
	if (!isScheduleRun()){
}
	        	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: EVisit_Verification_Schedule_View_Test_A1E5E0AE77DF6EBBC85EB03433326630 ",e);
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
	
		// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory",
												  "A1E5E0AF84C77173C85EB03433326630",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5E0AF986DAA44C85EB03433326630\",\"id\":\"1\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"to_overriden\":true,\"vpExpression\":{\"expression\":\"text\",\"id\":\"8\",\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"eVisit\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"name\":\"text\",\"translatedName\":\"Text\",\"operator\":\"TEquals\",\"expType\":\"getter\"},\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>eVisit<\\/b> on <b>Label<\\/b> to the right of Label <b>'Confirmed'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"object\":{\"id\":\"2\",\"locator\":{\"id\":\"3\",\"parameter\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"6\",\"parameter\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Confirmed\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"},\"skipScrollingIniOSDF\":false,\"retry\":false,\"timeout\":5}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
