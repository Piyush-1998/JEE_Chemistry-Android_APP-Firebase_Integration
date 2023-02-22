package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzka implements zzjv {
    private final zzoc zzaut;
    private final int zzavc;
    private final int zzavf;
    private int zzavg;
    private int zzavh;

    public zzka(zzju zzjuVar) {
        zzoc zzocVar = zzjuVar.zzaut;
        this.zzaut = zzocVar;
        zzocVar.zzbg(12);
        this.zzavf = this.zzaut.zzir() & 255;
        this.zzavc = this.zzaut.zzir();
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final boolean zzgl() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzgj() {
        return this.zzavc;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzgk() {
        int i = this.zzavf;
        if (i == 8) {
            return this.zzaut.readUnsignedByte();
        }
        if (i == 16) {
            return this.zzaut.readUnsignedShort();
        }
        int i2 = this.zzavg;
        this.zzavg = i2 + 1;
        if (i2 % 2 == 0) {
            int readUnsignedByte = this.zzaut.readUnsignedByte();
            this.zzavh = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
        return this.zzavh & 15;
    }
}
