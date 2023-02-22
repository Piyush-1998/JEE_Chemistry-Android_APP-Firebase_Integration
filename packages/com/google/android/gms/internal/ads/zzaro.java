package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaro implements RewardItem {
    private final zzaqv zzdoe;

    public zzaro(zzaqv zzaqvVar) {
        this.zzdoe = zzaqvVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzaqv zzaqvVar = this.zzdoe;
        if (zzaqvVar == null) {
            return null;
        }
        try {
            return zzaqvVar.getType();
        } catch (RemoteException e) {
            zzaxi.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzaqv zzaqvVar = this.zzdoe;
        if (zzaqvVar == null) {
            return 0;
        }
        try {
            return zzaqvVar.getAmount();
        } catch (RemoteException e) {
            zzaxi.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
