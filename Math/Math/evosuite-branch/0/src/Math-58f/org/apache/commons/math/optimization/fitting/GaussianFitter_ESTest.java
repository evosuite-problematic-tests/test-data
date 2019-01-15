/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:27:01 GMT 2018
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
      double[] doubleArray0 = new double[0];
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
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, (-1607.6572), Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      gaussianFitter_ParameterGuesser0.guess();
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, (-1607.6572), 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, (-1607.6572), Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, 0.0, (-1732.4));
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {(-1732.4), 0.0, 682.709153674998}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1.0), (-1.0), 1442.025407345195);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-1.0), (-1.0), (-807.8836426));
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {1442.025407345195, (-1.0), 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.0, Double.NEGATIVE_INFINITY, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, 0.0, Double.NEGATIVE_INFINITY);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.0, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(2.0, 39.0, 39.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(39.0, 2.0, 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPointArray0[2];
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      weightedObservedPointArray0[6] = weightedObservedPointArray0[0];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {39.0, 39.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1.0E-12, 1.0E-12, Double.POSITIVE_INFINITY);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, (-788.0997223471647), (-788.0997223471647));
      weightedObservedPointArray0[5] = weightedObservedPoint1;
      weightedObservedPointArray0[6] = weightedObservedPointArray0[5];
      weightedObservedPointArray0[7] = weightedObservedPointArray0[3];
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 1.0E-12, 334.6751374951914}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1166.7928289163083), (-1166.7928289163083), (-2151.6905831998365));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-2151.6905831998365), (-1166.7928289163083), (-2151.6905831998365));
      weightedObservedPointArray0[1] = weightedObservedPoint1;
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
  public void test11()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 496.4470525, 6.283185307179586);
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(2.0, 496.4470525, 6.283185307179586);
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