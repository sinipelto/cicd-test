import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "Lclient!ga;")
	private Class47_Sub1 aClass47_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	private int anInt593 = 0;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
	private final int anInt602 = -1;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
	private int anInt603 = -32768;

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
	private int anInt607 = 0;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
	public final int anInt598;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
	public final int anInt604;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	public final int anInt606;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	public final int anInt590;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	private final int anInt596;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	public final int anInt599;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "Lclient!tk;")
	private Class144 aClass144_1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt598 = arg3;
		this.anInt604 = arg2;
		this.anInt606 = arg1;
		this.anInt590 = arg6 + arg5;
		this.anInt596 = arg0;
		this.anInt599 = arg4;
		@Pc(42) int local42 = Static34.method877(this.anInt596).anInt1754;
		if (local42 == -1) {
			this.aBoolean41 = true;
		} else {
			this.aBoolean41 = false;
			this.aClass144_1 = Static36.method941(local42);
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)Lclient!ak;")
	private Class8_Sub1 method552() {
		@Pc(8) Class34 local8 = Static34.method877(this.anInt596);
		@Pc(26) Class8_Sub1 local26;
		if (this.aBoolean41) {
			local26 = local8.method1319(-1, -1, 0);
		} else {
			local26 = local8.method1319(this.anInt602, this.anInt593, this.anInt607);
		}
		return local26 == null ? null : local26;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		return this.anInt603;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		@Pc(7) Class8_Sub1 local7 = this.method552();
		if (local7 != null) {
			local7.method4546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_1);
			this.anInt603 = local7.method4549();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V")
	public final void method558(@OriginalArg(1) int arg0) {
		if (this.aBoolean41) {
			return;
		}
		this.anInt607 += arg0;
		while (this.anInt607 > this.aClass144_1.anIntArray474[this.anInt593]) {
			this.anInt607 -= this.aClass144_1.anIntArray474[this.anInt593];
			this.anInt593++;
			if (this.aClass144_1.anIntArray473.length <= this.anInt593) {
				this.aBoolean41 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
