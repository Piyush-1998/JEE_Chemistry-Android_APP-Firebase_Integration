package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public class zzug {
    private final zztv zzccu;
    private final zzts zzccv;
    private final zzxn zzccw;
    private final zzadn zzccx;
    private final zzaqm zzccy;
    private final zzarq zzccz;
    private final zzanm zzcda;
    private final zzadm zzcdb;

    public zzug(zztv zztvVar, zzts zztsVar, zzxn zzxnVar, zzadn zzadnVar, zzaqm zzaqmVar, zzarq zzarqVar, zzanm zzanmVar, zzadm zzadmVar) {
        this.zzccu = zztvVar;
        this.zzccv = zztsVar;
        this.zzccw = zzxnVar;
        this.zzccx = zzadnVar;
        this.zzccy = zzaqmVar;
        this.zzccz = zzarqVar;
        this.zzcda = zzanmVar;
        this.zzcdb = zzadmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzuv.zzoj().zza(context, zzuv.zzop().zzblz, "gmob-apps", bundle, true);
    }

    public final zzvl zza(Context context, zzua zzuaVar, String str, zzajx zzajxVar) {
        return new zzuk(this, context, zzuaVar, str, zzajxVar).zzd(context, false);
    }

    public final zzve zzb(Context context, String str, zzajx zzajxVar) {
        return new zzup(this, context, str, zzajxVar).zzd(context, false);
    }

    public final zzabm zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new zzur(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzabt zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return new zzuq(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzara zzc(Context context, String str, zzajx zzajxVar) {
        return new zzui(this, context, str, zzajxVar).zzd(context, false);
    }

    public final zzano zzb(Activity activity) {
        zzul zzulVar = new zzul(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzaxi.zzes("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return zzulVar.zzd(activity, z);
    }
}
