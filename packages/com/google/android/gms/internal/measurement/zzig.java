package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzanj uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class zzig {
    public static final zzig zzanb = new zzig("DOUBLE", 0, zzij.DOUBLE, 1);
    public static final zzig zzanc = new zzig("FLOAT", 1, zzij.FLOAT, 5);
    public static final zzig zzand = new zzig("INT64", 2, zzij.LONG, 0);
    public static final zzig zzane = new zzig("UINT64", 3, zzij.LONG, 0);
    public static final zzig zzanf = new zzig("INT32", 4, zzij.INT, 0);
    public static final zzig zzang = new zzig("FIXED64", 5, zzij.LONG, 1);
    public static final zzig zzanh = new zzig("FIXED32", 6, zzij.INT, 5);
    public static final zzig zzani = new zzig("BOOL", 7, zzij.BOOLEAN, 0);
    public static final zzig zzanj;
    public static final zzig zzank;
    public static final zzig zzanl;
    public static final zzig zzanm;
    public static final zzig zzann;
    public static final zzig zzano;
    public static final zzig zzanp;
    public static final zzig zzanq;
    public static final zzig zzanr;
    public static final zzig zzans;
    private static final /* synthetic */ zzig[] zzanv;
    private final zzij zzant;
    private final int zzanu;

    public static zzig[] values() {
        return (zzig[]) zzanv.clone();
    }

    private zzig(String str, int i, zzij zzijVar, int i2) {
        this.zzant = zzijVar;
        this.zzanu = i2;
    }

    public final zzij zzwz() {
        return this.zzant;
    }

    public final int zzxa() {
        return this.zzanu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzig(String str, int i, zzij zzijVar, int i2, zzid zzidVar) {
        this(str, i, zzijVar, i2);
    }

    static {
        final zzij zzijVar = zzij.STRING;
        zzanj = new zzig("STRING", 8, zzijVar, 2) { // from class: com.google.android.gms.internal.measurement.zzif
        };
        final zzij zzijVar2 = zzij.MESSAGE;
        zzank = new zzig("GROUP", 9, zzijVar2, 3) { // from class: com.google.android.gms.internal.measurement.zzii
        };
        final zzij zzijVar3 = zzij.MESSAGE;
        zzanl = new zzig("MESSAGE", 10, zzijVar3, 2) { // from class: com.google.android.gms.internal.measurement.zzih
        };
        final zzij zzijVar4 = zzij.BYTE_STRING;
        zzanm = new zzig("BYTES", 11, zzijVar4, 2) { // from class: com.google.android.gms.internal.measurement.zzik
        };
        zzann = new zzig("UINT32", 12, zzij.INT, 0);
        zzano = new zzig("ENUM", 13, zzij.ENUM, 0);
        zzanp = new zzig("SFIXED32", 14, zzij.INT, 5);
        zzanq = new zzig("SFIXED64", 15, zzij.LONG, 1);
        zzanr = new zzig("SINT32", 16, zzij.INT, 0);
        zzig zzigVar = new zzig("SINT64", 17, zzij.LONG, 0);
        zzans = zzigVar;
        zzanv = new zzig[]{zzanb, zzanc, zzand, zzane, zzanf, zzang, zzanh, zzani, zzanj, zzank, zzanl, zzanm, zzann, zzano, zzanp, zzanq, zzanr, zzigVar};
    }
}
