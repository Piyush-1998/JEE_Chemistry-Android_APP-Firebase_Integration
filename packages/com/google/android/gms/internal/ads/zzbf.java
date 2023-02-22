package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbf extends zzdvk {
    private ByteBuffer zzcq;

    public zzbf(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdvk
    public final void zzg(ByteBuffer byteBuffer) {
        this.zzcq = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
