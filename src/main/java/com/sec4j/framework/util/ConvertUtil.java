package com.sec4j.framework.util;

/**
 * 转型操作工具类
 * 
 * ClassName: ConvertUtil 
 * @author songge
 * @date 2014-10-27
 * @since 0.1
 */
public class ConvertUtil {

    /**
     * 转为 String 型
     */
    public static String toString(Object obj) {
        return ConvertUtil.toString(obj, "");
    }

    /**
     * 转为 String 型（提供默认值）
     */
    public static String toString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为 double 型
     */
    public static double toDouble(Object obj) {
        return ConvertUtil.toDouble(obj, 0);
    }

    /**
     * 转为 double 型（提供默认值）
     */
    public static double toDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if (obj != null) {
            String strValue = toString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为 long 型
     */
    public static long toLong(Object obj) {
        return ConvertUtil.toLong(obj, 0);
    }

    /**
     * 转为 long 型（提供默认值）
     */
    public static long toLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = toString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为 int 型
     */
    public static int toInt(Object obj) {
        return ConvertUtil.toInt(obj, 0);
    }

    /**
     * 转为 int 型（提供默认值）
     */
    public static int toInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String strValue = toString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为 boolean 型
     */
    public static boolean toBoolean(Object obj) {
        return ConvertUtil.toBoolean(obj, false);
    }

    /**
     * 转为 boolean 型（提供默认值）
     */
    public static boolean toBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(toString(obj));
        }
        return booleanValue;
    }

    /**
     * 转为 String[] 型
     */
    public static String[] toStringArray(Object[] objArray) {
        if (objArray == null) {
            objArray = new Object[0];
        }
        String[] strArray = new String[objArray.length];
        if (ArrayUtil.isNotEmpty(objArray)) {
            for (int i = 0; i < objArray.length; i++) {
                strArray[i] = toString(objArray[i]);
            }
        }
        return strArray;
    }

    /**
     * 转为 double[] 型
     */
    public static double[] toDoubleArray(Object[] objArray) {
        if (objArray == null) {
            objArray = new Object[0];
        }
        double[] doubleArray = new double[objArray.length];
        if (!ArrayUtil.isEmpty(objArray)) {
            for (int i = 0; i < objArray.length; i++) {
                doubleArray[i] = toDouble(objArray[i]);
            }
        }
        return doubleArray;
    }

    /**
     * 转为 long[] 型
     */
    public static long[] toLongArray(Object[] objArray) {
        if (objArray == null) {
            objArray = new Object[0];
        }
        long[] longArray = new long[objArray.length];
        if (!ArrayUtil.isEmpty(objArray)) {
            for (int i = 0; i < objArray.length; i++) {
                longArray[i] = toLong(objArray[i]);
            }
        }
        return longArray;
    }

    /**
     * 转为 int[] 型
     */
    public static int[] toIntArray(Object[] objArray) {
        if (objArray == null) {
            objArray = new Object[0];
        }
        int[] intArray = new int[objArray.length];
        if (!ArrayUtil.isEmpty(objArray)) {
            for (int i = 0; i < objArray.length; i++) {
                intArray[i] = toInt(objArray[i]);
            }
        }
        return intArray;
    }

    /**
     * 转为 boolean[] 型
     */
    public static boolean[] toBooleanArray(Object[] objArray) {
        if (objArray == null) {
            objArray = new Object[0];
        }
        boolean[] booleanArray = new boolean[objArray.length];
        if (!ArrayUtil.isEmpty(objArray)) {
            for (int i = 0; i < objArray.length; i++) {
                booleanArray[i] = toBoolean(objArray[i]);
            }
        }
        return booleanArray;
    }
}
