/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:07:41 GMT 2018
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PowellOptimizer_ESTest extends PowellOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(1759.08, 1759.08, 1759.08, 3822.534267678);
      assertNull(powellOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(3004.5568584234343, (-2989.79456));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,989.795 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(2901.041737, 2901.041737);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      double[] doubleArray0 = new double[9];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      try { 
        powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(2.0, 2.0, 0.0, 2.0, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(293);
      optimizationDataArray0[5] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }
}
