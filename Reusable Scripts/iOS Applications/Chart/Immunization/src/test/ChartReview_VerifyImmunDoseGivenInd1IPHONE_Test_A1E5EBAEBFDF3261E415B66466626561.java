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
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class ChartReview_VerifyImmunDoseGivenInd1IPHONE_Test_A1E5EBAEBFDF3261E415B66466626561 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public ChartReview_VerifyImmunDoseGivenInd1IPHONE_Test_A1E5EBAEBFDF3261E415B66466626561(IContainer container, String invocationId) {
		super(container, "ChartReview_VerifyImmunDoseGivenInd1IPHONE", invocationId, "A1E5EBAEBFDF3261E415B66466626561");
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
	        	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: ChartReview_VerifyImmunDoseGivenInd1IPHONE_Test_A1E5EBAEBFDF3261E415B66466626561 ",e);
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
												  "PowerChart",
												  "A1E5EB831C030030E415B66466626561",
												  "{\"imagePrerequisites\":[\"UIView\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E60D751F3377D1EC3AB93061623331\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E60D751F3377DBEC3AB93061623331&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:10}\\\"\\/><b>Image<\\/b> matches on <b>View<\\/b> below Label <b>'Hepatitis B'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Hepatitis B\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAWgAAAALCAIAAADdkIDCAAADTUlEQVR4nO2aXS9rQRiF\\/Xs3GqXoJ6o0SJogQtyQJoSKlIQbcSU+SimSklR9nDmPWe1kh3MuztVpk3ddjOnea2Y3kvfJemd3wDn3+fnpvN7f319fXzUPF4O4+\\/HxEb3yyyvcZQlj9KP7Ia6\\/vb3p1jdDdDeTydTLGnB\\/YoTzFR7KmFJ3vrDb7fZPPzQJvJBNE2xRELCJlodV2gdP4IiBw2TqCw3oj6IEdVuv1w8PD3d2dvb29o6Pj5+enpwv6QCLgAlAcHl5eXJysr29jf\\/s7Oz5+VnFH8x4FD0IMo1G4\\/T0FHO5XGaCOeSXACkDh8nUF\\/oCh8q12WweHByUSqVMJpNIJMbGxorF4tLS0vn5uawBLoytVqtarc7NzaXT6VQqNT4+zmR1dTWYo6mEOTsXCgV2xszmU1NTa2trtVotuqf7S\\/YxmUy9pi9wUL2ULvkil8tR1ZOTk0yy2SxFPjQ0BDvu7++djw+qc0ZAMD09PTIyAl\\/wAwIWxmKx5eXlm5sb180aesbW1lY+n4\\/H44CDVSwZHR1lFey4urqKfhtLHCZTX6jTqtB0LCwsgImcF0TIesEO6nx9fZ3OwnV7FtBA1hgeHgYHBA2xgwlQ4OLm5mb0hBU0kDXYM+WV9tJkcHAQALXb7cALA4fJ1BfqtCqVSoXin5iYUEmDDNJBMplU9OBWo9HQAvUd9CYYCBpkBwxiAWZ2gCnRHLG\\/v89FDCHFINZqjvnh4UHZRMel1q2YTL2vTuKgmyA4qLwZQQYf4UI4v7i4uFCf0mq1yuUyd8UOgYCEIu6Ag9nZWczhFcnGxga7YRY+EHOWc1GPq9Vqemuj0WQy9b464KC\\/oJJ1WqGSZp70ouDpQa6vr8OZBWYVvyqf1CDcKEqwA4kDashPmyNMwBT1QRkv+XnK7e2tfsEBkv7bv8FkMv2LOuA4OjqCDvQdIoXShMR8cXGx2Wy67ouVarWqdgZksAQDONCYSCSKxSLdh+seWLCzzkRhBB4MWsuD4vF4qVTSzmHzb78xM5lMPagOOO7u7lZWVmKxGCmgUCjoZJQJdc4VehP1EWpAXl5e5ufnKXvChbIDE\\/xwAfPu7m606Xh8fJyZmcEGjxjzXnrjCzsqlYodaphMfaffJEQZ2E7Bg7YAAAAASUVORK5CYII=\",\"id\":\"11\",\"annotationId\":\"A1E60D751F3377DBEC3AB93061623331\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":10,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
