package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhn implements Runnable {
    private final String packageName;
    private final URL url;
    private final byte[] zzlc;
    private final Map<String, String> zzle;
    private final zzhk zzqm;
    private final /* synthetic */ zzhl zzqn;

    public zzhn(zzhl zzhlVar, String str, URL url, byte[] bArr, Map<String, String> map, zzhk zzhkVar) {
        this.zzqn = zzhlVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzhkVar);
        this.url = url;
        this.zzlc = null;
        this.zzqm = zzhkVar;
        this.packageName = str;
        this.zzle = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        Map<String, List<String>> headerFields;
        byte[] zza;
        this.zzqn.zzn();
        int i = 0;
        try {
            httpURLConnection = this.zzqn.zza(this.url);
            try {
                if (this.zzle != null) {
                    for (Map.Entry<String, String> entry : this.zzle.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                i = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
            } catch (IOException e) {
                e = e;
                map2 = null;
            } catch (Throwable th) {
                th = th;
                map = null;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            map = null;
        }
        try {
            zzhl zzhlVar = this.zzqn;
            zza = zzhl.zza(httpURLConnection);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            zza(i, null, zza, headerFields);
        } catch (IOException e3) {
            map2 = headerFields;
            e = e3;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            zza(i, e, null, map2);
        } catch (Throwable th3) {
            map = headerFields;
            th = th3;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            zza(i, null, null, map);
            throw th;
        }
    }

    private final void zza(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.zzqn.zzaa().zza(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.zzhm
            private final zzhn zzqh;
            private final int zzqi;
            private final Exception zzqj;
            private final byte[] zzqk;
            private final Map zzql;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzqh = this;
                this.zzqi = i;
                this.zzqj = exc;
                this.zzqk = bArr;
                this.zzql = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzqh.zzb(this.zzqi, this.zzqj, this.zzqk, this.zzql);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(int i, Exception exc, byte[] bArr, Map map) {
        this.zzqm.zza(this.packageName, i, exc, bArr, map);
    }
}
