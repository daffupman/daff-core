package io.daff.util;

/**
 * 字符串辅助类
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class StringHelper {

    /**
     * 判断str是否是一个合法的数字
     * @param str
     */
    public static boolean isInteger(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
