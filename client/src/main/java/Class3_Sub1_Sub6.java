import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
	private int anInt861 = 4096;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
	private int anInt857 = 0;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(29) int[] local29 = this.method4624(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static189.anInt4457; local31++) {
				@Pc(38) int local38 = local29[local31];
				local19[local31] = this.anInt857 <= local38 && local38 <= this.anInt861 ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt857 = arg1.method2163();
		} else if (arg0 == 1) {
			this.anInt861 = arg1.method2163();
		}
	}
}
