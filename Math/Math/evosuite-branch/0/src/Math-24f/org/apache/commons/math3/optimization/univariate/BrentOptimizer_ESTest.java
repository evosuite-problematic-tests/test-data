/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:27:09 GMT 2018
 */

package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Atan;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Rint;
import org.apache.commons.math3.analysis.function.Sigmoid;
import org.apache.commons.math3.analysis.function.Sin;
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
  public void test00()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer((-4122.667884), 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -4,122.668 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(0.48850810527801514, 0.48850810527801514);
      Sigmoid sigmoid0 = new Sigmoid();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2273, (UnivariateFunction) sigmoid0, goalType0, (-4222.399946993), (double) 2273, (-3878.73407193512));
      assertEquals((-2276.3887416479715), univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(1.0, 0.0);
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
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.1730463525082348E-7, 1.1730463525082348E-7);
      GoalType goalType0 = GoalType.MAXIMIZE;
      Sin sin0 = new Sin();
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(82549, (UnivariateFunction) sin0, goalType0, (double) 82549, 1.1730463525082348E-7);
      assertEquals(0.999995339104141, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.1730463525082348E-7, 1.1730463525082348E-7);
      Rint rint0 = new Rint();
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(82549, (UnivariateFunction) rint0, goalType0, 2271.3, (double) 82549);
      assertEquals(82548.06672040843, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.1730463525082348E-7, 1.1730463525082348E-7);
      Sigmoid sigmoid0 = new Sigmoid();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(155, (UnivariateFunction) sigmoid0, goalType0, (-1057.2577194236956), (double) 155, (double) 155);
      assertEquals((-771.1439624057737), univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.1730463525082348E-7, 1.1730463525082348E-7);
      Sigmoid sigmoid0 = new Sigmoid(155, 541.850671870674);
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2351, (UnivariateFunction) sigmoid0, goalType0, 541.850671870674, 541.850671870674, (double) 155);
      assertEquals(541.8505433637561, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker0).converged(anyInt() , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class) , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class));
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(964.8714038562, 599.8299162955113, convergenceChecker0);
      Identity identity0 = new Identity();
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1610612736, (UnivariateFunction) identity0, goalType0, 628.767280655898, (double) 1610612736, 4.440892098500626E-16);
      assertEquals(6.151993224385386E8, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker0).converged(anyInt() , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class) , any(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.class));
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(964.8714038562, 599.8299162955113, convergenceChecker0);
      Identity identity0 = new Identity();
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1610612736, (UnivariateFunction) identity0, goalType0, 629.2211765427569, (double) 1610612736, 4.440892098500626E-16);
      assertEquals(6.151993224385386E8, univariatePointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(2578.984254830815, 2578.984254830815);
      Log log0 = new Log();
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2139868457, (UnivariateFunction) log0, goalType0, (double) 2139868457, (-2159.2), (-1408.29));
      assertEquals(1.739705777166245E7, univariatePointValuePair0.getPoint(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(640.662605, 1.0);
      Atan atan0 = new Atan();
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(134217729, (UnivariateFunction) atan0, goalType0, 1.0, 640.662605);
      assertEquals(320.8313025, univariatePointValuePair0.getPoint(), 0.01);
      assertEquals(1.5676794340420215, univariatePointValuePair0.getValue(), 0.01);
      assertNotNull(univariatePointValuePair0);
  }
}