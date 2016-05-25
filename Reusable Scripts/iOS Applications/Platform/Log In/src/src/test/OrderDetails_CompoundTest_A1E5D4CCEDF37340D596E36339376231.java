/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class OrderDetails_CompoundTest_A1E5D4CCEDF37340D596E36339376231 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public OrderDetails_CompoundTest_A1E5D4CCEDF37340D596E36339376231(
			IContainer parent, String name) {
		super(parent, "Order Details", "A1E5D4CCEDF37340D596E36339376231");
	}

	public void execute() {

		this.add(new test.SelectASharedBadge_Test_A1E5CEA2F255A1CBEF33B53761343863(
				this, "A1E5D4CD4111ADD0D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (30000 ms.)",
				"A1E5D4CD54C6D850D596E36339376231", 30000));
		this.add(new test.ClinialInteractions_OpenClinicalInteractionDetails_Test_A1E5CE94A73AFB05EF33B53761343863(
				this, "A1E5D4E8F7AB2D80D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.OrderDetails_OpenDoseField_Test_A1E5D0DBABCB4A1BF96CB63532636133(
				this, "A1E5D4CCF5495970D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.DetailModal_Search_Test_A1E5D4C8D90E552DD596E36339376231(
				this, "A1E5D4CCF8BED120D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.DetailModal_SelectADetail_Test_A1E5D4C925AEB89CD596E36339376231(
				this, "A1E5D4CCFD44F580D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.OrderDetails_OpenSpecialInstructionsField_Test_A1E5D0DDEC0EF085F96CB63532636133(
				this, "A1E5D4E9C53F5A00D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.DetailModal_EnterFreeText_Test_A1E5D4E7B9CA60B1D596E36339376231(
				this, "A1E5D4EA352D38A0D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.OrderDetails_CloseModal_iPad_Test_A1E5D0DF236CB7C5F96CB63532636133(
				this, "A1E5D4EA3BD1F740D596E36339376231") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}