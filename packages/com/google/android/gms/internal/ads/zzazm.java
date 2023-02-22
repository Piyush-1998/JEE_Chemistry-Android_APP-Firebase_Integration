package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazm {
    private final zzaxl zzdio;
    private final String zzdje;
    private final zzaab zzdyc;
    private boolean zzdyg;
    private final zzzz zzeat;
    private final long[] zzeav;
    private final String[] zzeaw;
    private zzayu zzebb;
    private boolean zzebc;
    private boolean zzebd;
    private final Context zzlk;
    private final zzavu zzeau = new zzavv().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzwc();
    private boolean zzeax = false;
    private boolean zzeay = false;
    private boolean zzeaz = false;
    private boolean zzeba = false;
    private long zzebe = -1;

    public zzazm(Context context, zzaxl zzaxlVar, String str, zzaab zzaabVar, zzzz zzzzVar) {
        this.zzlk = context;
        this.zzdio = zzaxlVar;
        this.zzdje = str;
        this.zzdyc = zzaabVar;
        this.zzeat = zzzzVar;
        String str2 = (String) zzuv.zzon().zzd(zzza.zzchn);
        if (str2 == null) {
            this.zzeaw = new String[0];
            this.zzeav = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.zzeaw = new String[split.length];
        this.zzeav = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzeav[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzaug.zzd("Unable to parse frame hash target time number.", e);
                this.zzeav[i] = -1;
            }
        }
    }

    public final void zzb(zzayu zzayuVar) {
        zzzs.zza(this.zzdyc, this.zzeat, "vpc2");
        this.zzeax = true;
        zzaab zzaabVar = this.zzdyc;
        if (zzaabVar != null) {
            zzaabVar.zzj("vpn", zzayuVar.zzwq());
        }
        this.zzebb = zzayuVar;
    }

    public final void zzel() {
        if (!this.zzeax || this.zzeay) {
            return;
        }
        zzzs.zza(this.zzdyc, this.zzeat, "vfr2");
        this.zzeay = true;
    }

    public final void onStop() {
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzchm)).booleanValue() || this.zzebc) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzdje);
        bundle.putString("player", this.zzebb.zzwq());
        for (zzavw zzavwVar : this.zzeau.zzwb()) {
            String valueOf = String.valueOf(zzavwVar.name);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(zzavwVar.count));
            String valueOf2 = String.valueOf(zzavwVar.name);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(zzavwVar.zzduh));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzeav;
            if (i < jArr.length) {
                String str = this.zzeaw[i];
                if (str != null) {
                    String valueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf3);
                    bundle.putString(sb.toString(), str);
                }
                i++;
            } else {
                com.google.android.gms.ads.internal.zzq.zzkj().zza(this.zzlk, this.zzdio.zzblz, "gmob-apps", bundle, true);
                this.zzebc = true;
                return;
            }
        }
    }

    public final void zzc(zzayu zzayuVar) {
        if (this.zzeaz && !this.zzeba) {
            if (zzaug.zzuu() && !this.zzeba) {
                zzaug.zzdy("VideoMetricsMixin first frame");
            }
            zzzs.zza(this.zzdyc, this.zzeat, "vff2");
            this.zzeba = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzq.zzkq().nanoTime();
        if (this.zzdyg && this.zzebd && this.zzebe != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            double d = nanoTime - this.zzebe;
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.zzeau.zza(nanos / d);
        }
        this.zzebd = this.zzdyg;
        this.zzebe = nanoTime;
        long longValue = ((Long) zzuv.zzon().zzd(zzza.zzcho)).longValue();
        long currentPosition = zzayuVar.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.zzeaw;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(currentPosition - this.zzeav[i])) {
                String[] strArr2 = this.zzeaw;
                int i2 = 8;
                Bitmap bitmap = zzayuVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }

    public final void zzxw() {
        this.zzdyg = true;
        if (!this.zzeay || this.zzeaz) {
            return;
        }
        zzzs.zza(this.zzdyc, this.zzeat, "vfp2");
        this.zzeaz = true;
    }

    public final void zzxx() {
        this.zzdyg = false;
    }
}
