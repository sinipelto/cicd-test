import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!ve;")
	public static Class153 aClass153_87;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!sc;")
	public static final Class133 aClass133_21 = new Class133(512);

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!na;")
	public static final Class100 aClass100_909 = Static28.method790("Versteckt");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method3711() {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
				Static31.anIntArrayArray6[local7][local14] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)V")
	public static void method3712(@OriginalArg(0) boolean arg0) {
		Static234.method4017(Static254.anInt5554, arg0, Static154.anInt3711, Static48.anInt1448);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!wa;Z)Lclient!bn;")
	public static Class3_Sub2_Sub4 method3713(@OriginalArg(0) Buffer arg0) {
		@Pc(35) Class3_Sub2_Sub4 local35 = new Class3_Sub2_Sub4(arg0.method2202(), arg0.method2202(), arg0.method2163(), arg0.method2163(), arg0.method2174(), arg0.method2229() == 1, arg0.method2229());
		@Pc(39) int local39 = arg0.method2229();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			local35.aClass69_23.method2282(new Class3_Sub24(arg0.method2163(), arg0.method2163(), arg0.method2163(), arg0.method2163()));
		}
		local35.method665();
		return local35;
	}
}
