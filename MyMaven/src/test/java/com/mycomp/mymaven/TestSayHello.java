package com.mycomp.mymaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSayHello {

    @Test
    public void testHello() {
        SayHello sayHello = new SayHello();
        String res = sayHello.hello("zzq");
        assertEquals("Hello zzq", res);
    }

}
