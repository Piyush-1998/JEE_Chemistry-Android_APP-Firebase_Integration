package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdst implements zzdse {
    private final int flags;
    private final String info;
    private final Object[] zzhnb;
    private final zzdsg zzhne;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdst(zzdsg zzdsgVar, String str, Object[] objArr) {
        this.zzhne = zzdsgVar;
        this.info = str;
        this.zzhnb = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzbbg() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zzbbh() {
        return this.zzhnb;
    }

    @Override // com.google.android.gms.internal.ads.zzdse
    public final zzdsg zzbba() {
        return this.zzhne;
    }

    @Override // com.google.android.gms.internal.ads.zzdse
    public final int zzbay() {
        return (this.flags & 1) == 1 ? zzdqw.zzd.zzhld : zzdqw.zzd.zzhle;
    }

    @Override // com.google.android.gms.internal.ads.zzdse
    public final boolean zzbaz() {
        return (this.flags & 2) == 2;
    }
}
