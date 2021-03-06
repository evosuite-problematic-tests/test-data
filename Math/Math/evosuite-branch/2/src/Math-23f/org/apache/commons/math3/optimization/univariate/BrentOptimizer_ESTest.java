/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:48:45 GMT 2019
 */

package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Acos;
import org.apache.commons.math3.analysis.function.Minus;
import org.apache.commons.math3.analysis.function.Ulp;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentOptimizer_ESTest extends BrentOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer((-749.006), (-749.006));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -749.006 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(2.718281828459045, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0);
      Minus minus0 = new Minus();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(276, (UnivariateFunction) minus0, goalType0, (double) 276, (double) 276, 3.0);
      assertEquals((-107.27672107127869), univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0);
      Minus minus0 = new Minus();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(3394, (UnivariateFunction) minus0, goalType0, 3.0, (double) 3394);
      assertNotNull(univariatePointValuePair0);
      assertEquals(1698.5, univariatePointValuePair0.getPoint(), 0.01);
      assertEquals((-1698.5), univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0);
      Ulp ulp0 = new Ulp();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2816, (UnivariateFunction) ulp0, goalType0, 762.7915579145, (-1438.27139802), 0.5);
      assertEquals(0.5, univariatePointValuePair0.getPoint(), 0.01);
      assertEquals(1.1102230246251565E-16, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0);
      Ulp ulp0 = new Ulp();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2816, (UnivariateFunction) ulp0, goalType0, 1.063488136428965E9, (-1457.2239411962416), 8.881784197001252E-16);
      assertEquals(1.9721522630525295E-31, univariatePointValuePair0.getValue(), 0.01);
      assertEquals(8.881784197001252E-16, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0);
      Ulp ulp0 = new Ulp();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2816, (UnivariateFunction) ulp0, goalType0, 762.7915579145, (-1438.27139802), 8.881784197001252E-16);
      assertEquals(1.9721522630525295E-31, univariatePointValuePair0.getValue(), 0.01);
      assertEquals(8.881784197001252E-16, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(anyInt() , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class) , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class));
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0, convergenceChecker0);
      Acos acos0 = new Acos();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2124460929, (UnivariateFunction) acos0, goalType0, (-3492.06744493961), (-1624.3), 3.0);
      assertEquals((-25.417060920553762), univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true).when(convergenceChecker0).converged(anyInt() , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class) , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class));
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0, convergenceChecker0);
      Acos acos0 = new Acos();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2124460929, (UnivariateFunction) acos0, goalType0, (-3492.06744493961), (-1624.3), 3.0);
      assertEquals((-506.92346804142795), univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.0, 3.0);
      Minus minus0 = new Minus();
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(59, (UnivariateFunction) minus0, goalType0, (-533.4), (double) 59, 3.0);
      assertEquals((-201.88656843455635), univariatePointValuePair0.getPoint(), 0.01);
  }
}
