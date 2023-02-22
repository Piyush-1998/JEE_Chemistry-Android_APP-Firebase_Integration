package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzwn implements MuteThisAdReason {
    private final String description;
    private zzwi zzcdz;

    public zzwn(zzwi zzwiVar) {
        String str;
        this.zzcdz = zzwiVar;
        try {
            str = zzwiVar.getDescription();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            str = null;
        }
        this.description = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.description;
    }

    public final zzwi zzow() {
        return this.zzcdz;
    }

    public final String toString() {
        return this.description;
    }
}
