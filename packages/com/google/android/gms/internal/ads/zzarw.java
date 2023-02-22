package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzarw extends zzaqy {
    private final String type;
    private final int zzdnv;

    public zzarw(zzaqt zzaqtVar) {
        this(zzaqtVar != null ? zzaqtVar.type : "", zzaqtVar != null ? zzaqtVar.zzdnv : 1);
    }

    public zzarw(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzarw(String str, int i) {
        this.type = str;
        this.zzdnv = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqv
    public final String getType() throws RemoteException {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzaqv
    public final int getAmount() throws RemoteException {
        return this.zzdnv;
    }
}
