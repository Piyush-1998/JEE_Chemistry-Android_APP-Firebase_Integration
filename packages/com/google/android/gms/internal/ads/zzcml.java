package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcml implements AppEventListener {
    private zzvt zzgcr;

    public final synchronized void zzb(zzvt zzvtVar) {
        this.zzgcr = zzvtVar;
    }

    public final synchronized zzvt zzalj() {
        return this.zzgcr;
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzgcr != null) {
            try {
                this.zzgcr.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAppEvent.", e);
            }
        }
    }
}
