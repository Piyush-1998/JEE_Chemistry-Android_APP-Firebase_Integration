package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyb extends zzach {
    private final zzbur zzfjl;
    private final zzbuj zzfml;
    private final zzbvj zzfpm;
    private final Context zzzc;

    public zzbyb(Context context, zzbur zzburVar, zzbvj zzbvjVar, zzbuj zzbujVar) {
        this.zzzc = context;
        this.zzfjl = zzburVar;
        this.zzfpm = zzbvjVar;
        this.zzfml = zzbujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final IObjectWrapper zzqm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final String zzco(String str) {
        return this.zzfjl.zzahz().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final zzabi zzcp(String str) {
        return this.zzfjl.zzahx().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final List<String> getAvailableAssetNames() {
        SimpleArrayMap<String, zzaau> zzahx = this.zzfjl.zzahx();
        SimpleArrayMap<String, String> zzahz = this.zzfjl.zzahz();
        String[] strArr = new String[zzahx.size() + zzahz.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzahx.size()) {
            strArr[i3] = zzahx.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzahz.size()) {
            strArr[i3] = zzahz.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final String getCustomTemplateId() {
        return this.zzfjl.getCustomTemplateId();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void performClick(String str) {
        this.zzfml.zzfp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void recordImpression() {
        this.zzfml.zzahd();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final zzwr getVideoController() {
        return this.zzfjl.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void destroy() {
        this.zzfml.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final IObjectWrapper zzqr() {
        return ObjectWrapper.wrap(this.zzzc);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zzu(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && this.zzfpm.zza((ViewGroup) unwrap)) {
            this.zzfjl.zzahu().zza(new zzbya(this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zzqs() {
        return this.zzfml.zzahl() && this.zzfjl.zzahv() != null && this.zzfjl.zzahu() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zzqt() {
        IObjectWrapper zzahw = this.zzfjl.zzahw();
        if (zzahw != null) {
            com.google.android.gms.ads.internal.zzq.zzky().zzae(zzahw);
            return true;
        }
        zzaug.zzeu("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzv(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzfjl.zzahw() != null) {
            this.zzfml.zzy((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzqu() {
        String zzahy = this.zzfjl.zzahy();
        if ("Google".equals(zzahy)) {
            zzaug.zzeu("Illegal argument specified for omid partner name.");
        } else {
            this.zzfml.zzg(zzahy, false);
        }
    }
}
