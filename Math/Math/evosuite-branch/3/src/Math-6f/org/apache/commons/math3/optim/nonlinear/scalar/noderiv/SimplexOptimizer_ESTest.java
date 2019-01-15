/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 14:39:17 GMT 2019
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
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexOptimizer_ESTest extends SimplexOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(1497.699638630154, 1497.699638630154);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(1497.699638630154, 1497.699638630154);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(46, 46, 46);
      optimizationDataArray0[4] = (OptimizationData) multiDirectionalSimplex0;
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (-568L);
      doubleArray0[1] = (double) (-568L);
      doubleArray0[2] = (double) 255L;
      doubleArray0[3] = 1.01;
      doubleArray0[4] = (double) (-568L);
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) nelderMeadSimplex0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(429.0, 429.0);
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(simplePointChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(5);
      optimizationDataArray0[0] = (OptimizationData) multiDirectionalSimplex0;
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(5);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
      // Undeclared exception!
      try { 
        simplexOptimizer0.doOptimize();
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", e);
      }
  }
}