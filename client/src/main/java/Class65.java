import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class65 {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	public int anInt2867 = 2048;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public int anInt2865 = 0;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public int anInt2872 = 0;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	public int anInt2873 = 2048;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!wa;I)V")
	public final void method2257(@OriginalArg(1) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2229();
			if (local5 == 0) {
				return;
			}
			this.method2258(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!wa;IZ)V")
	private void method2258(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt2865 = arg1.method2229();
		} else if (arg0 == 2) {
			this.anInt2873 = arg1.method2163();
		} else if (arg0 == 3) {
			this.anInt2867 = arg1.method2163();
		} else if (arg0 == 4) {
			this.anInt2872 = arg1.method2213();
		}
	}
}
