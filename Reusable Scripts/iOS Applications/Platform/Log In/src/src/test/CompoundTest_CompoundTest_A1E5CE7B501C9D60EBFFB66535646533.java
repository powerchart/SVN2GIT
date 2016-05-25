/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class CompoundTest_CompoundTest_A1E5CE7B501C9D60EBFFB66535646533 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_CompoundTest_A1E5CE7B501C9D60EBFFB66535646533(
			IContainer parent, String name) {
		super(parent, "compound test", "A1E5CE7B501C9D60EBFFB66535646533");
	}

	public void execute() {

		this.add(new test.Test_A1E5CE7DCAECFA53EBFFB66535646533(this,
				"A1E5CE7DE227EF50EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SelectFolders_Test_A1E5CC4997173F25D9E8B43733386336(
				this, "A1E5CE7B91043720EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SelectAFolder_Test_A1E5CC4991B7128ED9E8B43733386336(
				this, "A1E5CE7B8A43B320EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SelectOrderAFromSearch_Test_A1E5CC45C7CD7C59D9E8B43733386336(
				this, "A1E5CE7B9C76AA70EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.NavigateBackFromFolder_Test_A1E5CC4AB11CABCDD9E8B43733386336(
				this, "A1E5CE7BAFAD2F10EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.NavigateBackFromFolders_Test_A1E5CC4AB22989B9D9E8B43733386336(
				this, "A1E5CE7BA835B720EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SearchForOrderA_Test_A1E5CC4518026EF5D9E8B43733386336(
				this, "A1E5CE7BB546BF40EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.CancelOrderSearch_Test_A1E5CC46BE714945D9E8B43733386336(
				this, "A1E5CE7BC90C3D70EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SelectOrderBFromSearch_Test_A1E5CE8310050541EBFFB66535646533(
				this, "A1E5CE84A05B2180EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.CloseOrderSearch_Test_A1E5CC4628946B05D9E8B43733386336(
				this, "A1E5CE7BCEB84430EBFFB66535646533") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}