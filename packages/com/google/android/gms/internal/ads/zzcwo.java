package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcwo {
    public static ParcelFileDescriptor zze(final InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        zzaxn.zzdwi.execute(new Runnable(inputStream, parcelFileDescriptor2) { // from class: com.google.android.gms.internal.ads.zzcwn
            private final InputStream zzgks;
            private final ParcelFileDescriptor zzgkt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgks = inputStream;
                this.zzgkt = parcelFileDescriptor2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcwo.zza(this.zzgks, this.zzgkt);
            }
        });
        return parcelFileDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            try {
                IOUtils.copyStream(inputStream, autoCloseOutputStream);
                autoCloseOutputStream.close();
                if (inputStream != null) {
                    zza((Throwable) null, inputStream);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        autoCloseOutputStream.close();
                    } catch (Throwable th3) {
                        zzdoy.zza(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
        }
    }

    private static /* synthetic */ void zza(Throwable th, InputStream inputStream) {
        if (th == null) {
            inputStream.close();
            return;
        }
        try {
            inputStream.close();
        } catch (Throwable th2) {
            zzdoy.zza(th, th2);
        }
    }
}
