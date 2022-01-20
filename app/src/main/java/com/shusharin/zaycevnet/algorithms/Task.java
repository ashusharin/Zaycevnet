package com.shusharin.zaycevnet.algorithms;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Task {

    public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1, to = 100) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {
        int[] res = new int[readLength];
        System.arraycopy(price, offset, res, 0, readLength);
        for (int i = 0; i < res.length; i++) {
            double procent = (double) discount / 100;
            double result = res[i] - (res[i]*procent);
            int rounding =  (int)Math.floor(result);
            res[i] = rounding;
        }
        return res;
    }
}