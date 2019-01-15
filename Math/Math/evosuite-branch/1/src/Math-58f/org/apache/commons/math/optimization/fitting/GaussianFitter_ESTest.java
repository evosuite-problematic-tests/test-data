/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:44:17 GMT 2018
 */

package org.apache.commons.math.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.fitting.GaussianFitter;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianFitter_ESTest extends GaussianFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GaussianFitter gaussianFitter0 = new GaussianFitter((DifferentiableMultivariateVectorialOptimizer) null);
      // Undeclared exception!
      try { 
        gaussianFitter0.fit();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than the minimum (3)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GaussianFitter gaussianFitter0 = new GaussianFitter((DifferentiableMultivariateVectorialOptimizer) null);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        gaussianFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = null;
      try {
        gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser((WeightedObservedPoint[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null is not allowed: input array
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.5, 0.5, 0.5);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      gaussianFitter_ParameterGuesser0.guess();
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.5, 0.5, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, (-462.1549405), (-2629.959532503));
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(1317.4222599, 1.0E-9, 1317.4222599);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      weightedObservedPointArray0[6] = weightedObservedPointArray0[2];
      weightedObservedPointArray0[7] = weightedObservedPointArray0[6];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {1317.4222599, 1.0E-9, 4.2466090014400955E-10}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, 672.0, 481.7660734);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, (-1111.8663097157644), 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {481.7660734, 672.0, 757.538272820469}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-1122.83685553), 0.0, (-390.0));
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        gaussianFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(2193.845058413945, 2.147483647E9, (-2384.386686372762));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 2.147483647E9, 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        gaussianFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-1234.3389824), 0.0, 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        gaussianFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1.0), (-1953.944), 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, (-1953.944), 0.0);
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        gaussianFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
      }
  }
}
