/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:22:25 GMT 2018
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.random.Well1024a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UniformRealDistribution_ESTest extends UniformRealDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.inverseCumulativeProbability(0.5);
      assertEquals(0.5, double0, 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01);
      assertTrue(uniformRealDistribution0.isSupportConnected());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      uniformRealDistribution0.sample(287);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well1024a0, 0.5, 1.0, 1.0);
      boolean boolean0 = uniformRealDistribution0.isSupportUpperBoundInclusive();
      assertTrue(boolean0);
      assertEquals(0.020833333333333332, uniformRealDistribution0.getNumericalVariance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      boolean boolean0 = uniformRealDistribution0.isSupportLowerBoundInclusive();
      assertTrue(boolean0);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = null;
      try {
        uniformRealDistribution0 = new UniformRealDistribution((-585.5671178196), (-585.5671178196));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower bound (-585.567) must be strictly less than upper bound (-585.567)
         //
         verifyException("org.apache.commons.math3.distribution.UniformRealDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.density((-2932.5));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well1024a0, 0.5, 1.0, 1.0);
      double double0 = uniformRealDistribution0.density(362);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.75, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-2062.8), 0.0, (-1684.8));
      double double0 = uniformRealDistribution0.density(0.0);
      assertEquals(4.847779716889664E-4, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.cumulativeProbability(0.0);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.cumulativeProbability(3496.0);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }
}
