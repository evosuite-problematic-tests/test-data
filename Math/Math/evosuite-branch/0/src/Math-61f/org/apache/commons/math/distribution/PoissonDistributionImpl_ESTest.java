/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:29:44 GMT 2018
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PoissonDistributionImpl_ESTest extends PoissonDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0);
      poissonDistributionImpl0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(6.283185307179586);
      double double0 = poissonDistributionImpl0.getMean();
      assertEquals(6.283185307179586, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(6.283185307179586);
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(0, int0);
      assertEquals(6.283185307179586, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1000.0, 880);
      double double0 = poissonDistributionImpl0.normalApproximateProbability(880);
      assertEquals(1000.0, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(7.87544358612502E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl((-585.5671178196), (-585.5671178196));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -585.567 is smaller than, or equal to, the minimum (0): mean (-585.567)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1000.0, 880);
      double double0 = poissonDistributionImpl0.probability((-639));
      assertEquals(1000.0, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1000.0, 880);
      double double0 = poissonDistributionImpl0.probability(880);
      assertEquals(7.38819386676335E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0);
      double double0 = poissonDistributionImpl0.probability(Integer.MAX_VALUE);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(6.283185307179586);
      double double0 = poissonDistributionImpl0.probability(0);
      assertEquals(0.0018674427317079893, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(6.283185307179586);
      double double0 = poissonDistributionImpl0.cumulativeProbability(Integer.MAX_VALUE);
      assertEquals(1.0, double0, 0.01);
      assertEquals(6.283185307179586, poissonDistributionImpl0.getMean(), 0.01);
  }
}
