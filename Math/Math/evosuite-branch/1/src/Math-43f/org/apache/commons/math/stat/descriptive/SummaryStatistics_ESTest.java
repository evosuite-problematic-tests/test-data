/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:18:32 GMT 2018
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
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
      StatisticalSummary statisticalSummary0 = summaryStatistics0.getSummary();
      assertEquals(0L, statisticalSummary0.getN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.hashCode();
      assertEquals(0L, summaryStatistics0.getN());
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
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
      summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic0);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumLogImpl();
      summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setVarianceImpl(sumOfLogs0);
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfSquares sumOfSquares0 = summaryStatistics0.sumsq;
      summaryStatistics0.setMaxImpl(sumOfSquares0);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertEquals(0L, summaryStatistics1.getN());
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMinImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMaxImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMeanImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getPopulationVariance();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      summaryStatistics0.addValue(314.939185591878);
      summaryStatistics0.copy();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(Double.NaN);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.n = 1319L;
      summaryStatistics0.toString();
      assertEquals(1319L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.setVarianceImpl(sumOfLogs0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      boolean boolean0 = summaryStatistics0.equals(sumOfLogs0);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      summaryStatistics0.addValue(2854.209);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(1L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      summaryStatistics1.setVarianceImpl(sumOfLogs0);
      summaryStatistics1.addValue(2854.209);
      summaryStatistics0.setSumLogImpl(sumOfLogs0);
      boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
      assertEquals(1L, summaryStatistics1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SecondMoment secondMoment0 = summaryStatistics0.secondMoment;
      secondMoment0.increment(2151.2);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      SumOfLogs sumOfLogs0 = summaryStatistics0.sumLog;
      summaryStatistics0.setMinImpl(sumOfLogs0);
      boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      summaryStatistics1.n = (-2574L);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals((-2574L), summaryStatistics1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      Kurtosis kurtosis0 = new Kurtosis();
      summaryStatistics1.setSumImpl(kurtosis0);
      boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      StandardDeviation standardDeviation0 = new StandardDeviation(true);
      summaryStatistics1.setSumsqImpl(standardDeviation0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatistics0.addValue(2854.209);
      // Undeclared exception!
      try { 
        summaryStatistics0.setGeoMeanImpl(sumOfLogs0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setVarianceImpl(summaryStatistics0.sumLog);
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StandardDeviation standardDeviation0 = new StandardDeviation();
      summaryStatistics0.setMeanImpl(standardDeviation0);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertEquals(0L, summaryStatistics1.getN());
  }
}
