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
public class PatientSearch_VerifyTabBar_Test_A1E5EB8FF0559760F86DB76434653162 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public PatientSearch_VerifyTabBar_Test_A1E5EB8FF0559760F86DB76434653162(IContainer container, String invocationId) {
		super(container, "PatientSearch_VerifyTabBar", invocationId, "A1E5EB8FF0559760F86DB76434653162");
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
		     log("Test Execution: PatientSearch_VerifyTabBar_Test_A1E5EB8FF0559760F86DB76434653162 ",e);
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
												  "A1E5DFD19773DD60EEE2E26139626337",
												  "{\"imagePrerequisites\":[\"UITabBarButton\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5DFE164497707DAFFB53361363262\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;aspectRatioTolerance&quot;:20,&quot;annids&quot;:[&quot;A1E5DFE164497711DAFFB53361363262&quot;],&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>TabBar button<\\/b> <b>'Search'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"innerTittle\",\"parameter\":{\"name\":\"currentTitle\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Search\"},\"name\":\"currentTitle\",\"expType\":\"staticGetter\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITabBarButton\"},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAFkAAAAwCAIAAAD1kkFqAAAMgElEQVR4nO1aaXMU1xX1f8rHfEiq4g9JPjqulEMSp4KTOC6nXLjslBPHZaewzWKD8EKgDBgMWCAgWCAJSQgBFgIkJCQWgRa0L0iz9vb6Lf16uTmvezQiduzEMGZJ+dVlqoeeab17+i7n3J7H5HdreT32oDfwEK3vsFhZ32GxsmqLBVei+vqVS+EDksuKZW8ZrHJWyK\\/\\/+re37hILIQNYdpz5VnHJN15FSupABkqozFulOPPTA61VoFgZFkdKhyIKA8WdiJcTaVMSlYslCrW5yIOAo2ZYaMFgAffwGkofQEjhc86FMG4JzhKisojLmjjRoh8PLViXpwqjOT666OJ\\/ypIKPAyImOfgIhmI93nVNi5WDBAACOYDDymETxHP2+Uy0YUSvX584rm9V1dvu7Bqc8eTbzU9s+3CCwdu1o\\/ROFGRyBeMopWUuZ+rxliYcEhvKRcKxqT2VeirwPF5SVPrLf\\/5Xed\\/81HPm13enjFqs+n4Em29HL54dPqJTR1vNN7sK5FH5Hhuzfz7JqsGWPynZc4aFIKY68QNySI6NlhYte7oaw0DI0gHojmi8YjmyRjeHu6bfWHH6b\\/V94\\/5ZCNTVHJ3G7uXVXssEA4ZEECBhYkXUEHTxRyt3tT03qkpeG6FVPK8IgKHKCcCHNi+ZEifBfrdlqa69qkxRXZA9+DUXa4a8wugkKUGUxGCwlWJxeMZQX853P\\/C\\/gsjgtyECkW0DGKuj4IL0yqOdKxCchE7V+afqjvWlqNC+OhjkQKhmAiBBYCwRZT3glGPntrS2jBjSqOppEJoIUPOI+bDKI7tssOFdrnKEf1xX+\\/ajun8\\/wEWUmnLYzomBIWPXGCBIjraPfrszr5zHlkRgV\\/IiHKWFQIuPx\\/KklSeG0QljjNxOaa6c94fdvTNuGQgQ9AolXVlLDSmGu\\/231ftsfAYD2JyhQYcjoxlQvtPDj6749JgTF5E3Ckz7qs48P1SEjlaWnGC\\/CCuY3Rgn2jPNfrllrPAAp4HQVDFAgc13uqXVo1rJ3YMThHoyGYCWGS185MTF\\/+0u\\/tKTCUZU+glbp60rz0HaRIwLhwn9m2SnnDL6CB7bga\\/+qB9lpHv+5n\\/wAIHGS735Ot\\/WzXGAjtOfdBAhAeRaSUqOnbxxu+3d\\/RHVFQJKZf8PLEihZHrCI1+wUFF3QSsPBBovVt6Ss\\/tvbgg6AsZodJ1d7v9H1eNuRb0BWMpU1LI\\/9B01iAanHV+vrGl5bbhUeV8LlbAyUXIoLnCQM6jmBzH0QlNcQIHfeXYZG65dmb+V7n8t7pqjEUqrFxzEIZGkgmFfFkU9OdP+l769MqMNj01SmKXOSWhnJjKEeV9xQBZnPKxIffpbT2HJqiEAEpRqGLxbRdOWXNtBlO+a0QaSh5nWZ7bEbXf4r\\/d0ry9xx5GUhBBp8I3SBXEArIJXwfvOjVPLx8eXXPgOoSJk5i4yCqFXMbi0cqRimbX0GW+B8UZmp6oLJmAWWw7PfGLuvZ\\/dC8tBmT0KEqpgmBNE0fTQJ6e\\/fTa99d2vNQ83x+YuABhQyiYEIPq5R4MBWVZv37xr9cAifszywHpKhHdZLSnp\\/D89s6Xdp6pH3C6bep26YJLp4v0+mfXn9zcvmr\\/rR9tHfrehkvPH18Yk2QrhIwCEKQZsQIFbuDkQ2FGG2BqOAM4DFLCg9UEjvsx48O+LWEo9mJCHRPqrcbrz3x48td1ras\\/PPV0XdPqD1rX7OvZNRS1SXprgB7feu3xd7s2tIzMxUaklX0tmYPuEzs5Co3nwCLVvmEWGkDnUcICu48DxRgv+xEKQT6hoRJ1jpSO9011XJvtn7XHPVogY6gUuy47T2xs+sm65tdOzPULuk2GreZKkDCh9mwTFyD6mQg2cIQ13Of9wALlI2NTYaB9GZUFiAZByPOEgoTQdGUY2VLnWYRWgrZ68Kr1081dP1jftebw6DBRHqUUXcZm1aFhBQsZZXB87fTgG6z7EheSk\\/IM1wyMeAMThUhR0Cw8SOIQdDP0LdJpNxGaaZqN6f0h+uGm3h+v73izeXyI0YI03QfVVFQnIwBiGQv5aGHhO2XwKw0qhgahyeIhBAuoB3etREKH2crOKQfUU0VRAqJ1FQR0kH62oWnV2votR7oKkcHCYkEFgtSEsbCGc\\/P7gQXuOHiEJ3VZhLY2HbTIk7KIBcgl6Cm4Cfql4rFpC8r1ZCEtE1NEB7vHXlz3UevFoZKA5A39wMy7MgMWUhggHrHaCSzMyFNpFAUnSJyQvJBcDcdC0C3IUxSUSCHWoUkDKHdgZKl06sP0xHy+6PgRkesHUlexMNmB1DCViD+sPbWqGu6UUkL4Zq6tWDrrkVWTFcLKzb3lHKZNwJv5Mf6BWVQNbwNzSZ0xi2pDTb\\/7SGEhBUgCduxoCfMqtszZl42nVnluZh6yrFjlw9U+Ul3mww8r7\\/xKLABELKxQWjhYtoqHFf5eQSFI+XXoydiRKDExeoes8EsWSZZFQfYtc2FZ7aw1aCX3qY8Yt01orNiKP6qiblKmYLyCe6gXpXQa7ph6GaHEhlIAi9hgWsFRpp8EwYc9MljIFS1ndlztghlTyKbEbloRs6KIV6BQTqcbjibwEa5i6F1TX1eg5MtY0EOKxR31UqxMX5ROGUGyzIuyfQdZCFSwCCpAZGUVZNRMj41RZoaepg04K7cZFrhg1lYeLSySKhbLZTKreRmPNJa2FVQEJ+ElEgXyiwm3kAtCmIcMrohg1W56B8UKHhLeyeXKjymy+6nBGnCTHRnbKnbShAeVQCRnBEmkWIQrxa86ieAVLKRFvEj+ErFcwsrKd6HcLR4XORhapYJk15F3jE7uFYZ03TUWla2byY1Ee2dCcRYEkFvFgIYLfFdz18b9LZsOdpwZKy2kmY+0L\\/FExARVEikzpBI69qRh5agFjLEQCt01bCIJuGReEsWBGR0nYN+H2s6fvDTqEJUiWuIGDigacJUkiUDtA+XLB80veAZEioWHoHCDcAmqnGjzwfbG\\/pmphFqG7Vd3t0+gBBItSbqxJG7j9joQZRGC5TZLxvJi1pISFNOVeJuXNLtYACg4O77EJssaSmQpooaz187eLEDaj1npHMQ3lFQESbFYROAYZB8gFilrrPy8KO2OpsMhmVH2b0vadvTsnpNXJ7QZSYwgTBT1LibvHbv0Yev1d4+c7520SkTdE86mhjObj3TXHToz6RFiZ2P9qW1NvS09w+PlcF9n\\/9q9zRsbOg\\/2TOAiW473rWvo2t42uHZX8z\\/PjXhkksX2wkgTxTG37ZrIs3uad2a0r1oFEc\\/gBVZCg\\/Ni69HujfWnNx0+35szvyrYeurWvgH7vEfHJ5IPmvrniC7mqbtAE\\/Cz5VpD7+ygRa\\/sPn2hYKYV7UO5949dAARXPfq0d26GaMeZ0a3t1xfxrTlVV9+GKAPoDtORjiHqKFQPMC4qvCjTDhlxluZ5cpJnMW7apG1c6p0LD5y79cbO5v4ybWwZWbP3Ul13eV3b9Lqjl0ciOlugus6pus6ZFz\\/+vGGgcFPTX+t7hxKaJfroxMCJgaWFiOZjyiGyPDrQNdHYP2+OXdqw+8ikJawghGDzWNmzFyPovlr8jqeWWKBrOuCLAbX13ppiVCbjyfo9bWcmxPpjVz+bMlOJHknnlkykvLyz8+B1\\/waKS+vw4YF8v0Wv7u8eJ5omajh\\/68Dn45Dt05pabzgIh71nx470TBeIhstUt7eRmbiISo4daB9AUPxFnfJQYIFmkefUePbKOx9\\/tq+tb0fjua2HOmc19SzRq3s6t38+807j5ebB+RlNO9uuIFnqe+b+vrv1yPnRCU5bm\\/pGuPldwrSgtw91vdN67f3ToxtPXAU677VfP3IlD3TGGL294+iMQ25AnoccIeky7YuHq14AFwNQTAU\\/AX2+NJY7e2369JXJpYAWA\\/MrpMF80jHqnJv0bDLzzjmfzo8Vuobz0x7dyjF0h97xgnksYh67mrw4M8tPjJaGAxNE\\/QW66RIwva1paN4rSjMci2NyLJaoKBLqgWKRMuU7+0hlPB3EaIdgE+Vls5YNx2iQeM3YNCLICZe5UzqSMKxMJRm4oCBSEowrnDWGz3vpB8DlQGR8swEmlSeVY14fbE8FuZIKEHjLFKNCt0A6bZ1UDYmN\\/\\/FAq4KK0AKbguI0T1uDitzOxHsWa5Ch5IN6MuJ+wkUkYGDdKp3lqOqfNry8goX3EGKBPTEzwDJwhCkEIOPZPTRm2EcqwKEyITSqjzm+jEUsLHOpgPtmOCizr6cWLj8EgIIP03lnZrXRI\\/8CzqiAmJM0b4IAAAAASUVORK5CYII=\",\"id\":\"8\",\"annotationId\":\"A1E5DFE164497711DAFFB53361363262\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
