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
public class Test_CompoundTest_A1E5CF41C2E57670E63EB36633376139 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Test_CompoundTest_A1E5CF41C2E57670E63EB36633376139(
			IContainer parent, String name) {
		super(parent, "Test", "A1E5CF41C2E57670E63EB36633376139");
	}

	public void execute() {

		this.add(new test.SelectASharedBadge_Test_A1E5CEA2F255A1CBEF33B53761343863(
				this, "A1E5CF41D2F78990E63EB36633376139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LogInWithSharedBadge_Test_A1E5CEA2F25A5CE5EF33B53761343863(
				this, "A1E5CF41DACE86A0E63EB36633376139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LogOutIPad_Test_A1E5CEA2F23B6335EF33B53761343863(
				this, "A1E5CF41E0A34B10E63EB36633376139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}