package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzatq {
    private final Clock zzbmp;
    private final String zzdjg;
    private final zzatz zzdqe;
    private final String zzdqg;
    private final Object lock = new Object();
    private long zzdku = -1;
    private long zzdqh = -1;
    private boolean zzdkq = false;
    private long zzdqi = -1;
    private long zzdqj = 0;
    private long zzdqk = -1;
    private long zzdql = -1;
    private final LinkedList<zzatp> zzdqf = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatq(Clock clock, zzatz zzatzVar, String str, String str2) {
        this.zzbmp = clock;
        this.zzdqe = zzatzVar;
        this.zzdqg = str;
        this.zzdjg = str2;
    }

    public final void zze(zztx zztxVar) {
        synchronized (this.lock) {
            long elapsedRealtime = this.zzbmp.elapsedRealtime();
            this.zzdqk = elapsedRealtime;
            this.zzdqe.zza(zztxVar, elapsedRealtime);
        }
    }

    public final void zzes(long j) {
        synchronized (this.lock) {
            this.zzdql = j;
            if (j != -1) {
                this.zzdqe.zzb(this);
            }
        }
    }

    public final void zztx() {
        synchronized (this.lock) {
            if (this.zzdql != -1 && this.zzdqh == -1) {
                this.zzdqh = this.zzbmp.elapsedRealtime();
                this.zzdqe.zzb(this);
            }
            this.zzdqe.zztx();
        }
    }

    public final void zzty() {
        synchronized (this.lock) {
            if (this.zzdql != -1) {
                zzatp zzatpVar = new zzatp(this);
                zzatpVar.zztw();
                this.zzdqf.add(zzatpVar);
                this.zzdqj++;
                this.zzdqe.zzty();
                this.zzdqe.zzb(this);
            }
        }
    }

    public final void zztz() {
        synchronized (this.lock) {
            if (this.zzdql != -1 && !this.zzdqf.isEmpty()) {
                zzatp last = this.zzdqf.getLast();
                if (last.zztu() == -1) {
                    last.zztv();
                    this.zzdqe.zzb(this);
                }
            }
        }
    }

    public final void zzag(boolean z) {
        synchronized (this.lock) {
            if (this.zzdql != -1) {
                this.zzdqi = this.zzbmp.elapsedRealtime();
            }
        }
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zzdqg);
            bundle.putString("slotid", this.zzdjg);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzdqk);
            bundle.putLong("tresponse", this.zzdql);
            bundle.putLong("timp", this.zzdqh);
            bundle.putLong("tload", this.zzdqi);
            bundle.putLong("pcc", this.zzdqj);
            bundle.putLong("tfetch", this.zzdku);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<zzatp> it = this.zzdqf.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toBundle());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzua() {
        return this.zzdqg;
    }
}
