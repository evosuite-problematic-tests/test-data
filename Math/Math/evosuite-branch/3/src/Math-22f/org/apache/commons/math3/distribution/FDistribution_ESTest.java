/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 15:11:10 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FDistribution_ESTest extends FDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(0.6022218465805054, 0.6022218465805054, 0.0);
      // Undeclared exception!
      fDistribution0.sample(1099);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(2.0, 2.122358392979746E47);
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertEquals(2.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistribution0.getNumericalMean(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(1664);
      FDistribution fDistribution0 = new FDistribution(well44497b0, 1664, 2940.2513122720966, 6629.74353809056);
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertFalse(boolean0);
      assertEquals(1664.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0006806769698857, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(2.0, 2.122358392979746E47);
      double double0 = fDistribution0.density((-281.820158103799));
      assertEquals(2.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistribution0.getNumericalMean(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(1231.28737551168, (-972.523427), (-972.523427));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-972.523)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1962.5, Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        fDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction diverged to NaN for value 0
         //
         verifyException("org.apache.commons.math3.util.ContinuedFraction", e);
      }
  }
}
