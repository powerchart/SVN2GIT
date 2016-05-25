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
public class VisitList_VerifyTimeLineIPAD_Test_A1E5E87BDDA3FA4EC810B03838373766 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public VisitList_VerifyTimeLineIPAD_Test_A1E5E87BDDA3FA4EC810B03838373766(IContainer container, String invocationId) {
		super(container, "VisitList_VerifyTimeLineIPAD", invocationId, "A1E5E87BDDA3FA4EC810B03838373766");
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
		     log("Test Execution: VisitList_VerifyTimeLineIPAD_Test_A1E5E87BDDA3FA4EC810B03838373766 ",e);
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
												  "A1E5BE210412B041D600B86366343630",
												  "{\"imagePrerequisites\":[\"UIView\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5E87BF3CEB5FEC810B03838373766\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E5E87BF3D126A0C810B03838373766&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:10}\\\"\\/><b>Image<\\/b> matches on <b>View<\\/b> below Label <b>'Visit List'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Visit List\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAAgAAAABFCAIAAACzEMlbAAAbsUlEQVR4nO1dWXPbWHb2z8pLkqmpVE0e8pCkKk9JKi+p\\/IG8zFtSqUlmetLTS9aZzlSqpxdb8iZrI7XRsrVLlEiK2leKOwFuABeAxHbzXVwSoix127G5tX2+OiUBIEACOMD3nbude09RlHK5XKlUsJDL5c7OznZ2dvx+\\/\\/T0tA\\/wzw6DTc34J2dnuc3MTwmbmpoYfzLvf7o48zTge+ybHp\\/yTU\\/7fTDfjP8OG\\/QlkJGRkQ3AfGDGaVA6iB30DpIH1YPwQftYuIclVVWr1So+OD8\\/X15e3t3dlWW5VCphj2JJGbyVSzBZUWD5Mje+ESjIaimbT+zuzP+3Ip\\/L+Uw+L+WBYgEmjrq2gV8FGRkZWd8NNA4yB6WD2EHvIHlQPQgftA\\/yv1ev66BMXW8GAouLiy8bDcNxGMy2+d9hgcNMxo21\\/uPkxAc2s2Jnvr9ktTBz6swxmHvm7hHupy0jEAiEDxEemcNA7yD5QGARhA\\/aB\\/nfKxRK+Pf8+Qt81nnYEAmAw88GrN\\/kK4ZrppAAfoL2cdb3I1ZbYU6V2a4AWK2DrgVgSC6EQCAQ+gunHRN7ANWD8EH7IH8uAMfHp37\\/LD4wTds7ZljYn5EAEAgEwtujk88FyYPwQftcAC4vrwKBRcOwmk1exQKt8MoLwwISAAKBQHhbeLX6oigAqgfhBwKLIP97q6vrZ2cXtZomPhgu6hcgASAQCIR3g+B2EeiD8EH7IP97MzNz+Xxx6Ei\\/E28iAJUlZleEADi3G4GH+eoIBAKhvwDhg\\/ZB\\/iQABAKB8GGBBIBAIBA+UJAAEAgEwgcKEgACgUD4QDFEAvAGv8y7L2E3t3dPWwBc7ucbrDsEQGiD4w0DJgEgEAgDRZuUhgIDEwDnlll3bbx5OjYnfcf975gOM02RFQJ\\/LZuZh2nfj1llhdk1ngqinSzC5N9sX\\/8qgUAg9BWtGgi3azo3s4Pu2Ot5r4f4oZUARMjPjd\\/HJr+nzBUASMNxWwBaJQBxl033jr\\/5bxAIBEI30WZ0EeZabfa\\/\\/nRwGKwA2K+zO2Cx1gi1JmMNr4qfS8Nxyv9jpi4xW2W2jiKCzRz3XttOq6BAAkAgEPoO58Zix5pomHxT6uvJqf2wBMCTUPY9AmC1BMBxHFHmIgEgEAgDw50C0Gq8\\/HAFoONqHfNV+4574XglAJfUm627afLcFqZbBaS+YFbZFQDDcSzHZX8SAAKBMERo12O37TW818MTGXwJwLHcqpo3lEGvZw9o3bB4k4DbMmzZTD9ITv2I1ZaYU2GWxnewvLYXEgACgTAE8Bp5bYcTFMiJr3YQIMJW23z993TrdAbdCOzlnXZs23auf95ute++unO7Edg2GGs4nPpNTve4lcaxtPAT3g3UUtzOQu2b2xIAmg2GQCAMGrc6+rxKuf1l4D4LwDULezehaXPzumwa7hbr7jFb9nUJgAuA4XjdQPFJ8yzm\\/2OmByEMlmU47WygLdmgGcEIBMJg0dEdCGGp4YihTEy3uL3SN7QDPSSu\\/gtAO+RvV+gL3m92mNnRU8q5caCoz\\/GqgEzTHRjmtFoFErHAn7Fm2OKV\\/u6X294oMBIAAoEwKLyaiUBQn+jG0ujgvXbP9Vs9hXqG\\/gqAc10VIyi+6TDVYEXNTpcb8ZKGv1nVKNStmsk\\/sm4JgNO+R8xdwL3THaY0TLnCqqXT0OSfZNOLWaWoak0oqmF739DvtnUCgUBwYXeMSb1mP\\/Bb2WC5uplS9Qu5ciVXs4oO6jM7KK51uNPDJoHBlACc9v2o2QwXf5gq7qVK++kyLJrMHyQL2UqjYt68Ee6JWe1eQPir43DGclozVqidpvVsZn998k\\/PL+aP0unzbD5TrumOp6XE\\/gQCYTBwOiow3FUeuZZ060xWD7Olg0zxWMJCGbx3mi3LVUPR7SZ7Jfzt2bn1TQCc62IOb\\/PO1\\/W9q8yRrAbTlZDciBQaq\\/FiqGRGFTNS0A9K9f1cOVszUD4w3chfJPbhotDkDQVVh8U0a09VQ7l0MFE7z7OElPD7\\/2b3avNI0TdT+b1CdecqlWs03NHCvHnZcagTEIFA6Cs4a3Uwj+GwmuWA9LevpLCkhWRYI5it7OSqB4q5K9UjqfJ5ybgoNeoOpzrLbRDt4en1UwCsNvuD089ypf2MspUohQvWakrbSNdDJXst29iQGsG8sZlWI7nKUU5JKpqI4t0Tsy1wf4MLgKQ5oPiNrByU8nslFryyj1OJ6Zm\\/D8d3X17k9lQr5KpIJCmppsWLEa22gl5dHYFAINwJwTq2Ow9vxbAyaj2SUXfzjZ2itZFtgvoiRXtHNtaS1WC2DlXYTimQAVl3I2aeOcj6\\/u9\\/p3PrYxWQLfJ3gtAz5VokU91I6+EyW87akSobj6SeheO+I3nmpLCcbGwV2ctEfUfSw2ml3BDdeWxmayaf75fnADrIlII5ZavcWMlpq7K1HKu9PDz7+vHn\\/u2d5StlXXaCCltKaqG8eVnWlaY7IIzPhUz9QQkEQj\\/RGu3lWDZi+auytp0obsrmmmSD5TYlZ\\/GyMhVOwVaS+qZsr0lWsGAift3LFDOqzr+gl5HrAAQAGniaLYbzzVCJPU8YqxKbiGZn99OrsdLCUe7ZTgxigLuzkjV3Cs52popCgO7G8MxCqUjD\\/3qNhZOFrVwlWDZDVbZRtB9t7geiR1u7m8uH52Obx+tZa6PAtkpsQ7KO8ppUtcRcAnzQAAkAgUDoH8RAX0474LFjubaVUjeKLFhmSwl9MpqZDMWXj4srx8rTrdj0fm5bZatSM6RYoXTxPK\\/0OjtofwXAbc6OFSpHUnUzZ4Di93Q2unEa01gFtG6zcoO365YYe7J9uZYxV3NmULbOinpeM7gEOE2TNWsGu8rb+4VGqNRclfTZc+WblbDqtqswdzwBRHP5NOc\\/lHfrbCVrh9L6qay3Em+YJtUCEQiEPqLFe2CwsuGE0tVQyY7U2WaBvThKSyar4yOH6QarMHaqsqnjzHaFLeWqkWJ9L6voVm8rrq8F4OXL5cPD40QiFYvF0+ksFm5aFxCPXcWuUqv7Zy8PriajqfH93MSBtH5Z4CN3W92feO8oMPiXc5uPts6njuSZI2khcrZzenWaSMWTVxfJWPSysHqYm927mjmMTx8lfzO3s57IN5hh2Jro9GM5drbBRhbDT0PpZ3vS\\/EFm5TB1GksnE9lsIpOMd+VSCAQC4Y2QTFwlktnTWBI8Nn+Q8B2mx6JpEGCy5jRER0eb\\/8MyAtn\\/md+YPklPHCf9B7GF6MXBZfoynusSA9+gdJA8qB4LoH2Q\\/72Fhefj45Pffvvg8eOnsIcPH9+0d8fjByNPHjye+M+vn37+YOpXj59\\/\\/Cjw0X1fkbGqAeJuWBXJ0VXRSPB0KfjR188+Gpn75Gngs\\/vjXzya+OrJ+FcPHn7z4PGvH\\/o+H5n57NHCZ4\\/9Hz+c+uevpopcyWo8BRC+R0MRolF12MOFjY\\/uz+AnPhnx\\/\\/v9qa8eTdx\\/NDYy+qQbF0IgEAhvigcPRkE+oKAvRp\\/9anT648fz\\/3J\\/+mdfPkakq\\/MeQiYzG6zZQKAv182Pvhn7+PHszx\\/5P30y8\\/no9G9Hx78cfTbaJQbuNMHzIHzQPsifVwFNTEzdvz8yMuKe8f2Rm\\/buGPl25Mn9R+P\\/8dWTz74e\\/9XDuV88mP35N1OJmlPnlVwGQwjPKdzGfXkwv\\/KPXzyAPHzyaP6Tb8Z+Pfrsy0dj34w8goT818jEx\\/cnP304\\/+kj37+OTv7D\\/06kcByXT94+7Ja2zJLJ7s+t\\/vKB\\/2dfT3\\/y7eS\\/ffPsdw\\/Hv3349NvRx924EAKBQHhjPBgF+fzu4dhvRsbAXb986P\\/5A98\\/\\/25MdVNBuP0jDdbQUBRQbPZPvx39xcj0L0ZnPn00++mDyS8ejH05+vTbLjFwp4HkQfVYAO3zKqBAYFGWCz2sbWK8CRaClyjrh7lKuGBt5Z1gic1Ek2V3iEDNrQ6rueUgXyQWLTPss1e2j\\/MVSbM0URFmsYJlnVb1SN6Klpphpek\\/q04Gy25PW1uMq8aXbMYKU+Gr7aITKrI9qXZR0hqtcXjUAkAgEPoNkbag0GSRfC1UMsF7YL+1s0LFbbMU1d9Yzlhs8UwJlxhsN28cynXFrRzvKUD7gcDivdnZeUnKi02GYfE+kzesG3CbYNOKdpBRgrnGUroRLLNHW7HFE7nGA3imuC3AwXRl\\/jgXVRn2icj6iVwpN9z2AZ4\\/CftYF\\/X6TraxI9WChfqGwh6vV6oGlxDV\\/QbY6MpB4FJdk+zVjB7JqGdF1W0d4GfQnQshEAiENwNzWrkPiqazk1O3ZH1FtkMVdn\\/pOJw2VDfqLdmc\\/ecPs9sFtiWzoMTCGQ2Bcs1yrC6x7yuUbhit4QWgfZA\\/F4BcThab7N50lXQsnswnp2rH2dKOpCM8X8ma67Lz7crxTkqLaSwsm6D+J1un+1W2ltZ3srVorn6Zr9bdrD68BGE4OnNSmhZNNcJZdSdfXcqx5Tib206FLhIXysVpuTITjS\\/Fq1tFFla4hEQzxcuiYrUFoCcXRiAQCN+FtgColhPJFhG5bpVZIK4vx5sjK6f+SOZEcdIWm4xcPQsn17MWbEdyounqaU41rjNJdBkeyYP2uQD0oRuozadw4VX8ea0RTReiGTWUqaxnGrjgNZmt59myxLCwkWfBjL6TquylCsfZgquBovZGTALDmhaLJxv4NJIrbEsqiP6FxDaz0uTUT7ev9oM5bT2rbcnNsKQd5LW0UsM38Ho2x6YqIAKB0F9w+rYcU+Q8Tqq1g0wxKtcisr6Rba5KzTXJQhT7MsOWc4iGbdDXVloJZ0pncrmgNXpNWH0dB8CLHcxsutVeh9lSNFXazVZQFAjmDBR8wmUWLLHtIgvK1k5W283W9pNyvFwReZE8ARDJJApFdpIrR9K5nVw5VNBXciwiS3OzP91PHe0W9K1MbVvSI7nagVQp6s2mq8AkAAQCoe9oCYBIgVPQzbhSj0rqXp7TFELV7by97VIfbxOVLYStu1I1nJTTVa1qu3nue0nK\\/c4G6uUBVS2WUptnhVo4WdpNVfblxp7c2M3BtGiuvp9RjiW11GSin6yYHMx2eG4Mw033j60Vk2W0+m4qt5dVdvPWZT4eGPvb09jmqaREUsXdtHKh6HLTmze4t\\/eRQCAQvgNuMsr2HAAaY3FF308Xoxl1X67vyzpID+wXlTWeIyhdQBEhXWu2ZkZx+NSRvTuzAcwIZlqO2b4RBY0dpUtHaWU\\/pe4my9GUgr97qdJVUZNrdusW2C3uti2eSYJnx3Pvpdvqa18pyomMu6bEMvsrY391eb58nEjtJ3OxUr1s8Z+wWtfpkAAQCIRB4HoWLEF9VYvlKqabBr8AuttNImAtRdOFvUwR5YNsnY9k6kiG\\/16kg2Yug1tuak7Lvp4LTHSQqluuOa35cVqzJ3hpVMUUavgCU29NA2kJOTWb7Yl1mHFx5PsLq7xj263qNtG\\/ihO\\/bVI2UAKBMBi08\\/k4TqtB2OqYDBE0VbEcWN3lMW9CGJ5Azu75TFZ9nhGsYyrkjlkhrZt3pHNKyBu7utl8PAFweG5P43rmSPviwv\\/nrBJkdgP6YrmDyqzW4XbHlxAIBEIfcXsi+JsEaL5+KtyenVp\\/q4Bedza3151Xb58jRnRxSjfc\\/BmtKYKZtZ\\/w\\/4Spa8yqMN5awJt8W9OBkQAQCIRB4TaPdQa1zi1yukV6PTy1oRKAV3G3ANivCgDfYDArmvL\\/EVNX7hIAkwSAQCAMBt\\/D\\/u2pzq\\/J6S7S6+GpDWJO4O+077zka\\/ZHEYnP7cKzfvK0cYbbPCAEIJz2\\/YipS20BMF8VAEYCQCAQhgAd7C94744a774ErH0VADEv1\\/faa679NQLg\\/0MuAHbF4Vmlee5\\/EgACgTCsaAmAaAa4IQD2jai3d7gWAL9\\/VpYLlsV7S\\/YoFcS7gycDcm9NkxlNd51LgOgsZJ+WfL\\/P6stuag3RnH4bw3ph7wC4bNCnQOg5yMvvMbzujo7D+lYJL6rI8VyB9kH+XAA6SwC3ksENg5m80t9tL68zTXebfrFqi0xB5lFx8vdY9aVtq47DM0vz3W0urx3J7MzbSZF+0CYemoGfBllPjbz8fpvgfc\\/F\\/fE1a0sOaL8lAD+EEoAtekvpXgnANByRJtSJSP4\\/YNoqTwjttgHc1fd\\/WC\\/sbWGa79sVEW6DvEzoOuzbJQAs2e1wYzjN7fvDuV3naYXEVGoNmzVtPhvMdsr\\/Y1Zdse2qbenMaZUA2scKWAO\\/hO6aolQcr3PxoE+GrEdGXn7vzeLp4uxOau6Did+6IQCWmzJNlAOG0LxcQg0+iQ5zSyuGzSdV1hg7upz\\/a1aNOHbDsd1uoKbzHguAkGovg\\/fAz4esF0Ze\\/hCMuW08XoL+\\/vyoR\\/UtAfD5ZrJZSdMatZpWqdTwdwitWq\\/pql2v2IpWU+s4yVqzWq3XdU1XmXYUmvy7uhyqVUv1mqJj90pVq+ntYwUqA7+Ebhl8hAuPxeJ4bhoNY+DnQ9YLIy9\\/CKbrnMZUtQoXoxwAj\\/fhRwXJg\\/BB+yD\\/e1NTvkQiVS6rEAREHIVCafiskC\\/KRVkt5KtSsQADSrmCLPFzLqaj+YPfVvOHhXy2kJcKcr5l7oFtDOd1vY3xSy6WDw+P8dzAawM\\/H7JemCTl4eWjoxO8rvByPl8c+CmRdd3wLsOzIOJSSennj8LwUKVSmTt6AQ0nWomAOk\\/S5mMARPIk5mR4jtH+jqQYLEAQQ9tiT3h3iPcRL+qQv5iEd4RlOSgE9P93wR4QAz4jmGgDMHk\\/yeHtdOw2AXu07g6jsJjVZO3M0aUbWR8+AAHobB4kvH8QziUvv\\/eAf3W92c9fBMmLhgfQfmskMKTAGepxALblNC2bd+3n0wvzxt6GbbXDf1cNeAO6JcwW9v0zI\\/9wTbThiPC\\/c5XsfTIRkNltL3urZO+TNZvXo1bByE4fxwFg4ToVhOgF1NkePWwQ\\/YDaoX0DZjNvzmSe9Z8x9kGVAAgEAuEtIIIJ\\/G31AhrGbKCvQUem7N4nzegPeCnHnTNHqHRnXVyjYdx5SL1et+072gE6Rw8JRRdzovHOsBYvGem63t2TJ7wdEACKwAtubDQa7pamWGDcjyZWhYuxLNxn8V7QrUeFhz58DiTW07kDCe8MNxUB9xT+erU9Lbey9uvZbF5XBHXOY2jb13+7CGeo00F\\/SPCon7UfgjvHf2qaIAiR0+L6EMMFWENwhCB37OzcHNctPu3xpRDeFJ7Aez7pfP\\/boYA3PshmLVKw3DVOJbpeb2WUdKxeTx5CeFtce0cod1sDvC08jINfDXd4K\\/wuJMF7GEAF4kXurCzqCkgAhg58CkvbXlpaiUb3xZbLy6vZ2XnWloRAYPHk5CwY3IHLnj2bODu7SCbTz5+\\/mJ727+yERbkBe66tbTA39t\\/d3ZubW0Ap7+TkRHyhF04O5AIJHvC6wdFwHBwkOoFksxKWczk5EFicnw+8eLFUqdROT8\\/HxyexClfCa5qmxePxRCKB5fPz84WFhampqXA4XC6XB31BhLuRy+WWlpYODg6Y+\\/atr6+fneEVDs7NzU1PT19dJbAdr\\/DCwvP19U0R5OHthsf39g7wOi8uvgQDYAdQdHdPjARgWODJPmKB5eXlycnply+XsVoslsHdExNTjLX0H6QAshgbGwcvbG4G8Smej9XV9UbDwFMCMTg+PgX7QyGY6+BAYDEWix8cHEWjUXYroiQMEHCZzzcjWt0uLmJYAMXDlULdC4USPLu\\/fwiFgK+xg+iqh33AFOl0FkcFAovYgbl8ARcP+oIIdwCEjhcTsRqIXpT54FboOryJF1NRKvAdXm34XVWr2PP8\\/LJUUo6OTrAKR8PjUAJEBnjxEeFhzy72FyIBGFLgOdjeDjG3lgDPDQRAdA\\/AKsJ\\/bFfKNeawleUN2NTkTCYtY3XGvxDcCmNB10yQiGB4PG1bW9vwL4IOS2T5IAwHRKQfCkUQ9YMI4K\\/Awkuj6ahKXTjR75uPX6XhVri7Vm3MzgQOD05Ng0m5YuwyiT0LeQX7zM0+X18LNnRraLtvfODQ6sbEuG83cuDYrF5rJhNZ+Bf+skyWyxYi4X049OT4Ahs31rcX5l+IDiylYuXF4kqxoG5sbOHFRVkfSlCraV08MRKAIYJomxXLS0srYG28z3A8gnrEiWJ7KpURJUQ8H3iMngeWwAu+6TkQAXgBRLCzvcuHSzQd6IeIFKAliBaj0f2JiYlXfq6vl0e4BcT4KPLDy2B\\/BIDYEg7tOe6MF9WKjmUYlufnFrOZPMgCjj46PMMWuBvEISKAtdUtLIMpTk8uB31BhLvgMLykiNIuzuNwbiqZE28olqHieIXha+xwsH+C7fA4BACCgd0QDcCz2A1UgK9ByQDlfpT+u1h0vxaAlZU1KAzKF3gcKf3swAF3CGpgbpyI0iK8Dt+LeiHg2dgUgn1EB4l4ZmszhGcFpIBHRzxenBpW1oQf4d3LyysIwOrq6iAviXAL8C\\/K+MViGS4+Pj49ODgyeY5DBs9OT82CEcD7slSCriN43A5GJif8FVWzLa79KBlgAYWD6O4hQsXF58soBFAAN5xA1D\\/2dBICUC5VwfjiDYVb8eai7H55kYC6w+N4heFQrApFx0dYgDxMTfni8STCf3AC61J6cHwJHj8QPmgfXHEPBCG+nTAMCAQWl5dbfH1xERsfn0RRACGA8BE8hzLB3NzC5OQ0Ho5MJof4Ecui3VjUKYfDu0I\\/QqEIjnLLAenOn6C6oIEDLyFcA4UWbTwo9ong7sWLJXh8cfElnIuXE9rw\\/PkLuBslOXEUBCObleBoaAa2BwKLGxtbqlod6NUQ7gb8BY1362Avjo5ORAwH3z19+gzyjxcZzI4iIN5TeFnU9sDjCPbFAxCLxYPBnelpP97xclnt+unhCQRv3IMUbG4G8bSJ0QFd\\/xnC\\/xedHf\\/tdl5r1u476PXv9LoSdq56x4paII\\/qO6t9SACGB\\/Baq2aPtVL1vvIOCue6UZvR0Tecr4q+A2K5rydNeDOIoRvM7XcnFkRlr9fNV\\/TyZLcm\\/hQBHDaKen9QdBe7gYqBYCB80D6+9l6lUpPlAqKJbv0A4R3xSk2fRxC30dnZ31sQgtG5ykgAhgzCp7cH\\/QnHidFhkHBP+71+4mI3r8XIGzVGGEJ4Hfw8GfA+uv0O3g6+nfbMLd6+XXxxQfigfZD\\/PYgMiiFYevZsAgWQrv0C4a3Q6eOOUUJme7zojQEjzOUCbyCJd1TnFBNY7hxNSoMAhgTihRfhGGtTvAfPZWJMUEfP3esxX2JYqasBVHAfXhhGa4y35zu3MNcqELCb3bLFFqHrtVqN3QwHu9IIDJIH1YPwQfsgf5QAKqVSCX\\/j8fj6+vre3h5WWZtZ+jY5DhkZ2RuY0\\/FW3l4gG0LrdNNAXOYIjQGxg95B8qB6j\\/a5AJTL5SqfYKsuSdLm5ubMzIzP55ubm5vhmCMjIyMj+8HaDMgclI4F0DtIHlQPwgftg\\/z\\/Dwh3+Mh7lgO3AAAAAElFTkSuQmCC\",\"id\":\"11\",\"annotationId\":\"A1E5E87BF3D126A0C810B03838373766\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":10,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
