package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaky implements NativeMediationAdRequest {
    private final String zzabl;
    private final int zzcby;
    private final boolean zzccj;
    private final int zzddp;
    private final int zzddq;
    private final zzaay zzdeh;
    private final List<String> zzdei = new ArrayList();
    private final Map<String, Boolean> zzdej = new HashMap();
    private final Date zznc;
    private final Set<String> zzne;
    private final boolean zznf;
    private final Location zzng;

    public zzaky(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzaay zzaayVar, List<String> list, boolean z2, int i3, String str) {
        this.zznc = date;
        this.zzcby = i;
        this.zzne = set;
        this.zzng = location;
        this.zznf = z;
        this.zzddp = i2;
        this.zzdeh = zzaayVar;
        this.zzccj = z2;
        this.zzddq = i3;
        this.zzabl = str;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzdej.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.zzdej.put(split[1], false);
                        }
                    }
                } else {
                    this.zzdei.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zznc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzcby;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzne;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zzng;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zznf;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzddp;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        if (this.zzdeh == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.zzdeh.zzcvz).setImageOrientation(this.zzdeh.zzbjv).setRequestMultipleImages(this.zzdeh.zzbjx);
        if (this.zzdeh.versionCode >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.zzdeh.zzbjy);
        }
        if (this.zzdeh.versionCode >= 3 && this.zzdeh.zzcwa != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.zzdeh.zzcwa));
        }
        return requestMultipleImages.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzxc.zzph().zzot();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzxc.zzph().zzos();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAppInstallAdRequested() {
        List<String> list = this.zzdei;
        if (list != null) {
            return list.contains("2") || this.zzdei.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.zzdei;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isContentAdRequested() {
        List<String> list = this.zzdei;
        if (list != null) {
            return list.contains("1") || this.zzdei.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzsd() {
        List<String> list = this.zzdei;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map<String, Boolean> zzse() {
        return this.zzdej;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzccj;
    }
}
