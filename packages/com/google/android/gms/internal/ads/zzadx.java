package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadx implements zzaer<Object> {
    private final zzadw zzcxc;

    public zzadx(zzadw zzadwVar) {
        this.zzcxc = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzcxc == null) {
            return;
        }
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzaug.zzet("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = zzb(new JSONObject(map.get("info")));
            } catch (JSONException e) {
                zzaug.zzc("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            zzaug.zzes("Failed to convert ad metadata to Bundle.");
        } else {
            this.zzcxc.zza(str, bundle);
        }
    }

    private static Bundle zzb(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (jSONArray != null && jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj2 = null;
                        for (int i2 = 0; obj2 == null && i2 < length; i2++) {
                            obj2 = !jSONArray.isNull(i2) ? jSONArray.get(i2) : null;
                        }
                        if (obj2 == null) {
                            String valueOf = String.valueOf(next);
                            zzaug.zzeu(valueOf.length() != 0 ? "Expected JSONArray with at least 1 non-null element for key:".concat(valueOf) : new String("Expected JSONArray with at least 1 non-null element for key:"));
                        } else if (obj2 instanceof JSONObject) {
                            Parcelable[] parcelableArr = new Bundle[length];
                            while (i < length) {
                                parcelableArr[i] = !jSONArray.isNull(i) ? zzb(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, parcelableArr);
                        } else if (obj2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            zzaug.zzeu(String.format("JSONArray with unsupported type %s for key:%s", obj2.getClass().getCanonicalName(), next));
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(next, zzb((JSONObject) obj));
                } else {
                    String valueOf2 = String.valueOf(next);
                    zzaug.zzeu(valueOf2.length() != 0 ? "Unsupported type for key:".concat(valueOf2) : new String("Unsupported type for key:"));
                }
            }
        }
        return bundle;
    }
}
