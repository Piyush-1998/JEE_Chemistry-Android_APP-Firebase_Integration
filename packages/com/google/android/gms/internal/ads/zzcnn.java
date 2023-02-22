package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnn implements zzcru<zzcno> {
    private final zzcwe zzfga;
    private final zzddl zzgdu;
    private final View zzgdv;
    private final Context zzlk;

    public zzcnn(zzddl zzddlVar, Context context, zzcwe zzcweVar, ViewGroup viewGroup) {
        this.zzgdu = zzddlVar;
        this.zzlk = context;
        this.zzfga = zzcweVar;
        this.zzgdv = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcno> zzalv() {
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcje)).booleanValue()) {
            return zzdcy.zzi(new Exception("Ad Key signal disabled."));
        }
        return this.zzgdu.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcnq
            private final zzcnn zzgdy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdy = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgdy.zzalw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcno zzalw() throws Exception {
        Context context = this.zzlk;
        zzua zzuaVar = this.zzfga.zzbll;
        ArrayList arrayList = new ArrayList();
        View view = this.zzgdv;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzcno(context, zzuaVar, arrayList);
    }
}
