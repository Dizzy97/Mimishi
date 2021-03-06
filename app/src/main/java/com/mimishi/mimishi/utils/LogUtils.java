package com.mimishi.mimishi.utils;

/**
 * Created by chen on 16-11-30.
 */

public final class LogUtils {
    /**
     * all Log print on-off
     */
    private final static boolean all = true;
    /**
     * info Log print on-off
     */
    private final static boolean i = true;
    /**
     * debug Log print on-off
     */
    private final static boolean d = true;
    /**
     * err Log print on-off
     */
    private final static boolean e = true;
    /**
     * verbose Log print on-off
     */
    private final static boolean v = true;
    /**
     * warn Log print on-off
     */
    private final static boolean w = true;
    /**
     * default print tag
     */
    private final static String defaultTag = "__________>";

    private LogUtils() {
    }

    /**
     * info Log print,default print tag
     *
     * @param msg :print message
     */
    public static void i(String msg) {
        if (all && i) {
            android.util.Log.i(defaultTag, msg);
        }
    }

    /**
     * info Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void i(String tag, String msg) {
        if (all && i) {
            android.util.Log.i(tag, msg);
        }
    }

    /**
     * debug Log print,default print tag
     *
     * @param msg :print message
     */
    public static void d(String msg) {
        if (all && d) {
            android.util.Log.d(defaultTag, msg);
        }
    }

    /**
     * debug Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void d(String tag, String msg) {
        if (all && d) {
            android.util.Log.d(tag, msg);
        }
    }

    /**
     * err Log print,default print tag
     *
     * @param msg :print message
     */
    public static void e(String msg) {
        if (all && e) {
            try {
                android.util.Log.e(defaultTag, msg);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    /**
     * err Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void e(String tag, String msg) {
        if (all && e) {
            android.util.Log.e(tag, msg);
        }
    }

    /**
     * verbose Log print,default print tag
     *
     * @param msg :print message
     */
    public static void v(String msg) {
        if (all && v) {
            android.util.Log.v(defaultTag, msg);
        }
    }

    /**
     * verbose Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void v(String tag, String msg) {
        if (all && v) {
            android.util.Log.v(tag, msg);
        }
    }

    /**
     * warn Log print,default print tag
     *
     * @param msg :print message
     */
    public static void w(String msg) {
        if (all && w) {
            android.util.Log.w(defaultTag, msg);
        }
    }

    /**
     * warn Log print
     *
     * @param tag :print tag
     * @param msg :print message
     */
    public static void w(String tag, String msg) {
        if (all && w) {
            android.util.Log.w(tag, msg);
        }
    }

}
