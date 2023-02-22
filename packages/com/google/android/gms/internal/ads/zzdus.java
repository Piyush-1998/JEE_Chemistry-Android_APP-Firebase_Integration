package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdus {
    protected volatile int zzhrh = -1;

    public void zza(zzduj zzdujVar) throws IOException {
    }

    protected int zznx() {
        return 0;
    }

    public final int zzazu() {
        int zznx = zznx();
        this.zzhrh = zznx;
        return zznx;
    }

    public static final byte[] zzb(zzdus zzdusVar) {
        int zzazu = zzdusVar.zzazu();
        byte[] bArr = new byte[zzazu];
        try {
            zzduj zzp = zzduj.zzp(bArr, 0, zzazu);
            zzdusVar.zza(zzp);
            zzp.zzayv();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return zzdur.zza(this);
    }

    @Override // 
    /* renamed from: zzbci */
    public zzdus clone() throws CloneNotSupportedException {
        return (zzdus) super.clone();
    }
}
