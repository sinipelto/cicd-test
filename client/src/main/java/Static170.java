import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
	public static int anInt3245;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "Lclient!na;")
	public static final Class100 aClass100_619 = Static28.method790("Lade)3)3)3");

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "Lclient!na;")
	public static final Class100 aClass100_620 = Static28.method790("sch-Utteln:");

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lclient!na;")
	private static final Class100 aClass100_622 = Static28.method790("Loading )2 please wait)3");

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "Lclient!na;")
	public static Class100 aClass100_621 = aClass100_622;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
	public static int anInt3241 = 128;

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "[I")
	public static final int[] anIntArray306 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!nh", name = "hb", descriptor = "Lclient!na;")
	public static final Class100 aClass100_623 = Static28.method790("::fps ");

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)I")
	public static int method2569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22 = 65536 - Class58.anIntArray225[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local22) >> 16) + (arg1 * local22 >> 16);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILclient!th;JZ)V")
	public static void method2570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class15 local6 = new Class15();
		local6.aClass8_1 = arg4;
		local6.anInt732 = arg1 * 128 + 64;
		local6.anInt736 = arg2 * 128 + 64;
		local6.anInt733 = arg3;
		local6.aLong26 = arg5;
		local6.aBoolean49 = arg6;
		if (Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub5(arg0, arg1, arg2);
		}
		Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2].aClass15_1 = local6;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)Z")
	public static boolean method2572(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Buffer local13 = new Buffer(arg0);
		@Pc(17) int local17 = local13.method2229();
		if (local17 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method2229() == 1;
		if (local33) {
			Static97.method1962(local13);
		}
		Static69.method1546(local13);
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method2574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class3_Sub8 local7 = new Class3_Sub8();
		local7.anInt1206 = arg6;
		local7.anInt1205 = arg3;
		local7.anInt1187 = arg1;
		local7.anInt1200 = arg5;
		local7.anInt1192 = arg2;
		local7.anInt1190 = arg8;
		local7.anInt1197 = arg10;
		local7.anInt1204 = arg4;
		local7.anInt1189 = arg11;
		local7.anInt1188 = arg7;
		local7.anInt1191 = arg0;
		local7.anInt1198 = arg9;
		Static128.aClass69_77.method2282(local7);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)V")
	public static void method2575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static106.anIntArray257[arg1] = arg0;
		@Pc(20) Class3_Sub10 local20 = (Class3_Sub10) Static199.aClass133_20.method3863((long) arg1);
		if (local20 == null) {
			local20 = new Class3_Sub10(4611686018427387905L);
			Static199.aClass133_20.method3862(local20, (long) arg1);
		} else if (local20.aLong55 != 4611686018427387905L) {
			local20.aLong55 = Class209.method5096() + 500L | 0x4000000000000000L;
		}
	}
}
