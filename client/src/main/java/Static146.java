import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!ve;")
	public static Class153 aClass153_54;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[Lclient!tk;")
	public static final Class144[] aClass144Array1 = new Class144[14];

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!na;")
	public static final Class100 aClass100_669 = Static28.method790("gr-Un:");

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public static int anInt3508 = 99;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!wa;Lclient!na;)I")
	public static int method2748(@OriginalArg(1) Class3_Sub15 arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(6) int local6 = arg0.anInt2792;
		@Pc(14) byte[] local14 = arg1.method3148();
		arg0.method2194(local14.length);
		arg0.anInt2792 += Static62.aClass44_1.method1550(local14.length, arg0.aByteArray40, local14, 0, arg0.anInt2792);
		return arg0.anInt2792 - local6;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ve;BII)[Lclient!ok;")
	public static Class36[] method2749(@OriginalArg(0) Class153 arg0, @OriginalArg(3) int arg1) {
		return Static234.method4016(arg0, 0, arg1) ? Static253.method4331() : null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method2750(@OriginalArg(0) int arg0) {
		Static235.anInt5276 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static152.anInt3594; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static99.anInt2550; local8++) {
				if (Static130.aClass3_Sub5ArrayArrayArray1[arg0][local3][local8] == null) {
					Static130.aClass3_Sub5ArrayArrayArray1[arg0][local3][local8] = new Class3_Sub5(arg0, local3, local8);
				}
			}
		}
	}
}
