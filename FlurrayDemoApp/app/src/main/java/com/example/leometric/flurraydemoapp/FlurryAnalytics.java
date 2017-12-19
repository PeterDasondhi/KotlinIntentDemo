package com.example.leometric.flurraydemoapp;

import com.flurry.android.FlurryAgent;

import java.util.Map;

/**
 * Created by LeoMetric on 12/19/2017.
 */

public class FlurryAnalytics {

    public static final String EVENT_PHOTO_SELECTED = "photo_selected";
    public static final String EVENT_FETCH_PHOTOS = "fetch_photo_feed";
    public static final String EVENT_FETCH_PHOTO_STATS = "fetch_photo_stats";

    public static final String PARAM_SELECTED_PHOTO_ID = "selected_photo_id";
    public static final String PARAM_SELECTED_PHOTO_SECRET = "selected_photo_secret";
    public static final String PARAM_LOCATION = "location_request_param";
    public static final String PARAM_FETCH_PHOTO_ID = "fetch_photo_id";
    public static final String PARAM_FETCH_PHOTO_SECRET = "fetch_photo_secret";

    /**
     * Logs an event for analytics.
     *
     * @param eventName     name of the event
     * @param eventParams   event parameters (can be null)
     * @param timed         <code>true</code> if the event should be timed, false otherwise
     */
    public static void logEvent(String eventName, Map<String, String> eventParams, boolean timed) {
        FlurryAgent.logEvent(eventName, eventParams, timed);
    }

    /**
     * Ends a timed event that was previously started.
     *
     * @param eventName     name of the event
     * @param eventParams   event parameters (can be null)
     */
    public static void endTimedEvent(String eventName, Map<String, String> eventParams) {
        FlurryAgent.endTimedEvent(eventName, eventParams);
    }

    /**
     * Ends a timed event without event parameters.
     *
     * @param eventName     name of the event
     */
    public static void endTimedEvent(String eventName) {
        FlurryAgent.endTimedEvent(eventName);
    }


    /**
     * Logs an error.
     *
     * @param errorId           error ID
     * @param errorDescription  error description
     * @param throwable         a {@link Throwable} that describes the error
     */
    public static void logError(String errorId, String errorDescription, Throwable throwable) {
        FlurryAgent.onError(errorId, errorDescription, throwable);
    }

    /**
     * Logs location.
     *
     * @param latitude           latitude of location
     * @param longitude        longitude of location
     */
    public static void logLocation(double latitude, double longitude) {
        FlurryAgent.setLocation((float) latitude, (float) longitude);
    }

    /**
     * Logs page view counts.
     *
     */
    public static void logPageViews(){
        FlurryAgent.onPageView();
    }

}
