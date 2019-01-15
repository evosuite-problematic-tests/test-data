/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:11:39 GMT 2019
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((-230));
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 100, 2, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize((-815), microsphereInterpolatingFunction0, goalType0, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (-230)
         //
         verifyException("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(230);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 2, 2, unitSphereRandomVectorGenerator0);
      double[] doubleArray2 = new double[21];
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(230, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray2, (double[]) null, doubleArray2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(87);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 2, 2, unitSphereRandomVectorGenerator0);
      double[] doubleArray2 = new double[13];
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize(150, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray2, doubleArray2, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 13
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(64);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 2, 2, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray2 = new double[10];
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize(64, microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 10
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(1448);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 100, 2, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize((-815), microsphereInterpolatingFunction0, goalType0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(1448);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 100, 2, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray2 = new double[9];
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.optimize((-815), microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (1,448)
         //
         verifyException("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", e);
      }
  }
}