package com.yong.Test;

import com.yong.Utils.LocationUtils;

public class LocationUtilsTest {
    public static void main(String[] args) {
        Double t=LocationUtils.getDistance(117.27,31.86,118.38, 31.33);

        System.out.println(t);
    }
}
