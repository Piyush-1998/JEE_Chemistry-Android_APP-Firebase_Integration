package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzamu extends zzanj {
    private final Map<String, String> zzcuv;
    private String zzdfh;
    private long zzdfi;
    private long zzdfj;
    private String zzdfk;
    private String zzdfl;
    private final Context zzlk;

    public zzamu(zzbbw zzbbwVar, Map<String, String> map) {
        super(zzbbwVar, "createCalendarEvent");
        this.zzcuv = map;
        this.zzlk = zzbbwVar.zzxn();
        this.zzdfh = zzdl("description");
        this.zzdfk = zzdl("summary");
        this.zzdfi = zzdm("start_ticks");
        this.zzdfj = zzdm("end_ticks");
        this.zzdfl = zzdl("location");
    }

    private final String zzdl(String str) {
        return TextUtils.isEmpty(this.zzcuv.get(str)) ? "" : this.zzcuv.get(str);
    }

    private final long zzdm(String str) {
        String str2 = this.zzcuv.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void execute() {
        if (this.zzlk == null) {
            zzdn("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzkj();
        if (!zzaul.zzas(this.zzlk).zzpp()) {
            zzdn("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzkj();
        AlertDialog.Builder zzar = zzaul.zzar(this.zzlk);
        Resources resources = com.google.android.gms.ads.internal.zzq.zzkn().getResources();
        zzar.setTitle(resources != null ? resources.getString(R.string.s5) : "Create calendar event");
        zzar.setMessage(resources != null ? resources.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzar.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzamx(this));
        zzar.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzamw(this));
        zzar.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzdfh);
        data.putExtra("eventLocation", this.zzdfl);
        data.putExtra("description", this.zzdfk);
        long j = this.zzdfi;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zzdfj;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }
}
