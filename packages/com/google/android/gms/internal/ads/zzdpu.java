package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdpu {
    private final byte[] buffer;
    private final zzdqf zzhgh;

    private zzdpu(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzhgh = zzdqf.zzaa(bArr);
    }

    public final zzdpm zzaxs() {
        this.zzhgh.zzayv();
        return new zzdpw(this.buffer);
    }

    public final zzdqf zzaxt() {
        return this.zzhgh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdpu(int i, zzdpp zzdppVar) {
        this(i);
    }
}
