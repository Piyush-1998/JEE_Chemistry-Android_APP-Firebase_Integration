package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public class zzdrg extends IOException {
    private zzdsg zzhlo;

    public zzdrg(String str) {
        super(str);
        this.zzhlo = null;
    }

    public final zzdrg zzo(zzdsg zzdsgVar) {
        this.zzhlo = zzdsgVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrg zzbac() {
        return new zzdrg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrg zzbad() {
        return new zzdrg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrg zzbae() {
        return new zzdrg("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrg zzbaf() {
        return new zzdrg("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrg zzbag() {
        return new zzdrg("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrf zzbah() {
        return new zzdrf("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrg zzbai() {
        return new zzdrg("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrg zzbaj() {
        return new zzdrg("Protocol message had invalid UTF-8.");
    }
}
