package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzpf implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long zzbnj = ((Long) zzuv.zzon().zzd(zzza.zzclx)).longValue();
    private final WindowManager zzbnk;
    private BroadcastReceiver zzbnl;
    private WeakReference<View> zzbnm;
    private zzpm zzbnn;
    private final Rect zzbnr;
    private final DisplayMetrics zzwl;
    private Application zzxh;
    private final Context zzzc;
    private final PowerManager zzzd;
    private final KeyguardManager zzze;
    private WeakReference<ViewTreeObserver> zzzg;
    private zzawo zzbno = new zzawo(zzbnj);
    private boolean zzbnp = false;
    private int zzzk = -1;
    private final HashSet<zzpj> zzbnq = new HashSet<>();

    public zzpf(Context context, View view) {
        this.zzzc = context.getApplicationContext();
        this.zzbnk = (WindowManager) context.getSystemService("window");
        this.zzzd = (PowerManager) this.zzzc.getSystemService("power");
        this.zzze = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.zzzc;
        if (context2 instanceof Application) {
            this.zzxh = (Application) context2;
            this.zzbnn = new zzpm((Application) this.zzzc, this);
        }
        this.zzwl = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzbnr = rect;
        rect.right = this.zzbnk.getDefaultDisplay().getWidth();
        this.zzbnr.bottom = this.zzbnk.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzbnm;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzf(view2);
        }
        this.zzbnm = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.zzq.zzkl().isAttachedToWindow(view)) {
                zze(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void zza(zzpj zzpjVar) {
        this.zzbnq.add(zzpjVar);
        zzbm(3);
    }

    public final void zzb(zzpj zzpjVar) {
        this.zzbnq.remove(zzpjVar);
    }

    private final void zzcr() {
        zzaul.zzdsu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzpi
            private final zzpf zzbnw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbnw = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbnw.zzlj();
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzzk = -1;
        zze(view);
        zzbm(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzzk = -1;
        zzbm(3);
        zzcr();
        zzf(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzbnm == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.zzbnm.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzzk = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzbm(3);
        zzcr();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzbm(3);
        zzcr();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzbm(3);
        zzcr();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzbm(3);
        zzcr();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzbm(3);
        zzcr();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbm(3);
        zzcr();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzbm(3);
        zzcr();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzbm(2);
        zzcr();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzbm(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbm(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> emptyList;
        if (this.zzbnq.size() == 0 || (weakReference = this.zzbnm) == null) {
            return;
        }
        View view = weakReference.get();
        boolean z3 = i == 1;
        boolean z4 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr2);
            } catch (Exception e) {
                zzaug.zzc("Failure getting view location.", e);
            }
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = rect.left + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            z = false;
            z2 = false;
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcma)).booleanValue() && view != null) {
            emptyList = zzh(view);
        } else {
            emptyList = Collections.emptyList();
        }
        List<Rect> list = emptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i2 = this.zzzk;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        boolean z5 = !z4 && com.google.android.gms.ads.internal.zzq.zzkj().zza(view, this.zzzd, this.zzze) && z && z2 && windowVisibility == 0;
        if (z3 && !this.zzbno.tryAcquire() && z5 == this.zzbnp) {
            return;
        }
        if (z5 || this.zzbnp || i != 1) {
            zzpk zzpkVar = new zzpk(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime(), this.zzzd.isScreenOn(), view != null && com.google.android.gms.ads.internal.zzq.zzkl().isAttachedToWindow(view), view != null ? view.getWindowVisibility() : 8, zza(this.zzbnr), zza(rect), zza(rect2), z, zza(rect3), z2, zza(rect4), this.zzwl.density, z5, list);
            Iterator<zzpj> it = this.zzbnq.iterator();
            while (it.hasNext()) {
                it.next().zza(zzpkVar);
            }
            this.zzbnp = z5;
        }
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzbn(rect.left), zzbn(rect.top), zzbn(rect.right), zzbn(rect.bottom));
    }

    private final int zzbn(int i) {
        return (int) (i / this.zzwl.density);
    }

    private final List<Rect> zzh(View view) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 16) {
                    z = view2.isScrollContainer();
                } else {
                    if (!(view2 instanceof ScrollView) && !(view2 instanceof ListView)) {
                        z = false;
                    }
                    z = true;
                }
                if (z && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(zza(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void zze(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzzg = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzbnl == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzbnl = new zzph(this);
            com.google.android.gms.ads.internal.zzq.zzle().zza(this.zzzc, this.zzbnl, intentFilter);
        }
        Application application = this.zzxh;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzbnn);
            } catch (Exception e) {
                zzaug.zzc("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzf(View view) {
        try {
            if (this.zzzg != null) {
                ViewTreeObserver viewTreeObserver = this.zzzg.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzzg = null;
            }
        } catch (Exception e) {
            zzaug.zzc("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzaug.zzc("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzbnl != null) {
            try {
                com.google.android.gms.ads.internal.zzq.zzle().zza(this.zzzc, this.zzbnl);
            } catch (IllegalStateException e3) {
                zzaug.zzc("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzq.zzkn().zza(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzbnl = null;
        }
        Application application = this.zzxh;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzbnn);
            } catch (Exception e5) {
                zzaug.zzc("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void zzeh(long j) {
        this.zzbno.zzev(j);
    }

    public final void zzli() {
        this.zzbno.zzev(zzbnj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzlj() {
        zzbm(3);
    }
}
