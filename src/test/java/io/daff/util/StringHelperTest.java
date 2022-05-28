package io.daff.util;

import org.junit.Test;

/**
 * @author daffupman
 * @since 2021/3/11
 */
public class StringHelperTest {

    @Test
    public void test() {
        String ids = "2  , ,13     ,4 ";
        System.out.println(StringHelper.parseLongList(ids));
    }
}
