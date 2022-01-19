package com.shusharin.zaycevnet.algorithms;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Task {

    public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {
        int[] res = new int[readLength];
        System.arraycopy(price,offset,res,0,readLength);
        for (int i = 0; i < res.length; i++) {
            double a =  res[i] * discount/100;
            int b = (int) Math.floor(a);
            res[i] = b;
        }
        return res;
    }

}
