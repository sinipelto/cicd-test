import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "J")
	public long aLong55;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(J)V")
	public Class3_Sub10(@OriginalArg(0) long arg0) {
		this.aLong55 = arg0;
	}
}
