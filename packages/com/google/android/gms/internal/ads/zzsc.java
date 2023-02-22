package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzsc extends PushbackInputStream {
    private final /* synthetic */ zzrx zzbrz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsc(zzrx zzrxVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zzbrz = zzrxVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zzbrz.zzbrs.disconnect();
        super.close();
    }
}
