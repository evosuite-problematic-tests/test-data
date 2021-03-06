/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 21:55:22 GMT 2019
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
      long[] longArray0 = new long[4];
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts cannot all be 0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(443.775062074);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      DistributionFactory distributionFactory0 = chiSquareTestImpl0.getDistributionFactory();
      assertNotNull(distributionFactory0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1.0E-6);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      double[] doubleArray0 = new double[1];
      long[] longArray0 = new long[8];
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
  public void test03()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      double[] doubleArray0 = new double[3];
      long[] longArray0 = new long[2];
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
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1960.849312074788);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1960.849312074788;
      doubleArray0[1] = 1960.849312074788;
      doubleArray0[2] = 1960.849312074788;
      doubleArray0[3] = 1.0;
      doubleArray0[4] = 1960.849312074788;
      doubleArray0[5] = 1960.849312074788;
      doubleArray0[6] = 1960.849312074788;
      doubleArray0[7] = 1960.849312074788;
      long[] longArray0 = new long[8];
      longArray0[1] = (-2978L);
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
  public void test05()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(443.775062074);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray0 = new long[4];
      longArray0[0] = 1711L;
      longArray0[1] = 1711L;
      longArray0[2] = 1711L;
      longArray0[3] = 1711L;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1711L;
      doubleArray0[1] = (double) 1711L;
      doubleArray0[2] = (double) 1711L;
      doubleArray0[3] = (double) 1711L;
      double double0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0);
      assertEquals(3.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[2];
      double[] doubleArray0 = new double[7];
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
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
  public void test07()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1720L);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray0 = new long[4];
      double[] doubleArray0 = new double[4];
      try { 
        chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, 1.0E-5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative and expected counts must be postive
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      double[] doubleArray0 = new double[0];
      long[] longArray0 = new long[6];
      try { 
        chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, (double) 1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1.0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(443.775062074);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray0 = new long[4];
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2551.814072;
      doubleArray0[1] = (double) 1711L;
      doubleArray0[2] = (double) 1711L;
      doubleArray0[3] = (double) 1711L;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, 1.0E-5);
      assertEquals(3.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1720L);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray0 = new long[4];
      longArray0[0] = 1720L;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2551.8141;
      doubleArray0[1] = (double) 1720L;
      doubleArray0[2] = (double) 1720L;
      doubleArray0[3] = (double) 1720L;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, 1.0E-5);
      assertEquals(3.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(2.0);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      try { 
        chiSquareTestImpl0.chiSquareTest((long[][]) null, (-4358.0854558452));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -4358.0854558452
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1720L);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[][] longArray0 = new long[5][9];
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(longArray0, 0.5);
      assertEquals(32.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      try { 
        chiSquareTestImpl0.chiSquareTest((long[][]) null, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1.0
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1704L);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray0 = new long[2];
      longArray0[1] = 396L;
      long[] longArray1 = new long[2];
      longArray1[0] = 1704L;
      long[][] longArray2 = new long[3][7];
      longArray2[0] = longArray0;
      longArray2[1] = longArray1;
      longArray2[2] = longArray0;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(longArray2, 1.0E-15);
      assertEquals(2.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[0];
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
      long[] longArray0 = new long[3];
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1704L);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray1 = new long[2];
      try { 
        chiSquareTestImpl0.chiSquareDataSetsComparison(longArray1, longArray0);
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
      long[] longArray0 = new long[5];
      longArray0[1] = (-581L);
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
      long[] longArray0 = new long[2];
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray1 = new long[2];
      longArray1[0] = (-2795L);
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
      long[] longArray0 = new long[4];
      longArray0[0] = 901L;
      long[] longArray1 = new long[4];
      longArray1[1] = 901L;
      longArray1[2] = 901L;
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray1, longArray0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must not both be zero
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1720L);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray0 = new long[4];
      longArray0[0] = 1720L;
      longArray0[1] = 1720L;
      longArray0[2] = 1720L;
      longArray0[3] = 1720L;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, 0.5);
      assertEquals(3.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(443.775062074);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[] longArray0 = new long[4];
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, (-1862.99));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -1862.99
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[4];
      try { 
        chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: Infinity
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[] longArray0 = new long[4];
      longArray0[0] = 901L;
      longArray0[1] = 901L;
      longArray0[2] = 901L;
      long[] longArray1 = new long[4];
      longArray1[3] = 901L;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray1, longArray0, 0.5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) null);
      long[][] longArray0 = new long[1][6];
      try { 
        chiSquareTestImpl0.chiSquareTest(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must have at least two rows
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(2.0);
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl(chiSquaredDistributionImpl0);
      long[][] longArray0 = new long[5][9];
      long[] longArray1 = new long[0];
      longArray0[0] = longArray1;
      try { 
        chiSquareTestImpl0.chiSquare(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must have at least two columns
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      long[][] longArray0 = new long[9][3];
      long[] longArray1 = new long[8];
      longArray0[0] = longArray1;
      try { 
        chiSquareTestImpl0.chiSquareTest(longArray0, 3.6899182659531625E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must be rectangular
         //
         verifyException("org.apache.commons.math.stat.inference.ChiSquareTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[4] = (-3552L);
      long[][] longArray1 = new long[5][7];
      longArray1[0] = longArray0;
      longArray1[1] = longArray0;
      longArray1[2] = longArray0;
      longArray1[3] = longArray0;
      longArray1[4] = longArray0;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
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
