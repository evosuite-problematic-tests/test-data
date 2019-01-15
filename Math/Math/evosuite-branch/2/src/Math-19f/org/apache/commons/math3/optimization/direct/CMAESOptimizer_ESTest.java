/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:44:07 GMT 2019
 */

package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CMAESOptimizer_ESTest extends CMAESOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      cMAESOptimizer0.optimize(663, microsphereInterpolatingFunction0, goalType0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0);
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(3188, doubleArray0);
      assertEquals(0.0, CMAESOptimizer.DEFAULT_STOPFITNESS, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0);
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      cMAESOptimizer0.optimize(663, microsphereInterpolatingFunction0, goalType0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a((-518));
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>((-518), 0.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-518), doubleArray0, (-518), (-518), false, (-518), (-518), well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(2521, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray0);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a();
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(668.6329028370186, 1000.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(663, doubleArray0, 663, 663, false, 663, (-813), well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(663, microsphereInterpolatingFunction0, goalType0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a(0);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(2, 0.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(2, doubleArray0, 2, 2, false, 2, 2, well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(2521, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray0);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a(108);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(108, 0.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(108, doubleArray0, 108, 108, false, 108, 108, well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      cMAESOptimizer0.optimize(2521, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a(521);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(521, 0.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(521, doubleArray0, 521, 521, false, 521, 521, well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(2521, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[0], (double[]) null, doubleArray1[0]);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a(574);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(574, 0.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(574, doubleArray0, 574, 574, false, 574, 574, well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray2 = new double[0];
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize((-2140340470), microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      int[] intArray0 = new int[5];
      doubleArray0[2] = (double) (-813);
      Well512a well512a0 = new Well512a(intArray0);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(668.6329028370186, 1436.2091813);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(663, doubleArray0, 663, 663, false, 663, (-813), well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-175));
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, (-813), 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(0, microsphereInterpolatingFunction0, goalType0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -813 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 574;
      Well512a well512a0 = new Well512a(574);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(574, 0.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(574, doubleArray0, 574, 574, false, 574, 574, well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(2521, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 574 out of [0, 0] range
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a();
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(668.6329028370186, 1000.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(663, doubleArray0, 663, 663, false, 663, 663, well512a0, false, simplePointChecker0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2521);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      cMAESOptimizer0.optimize(663, microsphereInterpolatingFunction0, goalType0, doubleArray0);
  }
}