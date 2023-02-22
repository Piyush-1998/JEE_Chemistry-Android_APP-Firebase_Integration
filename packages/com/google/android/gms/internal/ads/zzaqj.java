package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaqj implements RewardItem {
    private final zzapy zzdnw;

    public zzaqj(zzapy zzapyVar) {
        this.zzdnw = zzapyVar;
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final String getType() {
        zzapy zzapyVar = this.zzdnw;
        if (zzapyVar == null) {
            return null;
        }
        try {
            return zzapyVar.getType();
        } catch (RemoteException e) {
            zzaxi.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final int getAmount() {
        zzapy zzapyVar = this.zzdnw;
        if (zzapyVar == null) {
            return 0;
        }
        try {
            return zzapyVar.getAmount();
        } catch (RemoteException e) {
            zzaxi.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
