package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzca implements zzce {
    static final Map<Uri, zzca> zzaah = new ArrayMap();
    private static final String[] zzaam = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};
    private final Uri uri;
    private final ContentResolver zzaai;
    private volatile Map<String, String> zzaak;
    private final Object zzaaj = new Object();
    private final List<zzcf> zzaal = new ArrayList();

    private zzca(ContentResolver contentResolver, Uri uri) {
        this.zzaai = contentResolver;
        this.uri = uri;
        contentResolver.registerContentObserver(uri, false, new zzcc(this, null));
    }

    public static zzca zza(ContentResolver contentResolver, Uri uri) {
        zzca zzcaVar;
        synchronized (zzca.class) {
            zzcaVar = zzaah.get(uri);
            if (zzcaVar == null) {
                try {
                    zzca zzcaVar2 = new zzca(contentResolver, uri);
                    try {
                        zzaah.put(uri, zzcaVar2);
                    } catch (SecurityException unused) {
                    }
                    zzcaVar = zzcaVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzcaVar;
    }

    public final Map<String, String> zzre() {
        Map<String, String> map = this.zzaak;
        if (map == null) {
            synchronized (this.zzaaj) {
                map = this.zzaak;
                if (map == null) {
                    map = zzrg();
                    this.zzaak = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void zzrf() {
        synchronized (this.zzaaj) {
            this.zzaak = null;
            zzcm.zzrl();
        }
        synchronized (this) {
            for (zzcf zzcfVar : this.zzaal) {
                zzcfVar.zzrk();
            }
        }
    }

    private final Map<String, String> zzrg() {
        try {
            return (Map) zzch.zza(new zzcg(this) { // from class: com.google.android.gms.internal.measurement.zzcd
                private final zzca zzaar;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzaar = this;
                }

                @Override // com.google.android.gms.internal.measurement.zzcg
                public final Object zzrj() {
                    return this.zzaar.zzrh();
                }
            });
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzce
    public final /* synthetic */ Object zzdd(String str) {
        return zzre().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map zzrh() {
        Map hashMap;
        Cursor query = this.zzaai.query(this.uri, zzaam, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }
}
