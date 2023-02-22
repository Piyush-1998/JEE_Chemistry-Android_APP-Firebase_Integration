package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzqk {
    private ByteArrayOutputStream zzbqj = new ByteArrayOutputStream(4096);
    private Base64OutputStream zzbqk = new Base64OutputStream(this.zzbqj, 10);

    public final void write(byte[] bArr) throws IOException {
        this.zzbqk.write(bArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        try {
            this.zzbqk.close();
        } catch (IOException e) {
            zzaug.zzc("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zzbqj.close();
            return this.zzbqj.toString();
        } catch (IOException e2) {
            zzaug.zzc("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.zzbqj = null;
            this.zzbqk = null;
        }
    }
}
