/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 16:03:57 GMT 2019
 */

package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentOptimizer_ESTest extends BrentOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.resetRelativeAccuracy();
      // Undeclared exception!
      try { 
        brentOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.resetAbsoluteAccuracy();
      // Undeclared exception!
      try { 
        brentOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, (-1366.078513803212), (-1.0));
      assertEquals(42, brentOptimizer0.getEvaluations());
      assertEquals((-1366.078512186515), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-38.45309434);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, (-2753.266592146), 317.7950585087, (-38.45309434));
      assertEquals(45, brentOptimizer0.getIterationCount());
      assertEquals(317.79505791403585, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 3.0;
      doubleArray0[2] = (-3027.86704102);
      doubleArray0[5] = (-137.99477152);
      doubleArray0[7] = 3217.2;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, 1.0);
      assertEquals(17, brentOptimizer0.getEvaluations());
      assertEquals(0.776939340301561, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, 0.0, (-44.6538803361355));
      assertEquals(21, brentOptimizer0.getIterationCount());
      assertEquals((-44.6538803361355), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = 1746.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      GoalType goalType0 = GoalType.MINIMIZE;
      double double0 = brentOptimizer0.optimize(univariateRealFunction0, goalType0, 3087.72, 0.0, (-1360.6906));
      assertEquals(6, brentOptimizer0.getEvaluations());
      assertEquals((-5.6843418860808015E-14), double0, 0.01);
  }
}