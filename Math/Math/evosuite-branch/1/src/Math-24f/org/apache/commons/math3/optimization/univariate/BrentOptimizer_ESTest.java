/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:48:13 GMT 2018
 */

package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Cosh;
import org.apache.commons.math3.analysis.function.Expm1;
import org.apache.commons.math3.analysis.function.Inverse;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentOptimizer_ESTest extends BrentOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer((-1604.7809472452795), (-1604.7809472452795));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,604.781 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(122.27921171364387, 122.27921171364387);
      Inverse inverse0 = new Inverse();
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2107552165, (UnivariateFunction) inverse0, goalType0, (double) 2107552165, 3.0, 3.0);
      assertEquals(0.002032037729233659, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(1365.312279, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(Double.NaN, Double.NaN);
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        brentOptimizer0.optimize(20, (UnivariateFunction) cosh0, goalType0, (-2098.9469), 0.007782140746712685, (-1793.25618626843));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (20) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MAXIMIZE;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(2.0, 0.5);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(23, (UnivariateFunction) cosh0, goalType0, 2.0, 1804.4931742546833, (double) 23);
      assertEquals(1.6294479811781584E305, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MINIMIZE;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(0.2782403502959694, 0.5);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1061, (UnivariateFunction) cosh0, goalType0, 0.2782403502959694, (double) 1061, (double) 16);
      assertEquals(1.6888527899119232, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MINIMIZE;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(0.5, 0.5);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1061, (UnivariateFunction) cosh0, goalType0, Double.NaN, (double) 1061, (double) (-18));
      assertEquals(1.4688635827284269, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MINIMIZE;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.6217655929285066, 0.5);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(23, (UnivariateFunction) cosh0, goalType0, 1.6217655929285066, 1804.49317, (double) 23);
      assertEquals(1.2715657803006103E26, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MINIMIZE;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(2.0, 0.5);
      // Undeclared exception!
      try { 
        brentOptimizer0.optimize(23, (UnivariateFunction) cosh0, goalType0, (-1696.345165), Double.NaN, 0.5);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (23) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MINIMIZE;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.6217655929285066, 0.5);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(23, (UnivariateFunction) cosh0, goalType0, (double) 23, 40.738184677350226);
      assertEquals(3.4637054287431914E13, univariatePointValuePair0.getValue(), 0.01);
      assertNotNull(univariatePointValuePair0);
      assertEquals(31.869092338675113, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      GoalType goalType0 = GoalType.MINIMIZE;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(23, 0.5);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(23, (UnivariateFunction) cosh0, goalType0, Double.NaN, 1804.49317, (double) 23);
      assertEquals(23.0, univariatePointValuePair0.getPoint(), 0.01);
      assertEquals(4.872401723124452E9, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(881.97671, 1.0);
      Expm1 expm1_0 = new Expm1();
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(3861, (UnivariateFunction) expm1_0, goalType0, 5.0, (-3361.8), 0.5);
      assertEquals((-1283.7843196262284), univariatePointValuePair0.getPoint(), 0.01);
  }
}
