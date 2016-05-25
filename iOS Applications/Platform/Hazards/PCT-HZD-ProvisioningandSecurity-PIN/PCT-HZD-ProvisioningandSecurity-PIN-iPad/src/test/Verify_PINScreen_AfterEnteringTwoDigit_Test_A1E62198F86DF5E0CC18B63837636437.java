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
public class Verify_PINScreen_AfterEnteringTwoDigit_Test_A1E62198F86DF5E0CC18B63837636437 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public Verify_PINScreen_AfterEnteringTwoDigit_Test_A1E62198F86DF5E0CC18B63837636437(IContainer container, String invocationId) {
		super(container, "Verify_PINScreen_AfterEnteringTwoDigit", invocationId, "A1E62198F86DF5E0CC18B63837636437");
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
	        	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Verify_PINScreen_AfterEnteringTwoDigit_Test_A1E62198F86DF5E0CC18B63837636437 ",e);
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
												  "A1E62197F9FAF290CC18B63837636437",
												  "{\"imagePrerequisites\":[\"UIView\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E621993294E373CC18B63837636437\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E6219932955860CC18B63837636437&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>View<\\/b> located at position 30\",\"id\":\"1\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":30,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIView\",\"locator\":{\"parameter\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"30\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAHoAAAAMCAIAAAAiQD5vAAAFoklEQVR4nK2Xx0smWxDFv3\\/OnMbw2uyY8yjGhSiKI4gLRTeKYeFGRRQFw8wgiqIDAyKuFHPOOcwzp\\/ebPth8DLjo5t1Fe79r33uqTp2qW+0KDg4OCgpKSUnp7e29uLi4vLy8urra39\\/v7+\\/PzMw0DCMmJiY0NNSwOf75YERERISFhXHmjx8\\/Dg8Pd3d3Hx8ft7a2QE9NTdV\\/2c4Tw8LDw+3ishF3OCc6OjoyMvLTp08BAQFZWVk9PT0HBwfHx8crKyuLi4udnZ3A+fv74xooGMZGdjFhO0+7uOz9\\/PkzNiclJXH479+\\/l5aWzs7OlpeXm5qa8Jd\\/JSQkuPhTXFx8fX399vaG56+vr09PT0z4CR0VFRXYxNt24T+iG2fKyspgmfNfXl7e3Mbp6WlBQQEcYVJISEhsbCxk2cVlIyfgPJOoqCjY5EwoXl1dbW5uhovy8vL29vb5+fnNzU305OPjA9HEhjeZsJeNCrmt4evri7Vg4RpYDQ0N+fn5\\/Ozo6Nje3l5fX\\/\\/y5QtYrrS0NLSMt0ib5\\/Pzs7hG48xPTk5yc3P\\/R3XjMKFVUEEhmcQ1P1k8Pz+HAugmwJ6enjBuFxdT4+LicCw+Pt7Pzw\\/v4Hp6ehrpQQdUEglvb+\\/s7OzJycm9vb2MjAwW2YjGFSqC5CCrMDg5ORmB\\/vz5kxPQqDIGefEvFmEck1xDQ0P4afnM8+HhQbrT+vj4OHvswn9E97dv3+7v7zn29vbW0jVxfTUH84GBASiDaKuw2BrsonrgoVylZK2trRlmkYF96Z3\\/BgYG8kR3KB1y+QmiBK6SYheXUI2MjJA0KmUKGOdIqRxOYWlra3Mpr+\\/u7iyJ8ZT\\/WkRxSNKB24YpGfRimKITKukiii26mYhoxRh7kGS4OaQ7W0OaUtVGTRTr+vp60kU2sJiYmKgaxbO1tRXGqSTs4h2xrMLiwF\\/oqqurY85RnEBoZYlEAxZXlOtfc0hilqIRuLhgwoqDpJbnxjvvQEIfaW6ljq4K99qt3GKRxMdc3HaQ1DgJrkLFDcn1COm6DEHnBYQsjUNEXl4ehRQgS4+sO5A2g0rC3UPHQR0TkLIZFM4EtKio6A\\/d1GicJMEJjhjXk7vVogOL7cILzDAFrp+4RNiwyUomBnXcYl8GgAvdvKx8t4tLXMGCQSaiANKlVhVuuKZDIOXRINcSOa7CpSxkl16zi0ufQ6Kkp6fjL9VMGcMcIE5mkpOTQx67MMjdYenLXYD476CY\\/EW3YcocI4juX6J2\\/4nAsQejsZj3HSQ1vtEkAMQJFCVO+\\/r1q1JbdQaW1Yp4eHjQq2xsbCBGqxdUnOyCMtA1rlVVVYFOvYJlVUJ1vYBSTLhFXGNjY1YiWw3DkzlEAVelIm93qP4a71VFKxMTEyrTOl+ZpMtTecYLYtmBxAyz8uIhdVn8Dg4OLiwsWFcWi1abSA7BdXd3t2QoXaN0Syi2BucPDw9DKND6lCGKKk2sAErf2dXV5aIfJKHktnsvLKXTqBUWFjq4sgyTL93ylvW4ROOleuKOogHpWEI9pYWgfKnI2gWVmvCQikHDRyXhqucbCue9vLzU+HMy\\/tMCQTf2KJNU7sW7gzuDLSTl0dGROivdxhzIBNDR0VF6xD+NIKGora2FAvekFgssNjY2ssdBtCUZJak1DzNHdXU1\\/Qlwak50LfPkxsYSbFWPrO7CgduSNk\\/d8KWlpTs7OzMzM7QNlBcOb2lpmZub4xZFSbAvDUoZoeZwkFiKWWVlJdGdnZ2tqakBiwoDqLD46sF3F9nHBwWXxq9fvyjTEH1zc0NVoYaUlJQEm8MutvHe+YliOSN\\/VDrBnpqaAguKIZ0yAhy88HWgjzr1Tw7c1l5VEo5SK03GoC9aTD7loAP2+\\/r6EL7kjOikQXUsalrs4lqdPncm9ZCGhx4ULCbfv39H+JAM1f8BJXgj+RrJzAIAAAAASUVORK5CYII=\",\"id\":\"8\",\"annotationId\":\"A1E6219932955860CC18B63837636437\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}},{\"uid\":\"A1E621993FB24791CC18B63837636437\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>CANCEL<\\/b> on <b>Label<\\/b> to the left of Label <b>'DELETE'<\\/b>\",\"id\":\"9\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":30,\"retry\":false,\"object\":{\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"DELETE\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"CANCEL\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"}},{\"uid\":\"A1E62199470B1449CC18B63837636437\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>DELETE<\\/b> on <b>Label<\\/b> to the right of Label <b>'CANCEL'<\\/b>\",\"id\":\"18\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":30,\"retry\":false,\"object\":{\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"CANCEL\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"DELETE\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
