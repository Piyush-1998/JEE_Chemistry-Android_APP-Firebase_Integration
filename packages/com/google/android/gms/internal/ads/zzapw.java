package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzapw extends zzapx {
    private final String type;
    private final int zzdnv;

    public zzapw(String str, int i) {
        this.type = str;
        this.zzdnv = i;
    }

    @Override // com.google.android.gms.internal.ads.zzapy
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzapy
    public final int getAmount() {
        return this.zzdnv;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzapw)) {
            zzapw zzapwVar = (zzapw) obj;
            if (Objects.equal(this.type, zzapwVar.type) && Objects.equal(Integer.valueOf(this.zzdnv), Integer.valueOf(zzapwVar.zzdnv))) {
                return true;
            }
        }
        return false;
    }
}
