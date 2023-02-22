package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbdj {
    public final int heightPixels;
    private final int type;
    public final int widthPixels;

    public static zzbdj zzb(zzua zzuaVar) {
        if (zzuaVar.zzccm) {
            return new zzbdj(3, 0, 0);
        }
        if (zzuaVar.zzcco) {
            return new zzbdj(2, 0, 0);
        }
        if (zzuaVar.zzbmb) {
            return zzaar();
        }
        return zzp(zzuaVar.widthPixels, zzuaVar.heightPixels);
    }

    public static zzbdj zzaar() {
        return new zzbdj(0, 0, 0);
    }

    public static zzbdj zzp(int i, int i2) {
        return new zzbdj(1, i, i2);
    }

    public static zzbdj zzaas() {
        return new zzbdj(4, 0, 0);
    }

    public static zzbdj zzaat() {
        return new zzbdj(5, 0, 0);
    }

    private zzbdj(int i, int i2, int i3) {
        this.type = i;
        this.widthPixels = i2;
        this.heightPixels = i3;
    }

    public final boolean isFluid() {
        return this.type == 2;
    }

    public final boolean zzaau() {
        return this.type == 3;
    }

    public final boolean zzaav() {
        return this.type == 0;
    }

    public final boolean zzaaw() {
        return this.type == 4;
    }

    public final boolean zzaax() {
        return this.type == 5;
    }
}
