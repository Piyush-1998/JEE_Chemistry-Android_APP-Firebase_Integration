package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzayw extends FrameLayout implements zzayr {
    private final zzazj zzdya;
    private final FrameLayout zzdyb;
    private final zzaab zzdyc;
    private final zzazl zzdyd;
    private final long zzdye;
    private zzayu zzdyf;
    private boolean zzdyg;
    private boolean zzdyh;
    private boolean zzdyi;
    private boolean zzdyj;
    private long zzdyk;
    private long zzdyl;
    private String zzdym;
    private String[] zzdyn;
    private Bitmap zzdyo;
    private ImageView zzdyp;
    private boolean zzdyq;

    public static void zzb(zzazj zzazjVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        zzazjVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzazj zzazjVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        zzazjVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzazj zzazjVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        zzazjVar.zza("onVideoEvent", hashMap);
    }

    public zzayw(Context context, zzazj zzazjVar, int i, boolean z, zzaab zzaabVar, zzazk zzazkVar) {
        super(context);
        this.zzdya = zzazjVar;
        this.zzdyc = zzaabVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzdyb = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzazjVar.zzxo());
        zzayu zza = zzazjVar.zzxo().zzbko.zza(context, zzazjVar, i, z, zzaabVar, zzazkVar);
        this.zzdyf = zza;
        if (zza != null) {
            this.zzdyb.addView(zza, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzuv.zzon().zzd(zzza.zzchp)).booleanValue()) {
                zzxc();
            }
        }
        this.zzdyp = new ImageView(context);
        this.zzdye = ((Long) zzuv.zzon().zzd(zzza.zzcht)).longValue();
        boolean booleanValue = ((Boolean) zzuv.zzon().zzd(zzza.zzchr)).booleanValue();
        this.zzdyj = booleanValue;
        zzaab zzaabVar2 = this.zzdyc;
        if (zzaabVar2 != null) {
            zzaabVar2.zzj("spinner_used", booleanValue ? "1" : "0");
        }
        this.zzdyd = new zzazl(this);
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar != null) {
            zzayuVar.zza(this);
        }
        if (this.zzdyf == null) {
            zzn("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzdyb.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzc(String str, String[] strArr) {
        this.zzdym = str;
        this.zzdyn = strArr;
    }

    public final void zza(float f, float f2) {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar != null) {
            zzayuVar.zza(f, f2);
        }
    }

    public final void zzhk() {
        if (this.zzdyf == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzdym)) {
            this.zzdyf.zzb(this.zzdym, this.zzdyn);
        } else {
            zzd("no_src", new String[0]);
        }
    }

    public final void pause() {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        zzayuVar.pause();
    }

    public final void play() {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        zzayuVar.play();
    }

    public final void seekTo(int i) {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        zzayuVar.seekTo(i);
    }

    public final void zzxa() {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        zzayuVar.zzdxy.setMuted(true);
        zzayuVar.zzwu();
    }

    public final void zzxb() {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        zzayuVar.zzdxy.setMuted(false);
        zzayuVar.zzwu();
    }

    public final void setVolume(float f) {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        zzayuVar.zzdxy.setVolume(f);
        zzayuVar.zzwu();
    }

    public final void zzcs(int i) {
        this.zzdyf.zzcs(i);
    }

    public final void zzct(int i) {
        this.zzdyf.zzct(i);
    }

    public final void zzcu(int i) {
        this.zzdyf.zzcu(i);
    }

    public final void zzcv(int i) {
        this.zzdyf.zzcv(i);
    }

    public final void zzcw(int i) {
        this.zzdyf.zzcw(i);
    }

    public final void zze(MotionEvent motionEvent) {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        zzayuVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzxc() {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        TextView textView = new TextView(zzayuVar.getContext());
        String valueOf = String.valueOf(this.zzdyf.zzwq());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzdyb.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzdyb.bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzwv() {
        this.zzdyd.resume();
        zzaul.zzdsu.post(new zzayx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzel() {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar != null && this.zzdyl == 0) {
            zzd("canplaythrough", "duration", String.valueOf(zzayuVar.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.zzdyf.getVideoWidth()), "videoHeight", String.valueOf(this.zzdyf.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzww() {
        if (this.zzdya.zzxn() != null && !this.zzdyh) {
            boolean z = (this.zzdya.zzxn().getWindow().getAttributes().flags & 128) != 0;
            this.zzdyi = z;
            if (!z) {
                this.zzdya.zzxn().getWindow().addFlags(128);
                this.zzdyh = true;
            }
        }
        this.zzdyg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void onPaused() {
        zzd("pause", new String[0]);
        zzxf();
        this.zzdyg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzwx() {
        zzd("ended", new String[0]);
        zzxf();
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzn(String str, String str2) {
        zzd("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzwy() {
        if (this.zzdyq && this.zzdyo != null && !zzxe()) {
            this.zzdyp.setImageBitmap(this.zzdyo);
            this.zzdyp.invalidate();
            this.zzdyb.addView(this.zzdyp, new FrameLayout.LayoutParams(-1, -1));
            this.zzdyb.bringChildToFront(this.zzdyp);
        }
        this.zzdyd.pause();
        this.zzdyl = this.zzdyk;
        zzaul.zzdsu.post(new zzaza(this));
    }

    public final void destroy() {
        this.zzdyd.pause();
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar != null) {
            zzayuVar.stop();
        }
        zzxf();
    }

    public final void finalize() throws Throwable {
        try {
            this.zzdyd.pause();
            if (this.zzdyf != null) {
                zzayu zzayuVar = this.zzdyf;
                zzddl zzddlVar = zzaxn.zzdwm;
                zzayuVar.getClass();
                zzddlVar.execute(zzayv.zza(zzayuVar));
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzxd() {
        zzayu zzayuVar = this.zzdyf;
        if (zzayuVar == null) {
            return;
        }
        long currentPosition = zzayuVar.getCurrentPosition();
        if (this.zzdyk == currentPosition || currentPosition <= 0) {
            return;
        }
        zzd("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
        this.zzdyk = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzwz() {
        if (this.zzdyg && zzxe()) {
            this.zzdyb.removeView(this.zzdyp);
        }
        if (this.zzdyo != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
            if (this.zzdyf.getBitmap(this.zzdyo) != null) {
                this.zzdyq = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
            if (zzaug.zzuu()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zzaug.zzdy(sb.toString());
            }
            if (elapsedRealtime2 > this.zzdye) {
                zzaug.zzeu("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzdyj = false;
                this.zzdyo = null;
                zzaab zzaabVar = this.zzdyc;
                if (zzaabVar != null) {
                    zzaabVar.zzj("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final void zzj(int i, int i2) {
        if (this.zzdyj) {
            int max = Math.max(i / ((Integer) zzuv.zzon().zzd(zzza.zzchs)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzuv.zzon().zzd(zzza.zzchs)).intValue(), 1);
            Bitmap bitmap = this.zzdyo;
            if (bitmap != null && bitmap.getWidth() == max && this.zzdyo.getHeight() == max2) {
                return;
            }
            this.zzdyo = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzdyq = false;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zzdyd.resume();
        } else {
            this.zzdyd.pause();
            this.zzdyl = this.zzdyk;
        }
        zzaul.zzdsu.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzayy
            private final zzayw zzdys;
            private final boolean zzdyt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdys = this;
                this.zzdyt = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdys.zzan(this.zzdyt);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzayr
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zzdyd.resume();
            z = true;
        } else {
            this.zzdyd.pause();
            this.zzdyl = this.zzdyk;
            z = false;
        }
        zzaul.zzdsu.post(new zzayz(this, z));
    }

    private final boolean zzxe() {
        return this.zzdyp.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzdya.zza("onVideoEvent", hashMap);
    }

    private final void zzxf() {
        if (this.zzdya.zzxn() == null || !this.zzdyh || this.zzdyi) {
            return;
        }
        this.zzdya.zzxn().getWindow().clearFlags(128);
        this.zzdyh = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzan(boolean z) {
        zzd("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
