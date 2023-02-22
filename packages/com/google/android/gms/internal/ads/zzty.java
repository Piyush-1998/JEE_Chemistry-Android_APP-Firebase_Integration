package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzty {
    public static final zzty zzccl = new zzty();

    protected zzty() {
    }

    public static zztx zza(Context context, zzwz zzwzVar) {
        Context context2;
        List list;
        String str;
        Date birthday = zzwzVar.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1L;
        String contentUrl = zzwzVar.getContentUrl();
        int gender = zzwzVar.getGender();
        Set<String> keywords = zzwzVar.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzwzVar.isTestDevice(context2);
        Location location = zzwzVar.getLocation();
        Bundle networkExtrasBundle = zzwzVar.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean manualImpressionsEnabled = zzwzVar.getManualImpressionsEnabled();
        String publisherProvidedId = zzwzVar.getPublisherProvidedId();
        SearchAdRequest zzpb = zzwzVar.zzpb();
        zzyf zzyfVar = zzpb != null ? new zzyf(zzpb) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzuv.zzoj();
            str = zzawy.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean isDesignedForFamilies = zzwzVar.isDesignedForFamilies();
        RequestConfiguration requestConfiguration = zzxc.zzph().getRequestConfiguration();
        return new zztx(8, time, networkExtrasBundle, gender, list, isTestDevice, Math.max(zzwzVar.zzpe(), requestConfiguration.getTagForChildDirectedTreatment()), manualImpressionsEnabled, publisherProvidedId, zzyfVar, location, contentUrl, zzwzVar.zzpd(), zzwzVar.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzwzVar.zzpf())), zzwzVar.zzpa(), str, isDesignedForFamilies, null, Math.max(zzwzVar.zzpg(), requestConfiguration.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(zzwzVar.getMaxAdContentRating(), requestConfiguration.getMaxAdContentRating()), zzub.zzcct));
    }

    public static zzaqo zza(Context context, zzwz zzwzVar, String str) {
        return new zzaqo(zza(context, zzwzVar), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ int zzf(String str, String str2) {
        return RequestConfiguration.zzabm.indexOf(str) - RequestConfiguration.zzabm.indexOf(str2);
    }
}
