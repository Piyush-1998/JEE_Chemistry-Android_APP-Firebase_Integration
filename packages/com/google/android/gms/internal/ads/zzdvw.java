package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdvw {
    public static final zzdvw zzhxh = new zzdvw(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzdvw zzhxi = new zzdvw(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzdvw zzhxj = new zzdvw(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzdvw zzhxk = new zzdvw(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double w;
    private final double zzhxd;
    private final double zzhxe;
    private final double zzhxf;
    private final double zzhxg;

    private zzdvw(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zzhxd = d5;
        this.zzhxe = d6;
        this.w = d7;
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.zzhxf = d8;
        this.zzhxg = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzdvw zzdvwVar = (zzdvw) obj;
        return Double.compare(zzdvwVar.a, this.a) == 0 && Double.compare(zzdvwVar.b, this.b) == 0 && Double.compare(zzdvwVar.c, this.c) == 0 && Double.compare(zzdvwVar.d, this.d) == 0 && Double.compare(zzdvwVar.zzhxf, this.zzhxf) == 0 && Double.compare(zzdvwVar.zzhxg, this.zzhxg) == 0 && Double.compare(zzdvwVar.zzhxd, this.zzhxd) == 0 && Double.compare(zzdvwVar.zzhxe, this.zzhxe) == 0 && Double.compare(zzdvwVar.w, this.w) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzhxd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzhxe);
        long doubleToLongBits3 = Double.doubleToLongBits(this.w);
        long doubleToLongBits4 = Double.doubleToLongBits(this.a);
        long doubleToLongBits5 = Double.doubleToLongBits(this.b);
        long doubleToLongBits6 = Double.doubleToLongBits(this.c);
        long doubleToLongBits7 = Double.doubleToLongBits(this.d);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzhxf);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzhxg);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzhxh)) {
            return "Rotate 0°";
        }
        if (equals(zzhxi)) {
            return "Rotate 90°";
        }
        if (equals(zzhxj)) {
            return "Rotate 180°";
        }
        if (equals(zzhxk)) {
            return "Rotate 270°";
        }
        double d = this.zzhxd;
        double d2 = this.zzhxe;
        double d3 = this.w;
        double d4 = this.a;
        double d5 = this.b;
        double d6 = this.c;
        double d7 = this.d;
        double d8 = this.zzhxf;
        double d9 = this.zzhxg;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    public static zzdvw zzp(ByteBuffer byteBuffer) {
        double zzd = zzbc.zzd(byteBuffer);
        double zzd2 = zzbc.zzd(byteBuffer);
        double zze = zzbc.zze(byteBuffer);
        return new zzdvw(zzd, zzd2, zzbc.zzd(byteBuffer), zzbc.zzd(byteBuffer), zze, zzbc.zze(byteBuffer), zzbc.zze(byteBuffer), zzbc.zzd(byteBuffer), zzbc.zzd(byteBuffer));
    }
}
