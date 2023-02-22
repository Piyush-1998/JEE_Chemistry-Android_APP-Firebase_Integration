package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzasu implements zzatc {
    static final zzatc zzdpu = new zzasu();

    private zzasu() {
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final Object zza(zzbeb zzbebVar) {
        String currentScreenName = zzbebVar.getCurrentScreenName();
        if (currentScreenName != null) {
            return currentScreenName;
        }
        String currentScreenClass = zzbebVar.getCurrentScreenClass();
        return currentScreenClass != null ? currentScreenClass : "";
    }
}
