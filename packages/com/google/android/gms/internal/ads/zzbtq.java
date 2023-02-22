package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbtq implements zzbuz {
    private final zzaxl zzblk;
    private final Clock zzbmp;
    private final zzdf zzegb;
    private final zzcyp zzfbe;
    private final zzbuy zzfdo;
    private final zzcvr zzfet;
    private final zzcwe zzfga;
    private final JSONObject zzfjj;
    private final zzbyh zzfjk;
    private final zzbur zzfjl;
    private final zzbni zzfjm;
    private final zzbmv zzfjn;
    private final zzbhk zzfjo;
    private final zzbvm zzfjp;
    private final zzbqv zzfjq;
    private boolean zzfjs;
    private zzwe zzfjz;
    private final Context zzlk;
    private boolean zzfjr = false;
    private boolean zzfjt = false;
    private boolean zzfju = false;
    private Point zzfjv = new Point();
    private Point zzfjw = new Point();
    private long zzfjx = 0;
    private long zzfjy = 0;

    public zzbtq(Context context, zzbuy zzbuyVar, JSONObject jSONObject, zzbyh zzbyhVar, zzbur zzburVar, zzdf zzdfVar, zzbni zzbniVar, zzbmv zzbmvVar, zzcvr zzcvrVar, zzaxl zzaxlVar, zzcwe zzcweVar, zzbhk zzbhkVar, zzbvm zzbvmVar, Clock clock, zzbqv zzbqvVar, zzcyp zzcypVar) {
        this.zzlk = context;
        this.zzfdo = zzbuyVar;
        this.zzfjj = jSONObject;
        this.zzfjk = zzbyhVar;
        this.zzfjl = zzburVar;
        this.zzegb = zzdfVar;
        this.zzfjm = zzbniVar;
        this.zzfjn = zzbmvVar;
        this.zzfet = zzcvrVar;
        this.zzblk = zzaxlVar;
        this.zzfga = zzcweVar;
        this.zzfjo = zzbhkVar;
        this.zzfjp = zzbvmVar;
        this.zzbmp = clock;
        this.zzfjq = zzbqvVar;
        this.zzfbe = zzcypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzfjv = new Point();
        this.zzfjw = new Point();
        if (!this.zzfjs) {
            this.zzfjq.zzq(view);
            this.zzfjs = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzfjo.zzo(this);
        boolean zzcp = zzawm.zzcp(this.zzblk.zzdwf);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (zzcp) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (zzcp) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(View view, Map<String, WeakReference<View>> map) {
        this.zzfjv = new Point();
        this.zzfjw = new Point();
        this.zzfjq.zzr(view);
        this.zzfjs = false;
    }

    private final boolean zzfo(String str) {
        JSONObject optJSONObject = this.zzfjj.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject zza = zza(map, map2, view2);
        JSONObject zzs = zzs(view2);
        JSONObject zzt = zzt(view2);
        JSONObject zzu = zzu(view2);
        String zzb = zzb(view, map);
        zza(view, zzs, zza, zzt, zzu, zzb, zzfq(zzb), null, z, false);
    }

    private final String zzb(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int zzahp = this.zzfjl.zzahp();
        if (zzahp != 1) {
            if (zzahp != 2) {
                if (zzahp != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzfp(String str) {
        zza(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzf(Bundle bundle) {
        if (bundle == null) {
            zzaug.zzdv("Click data is null. No click is reported.");
        } else if (!zzfo("click_reporting")) {
            zzaug.zzes("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zza(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.zzq.zzkj().zza(bundle, (JSONObject) null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfju) {
            zzaug.zzdv("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!zzahc()) {
            zzaug.zzdv("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            JSONObject zza = zza(map, map2, view);
            JSONObject zzs = zzs(view);
            JSONObject zzt = zzt(view);
            JSONObject zzu = zzu(view);
            String zzb = zzb(null, map);
            zza(view, zzs, zza, zzt, zzu, zzb, zzfq(zzb), null, z, true);
        }
    }

    private final boolean zzahc() {
        return this.zzfjj.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzqw() {
        this.zzfju = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final boolean isCustomClickGestureEnabled() {
        return zzahc();
    }

    private final void zza(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzfjj);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzfdo.zzfv(this.zzfjl.getCustomTemplateId()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zzfjl.zzahp());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.zzfga.zzdeh != null && this.zzfga.zzdeh.zzbka);
            jSONObject8.put("custom_mute_enabled", (this.zzfjl.getMuteThisAdReasons().isEmpty() || this.zzfjl.zzahs() == null) ? false : true);
            if (this.zzfjp.zzaiw() != null && this.zzfjj.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzbmp.currentTimeMillis());
            if (this.zzfju && zzahc()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzfdo.zzfv(this.zzfjl.getCustomTemplateId()) != null);
            jSONObject8.put("click_signals", zzv(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzbmp.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzfjx);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzfjy);
            jSONObject7.put("touch_signal", jSONObject9);
            zzaxr.zza(this.zzfjk.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            zzaug.zzc("Unable to create click JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(View view, MotionEvent motionEvent, View view2) {
        int[] zzw = zzw(view2);
        this.zzfjv = new Point(((int) motionEvent.getRawX()) - zzw[0], ((int) motionEvent.getRawY()) - zzw[1]);
        long currentTimeMillis = this.zzbmp.currentTimeMillis();
        this.zzfjy = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzfjx = currentTimeMillis;
            this.zzfjw = this.zzfjv;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(this.zzfjv.x, this.zzfjv.y);
        this.zzegb.zzb(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzg(Bundle bundle) {
        if (bundle == null) {
            zzaug.zzdv("Touch event data is null. No touch event is reported.");
        } else if (!zzfo("touch_reporting")) {
            zzaug.zzes("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.zzegb.zzcd().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzahd() {
        zza((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void setClickConfirmingView(View view) {
        if (!this.zzfjj.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzaug.zzeu("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzbvm zzbvmVar = this.zzfjp;
        if (view != null) {
            view.setOnClickListener(zzbvmVar);
            view.setClickable(true);
            zzbvmVar.zzfni = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(zzadf zzadfVar) {
        if (!this.zzfjj.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzaug.zzeu("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzfjp.zza(zzadfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void cancelUnconfirmedClick() {
        if (this.zzfjj.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzfjp.cancelUnconfirmedClick();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(zzwi zzwiVar) {
        try {
            if (this.zzfjt) {
                return;
            }
            if (zzwiVar == null && this.zzfjl.zzahs() != null) {
                this.zzfjt = true;
                this.zzfbe.zzei(this.zzfjl.zzahs().zzov());
                zzahe();
                return;
            }
            this.zzfjt = true;
            this.zzfbe.zzei(zzwiVar.zzov());
            zzahe();
        } catch (RemoteException e) {
            zzaug.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(zzwe zzweVar) {
        this.zzfjz = zzweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzahe() {
        try {
            if (this.zzfjz != null) {
                this.zzfjz.onAdMuted();
            }
        } catch (RemoteException e) {
            zzaug.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        zza(zzs(view), zza(map, map2, view), zzt(view), zzu(view), (JSONObject) null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzahf() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzfjj);
            zzaxr.zza(this.zzfjk.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final boolean zzh(Bundle bundle) {
        if (!zzfo("impression_reporting")) {
            zzaug.zzes("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return zza((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, com.google.android.gms.ads.internal.zzq.zzkj().zza(bundle, (JSONObject) null));
    }

    private final boolean zza(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzfjj);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            this.zzfjk.zza("/logScionEvent", new zzbts(this));
            this.zzfjk.zza("/nativeImpression", new zzbtv(this));
            zzaxr.zza(this.zzfjk.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzfjr || this.zzfet.zzgjj == null) {
                return true;
            }
            this.zzfjr |= com.google.android.gms.ads.internal.zzq.zzkt().zzb(this.zzlk, this.zzblk.zzblz, this.zzfet.zzgjj.toString(), this.zzfga.zzgkh);
            return true;
        } catch (JSONException e) {
            zzaug.zzc("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final JSONObject zzb(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzdf(rect.right - rect.left));
        jSONObject.put("height", zzdf(rect.bottom - rect.top));
        jSONObject.put("x", zzdf(rect.left));
        jSONObject.put("y", zzdf(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e4 A[Catch: JSONException -> 0x0100, TRY_LEAVE, TryCatch #4 {JSONException -> 0x0100, blocks: (B:81:0x00cb, B:95:0x00f3, B:96:0x00f7, B:97:0x00fc, B:86:0x00da, B:89:0x00e4), top: B:105:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fc A[Catch: JSONException -> 0x0100, TRY_LEAVE, TryCatch #4 {JSONException -> 0x0100, blocks: (B:81:0x00cb, B:95:0x00f3, B:96:0x00f7, B:97:0x00fc, B:86:0x00da, B:89:0x00e4), top: B:105:0x00cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final org.json.JSONObject zzs(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtq.zzs(android.view.View):org.json.JSONObject");
    }

    private static JSONObject zzt(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzq.zzkj();
            jSONObject.put("contained_in_scroll_view", zzaul.zzp(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject zzu(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzq.zzkj();
            jSONObject.put("can_show_on_lock_screen", zzaul.zzo(view));
            com.google.android.gms.ads.internal.zzq.zzkj();
            jSONObject.put("is_keyguard_locked", zzaul.zzax(this.zzlk));
        } catch (JSONException unused) {
            zzaug.zzeu("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private final JSONObject zza(Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] zzw = zzw(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] zzw2 = zzw(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", zzdf(view2.getMeasuredWidth()));
                        jSONObject4.put("height", zzdf(view2.getMeasuredHeight()));
                        jSONObject4.put("x", zzdf(zzw2[0] - zzw[0]));
                        jSONObject4.put("y", zzdf(zzw2[1] - zzw[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = zzb(rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", zzdf(zzw2[0] - zzw[0]));
                            jSONObject.put("y", zzdf(zzw2[1] - zzw[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                zzaug.zzeu("Unable to get asset views information");
                                it = it2;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                    it = it2;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    private final String zzv(View view) {
        try {
            JSONObject optJSONObject = this.zzfjj.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.zzegb.zzcd().zza(this.zzlk, optJSONObject.optString("click_string"), view);
        } catch (Exception e) {
            zzaug.zzc("Exception obtaining click signals", e);
            return null;
        }
    }

    private final JSONObject zzfq(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", zzahg());
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e) {
                e = e;
                jSONObject = jSONObject2;
                zzaug.zzc("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final JSONObject zzahg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", zzdf(this.zzfjv.x));
            jSONObject.put("y", zzdf(this.zzfjv.y));
            jSONObject.put("start_x", zzdf(this.zzfjw.x));
            jSONObject.put("start_y", zzdf(this.zzfjw.y));
            return jSONObject;
        } catch (JSONException e) {
            zzaug.zzc("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    private static int[] zzw(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private final int zzdf(int i) {
        return zzuv.zzoj().zzb(this.zzlk, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void destroy() {
        this.zzfjk.destroy();
    }
}
