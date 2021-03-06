/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 17:06:23 GMT 2019
 */

package org.apache.commons.math.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.DistributionFactory;
import org.apache.commons.math.stat.inference.ChiSquareTestImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChiSquareTestImpl_ESTest extends ChiSquareTestImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      double[] doubleArray0 = new double[3];
      long[] longArray0 = new long[3];
      try { 
        chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative and expected counts must be postive
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[6];
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, 1.580887032249125E-4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts cannot all be 0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      DistributionFactory distributionFactory0 = chiSquareTestImpl0.getDistributionFactory();
      assertNotNull(distributionFactory0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      double[] doubleArray0 = new double[0];
      long[] longArray0 = new long[0];
      try { 
        chiSquareTestImpl0.chiSquare(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed, expected array lengths incorrect
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[5];
      double[] doubleArray0 = new double[7];
      try { 
        chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed, expected array lengths incorrect
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[6];
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2065.981292931;
      doubleArray0[1] = (double) 2023L;
      doubleArray0[2] = (double) 61L;
      doubleArray0[3] = (double) 1L;
      doubleArray0[4] = (double) 953L;
      doubleArray0[5] = 1.580887032249125E-4;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, 3.6899182659531625E-6);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1835.855319235929);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1835.855319235929;
      doubleArray0[1] = 1835.855319235929;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = 1835.855319235929;
      long[] longArray0 = new long[4];
      longArray0[0] = (-713L);
      try { 
        chiSquareTestImpl0.chiSquare(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative and expected counts must be postive
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[5];
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 5L;
      doubleArray0[1] = (double) 5L;
      doubleArray0[2] = Double.NaN;
      doubleArray0[3] = Double.NaN;
      doubleArray0[4] = (double) 5L;
      double double0 = chiSquareTestImpl0.chiSquare(doubleArray0, longArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      double[] doubleArray0 = new double[3];
      long[] longArray0 = new long[1];
      try { 
        chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 0.0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) null);
      double[] doubleArray0 = new double[5];
      try { 
        chiSquareTestImpl0.chiSquareTest(doubleArray0, (long[]) null, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2.0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[6];
      longArray0[0] = 61L;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2065.981292931;
      doubleArray0[1] = (double) 2023L;
      doubleArray0[2] = (double) 61L;
      doubleArray0[3] = (double) 1L;
      doubleArray0[4] = (double) 953L;
      doubleArray0[5] = 1.580887032249125E-4;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, 3.6899182659531625E-6);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) null);
      long[][] longArray0 = new long[1][8];
      try { 
        chiSquareTestImpl0.chiSquareTest(longArray0, (double) 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 0.0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[][] longArray0 = new long[0][9];
      try { 
        chiSquareTestImpl0.chiSquareTest(longArray0, 4.9E-324);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must have at least two rows
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[][] longArray0 = new long[3][1];
      try { 
        chiSquareTestImpl0.chiSquareTest(longArray0, (double) 2727L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2727.0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[][] longArray0 = new long[2][5];
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(longArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[1];
      try { 
        chiSquareTestImpl0.chiSquareDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oberved1, observed2 array lengths incorrect
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[9];
      long[] longArray1 = new long[0];
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oberved1, observed2 array lengths incorrect
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[2];
      longArray0[0] = (-826L);
      try { 
        chiSquareTestImpl0.chiSquareDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[2];
      long[] longArray1 = new long[2];
      longArray1[0] = (-31L);
      try { 
        chiSquareTestImpl0.chiSquareDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[6];
      longArray0[0] = 61L;
      longArray0[1] = 61L;
      longArray0[2] = 1L;
      longArray0[3] = 2023L;
      longArray0[4] = 953L;
      longArray0[5] = 61L;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, 1.580887032249125E-4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = 498L;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray1 = new long[8];
      longArray1[1] = 498L;
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must not both be zero
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[4];
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, (-707.202219969842));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -707.202219969842
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[5];
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, (double) 1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1.0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[6];
      longArray0[1] = 61L;
      longArray0[2] = 1L;
      longArray0[3] = 2023L;
      longArray0[4] = 953L;
      longArray0[5] = 61L;
      long[] longArray1 = new long[6];
      longArray1[0] = 953L;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray1, longArray0, 3.6899182659531625E-6);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[][] longArray0 = new long[2][1];
      try { 
        chiSquareTestImpl0.chiSquareTest(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must have at least two columns
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[][] longArray0 = new long[2][5];
      long[] longArray1 = new long[4];
      longArray0[0] = longArray1;
      try { 
        chiSquareTestImpl0.chiSquareTest(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must be rectangular
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[7];
      longArray0[1] = (-1084L);
      long[][] longArray1 = new long[7][5];
      longArray1[0] = longArray0;
      longArray1[1] = longArray0;
      longArray1[2] = longArray0;
      longArray1[3] = longArray0;
      longArray1[4] = longArray0;
      longArray1[5] = longArray0;
      longArray1[6] = longArray0;
      try { 
        chiSquareTestImpl0.chiSquare(longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All entries in input 2-way table must be non-negative
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }
}
