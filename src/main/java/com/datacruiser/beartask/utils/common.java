package com.datacruiser.beartask.utils;

import java.util.List;

public class common {
    public static boolean isEmpty(List<String> noCacheMethod) {
        if (noCacheMethod == null || noCacheMethod.size() < 1)
            return true;
        return false;
    }

    public static boolean isEmpty(Object[] args) {
        if (args == null || args.length < 1)
            return true;
        return false;
    }
}
