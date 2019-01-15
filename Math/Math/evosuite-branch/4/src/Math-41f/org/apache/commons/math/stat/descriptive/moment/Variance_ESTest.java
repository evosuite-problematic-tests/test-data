/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 15:22:25 GMT 2019
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      Variance variance1 = variance0.copy();
      assertNotSame(variance1, variance0);
      assertFalse(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, Double.NaN);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      assertFalse(variance0.isBiasCorrected());
      
      variance0.setBiasCorrected(true);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      Variance variance1 = new Variance(variance0);
      assertTrue(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      boolean boolean0 = variance0.isBiasCorrected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      variance0.increment((-1.0));
      assertEquals(0L, variance0.getN());
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[1];
      secondMoment0.evaluate(doubleArray0);
      Variance variance0 = new Variance(false, secondMoment0);
      double double0 = variance0.getResult();
      assertEquals(0.0, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double double0 = variance0.getResult();
      assertFalse(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[7];
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(7L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[2];
      secondMoment0.evaluate(doubleArray0);
      Variance variance0 = new Variance(false, secondMoment0);
      boolean boolean0 = secondMoment0.equals(variance0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[1];
      variance0.setData(doubleArray0);
      double double0 = variance0.evaluate();
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      // Undeclared exception!
      try { 
        variance0.evaluate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0, 0, 0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 730.326182254124;
      Variance variance0 = new Variance(false, secondMoment0);
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 4390.048415195125;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 0, 2);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[1];
      Variance variance0 = new Variance(false, secondMoment0);
      double double0 = variance0.evaluate(doubleArray0, (-56.143942714), 0, 0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0, (-827.52832935504));
      assertEquals(0.0, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 730.326182254124;
      Variance variance0 = new Variance(false, secondMoment0);
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 594.16786118815);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 747.77051;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 747.77051);
      assertEquals(0.0, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }
}
