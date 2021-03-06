/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:19:51 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Skewness;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SummaryStatistics_ESTest extends SummaryStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.hashCode();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumLogImpl();
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      
      summaryStatistics1.setMeanImpl(storelessUnivariateStatistic0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getGeoMeanImpl();
      summaryStatistics0.setSumImpl(storelessUnivariateStatistic0);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSecondMoment();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      String string0 = summaryStatistics0.toString();
      assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setSumLogImpl(sumOfLogs0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumLogImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      summaryStatistics0.addValue(Double.NaN);
      boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
      assertEquals(1L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getGeoMeanImpl();
      summaryStatistics0.setMaxImpl(storelessUnivariateStatistic0);
      summaryStatistics0.addValue(Double.NaN);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StatisticalSummary statisticalSummary0 = summaryStatistics0.getSummary();
      assertEquals(0L, statisticalSummary0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMinImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMaxImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMeanImpl();
      summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic0);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertEquals(0L, summaryStatistics1.getN());
      assertNotSame(summaryStatistics1, summaryStatistics0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumsqImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getPopulationVariance();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getGeoMeanImpl();
      summaryStatistics0.setMinImpl(storelessUnivariateStatistic0);
      summaryStatistics0.addValue(Double.NaN);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(Double.NaN);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.addValue((-1883.716539080456));
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.n = 23L;
      summaryStatistics0.toString();
      assertEquals(23L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SecondMoment secondMoment0 = new SecondMoment();
      summaryStatistics0.setMeanImpl(secondMoment0);
      double[] doubleArray0 = new double[1];
      secondMoment0.evaluate(doubleArray0);
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setVarianceImpl(sumOfLogs0);
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Object object0 = new Object();
      boolean boolean0 = summaryStatistics0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(2667.448845);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(1L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      Sum sum0 = new Sum();
      summaryStatistics0.setMaxImpl(sum0);
      boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      SumOfSquares sumOfSquares0 = summaryStatistics0.sumsq;
      summaryStatistics1.setMinImpl(sumOfSquares0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      Mean mean0 = summaryStatistics0.mean;
      summaryStatistics1.setSumImpl(mean0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      Variance variance0 = new Variance();
      summaryStatistics0.setSumsqImpl(variance0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SecondMoment secondMoment0 = new SecondMoment();
      summaryStatistics0.secondMoment = secondMoment0;
      secondMoment0.increment(Double.NaN);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.addValue(Double.NaN);
      // Undeclared exception!
      try { 
        summaryStatistics0.setSumsqImpl(sumOfLogs0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.geoMean = null;
      SummaryStatistics summaryStatistics1 = null;
      try {
        summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      GeometricMean geometricMean0 = summaryStatistics0.geoMean;
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = geometricMean0.getSumLogImpl();
      summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertEquals(0L, summaryStatistics1.getN());
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getGeoMeanImpl();
      summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic0);
      summaryStatistics0.addValue(Double.NaN);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.sumLog = sumOfLogs0;
      sumOfLogs0.increment(Double.NaN);
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Skewness skewness0 = new Skewness();
      summaryStatistics0.setSumsqImpl(skewness0);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertEquals(0L, summaryStatistics1.getN());
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
  }
}
