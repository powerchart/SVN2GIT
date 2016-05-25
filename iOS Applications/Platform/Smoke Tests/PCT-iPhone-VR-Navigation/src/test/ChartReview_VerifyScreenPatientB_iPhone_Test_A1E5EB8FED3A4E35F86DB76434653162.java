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
public class ChartReview_VerifyScreenPatientB_iPhone_Test_A1E5EB8FED3A4E35F86DB76434653162 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public ChartReview_VerifyScreenPatientB_iPhone_Test_A1E5EB8FED3A4E35F86DB76434653162(IContainer container, String invocationId) {
		super(container, "ChartReview_VerifyScreenPatientB_iPhone", invocationId, "A1E5EB8FED3A4E35F86DB76434653162");
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
		     log("Test Execution: ChartReview_VerifyScreenPatientB_iPhone_Test_A1E5EB8FED3A4E35F86DB76434653162 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5C11A665B0633D4CDB83866383163");	
			vars[0] = new DataVar("Var_PatientB_Name", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5C11A665FE820D4CDB83866383163",
												  "{\"imagePrerequisites\":[\"UINavigationBar\"],\"variables\":[{\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PatientB_Name\",\"key\":\"MOEB_FIELD\\/IDB:A1E5E094D2954E10F20EB33135653462\"},{\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PatientB_Name\",\"key\":\"MOEB_FIELD\\/TEX:A1E5DFD0BEE2BF40EEE2E26139626337\\/TPM:A1E5DFD0BEE2BF44EEE2E26139626337\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5DFD0BEE2BF40EEE2E26139626337\\/TPM:A1E5DFD0BEE2BF44EEE2E26139626337\\\">Var_PatientB_Name<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5E094D2954E10F20EB33135653462\\\">Var_PatientB_Name<\\/subst>'<\\/b> above Navigation bar\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5DFD0BEE2BF3AEEE2E26139626337\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5E094D2954E10F20EB33135653462\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PatientB_Name\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5DFD0BEE2BF40EEE2E26139626337\\/TPM:A1E5DFD0BEE2BF44EEE2E26139626337\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PatientB_Name\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"}},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"uid\":\"A1E5DFD0B42C4567EEE2E26139626337\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;aspectRatioTolerance&quot;:20,&quot;annids&quot;:[&quot;A1E5DFD0B42EB660EEE2E26139626337&quot;],&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>Navigation bar<\\/b> <img data=\\\"{&quot;aspectRatioTolerance&quot;:20,&quot;annids&quot;:[&quot;A1E5E08EF6133560F20EB33135653462&quot;],&quot;threshold&quot;:80}\\\"\\/>identified by an image\",\"id\":\"10\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAXcAAAAsCAIAAAARnG8pAAANLklEQVR4nO2deYwU1RaH528lBhRERUQWFbe8kYgmgkuARBFwwaghRhPFJUqi4oZRXGLcIhMloqBEQyIuRKKImsAIoizjMAOPVfQRQJgJzcx0T09Pb7V090y9r+vQZckwhn7Q3abe+eV4vVV9+1R1w\\/38nVtdZdXKVqeo+MGNnvtXtOTb2hZnTbuzqs2pDTlro866DueHluLya2hoBCyq2h2nqIi60XN\\/2I2Q5XQ4TqfjtNhOa8ZpsYpLrqGhEbyoSpm5IsLKGqZN0DkikmYmA19SJh0r5yQM28x2E8Xl19DQCFxUWYZZXJjpI8MwfbJNF0MS7maR+TXKErZp2fk\\/TMNIpQnppJOpE3gIchJyIKLiH1mjUlGVMdLFhmUm3U6yELKzJ3FMQcz\\/cAiNUoeRiNN22VZ3xpZwshknlz1R+a1UkrDTKfpZ05DIWfqX4f8xivcyeY7kadLT0fgQ86eXqThHNY4a3bku2mQ8QXheJpVIetbjOMMq2CXPxcghKv7BNcofeJk8L461deNwEeTC5aiOxl89WUXl17aMrWlgNPJ\\/Qll2GCmb6sYyTlR+k+LLxMVYPY\\/4T\\/js2pazrcqm+VfymNu0oMTt5OGSNRJ\\/DfYkD+Pmz1rp2PNrW6bW6OzMmiknm7XTidD+\\/ds2N2yqq9vSWP\\/v+vrNG+uOv41HIkYixrHIT9tlG04mQ\\/tP+Ozalrktbl3GMn2Ot8AalyxHp4ylizL\\/1MhZpp1OybpJqjPW3toSPhSKRcId4bYTEslYR8Zd98m4azSyLkOn4h9co\\/xRZfguCR1DZL2rU\\/R7u4RUuNKUdaOo\\/Bpliq5uJ5U2O+PJtGFZNpVNhsjmuqVz\\/BFPpOxMLtflcKxkyuAocriKf3CN8kdVHhyWfcxtNmnlkla3Bxrj8OXqv4SbOivji8yvbZna\\/JqvZUOBtJ1paj5Uv2nzhrqGxi1b+Yf+8betbdHOVNqyu5ImfLHNbC6bc4yM\\/n34f2yr8lCwzGNt\\/xriZXrRYdwUl1\\/bE9qmKVKsTDKdSqWMTC5rGBb7HcdJpJK8yn4bF2Mz1D7Q3BSNxsLtkXC4vS0SjkSi9KWVPfF4sjXc1tYWOXgoxP72jqjX8m\\/alrZWRkZjHfQZk0jgXQzy29kM50A\\/nTbxNLT0\\/efJWbG\\/4t+VtqVroYwqyLLt\\/H8Juru7DcOQzVgsxqZlWfkZb5rJZDKXyyUSiUwGHFgZV3ZB9LOuGEwGeQub0me8N1L6Mp6EMtJyZRQkp2T1UMW+HVVZpJQJspjAHR0dcIROPB6nhS9sggNAwKbgQ\\/pQAM8jc14g4pFCIJItSJJ74PB3BD2S0J+K1stz1PMs23eiKr+UMoGSf7rKrGbCUyJBFggiCGAT9DDtMTWem2CkRxZPfgNCHiFFwhVJSEjrDfCcDpIDHeFTvKMccSD\\/UVSBlFImIJKJ6tkHIQL1C3QAB1AGIrAplZHjSt7IzGendLwJ75U\\/nvsQuEhVhSFqbm6uqalZsmSJOCN5Ly1pMTv4JknuIcw7Me9sjyijVAGWUiYg8pckMnvFyCxevPiOO+645ZZbpkyZcsMNN0ybNm3mzJm1tbWdnZ0QQcYLZSCI6doQz5KYBYeSctXV1SU0Yf9nn33Wr1+\\/0aNHY4vya8tutWW6loc8oOcIYMnykOdxbJ90aSbwUsoERD0pw2yHC3Pnzu3Tp8+wYcPGjh17ySWXVFdXn3766UOGDHnrrbfa29s9yyMZZNlFDIuX2UubvzhVsEIHDhyYM2fOsmXLpORhgCwJM8Bb6DFdrBxhsvxrNN7Z+rmmCp6UMgFRb5SZN2\\/eqaeeOmPGjKamplAoRMueoUOHjhw5cufOnTKGCgji8BItsCADxqTTlVDDdC9F8VI4HKYaikQigIaOHMW78MR46NPa2kpOIZcUa\\/7rTZJT7I84IDbZWdlvT1VSKWUCIqGM1xEHAQvee++9vn37Pvroo\\/SlSmLOU0D179\\/\\/008\\/ZROy1NTUXHPNNTidK6+8ctasWc3NzdDqxx9\\/HDNmzP33309NJNend+3adf3110+aNAnKNDQ0TJgw4cEHH4zFYjgX2ldeeeXaa6+97LLLSDJ79mx4RPKvvvpq3LhxL7zwAufDJlzjXRx97969sr4D\\/jhKfX19hb8+VSmllAmI\\/oYyZ5xxBrCgDw7k0jXznLpp0aJF+Ijnn3\\/+tNNOmzx58syZM6dOnTpgwABaDAiu5OKLLx41atRvv\\/0mlFmyZAkj77nnHhj0008\\/kZZ3iSsBN7w0fvz4J554AhLx0rRp00iyffv2wYMHX3XVVXJBauHChQyjXluxYgUnc\\/DgwdGjRwOmPXv2VPr7U5VQSpmAqDfKvPPOO3iZRx55ZP\\/+\\/YcOHdqxY8eCBQuY5xdeeOG+ffvWrl07cOBAoNPS0sK0p9LBXJxyyikABRiBDKAwf\\/58qYAefvhhiq+lS5eSFqdz1lln3XzzzeCjtrb23HPPvfvuu+ljT3BMd911V79+\\/b799ltOgzEXXXTR1q1beddTTz0Fuc455xyMD5sbN248++yzGUz+Sn9\\/qhJKKRMQ\\/Y2XYcL\\/yxU10eWXXw5ihg4d+v777zO3eRVTQz21YcMGwNHY2PjSSy8NGjTo6aefhjKrV68GJQ888ABGBmuD6bj66qvhEW\\/kpfPOO++2227D17z++usnnXTSiy++uGrVqnXr1gEU\\/BEoefnllzmBJ598koSwCU5dccUVbOKVJk6cyEl+9NFHHP3DDz\\/0LqurAimlTEDUG2VwLhgN4HLfffdNnz79ggsuGD58+Ntvvy0\\/qJs9ezYcYeell15KmQMaRowYAZUeeughWRKmoqmuro5GoxAEWMAIqX2omLAhU6ZM4Vh4HN7Iq2CIbCCMlzBBDGbkl19+2b9\\/\\/zfffJPKCwP19ddfv\\/vuu+eff34oFIJujGxoaNAr2cGWUiYg6o0yNTU1ffr0oWLCj7BJqXLyySfffvvtcs3otddeAwFURr\\/\\/\\/vsvv\\/yyffv2\\/7jau3cvGRjDeMDx\\/fffY1ggwvLly6EPXmbNmjXAi1KLYc8++yz9N954Y9euXb\\/++it10O7du8lAi9OhTMNDga05c+Zgfyjc1q9fP3jwYOhz4403XnfddZFIpNJfnqq0UsoERL1RhnqEcuaZZ56hAoIOe\\/bsoeoBHIsXL2Zz2bJlAwYMuPfee2GHlC04DpgCaMSz1NbWDhw4cMaMGePHjx8zZgzIYGcsFsPaDBs27NZbbyXJwoUL+\\/bt+9hjj8k9mQzYsWPHN998w7Hk+tRNN91ErTTJFefW1NSERYJQ0Ae\\/U+EvTlV6KWUCot4oM3\\/+fLzM448\\/DgIADXswHRRH48aNSyQSUGDixIlAh+Lliy+++OSTT5j\\/vLp06VK5AYqiafLkyViVIUOGzJo1Sy6Ek7+xsfHMM8+cOnWq3Aw1YcIE6qznnnsOQn3wwQfUX1gkqiq5lQEXQwFFJfXqq6\\/Kr\\/7wVhRZcOrjjz\\/Ouar096cqoZQygZL\\/5iD5kd68efOgDAULpoMKCNZgJcaOHYv7WLBgAROeKmn69OnMeUAAX6qrqxctWiT1FG+Jx+Nz584FGcOHD\\/\\/555\\/lhmwy0+ct+BEwBEfq6uruvPPOQYMGkYT9o0aN+vzzz8U90VJejRgxguQrV66UC+o4KTZHjhzJ0f23XKoCKaVMoNSTMqFQaNOmTfv27ZMfy8hv\\/\\/\\/44w+m9+7du+V3epBi\\/fr133333erVqxkvtwjIrQC8hVd37ty5bds2uZVJ7jMgs6y\\/mK5jglYybPny5RRZra2t7JRf+sod4Zs3b+ZVWeshczgc5qy2bNkij7ZRygRbSplAyX+Xs\\/yiX6okoAAFpKTyP\\/DBLNzBKPcZMOe92xf99yvAF3Ex0WiUDlyQx80AF7n9miTeTkQquXWA93qPjBA8SR65GYo+hxASVewrU5VeSpmAS25Kkvkv9zR6PkV+0WsWlnK81RwZGXclj6SSm5Lkt3OyTix3XZvu8yIkjzBLHhbBq7xXsGX4nnQl1JNsZuFBEOxhfGW+HVVZpJQJuJjS8twG0\\/csO7ES9PERUhaxk6kuD5GRwWJk5LEPjAEZcuck+JC7H+XJNfLMGimyPGaxSV\\/sjCT0bBGo8p7vKfnFQFX2W1KVVEqZQMn\\/rBb\\/s6xkGovvkApIQCAskLVeOCIuw\\/9YBi+zPNUBIojvkBqHvrwF9FBMMQCIMAZ4ecPEGXmwkzuw2dPtSm7sVi8TbCllAiX\\/gotRePClOAjmeSwWY1bL88Nlbsv09jyLJBEuyKtSDYmFkUvOng0BK7KqIm5InnElzkUuLcmZcFDTrbZkcUdMkzx+WACnl7EDL6VMoNSTMnIBW+yDzGcxMt66jBQy3rqMPC\\/GK5rMwqqNjIQ13uqv9\\/8tkPUa\\/2M9TXf5Br4I0WS8eCgGs1\\/OSjLIs\\/Uq+KWpSi2ljEqlKq2UMiqVqrRSyqhUqtJKKaNSqUorpYxKpSqtlDIqlaq0UsqoVKrSSimjUqlKK6WMSqUqrf4LMrJ6mL8U9T0AAAAASUVORK5CYII=\",\"id\":\"15\",\"annotationId\":\"A1E5E08EF6133560F20EB33135653462\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":20,\"threshold\":80,\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAXcAAAAsCAIAAAARnG8pAAANLklEQVR4nO2deYwU1RaH528lBhRERUQWFbe8kYgmgkuARBFwwaghRhPFJUqi4oZRXGLcIhMloqBEQyIuRKKImsAIoizjMAOPVfQRQJgJzcx0T09Pb7V090y9r+vQZckwhn7Q3abe+eV4vVV9+1R1w\\/38nVtdZdXKVqeo+MGNnvtXtOTb2hZnTbuzqs2pDTlro866DueHluLya2hoBCyq2h2nqIi60XN\\/2I2Q5XQ4TqfjtNhOa8ZpsYpLrqGhEbyoSpm5IsLKGqZN0DkikmYmA19SJh0r5yQM28x2E8Xl19DQCFxUWYZZXJjpI8MwfbJNF0MS7maR+TXKErZp2fk\\/TMNIpQnppJOpE3gIchJyIKLiH1mjUlGVMdLFhmUm3U6yELKzJ3FMQcz\\/cAiNUoeRiNN22VZ3xpZwshknlz1R+a1UkrDTKfpZ05DIWfqX4f8xivcyeY7kadLT0fgQ86eXqThHNY4a3bku2mQ8QXheJpVIetbjOMMq2CXPxcghKv7BNcofeJk8L461deNwEeTC5aiOxl89WUXl17aMrWlgNPJ\\/Qll2GCmb6sYyTlR+k+LLxMVYPY\\/4T\\/js2pazrcqm+VfymNu0oMTt5OGSNRJ\\/DfYkD+Pmz1rp2PNrW6bW6OzMmiknm7XTidD+\\/ds2N2yqq9vSWP\\/v+vrNG+uOv41HIkYixrHIT9tlG04mQ\\/tP+Ozalrktbl3GMn2Ot8AalyxHp4ylizL\\/1MhZpp1OybpJqjPW3toSPhSKRcId4bYTEslYR8Zd98m4azSyLkOn4h9co\\/xRZfguCR1DZL2rU\\/R7u4RUuNKUdaOo\\/Bpliq5uJ5U2O+PJtGFZNpVNhsjmuqVz\\/BFPpOxMLtflcKxkyuAocriKf3CN8kdVHhyWfcxtNmnlkla3Bxrj8OXqv4SbOivji8yvbZna\\/JqvZUOBtJ1paj5Uv2nzhrqGxi1b+Yf+8betbdHOVNqyu5ImfLHNbC6bc4yM\\/n34f2yr8lCwzGNt\\/xriZXrRYdwUl1\\/bE9qmKVKsTDKdSqWMTC5rGBb7HcdJpJK8yn4bF2Mz1D7Q3BSNxsLtkXC4vS0SjkSi9KWVPfF4sjXc1tYWOXgoxP72jqjX8m\\/alrZWRkZjHfQZk0jgXQzy29kM50A\\/nTbxNLT0\\/efJWbG\\/4t+VtqVroYwqyLLt\\/H8Juru7DcOQzVgsxqZlWfkZb5rJZDKXyyUSiUwGHFgZV3ZB9LOuGEwGeQub0me8N1L6Mp6EMtJyZRQkp2T1UMW+HVVZpJQJspjAHR0dcIROPB6nhS9sggNAwKbgQ\\/pQAM8jc14g4pFCIJItSJJ74PB3BD2S0J+K1stz1PMs23eiKr+UMoGSf7rKrGbCUyJBFggiCGAT9DDtMTWem2CkRxZPfgNCHiFFwhVJSEjrDfCcDpIDHeFTvKMccSD\\/UVSBlFImIJKJ6tkHIQL1C3QAB1AGIrAplZHjSt7IzGendLwJ75U\\/nvsQuEhVhSFqbm6uqalZsmSJOCN5Ly1pMTv4JknuIcw7Me9sjyijVAGWUiYg8pckMnvFyCxevPiOO+645ZZbpkyZcsMNN0ybNm3mzJm1tbWdnZ0QQcYLZSCI6doQz5KYBYeSctXV1SU0Yf9nn33Wr1+\\/0aNHY4vya8tutWW6loc8oOcIYMnykOdxbJ90aSbwUsoERD0pw2yHC3Pnzu3Tp8+wYcPGjh17ySWXVFdXn3766UOGDHnrrbfa29s9yyMZZNlFDIuX2UubvzhVsEIHDhyYM2fOsmXLpORhgCwJM8Bb6DFdrBxhsvxrNN7Z+rmmCp6UMgFRb5SZN2\\/eqaeeOmPGjKamplAoRMueoUOHjhw5cufOnTKGCgji8BItsCADxqTTlVDDdC9F8VI4HKYaikQigIaOHMW78MR46NPa2kpOIZcUa\\/7rTZJT7I84IDbZWdlvT1VSKWUCIqGM1xEHAQvee++9vn37Pvroo\\/SlSmLOU0D179\\/\\/008\\/ZROy1NTUXHPNNTidK6+8ctasWc3NzdDqxx9\\/HDNmzP33309NJNend+3adf3110+aNAnKNDQ0TJgw4cEHH4zFYjgX2ldeeeXaa6+97LLLSDJ79mx4RPKvvvpq3LhxL7zwAufDJlzjXRx97969sr4D\\/jhKfX19hb8+VSmllAmI\\/oYyZ5xxBrCgDw7k0jXznLpp0aJF+Ijnn3\\/+tNNOmzx58syZM6dOnTpgwABaDAiu5OKLLx41atRvv\\/0mlFmyZAkj77nnHhj0008\\/kZZ3iSsBN7w0fvz4J554AhLx0rRp00iyffv2wYMHX3XVVXJBauHChQyjXluxYgUnc\\/DgwdGjRwOmPXv2VPr7U5VQSpmAqDfKvPPOO3iZRx55ZP\\/+\\/YcOHdqxY8eCBQuY5xdeeOG+ffvWrl07cOBAoNPS0sK0p9LBXJxyyikABRiBDKAwf\\/58qYAefvhhiq+lS5eSFqdz1lln3XzzzeCjtrb23HPPvfvuu+ljT3BMd911V79+\\/b799ltOgzEXXXTR1q1beddTTz0Fuc455xyMD5sbN248++yzGUz+Sn9\\/qhJKKRMQ\\/Y2XYcL\\/yxU10eWXXw5ihg4d+v777zO3eRVTQz21YcMGwNHY2PjSSy8NGjTo6aefhjKrV68GJQ888ABGBmuD6bj66qvhEW\\/kpfPOO++2227D17z++usnnXTSiy++uGrVqnXr1gEU\\/BEoefnllzmBJ598koSwCU5dccUVbOKVJk6cyEl+9NFHHP3DDz\\/0LqurAimlTEDUG2VwLhgN4HLfffdNnz79ggsuGD58+Ntvvy0\\/qJs9ezYcYeell15KmQMaRowYAZUeeughWRKmoqmuro5GoxAEWMAIqX2omLAhU6ZM4Vh4HN7Iq2CIbCCMlzBBDGbkl19+2b9\\/\\/zfffJPKCwP19ddfv\\/vuu+eff34oFIJujGxoaNAr2cGWUiYg6o0yNTU1ffr0oWLCj7BJqXLyySfffvvtcs3otddeAwFURr\\/\\/\\/vsvv\\/yyffv2\\/7jau3cvGRjDeMDx\\/fffY1ggwvLly6EPXmbNmjXAi1KLYc8++yz9N954Y9euXb\\/++it10O7du8lAi9OhTMNDga05c+Zgfyjc1q9fP3jwYOhz4403XnfddZFIpNJfnqq0UsoERL1RhnqEcuaZZ56hAoIOe\\/bsoeoBHIsXL2Zz2bJlAwYMuPfee2GHlC04DpgCaMSz1NbWDhw4cMaMGePHjx8zZgzIYGcsFsPaDBs27NZbbyXJwoUL+\\/bt+9hjj8k9mQzYsWPHN998w7Hk+tRNN91ErTTJFefW1NSERYJQ0Ae\\/U+EvTlV6KWUCot4oM3\\/+fLzM448\\/DgIADXswHRRH48aNSyQSUGDixIlAh+Lliy+++OSTT5j\\/vLp06VK5AYqiafLkyViVIUOGzJo1Sy6Ek7+xsfHMM8+cOnWq3Aw1YcIE6qznnnsOQn3wwQfUX1gkqiq5lQEXQwFFJfXqq6\\/Kr\\/7wVhRZcOrjjz\\/Ouar096cqoZQygZL\\/5iD5kd68efOgDAULpoMKCNZgJcaOHYv7WLBgAROeKmn69OnMeUAAX6qrqxctWiT1FG+Jx+Nz584FGcOHD\\/\\/555\\/lhmwy0+ct+BEwBEfq6uruvPPOQYMGkYT9o0aN+vzzz8U90VJejRgxguQrV66UC+o4KTZHjhzJ0f23XKoCKaVMoNSTMqFQaNOmTfv27ZMfy8hv\\/\\/\\/44w+m9+7du+V3epBi\\/fr133333erVqxkvtwjIrQC8hVd37ty5bds2uZVJ7jMgs6y\\/mK5jglYybPny5RRZra2t7JRf+sod4Zs3b+ZVWeshczgc5qy2bNkij7ZRygRbSplAyX+Xs\\/yiX6okoAAFpKTyP\\/DBLNzBKPcZMOe92xf99yvAF3Ex0WiUDlyQx80AF7n9miTeTkQquXWA93qPjBA8SR65GYo+hxASVewrU5VeSpmAS25Kkvkv9zR6PkV+0WsWlnK81RwZGXclj6SSm5Lkt3OyTix3XZvu8yIkjzBLHhbBq7xXsGX4nnQl1JNsZuFBEOxhfGW+HVVZpJQJuJjS8twG0\\/csO7ES9PERUhaxk6kuD5GRwWJk5LEPjAEZcuck+JC7H+XJNfLMGimyPGaxSV\\/sjCT0bBGo8p7vKfnFQFX2W1KVVEqZQMn\\/rBb\\/s6xkGovvkApIQCAskLVeOCIuw\\/9YBi+zPNUBIojvkBqHvrwF9FBMMQCIMAZ4ecPEGXmwkzuw2dPtSm7sVi8TbCllAiX\\/gotRePClOAjmeSwWY1bL88Nlbsv09jyLJBEuyKtSDYmFkUvOng0BK7KqIm5InnElzkUuLcmZcFDTrbZkcUdMkzx+WACnl7EDL6VMoNSTMnIBW+yDzGcxMt66jBQy3rqMPC\\/GK5rMwqqNjIQ13uqv9\\/8tkPUa\\/2M9TXf5Br4I0WS8eCgGs1\\/OSjLIs\\/Uq+KWpSi2ljEqlKq2UMiqVqrRSyqhUqtJKKaNSqUorpYxKpSqtlDIqlaq0UsqoVKrSSimjUqlKK6WMSqUqrf4LMrJ6mL8U9T0AAAAASUVORK5CYII=\",\"id\":\"19\",\"annotationId\":\"A1E5DFD0B42EB660EEE2E26139626337\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/IDB:A1E5E094D2954E10F20EB33135653462", 0, 17, false, (IDCCoreVar)vars[0], false, "Var_PatientB_Name", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TEX:A1E5DFD0BEE2BF40EEE2E26139626337/TPM:A1E5DFD0BEE2BF44EEE2E26139626337", 0, 17, false, (IDCCoreVar)vars[0], false, "Var_PatientB_Name_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	


		return stepBatch;
	}

}
