package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzjx implements zzjv {
    private final zzoc zzaut;
    private final int zzavb;
    private final int zzavc;

    public zzjx(zzju zzjuVar) {
        zzoc zzocVar = zzjuVar.zzaut;
        this.zzaut = zzocVar;
        zzocVar.zzbg(12);
        this.zzavb = this.zzaut.zzir();
        this.zzavc = this.zzaut.zzir();
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzgj() {
        return this.zzavc;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzgk() {
        int i = this.zzavb;
        return i == 0 ? this.zzaut.zzir() : i;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final boolean zzgl() {
        return this.zzavb != 0;
    }
}
