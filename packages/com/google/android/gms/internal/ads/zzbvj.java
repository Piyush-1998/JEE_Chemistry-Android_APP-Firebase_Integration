package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvj {
    private final Executor executor;
    private final zzaay zzdeh;
    private final zzaui zzdrp;
    private final Executor zzfbx;
    private final zzcwe zzfga;
    private final zzbur zzfjl;
    private final zzbuv zzfkr;
    private final zzbup zzfkz;
    private final zzbvr zzfmy;
    private final Context zzlk;

    public zzbvj(Context context, zzaui zzauiVar, zzcwe zzcweVar, zzbuv zzbuvVar, zzbur zzburVar, zzbvr zzbvrVar, Executor executor, Executor executor2, zzbup zzbupVar) {
        this.zzlk = context;
        this.zzdrp = zzauiVar;
        this.zzfga = zzcweVar;
        this.zzdeh = zzcweVar.zzdeh;
        this.zzfkr = zzbuvVar;
        this.zzfjl = zzburVar;
        this.zzfmy = zzbvrVar;
        this.zzfbx = executor;
        this.executor = executor2;
        this.zzfkz = zzbupVar;
    }

    public final void zza(final zzbvz zzbvzVar) {
        this.zzfbx.execute(new Runnable(this, zzbvzVar) { // from class: com.google.android.gms.internal.ads.zzbvi
            private final zzbvj zzfmw;
            private final zzbvz zzfmx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfmw = this;
                this.zzfmx = zzbvzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfmw.zzd(this.zzfmx);
            }
        });
    }

    private static void zza(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }

    public final void zzc(zzbvz zzbvzVar) {
        if (zzbvzVar == null || this.zzfmy == null || zzbvzVar.zzain() == null) {
            return;
        }
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcsy)).booleanValue() || this.zzfkr.zzaib()) {
            try {
                zzbvzVar.zzain().addView(this.zzfmy.zzaiy());
            } catch (zzbcf e) {
                zzaug.zza("web view can not be obtained", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(zzbvz zzbvzVar, String[] strArr) {
        Map<String, WeakReference<View>> zzaiq = zzbvzVar.zzaiq();
        if (zzaiq == null) {
            return false;
        }
        for (String str : strArr) {
            if (zzaiq.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View zzaht = this.zzfjl.zzaht();
        if (zzaht == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzaht.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzaht.getParent()).removeView(zzaht);
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcol)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzaht, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzfjl.zzaht() != null) {
            if (2 == this.zzfjl.zzahp() || 1 == this.zzfjl.zzahp()) {
                this.zzdrp.zzc(this.zzfga.zzgkh, String.valueOf(this.zzfjl.zzahp()), z);
            } else if (6 == this.zzfjl.zzahp()) {
                this.zzdrp.zzc(this.zzfga.zzgkh, "2", z);
                this.zzdrp.zzc(this.zzfga.zzgkh, "1", z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzbvz zzbvzVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        IObjectWrapper zzqi;
        Drawable drawable;
        int i = 0;
        if (this.zzfkr.zzaid() || this.zzfkr.zzaic()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            for (int i2 = 0; i2 < 2; i2++) {
                View zzfw = zzbvzVar.zzfw(strArr[i2]);
                if (zzfw != null && (zzfw instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzfw;
                    break;
                }
            }
        }
        viewGroup = null;
        boolean z = viewGroup != null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.zzfjl.zzahq() != null) {
            view = this.zzfjl.zzahq();
            zzaay zzaayVar = this.zzdeh;
            if (zzaayVar != null && !z) {
                zza(layoutParams, zzaayVar.zzbjy);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.zzfjl.zzqo() instanceof zzaat) {
            zzaat zzaatVar = (zzaat) this.zzfjl.zzqo();
            if (!z) {
                zza(layoutParams, zzaatVar.zzqh());
            }
            View zzaasVar = new zzaas(this.zzlk, zzaatVar, layoutParams);
            zzaasVar.setContentDescription((CharSequence) zzuv.zzon().zzd(zzza.zzcoi));
            view = zzaasVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzbvzVar.zzaeu().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(view);
                FrameLayout zzain = zzbvzVar.zzain();
                if (zzain != null) {
                    zzain.addView(adChoicesView);
                }
            }
            zzbvzVar.zza(zzbvzVar.zzais(), view, true);
        }
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcsx)).booleanValue()) {
            zzc(zzbvzVar);
        }
        String[] strArr2 = zzbvh.zzfmp;
        int length = strArr2.length;
        while (true) {
            if (i >= length) {
                viewGroup2 = null;
                break;
            }
            View zzfw2 = zzbvzVar.zzfw(strArr2[i]);
            if (zzfw2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzfw2;
                break;
            }
            i++;
        }
        this.executor.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.zzbvl
            private final zzbvj zzfmw;
            private final ViewGroup zzfnc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfmw = this;
                this.zzfnc = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfmw.zzb(this.zzfnc);
            }
        });
        if (viewGroup2 != null) {
            if (zza(viewGroup2)) {
                if (this.zzfjl.zzahu() != null) {
                    this.zzfjl.zzahu().zza(new zzbvk(this, zzbvzVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View zzaeu = zzbvzVar.zzaeu();
            Context context = zzaeu != null ? zzaeu.getContext() : null;
            if (context != null) {
                if (((Boolean) zzuv.zzon().zzd(zzza.zzcoh)).booleanValue()) {
                    zzabh zzqx = this.zzfkz.zzqx();
                    if (zzqx == null) {
                        return;
                    }
                    try {
                        zzqi = zzqx.zzql();
                    } catch (RemoteException unused) {
                        zzaug.zzeu("Could not get main image drawable");
                        return;
                    }
                } else {
                    zzabi zzahr = this.zzfjl.zzahr();
                    if (zzahr == null) {
                        return;
                    }
                    try {
                        zzqi = zzahr.zzqi();
                    } catch (RemoteException unused2) {
                        zzaug.zzeu("Could not get drawable from image");
                        return;
                    }
                }
                if (zzqi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzqi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzait = zzbvzVar != null ? zzbvzVar.zzait() : null;
                if (zzait == null || !((Boolean) zzuv.zzon().zzd(zzza.zzcsz)).booleanValue()) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                } else {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzait));
                }
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            }
        }
    }
}
