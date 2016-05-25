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
public class Verify_PINScreen_AfterTappingDeleteTwice_fromCreatePINScreen_Test_A1E62199FB150415CC18B63837636437 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public Verify_PINScreen_AfterTappingDeleteTwice_fromCreatePINScreen_Test_A1E62199FB150415CC18B63837636437(IContainer container, String invocationId) {
		super(container, "Verify_PINScreen_AfterTappingDeleteTwice_fromCreatePINScreen", invocationId, "A1E62199FB150415CC18B63837636437");
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
		     log("Test Execution: Verify_PINScreen_AfterTappingDeleteTwice_fromCreatePINScreen_Test_A1E62199FB150415CC18B63837636437 ",e);
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
												  "{\"imagePrerequisites\":[\"UIView\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E6219A152F4B9ECC18B63837636437\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E6219A152F7254CC18B63837636437&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>View<\\/b> located at position 30\",\"id\":\"1\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":30,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIView\",\"locator\":{\"parameter\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"30\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAHoAAAAMCAIAAAAiQD5vAAAFx0lEQVR4nJ3X12uVWxAF8PPH2bvGe4xeS+xdsSOIgvpiAhZExYKEYEEUsSCKKBZ8ElGwYK+xRGNBhfjqz7O4H3IhD\\/t8D4f9lT1rZs2amX1qra2tY8aMmThx4sGDB1+9evXx48cnT5709vYeOHBg1qxZ48aNa21c9cLrn36u0aNHDx06dN68eZ2dnd3d3T9\\/\\/vz69evDhw8PHTo0efJkb4cNG\\/Zv47KGXoo7fvx4GznMgqCENnLkyIULFx4\\/fvzDhw+fPn16+vTpo0ePjhw5MmfOnBEjRrS0tEyYMIFjNtoVD\\/2W4to7bdq0sWPHzpw5k3FxPX78+MuXL8jcs2eP0LyaPn16bciQIWvWrPH07du3XV1dK1asWL169e7du1+8ePH+\\/Xu3POZBKXx\\/dAtvw4YNXHn37p0E433x4sW45gD2eQJL\\/Al+0qRJpbgyhGV7LWwHJwQUP3v2bO\\/evbiALtMPHjygrQULFsg9LLnxpYW9NlqU4lIJomChEdaOHTuWL1\\/u9vDhw2\\/evEGmMGHV5MTrK1euTJkypaVxkYOY29raLl269Pr1ayooxa73TzcUzF67dk3pDBgwADosKhOwhyiYPXu2gH2JdAGU4vJ\\/6tSpAuP\\/8OHD586di+ubN28CYi3FSmGLFi26fv26lM+fPz81BC6pkiTrUlz6FVFPT8+NGzdYEFEqRnReeYhxLtUo30dY4I3XPgKZavJLhufOnZOAUvj+6D558iSbykpx\\/S1eEDNmzNBVTp065VU8KQWtN4qaKREm1AsXLjx\\/\\/rzeaDLYj969HTVqlF+6o3Tkuo3aqpZSiitVFy9eVDRpZUlYqtmCcY1Ff67xRg\\/hIlfSplOMgWxvb\\/\\/27ZsnTYRdb0gmeytUDXTXrl2SD06CiW7w4MFhQag7d+7kD3nGSHNNLD2BcWrSrLdv3y5\\/8cFDSU3R+N2\\/fz\\/GFZZdvknIaSxNxPvr16+tW7daM8WCoOJJWhMsraIGT5eR+VDjXSoONUpSrRmbCrwUPpHX\\/+OdWfbxKH5wvEnHsMhAjsSWLFlicnriFfU1UdSCTCNi04SUXaRnGCaLUJJdwS5btsx8wm+lR8+bqyo+f\\/78GVFIC1CqGQqbQFetWvWHbjNUFxcbgUfUHHWrwfGAQ3o\\/W6XwAas3BJ7bpJBPOomHJMBspoVkRAtGpYEZsjLrSnHThTBoEQqQHrVGRmxyQN1wYOnSpWqcV6npbM9npbgmHOGa\\/JzHZCrGGhDLFpTU19dXc\\/JTApkw9YYYEypRSNSWLVs0E\\/6Vwv+P7ljmhDlhaid4rqTQoj7xr1+\\/XvpBc9FtE03MlhwlxWxOonvTpk0p7fSZDAYfDBw40Fnl5cuXAq\\/OgslTKaiLrr9\\/\\/75582bo+lV1imUtp0DNRJ+sHTt2jMh5idzUr98oTncz1g23JnpZvUFiJe3qyZkzZ+7evWuhfaEVVl5lvt27d+\\/06dPgNPccB0tBwxfPw+\\/Zs2eN32pkeVgdE40NXAs\\/MoyuKb0SStHFvjMFQkEjF92ymNaUvzUOXUePHq05e2oXJjh4MaerptWiRmuTq4qUoiuD92\\/vmVXa4C5fvoyX\\/MvI3wq3J06c+PHjh0rKCOFuEwfBqMlGdvRDcIYBy6yZyfkXo5OCEB26Dad00XSw8N7EzLBFJ9EqmM1Mrjcq2AKoI7Wy\\/nMQdL927Vo3lLVt2zb9zn+Bjo6OO3fucFQlxsVS+EgmRVqt01jBOYQSnTMDUpS8lnX79m1tVDPha9RRja\\/SsCNtv6Tqybp168yDW7du6ZmwqGrfvn337983RVeuXAkoGowyMkua6N3J2caNG5EmFhHB0mGABssBQfg1n6prx34Cpzud2uFBliQkJ4T8zS2FT\\/FWFFdKT80SndKDAqu3cYGT5qQnv82df3P2SicBlK5o4LOf6NCBfR2SD5Ez0UWDObHk0FKKW530zcyrV6\\/qCkKDZXH+\\/HnCHzRokAr+Dc9I8iy3IeTzAAAAAElFTkSuQmCC\",\"id\":\"8\",\"annotationId\":\"A1E6219A152F7254CC18B63837636437\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}},{\"uid\":\"A1E6219A87F6D6C7CC18B63837636437\",\"isWeb\":false,\"description\":\"Verify that <b>Is hidden<\\/b> equals <b>true<\\/b> on <b>Button<\\/b> to the right of Button to the right of Label <b>'CANCEL'<\\/b>\",\"id\":\"9\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":30,\"retry\":false,\"object\":{\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"CANCEL\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}},\"vpExpression\":{\"expression\":\"isHidden\",\"parameter\":{\"name\":\"hidden\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"true\"},\"name\":\"hidden\",\"expType\":\"getter\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Is hidden\",\"operator\":\"TEquals\"}},{\"uid\":\"A1E6219A9FF9D842CC18B63837636437\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>CANCEL<\\/b> on <b>Label<\\/b> to the left of Button to the right of Label <b>'CANCEL'<\\/b>\",\"id\":\"21\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":30,\"retry\":false,\"object\":{\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"CANCEL\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"CANCEL\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
