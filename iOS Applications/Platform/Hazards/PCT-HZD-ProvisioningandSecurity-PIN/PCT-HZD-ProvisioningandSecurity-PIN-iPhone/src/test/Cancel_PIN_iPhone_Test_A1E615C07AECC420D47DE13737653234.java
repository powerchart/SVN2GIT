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

import com.ibm.rational.test.lt.compare.IStringComparison;
import com.ibm.rational.test.lt.compare.StringEquals;
import com.ibm.rational.test.lt.datacorrelation.execution.action.AssignVariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.If;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Cancel_PIN_iPhone_Test_A1E615C07AECC420D47DE13737653234 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(2);
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Cancel_PIN_iPhone_Test_A1E615C07AECC420D47DE13737653234(IContainer container, String invocationId) {
		super(container, "Cancel_PIN_iPhone", invocationId, "A1E615C07AECC420D47DE13737653234");
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
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(dataVarAssign_1(this));
	this.add(ltIf_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Cancel_PIN_iPhone_Test_A1E615C07AECC420D47DE13737653234 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E615C07AED125AD47DE13737653234");	
			vars[0] = new DataVar("pinHidden", "", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start PowerChart",
												  "A1E615C30AF54130D47DE13737653234",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E615C30AF54130D47DE13737653234\",\"application_package\":\"com.devcernerpowerchart.ambulatory\",\"application_os\":\"iOS\",\"isWeb\":false,\"description\":\"Start <b>PowerChart<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0}],\"timeout\":10}",
												  "/PCT-HZD-ProvisioningandSecurity-PIN-iPhone/Cancel_PIN_iPhone.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button 'Cancel'",
												  "A1E615C0876583E3D47DE13737653234",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E615C0876583E3D47DE13737653234\",\"preferredThinktime\":0,\"thinktime\":39403,\"isWeb\":false,\"description\":\"Think <i>39,403<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0},{\"uid\":\"A1E615C0876583E3D47DE13737653234\",\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> <b>'Cancel'<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"sync_policy\":\"WAIT-NOT-BUSY\",\"id\":\"2\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":30,\"object\":{\"identifier\":{\"expression\":\"currentTitle\",\"parameter\":{\"name\":\"currentTitle\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Cancel\"},\"name\":\"currentTitle\",\"expType\":\"getter\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E615C30AF54130D47DE13737653234",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"key\":\"pinHidden\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"expression\":\"isHidden\",\"variableKey\":\"pinHidden\",\"description\":\"Variable 'pinHidden' is set from property 'Is hidden' of <b>Image view<\\/b> covering Label <b>'PIN Setup'<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"type\":\"TBoolean\",\"timeout\":30,\"uid\":\"A1E615C37D2A50B4D47DE13737653234\",\"isWeb\":false,\"expType\":\"getter\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSetVarStep\",\"propertyId\":\"hidden\",\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIImageView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"PIN Setup\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");

		IDataHarvester harvestContainer_1 = new DataHarvester();
		stepBatch.addDataHarvester(harvestContainer_1);
	harvestContainer_1.addHarvestInstruction("pinHidden", dcVars[0], ".*", 1, 0, false, "pinHidden", null, true);

		return stepBatch;
	}


private AssignVariableAction dataVarAssign_1(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1E615C37D2A50B4D47DE13737653234");

	varAction.add(vars[0] , dcVars[0]);

	return varAction;
}

	private If ltIf_1(IContainer parent) {
		If ifObj = new If(parent, "If", "A1E615C301F358B0D47DE13737653234");
		ifObj.setCondition(stringComparison_1(ifObj));
		ifObj.setThen(ltContainer_1(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private IStringComparison stringComparison_1(IContainer parent) {
		IStringComparison cond = new StringEquals(parent, "stringComparison_1", "A1E615C301F37FC0D47DE13737653234");
		
		dcVars[1].setValue("true");
		cond.setOperands(vars[0], dcVars[1]);
		cond.setNegative(false);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_1(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1E615C301F3F4F0D47DE13737653234") {

            public void execute() {                
                	this.add(applicationContext_4(this));
                super.execute();
            }
       
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }		
		};		
		return container;
	}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E615C07AED3951D47DE13737653234",
												  "{\"imagePrerequisites\":[\"UIToolbar\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E615C3DA971800D47DE13737653234\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E615C3DA978D30D47DE13737653234&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>Toolbar<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIToolbar\"},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAXcAAAAsCAIAAAARnG8pAAA29klEQVR4nO19iX9Ux5Xu\\/B3zZhLbLBJiM17GzmpnnWSW92bmTZKZePLixEkc79gYm+AtHtuxDQiQetMCEjuS2LFYBQghkEBoQ0hoX1st9d533+8975y6UtOAk7Gw2+CE+zu\\/0tXt27er6tb56jtVp079lfoFPxRNVlVZU0VDFUyFs5UkiiMn2QmXFkfm2EXOUER2v5ydVNUUU0VRdbyiaqKmCpgx\\/FFDkQ1FNWTTvUFRdUlDUdlXbjfRKf9uQaaLgxfxI2Na3Nvci7ePsPagsorVRc1EkTSqaqpkVWZvQXRfk6Lip5akWqxo2c3SjA6NNSS3Rf2P92h\\/\\/J7b6virW52BT3tgq3KBJgNrXLj5GMGP3HaGOp+VFFtVWi3xCkEM\\/agto4imLBuyPo0ypqsM6m2HMoQd10AMk2lM0Y0MrDGynpmZo4x6FWIYylwDMWmUkehTB+W2RZk\\/gSB3UOZzPbBJYUvidSst6bbF0OfqbWlR1SnFzk6qS6qDgiBCV6ZQTySRZaaTqLGWolIvSqK5rOe2OvRpLjYFK+55xkUXX2QsEcpNKFJWD4YyVyEmjTKs7xGmuhnF5TKEMsptV\\/9Xj0w0uVFude5mcHyxUUbN6LsQYjjdcSUDbqYE6TG7aDH917MkU21XBZeKkyq6EMMsJo0xHYQYF2XYiZll1JtxOl0W1hW7DXr6+tXcktKKSNCY0sq3PM+ZqduXuPhC59oUkbmWz8qsP5iymLJcnzM7MrpD9pA7KHPLD6xrsBSNj4CpclzScEDSbU4zU6qRtsnTVroLPVllyCpxK4v1kGhiqNjVo6HEtFHUZcnQmAJrhm5YPC8qkkz\\/KGoWLbiZp6xeme1J4CikbUzMNdWkrOom3sjrEmeJcVtJmlm1QGeeKrLIc0nbNkVRxJIYOtIu0dFld2DOHZszGZ1JU7Os5ucTissbNU3TbZANJ8FLWNWO40iShJ\\/KkpA29+6gzOd9kCYkxkGKgCHim9BsEC2I6xA3IGFAygBOR3FS7N+pi7p7MSuSYj8dZT+E\\/zJSgwYU4U5CsZN4gwUc5kS2EpJh2KBbwGtZzM\\/NFYHV21U+iCcpVntjkhOzYVy2sRSi6SDoCIrKa84tz3OmyFSljmBCXIGoZCc1wPMor7r2KQ2HsdfhVntWG8M1VXqDCBYJb1J7wH8xnwmVJCLoGoBqgQXA8QSUALaLlXdQ5tYc2NOCyYOREOMTgiijbsccGLchDDABMAkQYTLJ\\/g0BBFmaPRkDGGYyxv6dnJYQy8AQwAg7wewlAJIA48rUt24TGcnIf\\/DaQg0A9E6nQ+xknNVt8Fbn+Tpxa3uUnQ9OF+S6EoU+r2yP\\/HEZYuLW9sh0hifdhmFCMC4rNggKmU488l6BS49ep7FGZebVrVbBT3R8sVGG7G0hrnEJTtR4gE4BKi7x7xzqW7Gn68UdrS\\/taHl5x0VX8HzpztbnK9qf39n5XEVnltJnKrqequxGeW5n1\\/M7ul7cTrJ0Rxf++2xV7y82t\\/xiS\\/Nvd7S9sK15+faLLwSOv7PzwuvlJ18vr7lN0tc2nfwdyuaa1zcdfau8+vfl1ZjiOV58Zdu55TubfuWveWVH0\\/ItdctKD71WVv3e9hNvlB+\\/HXLuppiZ35cdfmvjodc2Hn1z6+mVW+te29HwxNq9r+9s\\/N2mWizdG+U1eM9bZVPC\\/q3Jfq1+TPq7DcdXbDy6cmPNSqrAk29sOfnWltP\\/vaXmZEdwTAAJiObERV0xbDT9LFO\\/DmXYpKp+B2U+jwNrGY3YuAbjDlyy4JWPxr677sID71+4b9WlJWs6UO5f037\\/mlaUJfnt9+Z3LM6\\/vDi\\/a2F+9+L87iyleetIFq7tundN95LVKL2L1\\/QtzO9bUDi40De00NO\\/pPDKg\\/ktX1t9\\/vtrGrf2Qt2g3NQ32dQXuR3SC\\/2R8\\/3R8\\/2Rpv5QS99YW+8YpvhRQ3+8blA43MM\\/vbbiaJ9Y2881DiUvDkw09wXZF299zt20uS\\/U3he82DNysT+MBanrSx65HH7VU3mqj6sfEM71c+f741hGduekK59D\\/i\\/0f0zaMhi\\/OBhpHojh+YXecGNvqLF74lx36N3ADn\\/l0REBOAdkBwTV5AXJNLQ7KHPLDrS0UxpMGsSNyzoBIebe1R2LfZNzvZGcQAIl1x+b54\\/kBvBfujKHXcye4PNnF8VQcgKxXH9ini81z8fl+IXZAeFvPKkvF6e+FIjmFIUX+UYeLOx5pPDKaQsm2WjfbSKiQaMYKIruaLqp6zqmeD1lkSk6osOytVuDFlU46oCCtxn2Lc9zpmB+LMuinDsg2hC1oDcJr3u2j+kQtSFmQ4qVDouJBSS5dflXLRp8oTo0qQFIui1qVorl07+ndn99x6QKnA0RTqGZBDyud\\/m5gzKf10G1bEDSgH4dfren6+F3Tj7kGVhcFLvHm7jHx6HM8iWYxO7xx+7xJe\\/xJ+b4InMRhrImc\\/wTc\\/zjOd6JeZ7JvMLIPE9sridJP10sfskf\\/7J\\/Iq9k4gH\\/4KOBvm\\/lXzwlQMQCWbduE8G2LuiAomqWrmqmqmAqazaNWNsQMmFFYSWiTFgH5I+yBjpqi3brs50WVTPIuDA01FgZCGUGeFjp2TlmwoRNVZ1go62Sjpm38WYmtyargqKLqoHdJJ4j2KmmgyJhJh3Y09Dn33UiYtI8hsiGgWOx2F8QyrguT+4McVpcb5S0ZPp0u2NU6QrSpt0ub7znUxy6YEHQgWU7Ln191fkHvCNz1gXnBLjZJAITbo7LMvBKUYoITiAyLzAx348SRqbDaE7MJT54cYF\\/fIGPPsLb6E5\\/ePpOupkJneDNJIH0FZLcAMoECvtWeIE3ssCLt6UwP3NL+Lt90bnF0XmB8VkfXv6qp+v7a8\\/XS4CNKbMy\\/7RkvogMueoWxNxwTLfCpwcIp9+XRudM3HPXo4TuT3swKhleJNq0NzPewGsQU2EgCa8WVHWlIE5zTIhEtjz96txfz2wk6febecW9yHwpXY84U81oRXRP2pFyeqFARjPTp4t5jYOl2wambtNo6lrX1ViKkxBZJMZlivb2SDBh0twfkgUsC6sl5t+kqRmP0jM9EqRppz6WpSmtnlZsfdo3J11qOV0PyrW5yvCl0t3Kv9EPE39CVDWUlGYj4WoO6W8U7QkDoQyvWIg+SGXYChXxhgmmPy+U0diBoItwqwJyPOoNNAt0oAm5pAUcGx5P2aABEWnHNmUu7ug01Q8mdnxxKzXhqLxpko0TlYgfqqqaiT43izg6Np1RgF+VNf\\/d2q4FPtT2GFpMub5oji8+y59CyfFFc33huf74bH\\/yLk88tyg53z8+3ze6ENW+MPq3vtjsjco9AWUuGjiewXt9\\/ff5xxYFol8uiCD3yfOFFvtDC\\/2T8330THw4nuR4I7PpyTxi07xAfF5RdI53YrYnhCc5\\/jDKXD\\/+enS+dzKPCE4Sf5eu4HXfJAITpvd5B7+35myjSE3\\/kxcV68fWZCGZsNgEhGU51Px0JyVpBtBgYVIFUTFNLgpKHHRy0pFUmrUVVUVQRVkhDx6VLf6SsGWjIik0105LNDQh7YA3reruv7o7+4vMZZxzlnv2dSuUZ6QD+BEtl1Doi24H475Bt9dBs8VUJV2Iq0JSVjQTiLIJgmChBaCYNKOPRRAMSRAdB1Kigu0qqegyfkUTFZnTDBmblqRbpuWIoizJumI6vGkLlsPJmmHarDkiGZDIqVojyw61lJcVUmaFHE9ESUGg6YuZL3v29TH3AsS1KRSehhLSeZ34D5\\/iVFFyJNkWJTBMZHCYGd60EiIvySlL5XUpaTDmbOgO\\/pzrA4UqgOyPVQJna5IocGgEYVnA0g2Zp6LZ4KBlJBsMsfEBlkjOyFRTbl0ZKtaegPUv6ipv6Jxhoja1B4UVJYeGbRoAlmT8SUvFN8c0Rb0eXr8Yx8xQBg3a5qC8v3mstnPy4lCqvnO8tjN08kq0blCs6ZcOtodP9iQaesO1zV3hBG\\/bNg2Nqzq2NhAmgR8HlUOzmXcIlXhaQqK6fl+fHmWGAX5Z3nrf+j4aDfHHcryTqOGILC7K4AlqO6o9ajuaUXMCqTxfcKF3dJE3Mrcw\\/jfe6F\\/7k3\\/rkecG5PmFg\\/f5eheu7Z9fEJq\\/UZ4VSC4qjs0vCM5eNzqnEJ8QR8nzRuf5kBkJs\\/ziHG+CxoCmkCVMtAiRyx9FZMF0CmUYuk3lAXPlj6ERt9g79r01Z86L5IfyyYuK9WNhZRJZUeKJlM7aNDkZG5ZIjoiO6oDtAKg8SDFd4lGjOJWGIXRTwYaPbVWSDV2TLFNhKGO5Hj3MDS+NMnKGTDk0o6CCTXDGy56DnSr1sWRx4OtTJddtLxNlePJGcXguCY6Byob3oNoneAn7ZDzUVBx\\/JaFDWCF3IUWS8QZsKogIKQUhSCLFExOKzAuqERPx0TLeg60I\\/01qhuRgD2crLtWSBUuiBWL4w7quy7ohMBsEQQY1X0KARVM6Zrzo3d\\/DPJjSNIRp\\/JTFwSuCYtLXseIsRTN4CTQd8UK0zKShKWCbgMXnJT6ONY+oLfKChmCEP61K5FCuGJrEm1IcC4YVi10sIb4ig64IHJ9MCIQvEg0UWURaLeRYiD62rrjcBOHJUDlFE12U4XVTsuBSkH+15OiAQyiDZc9EmWlmetW59AtxzAxlEB2Wbz77q41Nr1ZcenNXx8odF1\\/b2bR8+8VXd7a8ta8br7y9u\\/XtbafXVdX2JSwJYJI3EoqNXRnoHOhJS05xvBiTnRj2rqxRfv4ok1uqUOoZnV84nFc4mReI55XE5xTHv+wVZ3m5hYHQQs\\/g\\/PUjuWvH8CGIHQuKk4gjswvReuLyigU0f\\/D5C0r4nGIB7SAEHSJNaC4VRXOLogQ02UQZPLCVOwbqU0pBAgHk4OdgY+WiqACozDLPYZ+KVgMva2gv0Agikg4d4YdHcVEDNAFpjsJQZnot1XVLgT8pymBLd6loGmXwIkdWiYP4gr9Cjs42ICzibXiCXANAdIykrPHhZBzzj+TFFCKgpPBOQcYnED0DCVFSwr+8CGhIWIxb4XfJrNCJ1ND4C2ITqrpIXAbBCYusGCYC0IxQBolFUuIQZuMClxBkZCJEdpA4afQ3ZQhhTQ6beoLmlQ1VSoHGIbS560fxOQgxPDJKHXFfdBCa+AQyIIlsSRodoqpGOkavRZPpdhNpJg3B4Aey5LJ4t\\/1jVadHHvDrf+kog0bj02UNlTHYl4Cdo7BrHHaHoGIUKoOwfRh2DEHlEFSH4OAgfHRFOHQ5NqzRwH5CMhBfQEsRjZRVzmBUUDPd1SWslj+Nf9GMUeYebzzXE5zvC87zTuD1xf7gPM\\/o3CL+SwXRxSXxvIKRJSWJhf7I7A+7lxRN3rU2dFdhbDYbW0HmMqsgPLtgYq4nnOuNo92EIDW\\/KOaO4CDKzPKEso0y2OZQfxBNkLyMy4CCB1YvQg+SAoOPE+joBqfaUZsmLATs+WXe5qIWHyOT19BQpW00ZKaGHsg+mlpvfbMogycuyrjv0XWoRWNZSERorgfNK5GnJ1sQ40QDsyaFLAvtHl6ykUwpYHKWEEa9pZXfqoWEAsQUAo2GPAuND01HEHGpioXajigm0xAGogyW1JamFm1iTm4CZZgnhIKYgRAmqLZooR1Kik1sUVd4S4uo6oRmJLAUDmCBHJlD+8eFGAQPzAYbCZJtQwbMkCQg6KBtiGiCKC8gPtpAIzvI3xU9qWgRJHQWUiUTLUd37Cy9jNZd4EbYdgdlkMss3VB7MAZLK688s7llWUXHy5WXX93T+2JV94t7B5cdGHumsu\\/lAyMrPxrB66\\/v7qiPk3sofovaGR9DQEGLiSxwWrWsX4cyNws0M0OZu72Juwqj+O+9xdF5SD3WDt6bf\\/n+gv4FpYm7vPjFyKz8URpS8Ye\\/vSm8ML8bWcysYnFusTTbE5\\/jic73xfK84dyC8QWF4zn5w3meiUVFSGfCc7wTCCuzPJPZRhlso9RSUd+YwyhKjM3aYm9pazISFmzutpQQ+BQaF6haiCNEKwTUW06jaQ0RZHauMPhAQ0QTNArsQGYYDUHOEGVc\\/pKJMq5bvWEiAtD6AySzCr5x1E0gxOG4pKmJ2MOYtiWoJlp8CBYGH8XMG\\/T+dTT0yLjmJmRRwuxiihYKIsx4NIoGhWBYKXzjooQ3M6BBRiMyyJDdAWPK7SdGGRTbdLDQDmIDIoKIFeOAZDiiKsiO7IBqAi1bQbwTUeMdk5MMScH8ML6jILggkUFwSfEcJ\\/DI2\\/DAX8Bs0\\/y0ZkdTxDejsjopa9gdJHVbZLhPA7pX17WrJpZPNjXiZM4dlCGUeW3b2T3j8PSm5r3jcGAC9oxBdQR2DsDmPtgbhp0hKB+ETYOASFQxCAeG4WAX38eTBY49LVqwsiyj4ZoUpxbjT6OMOwdh3hTQzAhl4rOLUrN8sXmeSWQrub7JvPX9\\/1w28mwtILWZHYjes35yfrEwv1x5dK+9fhL+tSJxb0lybrEw2xudsy44vyB4X2BySSCyqGDs77enHigcyFs3uNA\\/OacwNKtwHGFlji+74zJ4CKKc0uBIy1j5qb5tjaFdrfHDPWKvQLMntgOKwJsiZ4tRXUJNB9RwATVKl+kFoK2hiRLFu0E7hIW5oaWbnIaiUBP\\/bFCGDDEHM3OquXs0qcYETTBpLcWR5sHOcR6BT9FBN6C+qbNvLJGUmcOIapqmrSoSaijrbATQEiiaIauMF+BvoW1y8GRd45VBDghhaYGVamjk8UKMBtVVQXVUETnc0d9PijL4BBrWUe1LvcmjDSPjUXBsUOMSqFZKBMGBk60jDZfHNewmBVviaVbZQtzRkR4amGFHTdmagEYQZ5K3LsKHLIsidqg2BBNKXGEOLxrsr7+wp+58HOHGhKgO47wek3S2ZJ\\/F0JD1aaCx1Dso46LMmzsb94XhhcrujxKAFObJssYVlZde23VpRUXrKzvbfre3Z+X+gee2NOPFFdsb3t3T8lThwZpeHpuLYeCbFVEE5L82pBfjG6rghom5dhbwkx8zQ5mcUiGvhMspmJxXMJHjDy3y9P92X6IiBQ+WBucWR+Z6E3evj\\/+vwnhe0eTyc\\/DNNU0LC4bvWTeWu27oPs\\/I3xX237uma9Havod8w293wr9Xxu8rHFjkG5\\/rCc1GWykQc6eWsooySNSjGry2pf7FsnOFhy6\\/X3l25eYzrxQfqR\\/gRGzoKmoNDQ8jvRemfENI\\/zls8SrxGkmXUWPRcFEVi5opQowqpFGGZlQ\\/xbgMy6DsvpF3yg9V1PfIhoOgcHzY+mX+vsI9ZxLMI25oQv+9d8\\/ZHh7hEj+NmZBA4040MKtIVQTTUG1dMpS4ptAsgUNOLhEV8jfv3lnXHkOIYaQgJtm8ZCIXQJQhcwlNP0WiAZCZoAymDjfpAHhOBn+86tiRjhQyjkRStCwnpVhtE8ov11e\\/e7AToY03aPklZ0EUU425FKlYs3FNRm4GMbYqLawD0hnMBt5cdfzCyfbRSYs+Kj1c5z94egLIYScFEGc8FI0jzY15prooQ3EUKfbQHZQhi6n05O4J+M32nh1heKqif12zvmsEqifgwCjsHoSqYUCOg1eORmD\\/oPPREPzGe\\/TkGAgAHHU2kmXqsmKkzSU3ROZUeMSpyGYzBZoZoAwq\\/N2eCKJMnjdOM9PFk3n5l56sDFbL8M3y4CzP8P3l+pfXRnPKtLyi0D8XX\\/7Busb713YtKRz+3pbwf+wT\\/m3r+Ffz275a2PcvO+OHAV6tcx4pGb0vEEJONBstpuL4nKJYtlEGOXlEh6Wbzpe2G5PYPQJ0y7Dx9MBzhfvaEsDbNF+LgNI+FGkaFgYFatATElyJk38a+bw6EJKhN0LDmy6sMGTR2ZjIjFEmPcfkjlyq06PIqNJbLoTf2laH+oYwseWy+Zi3buXGY2Mqefe1jhnLvR91KxA2YEyEiyHr7IgyLJETXdykzn9cg56k2T6e6JjgJ2wY1mhl5qrKU1VNw1jkIfw0po\\/zRlIkQLE0fSoyKP60NkMuoyKbSiCyrG8xvv1h7Xv724OIyw7EFAuxoOxM3zder\\/igPhHESlMcxIvWKJwd5K\\/EHMQLbNJY6jAndvPQLsCxfqktCvgoBKM+DlYWHfR+1HYxCsMOlB5vLaq51KtD\\/WDyUljD4uDX3TB97sy6G4fIdU26gzKEMss21e2OwhNVI9tS8Kt94Z9u7n5qR9eP1x1\\/oqT+pV1Xfuw999jGtmeqBv\\/Tf+43pede3dXxXwU1h0fJlQbZCvU5bAA4c1AGW\\/bU6PrngjJkLhWncr3xWetDc\\/zjiwq6nq4cPq7BI6V9C4pGcwuj9xQk\\/rog9t395uYo\\/Gdp28MfNi1rgq0ilAahMgl\\/aAW0sFb1Qq0DFTFY3owkaOJvVw3QoIwvNrcomW2UwQYX1uDF7S0bL+nYMfKyhpYRIshzG+s3XkzhlYGo+ubGY29UNj+74ezL5XVtYacjBsvKTp2ZJP96rKuq8yNrdp3mdIcNQFJLdb3ybmL0lyahrx2\\/dw0oLFTNBLxQemowZYcBXt7T5++i\\/qlu1MAuvfhE+7oj7ZdN6LHAc6TtJd+Bt7bVvlpa0xCCEZkG8srrxpcVn3p7U+0K\\/8G9LdEBgC6AN3c17bwYGgOo7teWeaouj0QEzL4NKaQ9QgoMCZVVUmbGZVwjHQHF027\\/etfQMxtOngsZcbZiu1WFZ7ecf3ZX94d1E0MmLaP3n+p+tvjoa1vqXik5seHs5CBb2721tvOdqsZ3Dlx+aUvDr9YdON4ntqSgpIn70QcfPVlUt+pwf48JnkOXPtzTsvZA23+XVS9dvani\\/ChWAhq02Np58k603CltlVyN9DsoQyjz1o5zO8fgt3vGN4Thp5XjW5NwEeA3W9sPJqAV4EcbOnbwcBYA0WdvHNoAntnRcSIKYRuSIvll2rpCjmSK4tasO42dRplsW0yk8F5ymcvzJxcUcXmlsflrLj2xpfuwAH+\\/aWCRd2DeuvH5Af5uX\\/zRKmmPAj\\/ynfuhr227CM9Vxx9588DSPQMfNDnfWt\\/x7bXNJ1V4rqr34fzWxb6RvEBkXjGtY5jtzbrFRM4mqLdVV4pbaNjClJLIEJHSv38i\\/Mbh4JgJLWNyfs1wvQ3tyLZ2XS480Nqtw+8OXNnQysdsCKvwatnJqrYIah1zOSEewGZaxZv2l8kMdqUyuMFCXZKpQ6obVntteGpL2+4IvHeov6xpsgfgv\\/c1lJ\\/rw1fmvRB7acfFNoVCH5Q2S8+V1CFrON2vLS1vqUkA3tmUgGcKDtdGoBtgRVVbRZd0aNR5ylvdECbTA4lSUgWEErBMVUhyqRgSvRmhDFIJ1HPkR94mZfmRyKpTQf+pngEThhzY3Mb9bn\\/vhw3iu8dGkUkd7o6+UHr4LA99mMNJ+EXBMSTvfQBvb69dUX7iogT9AFtaEi8UHUZAbAFYWT3mb+R6WHgH3+HuVzeeqQ0SgJ4dkp9eU9HFUxAfxBQK5WNYLAR9UtEFUVfv+MtovAW\\/33Dwo1F4uqJ7SwSe2Bd5uxlKBuCnRY35TWr5KPz7pr4322DtGPz7ttH3W6FshD46PE7EXlCZM6jCI8SobgAqap2iizI3CzHqTFEG4WBeII63oeSVxO8t7H2yYuiwBN\\/1dyxcfWmJL7gIUcAz+ch2bq8O\\/1XW\\/p21jYEx2JOC5fsGf5J\\/7Ad\\/OPJdT9e317dXR2FpRffDq1sWFo4sKI7nFKfwWwhh2UYZy7ImDXh2e8f6cykNABQ+KchI5t+pib55dGIY7QuDev59YdjWBwV1kTc316IOezv057Y3DSnQMQHPBo5dAZhGGZpdQoihySaCMPcVzGz0F9+jG4ZOY34f2GFgobC7Xr2\\/pawpdTIFL25ubLGhosd5Y1\\/nBYAXy083jitIZJ7ZM\\/xGnVA7Dgc7U+U98FPP6S4JNp7ofbqsZXcIdvfDri77maK6nZ0mluj1qtaV1QNPbqw73CcgiRgxIWQAap+jaablCIoqiSmLXH9mxGXQyiMjLnAm\\/vax6MFJmkK9lKLm+vvyEwd67cBF4+1DISRTaw91rvvoIsWmMQgs8qu7\\/GeIWHkONpYdOhe1YdyAy0l44v3NTTL1u2\\/s6dpxfnzYpJAx6\\/d2FBwZGmO2Xr8Iy4sOn59wXC6DuUpQCThDi99Bmau+v++X7a1HBavs3DwJP6sMPrZj+Pn9I\\/\\/hq\\/tV+cUX9g3+sPDCj7aPPb4\\/8QNP8y+2dr20b+D\\/rq9F1I+53uKqpIkpCjKoXV3Jrk6vgvkcvPKIxRQlUHJ88S+vCyEo3O8b+u2+0L4k\\/GNJ14NrOx7ZODkvv3\\/O+rHv7RQ2J+BHpW3f+LD+nwLt71+wd4zAaQV8nfDwmo5vFXYeScAr+wa+Udi1yDsxxxO+q5AoUm6WfX9VNmEbVIjLlLTpvANYmUgw+214ubJrTV0M2\\/Sxy9G3djahAbXmaP+yDSfe3X4WUea0Bs9sPtcSh10N454TA\\/0MZfBpiDIGxQUVGMqkzdVPijLMy5+NbkgxFLfD4NkcU9KB\\/a0Trx\\/oR5rgOdqFOoaFfXFL054xeL6kdsKEURt+vq3\\/l5WjH1SdKznc\\/M6xEHKxSzwUHW379YZzrx+bWFnVvupQ94fV3XuvGFiE50tPPFFc+3jhof0dMURSVOAIOeAbqihouq2alqaT0TRTlJE1Whyz4Wz4nepBZExvVl6ouCyej8F7pQeRwqw9FX\\/3WAwpCZpFVS3BEZts\\/wkLCg51vXegE3lKwYHze+vaUja9x8tRbUXpkTaTmNfrFS1bzwwhHmHL9+1v9RzpRyssqMOlSee1DTWIMlhLiNBxcwplTPUOymSgzDvFOw\\/3Ky\\/tuoJc5me7Q6UT0ACwdGdrdRg6AX5R3ro7CU0AT29trQlTdT+7pfVYhCwmTlLJoUOX8TmoKpnrvlwik7mmaSbHDFCGIMATzvFGcouS93ijswrCC\\/L7Ht8T2sXDP\\/g7HlrV\\/HBB16J1VxasH\\/rfu5XdFvxLaed3fZ3\\/p3zo0fdP\\/uD9489W9pwA+O6W+Fd9A6c0eGrr5Zy3GnI9IcQRRJm84liOf9JdxJQllHE9RMdVWLateUOLzLHZikFkLv3wlO\\/4yXHoFSF\\/69Etp66ghow5sO\\/i6DubjyEG9aI+nOwrqRt7a8uZ+jFnUHW1jrSSvMLc1TTs4ex3ZoAyLGC7fh3KuNKTcH5TcubJDQ11PdEkkBny9u62pRsuFNWMRlUa4l15OP7eGd0NaYiafE4mBrSz\\/tKrVRcusnB8iE1X0BgxaATn\\/b0tlS2hEyPa0kB1Tb8kIY2zISY6nGQ7BtFkUeSZ6s3QYjIICMrPj7+9pwEpzP7OsaeqOp7ffXnP2Q6s3j8cH3v7eAgBorTm\\/Bs7jmKWMCf47+s7mzY0C9jg39nbuq2+J2jTGE1LAl7eVH88CecteLe6r+h0cJyhzNZj7Wi3Dhg0YDyQsF\\/27GsOOywENQ2TM1IpmGgxaTLNtN5BGdlwKo+caQgZz245v22SRn\\/fb4cdQXhq45nA+cj+MXi8tHFts7lzDK+c3dwwemRAxXZ2dII8x2h1nyqioMWUXr+rZizYzVxtMJNjZigzzx+ZXTA+tzieW8LN8URz1\\/Q9fjB+FOCFY8ozx\\/THD8lP1MLXioPfKQ9X6PCDkitf9\\/QEkvBGMzy2peet00qlDA9tSD7oD24LwqYh+NF+fdb60NyiJD3NG8rxTmQbZQQWguTNradXHeg4MygcbBlbe7j3ycJDW+v6UVeR\\/JfuPblme01bDE71Jl\\/K3\\/KHLUdGUTFsqB9Tn\\/IeXrG5bkSlqRCsNHfcMT3T524wkrEE+X9GGVUzOPYckONplJliprqJdObF8vonCg6NcQQ9EQd2nhv+yYrSE91yQiGV290NT5c27Lkw2jgovFd1bvW+CyEdBmX4re+g5+x43YReee7y7z3behIwZMGqitPbTrUhEFQ0BZeu2dI1NMnxCuokp4ImibrESVSEmXnlIcpgfYY12H5u4IPK48hT+mTr19sv\\/MR3ojumiGjs1Ax+cLgHkaJ9MrGyfF9J41BdGDxHupf5DiDfQYb1\\/u7G8ppLbtTXxgnz12sqL1sEjv6anucDR04MGSENNh08XX68DQE0mFDGUtqKwO7mkO52q24MYPctqMzt6M4KA42co1UDMX7F1noEl\\/\\/acuUnGy8t3dX12Lrqp0pqXq5q\\/7G3\\/mebO56s7H\\/MW\\/vSxpOv72z8yZrDB0fImwC\\/ixCjCklRUiimxrWxI\\/An3OaebZRZGKBPadY5kMjxJBYVjP1r1cTaIdgWg+0pCESgIAI\\/Oaj\\/49bYGx3ww82j967v+7eDVv4YbErCxhD8dA+PP5GzPvjsvomKKDx\\/EWZ7yaU4pzg1uyCY5wuxxd\\/ZQhmsqIhC0YI3Hzzzhw0H3tlc817F2Q2nek\\/38UhqkrJtAvRPioUHL7627Wzg1GB1t7j1zBVEJSShkyr8xnuotCkc08A0KAACrTZSOUdBGsIho5FYIPEZoYysG+56ArZ7Z5zNxU4PrmkG4khlc3hjbZ9gkmsysobOUMpfeWREcASbHhKy4MjlyLpdp\\/+wubr0QMMQTw4+MQsaY7D6o+43ig8EKo73jCUTKrmP7zp5sb4vjAo\\/qsKB+rYTFzomErKDjAafzPOsbRoz9cpTFdOUTEWCc52T1Y1XoqodNmFve2TruRGsJd6CE5eSh5pCggGSDWd6J1dXnXqj\\/Pjq7SeGwlh\\/5MWz+1TTida+CQ2wUIMps2z\\/iaG4LFvQN8kV7m1Yv\\/tMVIcj585XN3UjhOHbiYiyb3\\/9lYRNy+tlgdPI+8aW0OQkryVaH38HZcjpyDATJhQebj+jwNM7OysjcAngybJzx5J08p8bW\\/dKZDH9clPbqRTR4OfLztRN0GomnjbboGkmGiAkp0c3csfVyCmfnss8sK5nvo+C1M31xlCrc9mSAlR40nCaWoqTrB9fEIjklcTvLgjleeNL\\/OHF+S1fWdf88PtND77b+GB+80OezsWrOx\\/yDC38oHXJuq5FntF5awceLOi778PWr6xpv3dNFz5wgT\\/69VXnv7mqIXdNz4ISHu2vL+ePzfeHXZRxh2Zy2L8oDN1oUSXmgVAmEMH0fs\\/g91ffDMpwTGEMoPgbIYccSZCboPmgY6PkeXcFE3abfRbVCcXQtpgPmGwMjKeW+vafCtLqZ6x9USWXDUQZW4k7ksBQhq0JZnTG9aPJiLSCKGNNcNZSb\\/VltLZ0wKZAi\\/5oDyyGVtO9sevqhi9REGXRIksZ7TvMG9EcxADTESyHedlbCVmlzbMcQMVGqksO+DL58sckGnwdUKlnwicgTxJkg5d0RJSwDhEDOBNSmp3SCDrJRUYSTdPWDUuUydlfZY6LuqrRMkUTeuPm876D3WxLCUIWtnfwlLVOy9QRJkXUfl4mbafVAKKRsFkAHQPiAuYTEhI4DiSTClZ4xIRRjViYyAs0u4eNFrOtWip7HSLFvnPw1\\/Ej27SQIlG5bMytii8oolj4y7ys8MwRETNjyyK9BZVQxpFEF2VEZjGtLJ6K\\/CD\\/0cgPX6TgDzOLYoWtLakTZEywWPZLNzX4muXyPnis+PzqJrtsFP7F1\\/zOedgUhJ9taPuwnt81CM+v33VhRMBajklmStKw0bgQw553\\/c6ENwExkqwLDvTo8JtN7V\\/Jv3x\\/cSIvINxVkEAsmNZtklxvfLaPn814zXwvKj+xDOQaCz2hRd7hJZ6h+wpJFntQhhFZUNyThd4givvvkkK6gmCBX7yvcAAFP3IfxZ4WIvLiJUSjAZpAMM8\\/Ot8XxIvzPZiHOOZhrpdCXi0qHPxG4eV\\/WF3fJDCNncl+T9ORk3Q3uJSr5Jn7PVM0A+3qjhxRhkEnzzZ\\/UFCy93RrmCGUGzImHe9qalM65q\\/BPDhMQ00i+mDrR1V0IxIQyqTg6cDRVrYDDJIT1FhJt92IUOmQVxlZvbp\\/ozod9knNILAZIdCcdOQXd9GgWy4W5spK72np5tm9bToilJn5c277oeXUFD7CkSQH8bQ76fy2+BhaMfgcEDlVoalrhCxVE9mYlM6cbnV3T2FXpKt78rGFRdN5cH1H3dp2CVE6SE06PFiaK2Hqbsni9qaZUb6m9ueWFVpGTysV2OgYhSU0ZI1YW2tQenXtJkSopEZROwVUGOY4n7l7gVuZXxSsmXGsPNlwkMGGRAc7nKLqJorGvq3xzX3dr+zqernqCsqLO9pfrWhfWdW+sqL5\\/d0XCiqOtw2GkybtNYP9g2YTcaWAsjfsLHMTCyYpP4qB3KrXgic2tnw1\\/9IiT2iONzmnSEZMQa1mOIJKHk6jjBvRKovipRg0cwOTcwMhBJpcfwh\\/fb4nnuvh5\\/r4e\\/yJ3EB4kacfUeaHqxsbBeIyn\\/nmc2mhtYuqnVDswYlE\\/1g0IVG7T4pXQ7q5t7kWhDvfR7BFs4FxkCPYwaIGchRdSUeUCSXhqcCxZjSXsIMWBVQP5u+b3X2mZyYUF4rTZcHAxiYSuehM2r9iKINoAkIcUYbwC1uNLjCUuWVbfdOkP4sHkRbiX7qNdOnCCLemfC8HhDIEatOhOa6bHvkUC4w\\/72NmKEP9nhBDhmfJKcukbRyQZCLpjVrEcscYy8XaiejUfyIHRuMWRWZ8kpzNFSMpyClOoJAbnxHKCKo5qdM8y+Mbm1F1FxSM3lMQnbdBnetD2hIlqkLEJIhYk+t65fmTswJZE39qtk+c5efvDiTvKo7fXRSdHUBzKZnj5Wd7lbv9ypcCwj1FqXnesYe8fd\\/Jb61nsfJu3GnwsxKyX4BaKgWyoo03afGhojuGCVdRZiqO2xTK8Cz0zzTKkCoSlzFodWUoaSOXaZlGGfxGOnbnbSOiizK6Yosi2YZXEuaTRUc7b0QZ4jLyFMrciqyqFEfs+ouIMmhPNQ5xq8v2TTIeioahgWaXfN1rvUl9uVXHjFHG4cMgTYKMdDrh6LJtGbYDU9MKiDVJ3rQcvJiKhW3GXbF9x2QnLlu0iMaNcqZppvmZcRlOI5QZJpRpetR3ZbF3bFZhLKdEphFZiokZoph4HjRbQumgnC4cZCWdRpm7iqZQZlYgnuNN5XjFTJTJ8Y39nXfg0fxLdWmUcdv6Z5260yg02WwSdnAiVj1YNnC8O7I7hTKuuAOiaZRxFMZllKkYbi7KPBOoblddlBGvQZns5P9mUhVJ1jUo83Tg8BXTRZnkNMqoaZS5LfI8ndI7AuQywpuebdiqsYdGxdEtGjtXr4k05h5\\/piijsqLyXNw0aCxYktVwPIX0hJy62EprVTNSqRStitRkhU\\/QwiWTYosgi3EhxnX8VVhMkOvszJtDGUm3kGQOAfxiQ8NX1zbf6x\\/NCSTu8nOk8P54jj+cywZN8ITCPuAVFtouSykbBmLjL\\/hzZDTh79KgDFlM3hTSK7SYcorCCzxDD3t6v53fWiel4\\/7q2Ul1Cpsg6Ygvsm5pbL8ESZ5asHpdBFlNmYoOgxaTOypsyyKNy+gmZ1B8qVCKRlI7KLSw7VCUTGs6Qnj28j\\/zVBPJU0KdQpnuhInI2G0CxREWOcwzQxlaVKEpU+bSrc\\/zdIr1GTWhZVxBlOFZYKaIZNBopn5NPENtagbwC3PMeFxGY5vIILWLcZLBJudkw0GIof0fFHJ5d9kg2BQPFU9Uk21Awz5lXr8K0R\\/LuG4vTvXmUEZTFUNPWDBgwQvbmh\\/6Q+3i9d0LkET44kguZtOk0tVw3y7jQCygwVpvOCupN8wGemn0l8Zl\\/CF3XGZhYXR+YRLRZ44vkhuYWOgZZCjTflqimCPu7F12UkM3HJN1hoIo03SyIAmCZNtw7Z1TB00\\/6xQnxdRER01RpFtVo2gMaBqr1mTKWObb381CBTuKRMMabL+RbOb\\/JlLyx9I1R0Kz3oK+hPmi\\/8CACbSljswT5rJoGNiQ2VYwlN6q3LImfA3KCCpZTGf7E++X7IrZhDK0l7bCdnS5FmW0P2+U4VSbNpNXbHKRZntWxTnRAdB1XRRFSeQd20SmIwocRZNRlBQnkKcv20KMFrPJopBM8InoZ4IyhOiKIFlO0Ab\\/2Ynvrzn9wOrWJf7xOd6J9HSyCzGIOHcHeLafQdyd5M5GmueNMpSh353mMmF2MZ7nQZRJzvLFkMvkeYfQYvrm2ssnZUIZWrCoallJVY1Lpmw0Yi3bHW7EK4okS+TLnnHntGDTx\\/4DuwQXZRBKTBqStFAMzYxw2gpv1YBKU1SgShrbzAjVJYv5n3lq6NSiTN2i6RsLhuLqq749IzqijAYKjxlGGJV10nMWzWW67Lcot5kWk0pRQcn833q8acex8+MSuRSp4Ab6mtKLvxSUwf4hpQGmukP4gvDB8zxFJ0QSKvFkKAkpes2GxnG0YwEii2kS31NYcBlDp4W84JifCcrgd2Uuahi0SXbtmPPzonOPrDr7dU\\/Pvev7lhTSxPMSz9CS6clpGqPxhBZ7Rqc+yoLcVzj8QAGli7xDtF+tb2iRd\\/i+gtEHCkbvKwguKQwuxMz4BpcUXvma5zJaTIgy42xHh5SZlTRlkXDGVRHYqLx7PfVx34pZzLnJnNpkEi\\/GpndlHBHhpUB1l0buHgItwCG\\/kqSVxfzfXHmTJoWbiuk0F9HFwdLA4V72KQ0R2hB2wKUJbhlTtyj\\/SVonSWncIG+GGNtIL6LDseb+t\\/07uyZp+UhMo9i15C4wHRHlLwJl1Aws0KZcLQTXZ9eV64IAuEfm+GLm\\/niffvQXnwMKBS2XHXLhqR6Gl6p6\\/2ldww\\/WX\\/zW6vMkaxpceXTN+W+uaUJ5lOR8lgR\\/8burGr6zuuGb+Q1fX9vw1XXnv5GPF5u+s6rp2x9eeGT1ha+tbvjKqrpvrDr1\\/TW1P1pX9\\/PC2hfLzr1UfnpZWV020mVlp5dvvEbcK5hOS91LdFs6rX+h\\/BxmCT96ZeMpFDzBf90rz5TW\\/ay09fENrcvKKUDfsvIzz5fUvpSdnN9seeuWb6p\\/ufwMy3bt8xtOP7mh4f9tbP\\/5houYz+VlJ7B0z5c3Up2X1S8vO4WCd94OOXfTFRuP5+84fvbKOMJ3CgFRMJMy7SD8sSjzBcKam9zBdho1MlBGvgZfaF++G3bhuG5H8c8EZRwxofNJWvYG5AjbLEBNGA5NwJEwHJ2E4xlyNExyJJuCz69hv3UoAgdiJB9F6TpewVwdi8ChGFRH4SM8D8OZCTgXhhNBODaeLakZp+enpWY8Q4JTct1XjoTgKPs0\\/ZVjQbqCH1WPwa5R2BOE4yGonaArh0ezmPmbLzXL9vEgHBmDj4KU4T3BqdrA0h1iBTyWWcDbRpCPj8jEcXiHEU80TB3m\\/SzKmXr3548ymY6b7pX0iHd6Txla+892C+V0UP6kP8WNT55RZmh7LU1EgBMFNaFQtIEkC1I5ZtAu91FGnlMZgkw1bk2ZANkQfDhv0A8hLQ+xWGqTDtkg5JRosOi2bP1x2A0Bq9FKP9HKrkhs7Ez6OLnxZmFaRPPqF\\/FcYJ+mmD2FZRRscpyn+z\\/uIbdWBIMsI9F0JMtxS5SwqOYxz6JN4b45N9tuJbB7bh\\/BTErM5TcuW5xqs235DBrW1K6Zyf5LRJn09TTEuHtlfA4oo9GSM9HRFV03BdlKKcDrtCAlLtoUK1+zbVUFiu0qkagSbcfBdjvNktDepqpuabTaS7BMHhux6Wi056lNxVVpRgwzQYG9TTeWtJLJ77Ih5rQYH5feKFOGLbneyyyYIUeLffBfjdc1EatUU2klt6HSMm7aASrL+Z+hyG4sC1NNmmrcUkWaRVIoz2xlluAuAdVki0qEpVOThirc6jxfFWwhvGKkFIuistNeTibHi3gYhvZJNOi2PW7GX+bGdplZ5usWqmQhzxmZUVQKYqTQijLyZ9Uddy0Marsh87aUADEGYnRaYnjF3YMxS4cqK5YoGZIkqkpK15K6yWmmrNA2yRpekmRBFXkUg3b6otkZtuOquwFAlsRdleP65t2Y\\/pH7HbZ\\/NtvzAEVl54Ymk7c3kN+JZmKlY85lzc5q5m+mvBqtF2dIKakU+9VRWFl43eIMkzMstms47SfHVhjJ2a7\\/mYpBm0A55JvM2qk7hUcrs\\/7kmOZtfswUZa4Zwb2xzNcNwXwOteDOoPOCxIglKrikCDztc6akQEnQpvSYynjOs55NYvO12ToQ4UCmrciwvxRMgzdp6w\\/az1ShraotCuItCjrlD5UW+RdSA1ExBTWrYiP3TqfT8kfvx\\/yItIsT7bJIO8aiyIDCG7pIXQag3gqqkSJiYGQ\\/8zMurES+y7QeUtJFbBIyI7uS5KR0E0HfXcwtyNOl0yQsxa3Oc0blY5VKiuzu6sQlZQkJsY6iSfyf6Ndv\\/+MmR3\\/d42PHaNKjwu5gsHoDu7lRPk0e0EzB98JJInIFPGcHbY7LXobobjmIXQTabgljKqTzn7DgPqXQOJGIjZp2oeZpkaHJ64xbyWQ6opEiKTyv8ZwuocYyHVBdr5bsCfNqMdLptFxzZN7PlkUbugKaaqOJRPtAKoiSlm5Ius5jJ+vIGo3sGyJtPq\\/K2c7\\/DMUwVLRPTVNLmXoC+xXMML5yipqjMz6AL1+zsHRoRlHRNGSc0q3Oc4bQJh8iwgo4Fpha2iD9WJT5NFrzOR+falyGjcXo0yvxrwKNMWX5fx4oQ8M+poH44oa6doMwkY85rXLVZN0Q2NZ\\/CZMGgzGVdSvTD+2zlTSXwV9HtoJ0RiKT2jBVYlm0tabCi5qAbYcUGQsua9PcMEvpnwJEWlt4w7emdm5m8YANle1PwPYks3SKs2+LPHID1E9DlzCl1c9XB0Ruh5RGlGiBEhuXcVQe38UUu9QQ+hl9UaaiHV87LnPLc341VWQe+TimRMhYDbtw476vLxaLcY\\/\\/DxDPlQc1RNvAAAAAAElFTkSuQmCC\",\"id\":\"6\",\"annotationId\":\"A1E615C3DA978D30D47DE13737653234\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
