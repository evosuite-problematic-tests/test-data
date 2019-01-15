/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:29:28 GMT 2018
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
  public void test00()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getMean();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(2.0, 2.0);
      double double0 = normalDistributionImpl0.density(2.0);
      assertEquals(0.19947114020071635, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      normalDistributionImpl0.sample(137);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getStandardDeviation();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.5);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = null;
      try {
        normalDistributionImpl0 = new NormalDistributionImpl(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0): standard deviation (0)
         //
         verifyException("org.apache.commons.math.distribution.NormalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.cumulativeProbability(4137.3827);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.cumulativeProbability((-1663.9786110049392));
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(2207.0994573, 1.0E-8, 2207.0994573);
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(2207.0994573, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0E-8, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(3225.444, 3225.444, 3225.444);
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(3225.444, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(3225.444, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.1921056801463227E-8);
      assertEquals((-5.581523278384263), double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getInitialDomain(1.0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }
}
