package io.daff.util;

import java.util.UUID;

/**
 * 字符串辅助类
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class StringHelper {

    /**
     * 判断str是否是一个合法的数字
     */
    public static boolean isInteger(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 生成默认长度的uuid
     */
    public static String uuid() {
        return uuid(32);
    }

    /**
     * 生成指定长度的uuid
     */
    public static String uuid(int length) {
        if (length > 0) {
            return UUID.randomUUID().toString()
                    .replaceAll("-", "")
                    .substring(0, length);
        }
        return null;
    }
}
