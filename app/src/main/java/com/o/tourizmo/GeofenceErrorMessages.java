package com.o.tourizmo;

import android.content.Context;
import android.content.res.Resources;

import com.google.android.gms.location.GeofenceStatusCodes;

public class GeofenceErrorMessages {

    private GeofenceErrorMessages() {}

    /**
     * Returns the error string for a geofencing error code.
     */
    public static String getErrorString(Context context, int errorCode) {
        Resources mResources = context.getResources();
        switch (errorCode) {
            case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE:
                return "geofence servisce not avilable";
            case GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES:
                return "your app has registerd too many geofencses";
            case GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS:
                return "geofence too many pending intents";
            default:
                return "unknown error:the geofence service is not avilable now";
        }
    }
}
