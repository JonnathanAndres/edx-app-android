package org.edx.mobile.util;

public enum AppConstants {
    ;

    @Deprecated // This is not a constant. Should move it to the activity and use savedInstanceState.
    public static boolean myVideosDeleteMode = false;
    @Deprecated // This is not a constant. Should move it to the activity and use savedInstanceState.
    public static boolean videoListDeleteMode = false;

    public static final String VIDEOLIST_BACK_PRESSED = "offline_video_back_pressed";

    public static final double MILLISECONDS_PER_SECOND = 1000.00;
    // Threshold value to consider user has not rated yet
    public static final float APP_NOT_RATED_THRESHOLD = 0.0f;
    // Threshold value to consider user has given negative rate
    public static final float APP_NEGATIVE_RATING_THRESHOLD = 3.0f;
    // Minimum minor version changes required for negative raters to ask rate again.
    public static final int MINOR_VERSIONS_DIFF_REQUIRED_FOR_NEGATIVE_RATERS = 2;

    /**
     * This class defines the names of various directories which are used for
     * storing application data.
     */
    public static final class Directories {
        /**
         * The name of the directory which is used to store downloaded videos.
         */
        public static final String VIDEOS = "videos";
        /**
         * The name of the directory which is used to store subtitles of the
         * downloaded videos.
         */
        public static final String SUBTITLES = "subtitles";
    }
}
