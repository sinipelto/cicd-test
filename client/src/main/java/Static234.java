import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	public static int anInt5245 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method4014() {
		for (@Pc(3) int local3 = 0; local3 < Protocol.extendedCount; local3++) {
			@Pc(10) int local10 = Protocol.extendedIds[local3];
			@Pc(14) Npc local14 = Static175.npcs[local10];
			@Pc(18) int local18 = Protocol.inboundBuffer.g1();
			if ((local18 & 0x8) != 0) {
				local18 += Protocol.inboundBuffer.g1() << 8;
			}
			@Pc(43) int local43;
			@Pc(47) int local47;
			if ((local18 & 0x40) != 0) {
				local43 = Protocol.inboundBuffer.g1();
				local47 = Protocol.inboundBuffer.p1neg();
				local14.addHit(local47, client.loop, local43);
				local14.hitpointsBarVisibleUntil = client.loop + 300;
				local14.hitpointsBar = Protocol.inboundBuffer.g1ssub();
			}
			if ((local18 & 0x2) != 0) {
				local43 = Protocol.inboundBuffer.p1neg();
				local47 = Protocol.inboundBuffer.g1ssub();
				local14.addHit(local47, client.loop, local43);
			}
			if ((local18 & 0x10) != 0) {
				local43 = Protocol.inboundBuffer.g2();
				local47 = Protocol.inboundBuffer.g1();
				if (local43 == 65535) {
					local43 = -1;
				}
				Static223.method3855(local47, local43, local14);
			}
			if ((local18 & 0x4) != 0) {
				local14.faceEntity = Protocol.inboundBuffer.g2sub();
				if (local14.faceEntity == 65535) {
					local14.faceEntity = -1;
				}
			}
			if ((local18 & 0x80) != 0) {
				local43 = Protocol.inboundBuffer.g2sub();
				if (local43 == 65535) {
					local43 = -1;
				}
				local47 = Protocol.inboundBuffer.g4me();
				@Pc(147) boolean local147 = true;
				if (local43 != -1 && local14.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(local43).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(local14.spotAnimId).seqId).anInt5355) {
					local147 = false;
				}
				if (local147) {
					local14.spotAnimId = local43;
					local14.spotAnimStart = (local47 & 0xFFFF) + client.loop;
					local14.anInt3361 = 0;
					local14.anInt3399 = 0;
					local14.spotAnimY = local47 >> 16;
					local14.anInt3418 = 1;
					if (local14.spotAnimStart > client.loop) {
						local14.anInt3399 = -1;
					}
					if (local14.spotAnimId != -1 && local14.spotAnimStart == client.loop) {
						@Pc(227) int local227 = SpotAnimTypeList.get(local14.spotAnimId).seqId;
						if (local227 != -1) {
							@Pc(236) SeqType local236 = SeqTypeList.get(local227);
							if (local236 != null && local236.frames != null) {
								SoundPlayer.playSeqSound(local14.zFine, local236, local14.xFine, false, 0);
							}
						}
					}
				}
			}
			if ((local18 & 0x1) != 0) {
				if (local14.type.hasAreaSound()) {
					Static91.method1877(local14);
				}
				local14.method2698(NpcTypeList.get(Protocol.inboundBuffer.g2le()));
				local14.method2692(local14.type.soze);
				local14.anInt3365 = local14.type.basId;
				if (local14.type.hasAreaSound()) {
					Static122.method2411(local14.movementQueueZ[0], null, 0, local14, local14.movementQueueX[0], Player.level, null);
				}
			}
			if ((local18 & 0x20) != 0) {
				local14.chatMessage = Protocol.inboundBuffer.gjstr();
				local14.chatLoops = 100;
			}
			if ((local18 & 0x100) != 0) {
				local43 = Protocol.inboundBuffer.p1neg();
				@Pc(331) int[] local331 = new int[local43];
				@Pc(334) int[] local334 = new int[local43];
				@Pc(337) int[] local337 = new int[local43];
				for (@Pc(339) int local339 = 0; local339 < local43; local339++) {
					@Pc(350) int local350 = Protocol.inboundBuffer.g2le();
					if (local350 == 65535) {
						local350 = -1;
					}
					local331[local339] = local350;
					local334[local339] = Protocol.inboundBuffer.g1ssub();
					local337[local339] = Protocol.inboundBuffer.g2();
				}
				Static159.method3037(local337, local14, local334, local331);
			}
			if ((local18 & 0x200) != 0) {
				local14.faceX = Protocol.inboundBuffer.g2sub();
				local14.faceY = Protocol.inboundBuffer.g2();
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIII)V")
	public static void method4017(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (InterfaceList.load(arg2)) {
			Static266.method4190(-1, arg1, arg3, arg0, InterfaceList.components[arg2]);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZII)V")
	public static void method4019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static267.anInt5773 && arg3 <= Static106.anInt2869) {
			@Pc(15) int local15 = Static78.method1690(Static224.anInt5063, arg0, Static172.anInt4164);
			@Pc(21) int local21 = Static78.method1690(Static224.anInt5063, arg2, Static172.anInt4164);
			Static222.method3826(arg1, arg3, local21, local15);
		}
	}

}
