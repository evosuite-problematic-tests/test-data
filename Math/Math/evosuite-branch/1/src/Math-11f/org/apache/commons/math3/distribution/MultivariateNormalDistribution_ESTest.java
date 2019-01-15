/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:26:33 GMT 2018
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.random.MersenneTwister;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultivariateNormalDistribution_ESTest extends MultivariateNormalDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 1
         //
         verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 233;
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(mersenneTwister0, doubleArray0, doubleArray1);
      RealMatrix realMatrix0 = multivariateNormalDistribution0.getCovariances();
      assertEquals(1, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[0][3];
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-356.71911229223963);
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution(mersenneTwister0, doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -356.719 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -356.719 at index 0
         //
         verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3268.7526;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      double double0 = multivariateNormalDistribution0.density(doubleArray0);
      assertEquals(0.006977808396525925, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3268.7526;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      double[] doubleArray2 = new double[0];
      try { 
        multivariateNormalDistribution0.density(doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 1103;
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(mersenneTwister0, doubleArray0, doubleArray1);
      double[] doubleArray2 = multivariateNormalDistribution0.getStandardDeviations();
      assertArrayEquals(new double[] {33.21144381083123}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3268.7526;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      double[] doubleArray2 = multivariateNormalDistribution0.sample();
      assertArrayEquals(new double[] {3313.8570105776266}, doubleArray2, 0.01);
  }
}