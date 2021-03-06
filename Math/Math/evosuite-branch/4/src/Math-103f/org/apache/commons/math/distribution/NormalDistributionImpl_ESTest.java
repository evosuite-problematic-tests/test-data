/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 17:08:15 GMT 2019
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NormalDistributionImpl_ESTest extends NormalDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      // Undeclared exception!
      try { 
        normalDistributionImpl0.setStandardDeviation((-724.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Standard deviation must be positive.
         //
         verifyException("org.apache.commons.math.distribution.NormalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(0.19990708, 0.19990708);
      assertEquals(0.19990708, normalDistributionImpl0.getStandardDeviation(), 0.01);
      
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.19990708);
      assertEquals(0.19990708, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(0.031594801909024334, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(0.9999999999999971, 0.9999999999999971);
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.9999999999999971);
      assertEquals(8.872252011415465, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getInitialDomain(0.5);
      assertEquals(0.0, double0, 0.01);
  }
}
