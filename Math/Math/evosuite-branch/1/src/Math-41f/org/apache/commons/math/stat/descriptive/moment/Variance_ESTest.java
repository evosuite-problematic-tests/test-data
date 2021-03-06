/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:16:20 GMT 2018
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
      Variance variance0 = new Variance(false);
      variance0.setBiasCorrected(false);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Variance variance0 = new Variance(true);
      Variance variance1 = new Variance(variance0);
      assertTrue(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      Variance variance1 = variance0.copy();
      assertTrue(variance1.isBiasCorrected());
      assertNotSame(variance1, variance0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      boolean boolean0 = variance0.equals(secondMoment0);
      assertTrue(boolean0);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0, 0.0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance(false);
      boolean boolean0 = variance0.isBiasCorrected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      variance0.increment(0.0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment(0.0);
      double double0 = variance0.getResult();
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      secondMoment0.n = (-479L);
      Variance variance0 = new Variance(false, secondMoment0);
      double double0 = variance0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      double[] doubleArray0 = new double[2];
      secondMoment0.evaluate(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1791.0;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[0];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 2225.619;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 1, 1);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[5];
      double double0 = variance0.evaluate(doubleArray0, Double.NaN, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, 1838.949151803148);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 1068.1);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 1279.42404457205);
      assertEquals(0.0, double0, 0.01);
  }
}
