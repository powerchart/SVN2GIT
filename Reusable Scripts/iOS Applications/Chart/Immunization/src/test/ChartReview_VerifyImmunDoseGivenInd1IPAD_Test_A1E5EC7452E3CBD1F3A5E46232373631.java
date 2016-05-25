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
public class ChartReview_VerifyImmunDoseGivenInd1IPAD_Test_A1E5EC7452E3CBD1F3A5E46232373631 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public ChartReview_VerifyImmunDoseGivenInd1IPAD_Test_A1E5EC7452E3CBD1F3A5E46232373631(IContainer container, String invocationId) {
		super(container, "ChartReview_VerifyImmunDoseGivenInd1IPAD", invocationId, "A1E5EC7452E3CBD1F3A5E46232373631");
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
		     log("Test Execution: ChartReview_VerifyImmunDoseGivenInd1IPAD_Test_A1E5EC7452E3CBD1F3A5E46232373631 ",e);
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
												  "A1E5DCA1D5DDDAC0CBFFB83930633666",
												  "{\"imagePrerequisites\":[\"UIView\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E60D5D9A5ACC79E43EE13565353638\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E60D5D9A5ACC83E43EE13565353638&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:10}\\\"\\/><b>Image<\\/b> matches on <b>View<\\/b> below Label <b>'Hepatitis B'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Hepatitis B\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAPAAAAALCAIAAADOYpcfAAADPUlEQVR4nO2Z3UuiQRTG+\\/cjwnIrTdus8ItICYugq0D6sIxE74KupDBLKior05r98T44DLK+694sLMxzMY0z55yR+M3Ted+mjDG9Xo\\/x+\\/vbOOr3+4wfHx8jK5+fn19fX1phMpLV7XbtFuNgMFCMlRvMrp3rIPc4L69wuTiJN8YpfYZpSHVDbTTrIt4V5NnFXiAbPwjkHqOboLL2PiiGuXZtjJfXhBoLND\\/e39+1cX193Wg0yuVypVK5urqy6wIOCl2UO51OvV4\\/PDys1WrNZvPx8dENpqy9JCQ+PDxcXl5StlqtcsoI9Nb1R1zcy2ucxgKtDT5cXFxks9nl5eWFhYWVlZVYLLa\\/v99ut82wLTGBYZvAoUF5fX2dyMXFxbm5OUaCW62WCqrZYGQO32dnZ6urqz8Czc\\/PJ5PJQqFwc3Mz8s2IdP9QeHmFKKzlYO\\/4+BiCQRNGYToej8PozMzM1taWmHZ1dHSUSCRAk3FjY4MRXvm4vb19f39vnP6YM7DwVCo1PT1NQe4AV2VpaYkUG2whtj7t5fVHhbUcNAygBs1ra2s\\/AwF3JpMBbiYHBwdKe3t7M0FbApTQSbBMF0C5A4xUgHX3pNvbW7YoSDBYwzGJAjoSieDcbmfigfaaXGEOfXp6iiWDL81ALBAUMoIdK7AulCUcF4jZxZXJYpcYGGUSjUZzudzz87MZmjR8U5YwArBwErkMkE0KwZubm6+vryNfy8trEo0FGvJ2dnYANB4ITGW3kAd\\/YpHnPz0gEry7uwvoLEIkMVgvXkuWvQZqjgV0sVgU0MlAJKo4i9g29e\\/u7oxH2evvFebQe3t7MCem5bs0BgDHBASZgJ2eC8G0VCqxqK6DFOwWsnUZ+EiwgNZ5XBXCCNZfABJVHLi5CcCtNtr9Wl5ek2gs0P1+\\/+TkBNTAUS83YE68qgOhl3h6erLJ1WqV5oF1HgfVPZObCoRVFwoFtRx0xlSmmcGG1UbLv6msHn12djafz7+8vLhvOf7pr8Trf1aYQ7fb7Ww2C46yT7XOAKq3cvTBCgM+RnhNp9O4shoPNRK2Sz4\\/PzfDf81wAL0K+FIEmkFZT5nyfoJ5KDTOKxEPtNfk+i3QvwBTj66\\/XkMhtwAAAABJRU5ErkJggg==\",\"id\":\"11\",\"annotationId\":\"A1E60D5D9A5ACC83E43EE13565353638\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":10,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
