package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcch implements AppEventListener, zzbna, zzbnb, zzbnj, zzbnm, zzbog, zzbpc, zzcym, zztp {
    private long startTime;
    private final List<Object> zzdwa;
    private final zzcbv zzfsq;

    public zzcch(zzcbv zzcbvVar, zzbei zzbeiVar) {
        this.zzfsq = zzcbvVar;
        this.zzdwa = Collections.singletonList(zzbeiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zza(zzcvz zzcvzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbu(Context context) {
        zza(zzbnm.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbv(Context context) {
        zza(zzbnm.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbw(Context context) {
        zza(zzbnm.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zza(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void onAdLoaded() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - this.startTime;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        zzaug.zzdy(sb.toString());
        zza(zzbog.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void onAdFailedToLoad(int i) {
        zza(zzbnb.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdOpened() {
        zza(zzbna.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdClosed() {
        zza(zzbna.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdLeftApplication() {
        zza(zzbna.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void onAdClicked() {
        zza(zztp.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void onAdImpression() {
        zza(zzbnj.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoStarted() {
        zza(zzbna.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    @ParametersAreNonnullByDefault
    public final void zzb(zzapy zzapyVar, String str, String str2) {
        zza(zzbna.class, "onRewarded", zzapyVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoCompleted() {
        zza(zzbna.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str) {
        zza(zzcye.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzb(zzcyd zzcydVar, String str) {
        zza(zzcye.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str, Throwable th) {
        zza(zzcye.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzc(zzcyd zzcydVar, String str) {
        zza(zzcye.class, "onTaskSucceeded", str);
    }

    private final void zza(Class<?> cls, String str, Object... objArr) {
        zzcbv zzcbvVar = this.zzfsq;
        List<Object> list = this.zzdwa;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzcbvVar.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzb(zzape zzapeVar) {
        this.startTime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
        zza(zzbpc.class, "onAdRequest", new Object[0]);
    }
}
