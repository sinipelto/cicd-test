import java.applet.Applet;
// import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static287 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;")
	public static Object method1757(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		return null; // JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
	public static Object method1758(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return null; // JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)V")
	public static void method1759(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		// JSObject.getWindow(arg0).eval(arg1);
	}
}
