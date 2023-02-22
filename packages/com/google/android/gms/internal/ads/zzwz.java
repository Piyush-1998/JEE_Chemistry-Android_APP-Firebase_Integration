package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzwz {
    private final int zzabj;
    private final int zzabk;
    private final String zzabl;
    private final boolean zzbkg;
    private final int zzcby;
    private final String zzccb;
    private final String zzccd;
    private final Bundle zzccf;
    private final String zzcch;
    private final boolean zzccj;
    private final Bundle zzcec;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzceg;
    private final SearchAdRequest zzceh;
    private final Set<String> zzcei;
    private final Set<String> zzcej;
    private final zzcyw zzcek;
    private final Date zznc;
    private final Set<String> zzne;
    private final Location zzng;

    public zzwz(zzwy zzwyVar) {
        this(zzwyVar, null);
    }

    public zzwz(zzwy zzwyVar, SearchAdRequest searchAdRequest) {
        Date date;
        String str;
        int i;
        HashSet hashSet;
        Location location;
        boolean z;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i2;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z2;
        int i3;
        String str4;
        date = zzwyVar.zznc;
        this.zznc = date;
        str = zzwyVar.zzccd;
        this.zzccd = str;
        i = zzwyVar.zzcby;
        this.zzcby = i;
        hashSet = zzwyVar.zzceb;
        this.zzne = Collections.unmodifiableSet(hashSet);
        location = zzwyVar.zzng;
        this.zzng = location;
        z = zzwyVar.zzbkg;
        this.zzbkg = z;
        bundle = zzwyVar.zzcec;
        this.zzcec = bundle;
        hashMap = zzwyVar.zzced;
        this.zzceg = Collections.unmodifiableMap(hashMap);
        str2 = zzwyVar.zzccb;
        this.zzccb = str2;
        str3 = zzwyVar.zzcch;
        this.zzcch = str3;
        this.zzceh = searchAdRequest;
        i2 = zzwyVar.zzabj;
        this.zzabj = i2;
        hashSet2 = zzwyVar.zzcee;
        this.zzcei = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzwyVar.zzccf;
        this.zzccf = bundle2;
        hashSet3 = zzwyVar.zzcef;
        this.zzcej = Collections.unmodifiableSet(hashSet3);
        z2 = zzwyVar.zzccj;
        this.zzccj = z2;
        this.zzcek = null;
        i3 = zzwyVar.zzabk;
        this.zzabk = i3;
        str4 = zzwyVar.zzabl;
        this.zzabl = str4;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zznc;
    }

    public final String getContentUrl() {
        return this.zzccd;
    }

    @Deprecated
    public final int getGender() {
        return this.zzcby;
    }

    public final Set<String> getKeywords() {
        return this.zzne;
    }

    public final Location getLocation() {
        return this.zzng;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbkg;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzceg.get(cls);
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls) {
        return this.zzcec.getBundle(cls.getName());
    }

    public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzcec.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String getPublisherProvidedId() {
        return this.zzccb;
    }

    public final String zzpa() {
        return this.zzcch;
    }

    public final SearchAdRequest zzpb() {
        return this.zzceh;
    }

    public final boolean isTestDevice(Context context) {
        Set<String> set = this.zzcei;
        zzuv.zzoj();
        return set.contains(zzawy.zzbi(context));
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzpc() {
        return this.zzceg;
    }

    public final Bundle zzpd() {
        return this.zzcec;
    }

    public final int zzpe() {
        return this.zzabj;
    }

    public final Bundle getCustomTargeting() {
        return this.zzccf;
    }

    public final Set<String> zzpf() {
        return this.zzcej;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzccj;
    }

    public final int zzpg() {
        return this.zzabk;
    }

    public final String getMaxAdContentRating() {
        return this.zzabl;
    }
}
