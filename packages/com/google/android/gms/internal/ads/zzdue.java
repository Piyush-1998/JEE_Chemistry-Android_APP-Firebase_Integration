package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzhpz uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public class zzdue {
    public static final zzdue zzhpr = new zzdue("DOUBLE", 0, zzduh.DOUBLE, 1);
    public static final zzdue zzhps = new zzdue("FLOAT", 1, zzduh.FLOAT, 5);
    public static final zzdue zzhpt = new zzdue("INT64", 2, zzduh.LONG, 0);
    public static final zzdue zzhpu = new zzdue("UINT64", 3, zzduh.LONG, 0);
    public static final zzdue zzhpv = new zzdue("INT32", 4, zzduh.INT, 0);
    public static final zzdue zzhpw = new zzdue("FIXED64", 5, zzduh.LONG, 1);
    public static final zzdue zzhpx = new zzdue("FIXED32", 6, zzduh.INT, 5);
    public static final zzdue zzhpy = new zzdue("BOOL", 7, zzduh.BOOLEAN, 0);
    public static final zzdue zzhpz;
    public static final zzdue zzhqa;
    public static final zzdue zzhqb;
    public static final zzdue zzhqc;
    public static final zzdue zzhqd;
    public static final zzdue zzhqe;
    public static final zzdue zzhqf;
    public static final zzdue zzhqg;
    public static final zzdue zzhqh;
    public static final zzdue zzhqi;
    private static final /* synthetic */ zzdue[] zzhql;
    private final zzduh zzhqj;
    private final int zzhqk;

    public static zzdue[] values() {
        return (zzdue[]) zzhql.clone();
    }

    private zzdue(String str, int i, zzduh zzduhVar, int i2) {
        this.zzhqj = zzduhVar;
        this.zzhqk = i2;
    }

    public final zzduh zzbcg() {
        return this.zzhqj;
    }

    public final int zzbch() {
        return this.zzhqk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdue(String str, int i, zzduh zzduhVar, int i2, zzdub zzdubVar) {
        this(str, i, zzduhVar, i2);
    }

    static {
        final zzduh zzduhVar = zzduh.STRING;
        zzhpz = new zzdue("STRING", 8, zzduhVar, 2) { // from class: com.google.android.gms.internal.ads.zzdud
        };
        final zzduh zzduhVar2 = zzduh.MESSAGE;
        zzhqa = new zzdue("GROUP", 9, zzduhVar2, 3) { // from class: com.google.android.gms.internal.ads.zzdug
        };
        final zzduh zzduhVar3 = zzduh.MESSAGE;
        zzhqb = new zzdue("MESSAGE", 10, zzduhVar3, 2) { // from class: com.google.android.gms.internal.ads.zzduf
        };
        final zzduh zzduhVar4 = zzduh.BYTE_STRING;
        zzhqc = new zzdue("BYTES", 11, zzduhVar4, 2) { // from class: com.google.android.gms.internal.ads.zzdui
        };
        zzhqd = new zzdue("UINT32", 12, zzduh.INT, 0);
        zzhqe = new zzdue("ENUM", 13, zzduh.ENUM, 0);
        zzhqf = new zzdue("SFIXED32", 14, zzduh.INT, 5);
        zzhqg = new zzdue("SFIXED64", 15, zzduh.LONG, 1);
        zzhqh = new zzdue("SINT32", 16, zzduh.INT, 0);
        zzdue zzdueVar = new zzdue("SINT64", 17, zzduh.LONG, 0);
        zzhqi = zzdueVar;
        zzhql = new zzdue[]{zzhpr, zzhps, zzhpt, zzhpu, zzhpv, zzhpw, zzhpx, zzhpy, zzhpz, zzhqa, zzhqb, zzhqc, zzhqd, zzhqe, zzhqf, zzhqg, zzhqh, zzdueVar};
    }
}
