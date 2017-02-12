package com.hanze.general;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Hanze on 12/02/2017.
 */
public class BigDecimalTest {

    @Test
    public void shouldBeEqual(){
        BigDecimal a = new BigDecimal("0.01");
        BigDecimal b = new BigDecimal("0.05");
        BigDecimal c = a.add(b);
        assertThat(c.toString()).isEqualTo("0.06");
    }

    @Test
    public void testDouble(){
        Double a = 0.01;
        Double b = 0.05;
        Double c = a + b;
        assertThat(c.toString()).isNotEqualTo("0.06");
    }
}
