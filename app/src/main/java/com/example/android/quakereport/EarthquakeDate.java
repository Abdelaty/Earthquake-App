package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EarthquakeDate {

    private String mLocation, mUrl;
    private double mEarthquakeMag;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    public EarthquakeDate(double magnitude, String location, long timeInMilliseconds, String url) {
        mEarthquakeMag = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    public double getEarthquakeMag() {
        return mEarthquakeMag;
    }

    /**
     * Get the earthquake time
     */

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    public String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    public String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    public String getUrl() {
        return mUrl;
    }
}
