package org.scalaworkshop.examples;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.util.Arrays;

/**
 * Created by ykim15 on 4/28/15.
 */
public class JavaExample {
    public static void main(String[] args){
        INDArray arr = Nd4j.create(5);
        System.out.println(Arrays.toString(arr.shape()));
    }

}
