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

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
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
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class RoleSelection_Test_A1E600B6E3159870E49BB63436366230 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(1);
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public RoleSelection_Test_A1E600B6E3159870E49BB63436366230(IContainer container, String invocationId) {
		super(container, "RoleSelection", invocationId, "A1E600B6E3159870E49BB63436366230");
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
	        	this.add(datapool_1(this));
	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(null);
		
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: RoleSelection_Test_A1E600B6E3159870E49BB63436366230 ",e);
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
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E600C57C0AAAD0E49BB63436366230", "A1E600D06F7142B0E49BB63436366230");
		Datapool dp = new Datapool(
				 "/A1E600C57C0AAAD0E49BB63436366230.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("Specialties", dcVars[0], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E600B6E315988EE49BB63436366230");	
			vars[0] = new DataVar("Specialties", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start PowerChart",
												  "A1E600B6E317E270E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E317E270E49BB63436366230\",\"id\":\"1\",\"application_os\":\"iOS\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"application_package\":\"com.devcernerpowerchart.ambulatory\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Start <b>PowerChart<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"activity\",\"type\":\"TString\"},{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"rmot_kind_of_launch\",\"value\":\"playback\",\"type\":\"TString\"}],\"type\":\"start\"},\"timeout\":0,\"sync_policy\":\"SYNC-WITH-NEXT-STEP\"}],\"timeout\":10}",
												  "/RoleSelection/RoleSelection.testsuite",
												  "e73ed4a2f94c17127452e762b4359e2b",
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click item at position 2 in section 1 of Table view",
												  "A1E600B6E336DC10E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E336DC10E49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":5399,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>5,399<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E336DC10E49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click item at position <b>2<\\/b> in section <b>1<\\/b> of <b>Table view<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"position\",\"value\":\"2\",\"type\":\"TInteger\"},{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"section\",\"value\":\"1\",\"type\":\"TInteger\"},{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"Object\",\"object\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"8\",\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Wilks,Josh\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},{\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"_mode_\",\"value\":\"UITableView.ClickItem.PGSection\",\"type\":\"TString\"}],\"type\":\"clickItem\"},\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\"},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"SYNC-WITH-NEXT-STEP\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Password field whose Label is Password",
												  "A1E600B6E34533F9E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E34533F9E49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":1303,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>1,303<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E34533F9E49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":true,\"description\":\"Click on <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"onclick\"},\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\",\"identifier\":{\"id\":\"5\",\"parameter\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"label\",\"value\":\"Password\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"label\",\"operator\":\"TEquals\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"DEFAULT\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Enter value 'asdf' in Password field whose Label is Password",
												  "A1E600B6E39D3F00E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E39D3F00E49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":2688,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>2,688<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E39D3F00E49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":true,\"description\":\"Enter value '<b>asdf<\\/b>' in <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"newtext\",\"value\":\"asdf\",\"type\":\"TString\"}],\"type\":\"oninput\"},\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\",\"identifier\":{\"id\":\"6\",\"parameter\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"label\",\"value\":\"Password\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"label\",\"operator\":\"TEquals\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"DEFAULT\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Submit button whose Content is Log In",
												  "A1E600B6E3ADE0D0E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E3ADE0D0E49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":835,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>835<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E3ADE0D0E49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":true,\"description\":\"Click on <b>Submit button<\\/b> whose <b>Content<\\/b> is <b>Log In<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"onclick\"},\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\",\"identifier\":{\"id\":\"5\",\"parameter\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"content\",\"value\":\"Log In\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"content\",\"operator\":\"TEquals\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"DEFAULT\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button 'Cancel'",
												  "A1E600B6E3B50E1BE49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E3B50E1BE49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":4257,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>4,257<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E3B50E1BE49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> <b>'Cancel'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"click\"},\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"identifier\":{\"expression\":\"currentTitle\",\"id\":\"5\",\"parameter\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"currentTitle\",\"value\":\"Cancel\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"currentTitle\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"WAIT-NOT-BUSY\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on TabBar button 'Settings'",
												  "A1E600B6E3B756B8E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E3B756B8E49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":4661,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>4,661<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E3B756B8E49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on <b>TabBar button<\\/b> <b>'Settings'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"click\"},\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITabBarButton\",\"identifier\":{\"expression\":\"innerTittle\",\"id\":\"5\",\"parameter\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"currentTitle\",\"value\":\"Settings\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"currentTitle\",\"operator\":\"TEquals\",\"expType\":\"staticGetter\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"DEFAULT\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop1",
				 "A1E600C6F4B89180E49BB63436366230",
				 0,
				 0,
				 0,
				 7,
				 1,
				 true, 
				 false) {

			
		  
		    public void executeLoop() { 
		    	
	
	               
				this.add(datapool_1(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click item at position 1 in section 1 of Table view covering Label 'Log Out'",
												  "A1E600B6E3B9C7BCE49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E3B9C7BCE49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":11836,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>11,836<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E3B9C7BCE49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click item at position <b>1<\\/b> in section <b>1<\\/b> of <b>Table view<\\/b> covering Label <b>'Log Out'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"position\",\"value\":\"1\",\"type\":\"TInteger\"},{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"section\",\"value\":\"1\",\"type\":\"TInteger\"},{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"Object\",\"object\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"8\",\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Specialty\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},{\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"_mode_\",\"value\":\"UITableView.ClickItem.PGSection\",\"type\":\"TString\"}],\"type\":\"clickItem\"},\"object\":{\"id\":\"11\",\"locator\":{\"id\":\"12\",\"parameter\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"15\",\"parameter\":{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Log Out\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\"},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"WAIT-NOT-BUSY\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on the item containing Label 'Specialties' in Table view",
												  "A1E600B6E3F7BB20E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E3F7BB20E49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":1756,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>1,756<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E3F7BB20E49BB63436366230\",\"id\":\"2\",\"substitutionParameters\":[{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Specialties\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E600B6E3FEBFF8E49BB63436366230\\/WID:A1E600B6E3FA050BE49BB63436366230\\/IDB:A1E600B6E3FEBFF0E49BB63436366230\",\"type\":\"TString\"}],\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E600B6E3FEBFF8E49BB63436366230\\/WID:A1E600B6E3FA050BE49BB63436366230\\/IDB:A1E600B6E3FEBFF0E49BB63436366230\\\">Specialties<\\/subst>'<\\/b> in Table view\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"position\",\"value\":\"1\",\"type\":\"TInteger\"},{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"Object\",\"object\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"8\",\"parameter\":{\"$ref\":\"3\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"_mode_\",\"value\":\"UITableView.ClickItem.GroupObject\",\"type\":\"TString\"}],\"type\":\"clickItem\"},\"object\":{\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\"},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"SYNC-WITH-NEXT-STEP\"}],\"timeout\":10,\"variables\":[{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Specialties\",\"key\":\"MOEB_FIELD\\/TPM:A1E600B6E3FEBFF8E49BB63436366230\\/WID:A1E600B6E3FA050BE49BB63436366230\\/IDB:A1E600B6E3FEBFF0E49BB63436366230\"}]}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E600B6E3FEBFF8E49BB63436366230/WID:A1E600B6E3FA050BE49BB63436366230/IDB:A1E600B6E3FEBFF0E49BB63436366230", 0, 11, false, (IDCCoreVar)dcVars[0], false, "Specialties", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button 'Done'",
												  "A1E600B6E3FEC000E49BB63436366230",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E600B6E3FEC000E49BB63436366230\",\"id\":\"1\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"thinktime\":2399,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>2,399<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E600B6E3FEC000E49BB63436366230\",\"id\":\"2\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> <b>'Done'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"click\"},\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"identifier\":{\"expression\":\"currentTitle\",\"id\":\"5\",\"parameter\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"currentTitle\",\"value\":\"Done\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"currentTitle\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"DEFAULT\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
