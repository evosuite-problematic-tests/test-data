/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 17:30:52 GMT 2019
 */

package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gamma_ESTest extends Gamma_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(915.0, 1686.69410486);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Gamma.logGamma(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = Gamma.logGamma((-4592.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(Double.NaN, 57.15623566586292);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP((double) (-914), (double) (-914));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1.0, (-0.4919138160976202));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1560.003611948, 0.0, 1908.1042770537, 15);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(3.6899182659531625E-6, 3.399464998481189E-5);
      assertEquals(3.583631918702146E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(2208.970738648357, 2.1743961811521265E-4, 152.11154, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        Gamma.regularizedGammaP(232.0, 1.0E-8, 1.0E-8, (-608));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-608) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(Double.NaN, 59.9752, 172.9833072602151, 1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ((-6365.513310148923), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(0.0, 1.6117493199520342E-268, (-1.0), 1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(915.0, (-4592.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(57.15623566586292, 0.0);
      assertEquals(1.0, double0, 0.01);
  }
}
