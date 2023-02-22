package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbar extends zzay {
    static final zzbar zzedb = new zzbar();

    zzbar() {
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final zzbb zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzbd();
        }
        if ("mvhd".equals(str)) {
            return new zzbg();
        }
        return new zzbf(str);
    }
}
