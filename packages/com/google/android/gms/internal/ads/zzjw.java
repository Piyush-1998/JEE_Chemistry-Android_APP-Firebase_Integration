package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzjw {
    public int index;
    public final int length;
    public int zzauu;
    public long zzauv;
    private final boolean zzauw;
    private final zzoc zzaux;
    private final zzoc zzauy;
    private int zzauz;
    private int zzava;

    public zzjw(zzoc zzocVar, zzoc zzocVar2, boolean z) {
        this.zzauy = zzocVar;
        this.zzaux = zzocVar2;
        this.zzauw = z;
        zzocVar2.zzbg(12);
        this.length = zzocVar2.zzir();
        zzocVar.zzbg(12);
        this.zzava = zzocVar.zzir();
        zznr.checkState(zzocVar.readInt() == 1, "first_chunk must be 1");
        this.index = -1;
    }

    public final boolean zzgm() {
        int i = this.index + 1;
        this.index = i;
        if (i == this.length) {
            return false;
        }
        this.zzauv = this.zzauw ? this.zzaux.zzis() : this.zzaux.zzio();
        if (this.index == this.zzauz) {
            this.zzauu = this.zzauy.zzir();
            this.zzauy.zzbh(4);
            int i2 = this.zzava - 1;
            this.zzava = i2;
            this.zzauz = i2 > 0 ? this.zzauy.zzir() - 1 : -1;
        }
        return true;
    }
}
