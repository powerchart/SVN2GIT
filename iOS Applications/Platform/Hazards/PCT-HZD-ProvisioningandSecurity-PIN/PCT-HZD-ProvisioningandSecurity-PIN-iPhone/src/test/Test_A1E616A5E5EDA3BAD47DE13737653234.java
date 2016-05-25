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
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Test_A1E616A5E5EDA3BAD47DE13737653234 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public Test_A1E616A5E5EDA3BAD47DE13737653234(IContainer container, String invocationId) {
		super(container, "Obivius_PIN-iPhone-Step20", invocationId, "A1E616A5E5EDA3BAD47DE13737653234");
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
	this.add(applicationContext_2(this));
		KDelay delay_1 = new KDelay(this, "Delay (10 sec.)", "A1E616A9B19AB8D0D47DE13737653234", 10, 1000);
		this.add(delay_1);
		
	this.add(applicationContext_3(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Test_A1E616A5E5EDA3BAD47DE13737653234 ",e);
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
												  "Start PowerChart",
												  "A1E616A37C4907A0D47DE13737653234",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E616A37C4907A0D47DE13737653234\",\"application_package\":\"com.devcernerpowerchart.ambulatory\",\"application_os\":\"iOS\",\"isWeb\":false,\"description\":\"Start <b>PowerChart<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0}],\"timeout\":10}",
												  "/PCT-HZD-ProvisioningandSecurity-PIN-iPhone/Obivius_PIN-iPhone-Step20.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button 'Continue'",
												  "A1E616A2A8FFFB3CD47DE13737653234",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E616A2A8FFFB3CD47DE13737653234\",\"preferredThinktime\":0,\"thinktime\":50001,\"isWeb\":false,\"description\":\"Think <i>50,001<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0},{\"uid\":\"A1E616A2A8FFFB3CD47DE13737653234\",\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> <b>'Continue'<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"id\":\"2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"currentTitle\",\"parameter\":{\"name\":\"currentTitle\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Continue\"},\"name\":\"currentTitle\",\"expType\":\"getter\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E616A62DAA3350D47DE13737653234",
												  "{\"imagePrerequisites\":[\"UIImageView\",\"UIView\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E616A35B581C9CD47DE13737653234\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E616A35B595400D47DE13737653234&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>Image view<\\/b> covering Label <b>'Create PIN'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIImageView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Create PIN\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAF4AAACOCAYAAAC47L9BAAARMklEQVR4nO2d6XqbSBBF83qZWAJ6Q37\\/R5iZxLK2qV7pfREgcDI\\/7idbS4NOlYrqSwt9G0+nx2k8PcZxlGLjgzH2oFyUPgihD0zIA2P8QIgLPYaBa\\/AE98Fj\\/HEEz8WYSJFJRN8nHgep8Xzx+\\/nj\\/PkEXsf3g1Em9ovvH99Pvs+nk6v30\\/tmUvtwFxrF7Q1ub7CvV9jvC+gT3seZEnqG9\\/TxTbyBCHj+RokAL2FxmAOSwHuunt\\/2Ur28Twdggm8FwAZuBRF5QUTq9fp5AjwEX8C3wAv4OwKv4JfB0wR4pjOeg3ey3YIuYPePTqnXgvvj8HEEOg6gx+A7We+DH784+DEKPpXtCnjH1U0y8BVAUTZwCD+R6X7ZSoEX8H8v8CcF3qvvKkM5DFliJPQjwLbV9Qq+n\\/UKPjLQbfAKfm9JZ71d61W5MXU+AX5r+E9nPBtj9d0uMzLbBewj13GSyPxE1iMPun+AjoEfMuAz5eYVWhC8fWAdRX2nVn03ZcbOdhu6Bq+zvh\\/CrI+Cz2R8BHxNnd8qCNVdTRq8e2DV9d2UmX7K9oOSBK\\/hy6wPWkwPfL7Gh6UmVecN\\/I0DMAt88sCq6rs8qHYSsoB+EIqBd8uNDz7d0RTBR8qNAz8XgLFCrwJf7GiQC\\/4YAW9nfbzOx8tNTTuZAu9nfTQAGbU+vzIwLeBHC7zd0Uyz1QHJCVMK\\/JTxMfBDBLxV61UAjLzZaxY8C8GvqYogtIMvdjS9VWqOx3SNz4DHaGor\\/S4nZhnYfbwGb9d5A\\/\\/FAcgcVwR0eLwh4y2rgHcQSfB9F+9qjn6N7x3wBnpsJovTj2noDngr64MA5ILAKvU8\\/OfB0xR4bROYSdNUXkx97zMH1wTYlOxMt9vJFPhoACJKva74+rry44CH27RJFh5YffDY9NuTXdA5AZhsg075Nt7UH0WgCucSK7mQfdnQS+DXUCkAWfAMwNMseGY6Ggc8Ro5Pow0xnd2d9Xfv9PBTtk\\/QJewc5AC4B92AfzH80vFEg+fQ68EzG7yd8Xa5CeEHGmzoQ1hiooDpBNgWjctA3wB8xcF8Aj\\/GwcN7PsOnPQ7edDUEm6yXrZ\\/bb\\/eD7cMPQabz103QcZDNJAG3CvpG4Avw75YEeHj+Ffb9AvubBy+6GgXeyXqMrN57cIIgJkKmbVStYyLTJXCSgMtCuDntFTwLwYMMeGAC4Nl0YLXB63JDzCk7u\\/1DYQ+OvQwvdCYp0HQjmAvBF9Dh8bsqMzd4TxN4Xt+xA34akDILjAUfRwKQVOQAGu1MNsza5zQ6fzttqqwcDni4vVELvMz2BHgn6\\/3M9\\/R0K\\/jlgMfA6\\/8dCegCPNPg6RUYWOCxBB\\/bAM96B74JQDoI4YGT\\/GbAbeXAj3cq4IsyI8ATDp7QT6zBowR4nfUBfCUO1VepE\\/kqtbsMPSuADqISPLXAgz5VfT+jLHgHfjwAe+21XxUEGsqApwL8eCMWeFwNnk1lJ\\/cJ8LsT8ZrKN1NtXL1QpcyOABciAvp4JzZ4wq44Br7GOPLhz+mrt4Y6NwAT6BOAtgXgBXSjGwnA0zOywdfAnwu9xunbk5iZWPrgTyF0KoXZ6Y4BOhcEQoDHCjxWGY+4bPBF+DPAfyXgPnx5guhk5EJ\\/B9hKHDzl4EHkBBl\\/umEOntrgqQV+9D9eT0Cv8cd3AHIufDfbJ+hIgIdb+n5HGr4BP14RYQCeWeC9EyET+DELPumrpMDvAGCbptV1TMtAfzfyoCvwBv6NC7WADzI\\/09Xkwcez3VnLs1tFwI8nB7oGjzzwQwk8xm3gW3v2r15m1gFPK8EXevg\\/NePJGhlfW2ZqZqnprN8z\\/LYa74N3ajzJ1fhcVxM9sJbB25+er1xu0u2k3UraXY0NnvfxKfA1ffxTZ4Q88F8UfraPpz5800pa4BmApx742gnUU338+AjKzUz4rFFLQPdnr8HMdZq1WhOocZpAkdQEKgK+eSKVqO1L+DONtmyg5Ng56IV9SNoG7JT0anDKq4mBKvo3hdlqC\\/i5gBcJRsO+UWsmq5zJB7VMMlprkpVg1cJuhV4DKmXDlrQU\\/Ib9E7Yw9WzhqB+f32AebuvzWt6Qm1GRj3ZG\\/uvWzPz4GaixfCJkTv2dqxLwmPVarUgQ5oKvCELinCsJT\\/3VHFyeVsXBq3jg0h2D7BrqxNwAFMG3djzpYNyZXt7BpuUd+mS3Wd6RBP+q\\/jjSI0f7ZOpMUpLCvsws04Zvaen3ZdbVjGpdzegt76DT8o6twMfgp6DbcIeEokHg0Om7U3Zs6IuDH8MFTSy1oKn5y1czNHryfRDbC9HgSsBzAdCB02M6WR\\/Zn3nvTYG31056S\\/jUgtUtMz6EHxhQ1DWgasE78JldbizwYwz8QhmfBM+8tZOblZp68C3QY+BxEfyCpcYHz1KLVncE3ik1bD54XJ3xfwT4SJ2P1Xj2XKnxD677KTWbg5+UPoN\\/cuzWGvixjibWTtK1u5ox39XsB3yyjw9OMlQpBj3ax68FPlgfn1imvSV0f+YaLI2j4Yw1BB3OWs3MNYDuzZSXhh\\/9YsJOwJs322oZVFoFKeg5y2AR+HKs6BcTuFfjgN+nSWZW3uqFoKrmV\\/gzRtPrcxbxCu8pDd4yyTYHH894D74CT3LgnU9ICP1V4DV0A55+IfDRrDedTn22vxp6e8ZvdGBdvM4\\/UdvFtpc7sJbBk43B+0Hw4dd0N8kDa6GTWRR2CL\\/uW397AG8+ATP7+aINvF7vbmu\\/7WQS\\/OjOYDX4mhls3I18wYmPCvA7nLnmvflWz8bJes+f0f57zINfHHzWj9+JV2MHoAb8s45kHPxKGf8VTLKXgB83Br8fW\\/h\\/8DsAnzv\\/6n3zoqLGa\\/D1Nf4F4PdbaqSK366r6GqySzrG1VtJA37nXU0ceu5rjTV9fHYtzfrwv04fv9jMNWkbvHrm6q8k29HM1fZpmryakkOZWDeZ8+G382p+B3fSdigjtvA+3cm9Q6eN4De0hr+EH5+D3pztvjtZmfUrwN+fH1+u6wss0dbwqZ39+S8oOPv00hq\\/wYFVto7Pn\\/yIri6ogh\\/vcBY8wFb48Ruujy9eB4ZOfXvzmhq7n6eZdTXr9PX77+NLEybvq+rVq8hKi5q2Xh+\\/0cy1\\/hoBuAJ4NgAsYpg5FsIq3s2e\\/fiyG\\/nMFxJKS7TL4BfK+H2bZBXXgZkJvm218GLvbc+2cOWVj1bIeN8mfsky7X2A\\/7Nr\\/A5KTYUNXNnR7K6r2bMfX7WOpuC\\/Z\\/v4GvB\\/Sh9vL9t7ZtYaB\\/3Mcu2IZ7NUAOz18Vv58aX1kT702V+jj0Fv8Gxm+\\/TNXs0GLmTWjay1gSvWT6bWyq\\/oWG7vxzcD96Ab8C3wY+Dp6NjEawaA+eC38OMXAT6j1ISZf8oGYCH4r\\/fjm8+jWnV4FuiGQDxT+533tGiNX+Gg6oNPrhpYA\\/STn4hF1tNvuT6++prrtL1PX0KlPn\\/mJGvbPt6HH0CvnJmm4D1tIxRmtwt8+3sLP\\/656\\/G2mmBzVe3nPLeefks\\/vnA5lCcNsLXgL2wdb2mS7R+8DX918K+xhSuuvGSVmq2h\\/yYZn74OzVKXvFo823Pg2Zer8W5XU3MdmlQA5nQzxUwPoH\\/ZrsYD7\\/XxKb\\/91b18cF1KWl57Mwf8y\\/r4OZ57q5o8+kq\\/fv7MtcKPXxJ8rVfjw\\/fleyuzbYWYT5PwakrXPRBKQ9+HH9904qMQjCAotdmcAF0DfH13ciXwOfi+RZy0i9lo+emebZwCbgJY9uFL15hvBb8LP742ALFPQs5CjmZ+ppT4Y9bsy4yzUNuuj\\/fPt84JQtK7z5WXhlKSA93UTtaA38OXz3KrDrJdUKrGN3QqzAO77Pr4F3c1iwSipvdnXi\\/uT4Yq+vIVv+u6v3U1LfDDGl9e5LTh1VVd8HteSTap8lryER8\\/KhWYvV6vZhdrJ334zHM0c2vmfd\\/GP7FRB369jB\\/3t1q4HnzurFUJ\\/K4uFLRP8JWnC2kd+PZLly8ZgFMc\\/H5LjVTyR1oKGR87wCZXDowvOLju88tnZeizLn+YsHr\\/byct0LnZrAM+sI9T0KeJVPUPb2nNfU+1lsHWV+8oWwbhRZ1rbWBpG4hfmqw2w5Z5P+J3Du+WvJ+cI9ZPzqGPb7Wm0avkuIfUcidB2Pvb\\/99+LvXgr7vf5gcmJXQqwQP0G2S6Aa+yXYN\\/7jdb1xDVssCRJ2WPIX5rXI298nsQ0PnPiqpsvwHwK2T6BfSpsl2Br\\/097heIJkQalRrnBfsP0Okdsvwusl2BB+AX0AR+yICn3q\\/R12gJyGuCbw1G\\/TiaAbsTAE8UeLh1wSML\\/DOA19ca4JffN3e79MGBG8lsv0GJuSIFXpWZ8zAMewXvijToJftAkhLQMSF3me30hgE8ZPoEfuDgcxlPGrUy4M2DHkBmRliIct2xBR5uBXgE4JEAjxX4WMZHoMJHJqlZAVgpsKRm7IZxfNjYEhKi+u87wlQIK\\/DoGfA54LPgt36a1gpoTbZb0F3YUoOr+4C5AD6AhwBM4FEl+FroAfwZYJKB3BF4G3jPhUcQ07pLueAHC\\/yQrPEbgK\\/6JLWAr4Uffa3XtXDglIbQBfDx0QkxdTveOwUfnnODzL8NSIMnT2Y89pQC1Qhl0YAuAn4KgAFvsn000DnoY6j7EaAfBfzxBgEA+Bw8MeCHZDuZgQ4tkVAKfiv4xT9JFcFtKzUTeJnpowP9AHrDJ6XxznUQYpD5EnyP6LUH8BAAC7wsNXcjIkVEO6SEyR1gR8Ufc54LosQaL6bYNgrSr8mO27iN0phEzEIZdCdS\\/MDZE15KeFZLwG\\/odP9h6U2IP366wXNuUHauNvghB74Wegp+9g3lgGBLOVgVwGsDG99XaXIJ8EQKafBYgpfQRwH7L62B3\\/L7+OMS\\/BGxa6fBIwUeoOtSU5fpyFNN5pMCDJwObioIsXFbgefGJCYBoRenVGT7BJ7JbNfQh1EA\\/64E9924IPNv8JyrAn+BLucT4J97DR6hXxz8zRfhHoMW5rMvHBV\\/zH4u7HAwVlTE20ZB1eNGtuNvS9+Xfh0zIkLjDYGgvt+g1NyOBKBiCZdD\\/gu9WzoJQdZfJXh6OUK2Q7n55NBBAB3\\/AvgWeH8nbeAI3xBCjvh9TQGIQMgF1h+zClpqG6WgRsaUJheD2Se7Id4aEl6zR1FCJuig4XT7rgR\\/X+FTcP0BekPschjoBTL+s4Ns7wYAL8qMAP\\/zG+FGvS0sbEwphGHWhbLiz9HP568NxouM729Dy4yn1TJuaTvYGy87JhWCaf8VJkJXKDNXKBdXfrA8Ig4V4II45O9CJ6VRgWeXHwD9ANCPCnoH0OH2F8D\\/2feDAM\\/PjlyUZywlGn4kNaALHAyi4o+Z54GUCyekzrqEY\\/vjV8ge1x+7tB1\\/W\\/o+\\/7nhWFIw84SOhPJywbOXw7y8CbDsApAv3+H2ez8qwX1ciH3+AB0Hej4O5Hzs8ceRQ+8l9L7v\\/+Xg+UnYT3VqapKY4qJJgyfrMf5c57UgPWZ0bDV+sA1UHtcZmyjltlMh81piCUvBtP9z4AdHzEsGwAQdFNi\\/Bq7x87uS\\/B8eA+BvoEM\\/QYeM\\/9kB9A6gd13\\/zze1zmMSMucF9dkSPtOKij\\/mPBfEXx+MmRrb2kag2Li5sWu2U72v8jrvSAl6cDgw0jNk\\/BkOmOeDAMvOP4ToGbLc6EcPjwmRjwNAPwD0Y6+gdxL6sesAfAaGgdxLwUdESP9fCkJSQz6gtePqYNRsKxfUcLxJg+xGhHi95qVDgIds5pBd8fvIB9fbQH69Cej45xGgH7vh3yOHfuz+6bru72\\/8jLeRau6N+uEDQGfFn2O\\/ho\\/hjGmNHRs\\/tQ39WNXYpe0kpJ+bGgv67Y9eCPMDIy8ZQgcOVgEOhT\\/eOoDe4V8HAR050OH2b7j9+z\\/nGC50RqRpFQAAAABJRU5ErkJggg==\",\"id\":\"11\",\"annotationId\":\"A1E616A35B595400D47DE13737653234\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}},{\"uid\":\"A1E616A34975DCD0D47DE13737653234\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>Create PIN<\\/b> on <b>Label<\\/b> below Button <b>'Log Out'<\\/b>\",\"id\":\"12\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"currentTitle\",\"parameter\":{\"name\":\"currentTitle\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Log Out\"},\"name\":\"currentTitle\",\"expType\":\"getter\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\"}},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Create PIN\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"}},{\"uid\":\"A1E616A3520294CFD47DE13737653234\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E616A3520294D9D47DE13737653234&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>View<\\/b> located at position 6\",\"id\":\"21\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"835BB2BE68E6A62430C17814008427A5\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIView\",\"locator\":{\"parameter\":{\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"6\"},\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAHoAAAAMCAIAAAAiQD5vAAAF\\/UlEQVR4nK2XR09VXRSGz19zIiK9XbogJQQS6gBIpMVEpIQWOiSAIlIMRiCRFqoUJUSKE9DQmwICohJw5JP7xhuDH8RzPvcA9t1n7VXeVbdx584dm812+\\/btrKysgYGB\\/f39nZ2d9+\\/fz8zM3L9\\/38fHx8\\/PLzAw0Nvbm31QUJCXl5e\\/v7\\/N5AoODnZ1dUUW1\\/np4eGRlpY2NTW1urp6cnKysbExPT2dnZ3t6+uLFNH8k4XaaOvu7p6Xlzc2Nra3t4eB6+vrIyMj6enpWI1pQfbl4uLC3ix\\/T09PjII\\/UmASFhaG8rm5uZi2u7uLddvb26CanJyMyQEBAQb\\/uNbU1ITZc3NzDx8+TEhIwHKU+\\/LlS1dXlxQSRiEhIcDBNQtm3717F7VCQ0NRqL29\\/fv37+Pj48XFxbGxsQUFBUNDQyjAOfwBHR+bFfHnggkowK2jo+P09HR4eBjrYmJiEPrmzRtOOAdxaFAp2L7MikBb8AGQ8PBw4gmf9fT0fP78GfRycnJSUlJw88LCwtevX6urqxFk3Lx5s6Sk5Pz8PD8\\/HzjARZiiJdF9cHBQV1fH3t++EAB3flpQS5z5W1paenR0VFhYiJGoCCgc4ktAB4LGxkbOLyH+l+hfugITWD169Ojw8LCsrAwsMAFZhCTiKioqyOPKykp0k2kWsoqLsFL2461nz54RzjjVzc1NieVtXw8ePPjx4wcIG3h7c3PzyZMnUPCZO87Ozmw87au2tvbTp0\\/QoApZAzpyhlm1UIi4hmFkZCRZ9vjxY\\/bAgSqcCxonJycg+PDhQ2JiooqYw8fC8ZoidomMxR4mxBcMwfTWrVt8Qgr5Lhrsffr0KeUFi1APegvRzV3VEJQnTQkj\\/ApKxLtQUkLjEkz++PGjUVRUBKBcgEJmAyupAb4gwt+trS0CnL3uQ6DaYmrBGQ6AW1NTQ+mMjo7GqTBHXVTBTuxXESQSoVGAO4BTsF8P9+9kqiEwoUgCKGiifFRUFLIgQKgokUswUlvQzXatO69acEaKj309f\\/4c0\\/gprPmrOqy2hzNoUUZDQwNtCnm6KZGCgAuQdnd3U1jZgIV6nYUowMNYeOPGDcrlxMSEzd5k1FjkPPkDiX19fS9evJB3\\/w\\/cXIcJyg8ODipX1KwU9eiDOfx8+\\/Ztc3Mzkc5XC2GkzqeSMDo6inWyAk04VHFmExERAcHi4qJBGXn9+rWiSamtzGKjkkr7osmgENc4UZ0yq5bNXhmxs7Ozs7+\\/nzJKiEkzQSPoEUHSvXr16l\\/BTcuiGSjSQVO4SzStm74FARIdn8waBSvdooAwjQA3PKWPEHekKRIZ9gzKJSkAuGqyqrDyP3TA8e7dOzoAuMtR1mo3fBAMB7y7vLyMIKSoaMIZWfIH\\/OnjNDdHq\\/T\\/ta7nf4nM79dqa2uDIWwV1DhVsSJ\\/oMDa2hqVHbgZUTQTm1pyMxvC8eXLl\\/Pz86oekoJp8GQPDaLpkUZcXByDS1VVFZGvGqKWivEQpaamUv4ZG5V9jnOzasFTJtF1z87O6NEOneRmmGP8vXv3mJHob9bg\\/v1EcDPdI44nhRysTyq1SEcNhl2qKpkOLg6Cv18aqxSadHim28zMTFUtTpgLiHogxXY6BG3JAIKWlhYwRSfoIFIxAVb0oJlSkjhXRKtqW4BbTyQABVa6BWrBXBmnDgENJziewk2pEVhXQfnn+k8COMCKoKNbxsfHa85DlmpLUlISWLe2toKA2qaF9wRy1fO4znDCi4ZSQXQS7MonXAjinOB1DDc0kFFP0YlHDTZT13EUFY0HGG0NjGSM40lpTS2bvT2qa1OdMRURBLLEMY1cXFzw8NG4Ypb\\/VUuTPrPA8fEx4khlxGE8Denbt2\\/Yq\\/nB0UIt8Ndd1IYPE9fk5CRBQ\\/tlT3vIyMigXfOC6+3tRRNDtRgPU8SXlpZQApS5QFHjIaRk0VNV6a\\/wN6uW+CALtTAYhzOfMhiBws6vhQJyhgWzr1pyHgyZZZloSWfs4o1HGeVVBYHGcMW7Bbs0e3BRs6ym5\\/r6+pWVFaQgi3fi7OxseXk5lND8BC9L8aKpSB5yAAAAAElFTkSuQmCC\",\"id\":\"28\",\"annotationId\":\"A1E616A3520294D9D47DE13737653234\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
