/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:46:52 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FDistribution_ESTest extends FDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(369.522529496, 369.522529496);
      double double0 = fDistribution0.calculateNumericalVariance();
      assertEquals(0.01103272701804739, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1.0E-9, 1.0E-9, 1.0E-9);
      // Undeclared exception!
      fDistribution0.sample(564);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1039.845328014213, 1990.76, (-3465.8442));
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertFalse(boolean0);
      assertEquals(1039.845328014213, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0010056517629076, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(369.522529496, 369.522529496);
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertEquals(369.522529496, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0054418432599022, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      FDistribution fDistribution0 = new FDistribution(well44497b0, 633.5574, 633.5574, 633.5574);
      fDistribution0.density((-2283.498971169553));
      assertEquals(633.5574, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (0)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(well512a0, 1103.11494341667, (-1488.9175138076), 1103.11494341667);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-1,488.918)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      FDistribution fDistribution0 = new FDistribution(well44497b0, 633.5574, 633.5574, 633.5574);
      double double0 = fDistribution0.getNumericalMean();
      assertEquals(1.0031667747064636, double0, 0.01);
      assertEquals(633.5574, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
  }
}
