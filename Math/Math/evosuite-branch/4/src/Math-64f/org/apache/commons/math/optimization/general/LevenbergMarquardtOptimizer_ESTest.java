/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 16:01:54 GMT 2019
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.SimpleVectorialPointChecker;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LevenbergMarquardtOptimizer_ESTest extends LevenbergMarquardtOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray2, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray2, doubleArray2);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[22];
      doubleArray1[0] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[3];
      double[] doubleArray4 = new double[3];
      doubleArray4[0] = (-1440.2201846358);
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray3, (Object) doubleArray3, (Object) doubleArray4, (Object) doubleArray4).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = 100.0;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray5, doubleArray5, doubleArray5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray1, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setOrthoTolerance((-37.40355652274589));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) 100;
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray2, doubleArray2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0));
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (-1.0);
      doubleArray1[2] = (-1.0);
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 0;
      doubleArray1[5] = (double) 100;
      doubleArray1[6] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (double) 100;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[1] = (-1.0);
      doubleArray3[2] = (double) 0;
      doubleArray3[3] = (double) 100;
      doubleArray3[4] = (double) 0;
      doubleArray3[5] = (double) 0;
      doubleArray3[6] = (-17.76907836707096);
      doubleArray3[7] = (double) 0;
      doubleArray0[2] = doubleArray3;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray4 = new double[3];
      doubleArray4[0] = (-2730.82);
      doubleArray4[1] = (double) 0;
      doubleArray4[2] = (-1.0);
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = 1415.4099999999996;
      doubleArray5[1] = (-2730.82);
      doubleArray5[2] = (double) 100;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray4, (Object) null, (Object) null, (Object) null, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray6 = new double[3];
      doubleArray6[0] = 100.0;
      levenbergMarquardtOptimizer0.setMaxEvaluations(753);
      doubleArray6[1] = (double) 0;
      doubleArray6[2] = (double) 0;
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray6, doubleArray6, doubleArray6);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      SimpleVectorialPointChecker simpleVectorialPointChecker0 = new SimpleVectorialPointChecker();
      levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialPointChecker0);
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (double) 100;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = (-2730.82);
      double[] doubleArray4 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray3, (Object) doubleArray3, (Object) doubleArray4, (Object) doubleArray4, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (double) 100;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray5, doubleArray5, doubleArray5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(100);
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 100;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 0;
      doubleArray1[5] = (double) 100;
      doubleArray1[6] = (double) 100;
      doubleArray1[2] = (double) 0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (double) 100;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[1] = (double) 0;
      doubleArray3[2] = (double) 0;
      doubleArray3[3] = (double) 100;
      doubleArray3[4] = (double) 0;
      doubleArray3[5] = (double) 0;
      doubleArray3[6] = (double) 100;
      doubleArray3[7] = (double) 0;
      doubleArray0[2] = doubleArray3;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray4 = new double[3];
      doubleArray4[0] = 0.0;
      doubleArray4[1] = (double) 0;
      doubleArray4[2] = (double) 0;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray4, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (double) 100;
      levenbergMarquardtOptimizer0.setMaxEvaluations(753);
      doubleArray5[1] = (double) 0;
      doubleArray5[2] = (double) 0;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray5, doubleArray5, doubleArray5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      SimpleVectorialPointChecker simpleVectorialPointChecker0 = new SimpleVectorialPointChecker();
      levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialPointChecker0);
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (double) 100;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = (-2730.82);
      double[] doubleArray4 = new double[3];
      doubleArray1[0] = (double) 100;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray3, (Object) doubleArray3, (Object) doubleArray4, (Object) doubleArray4).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (double) 100;
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray5, doubleArray5, doubleArray5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // cost relative tolerance is too small (0), no further reduction in the sum of squares is possible
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      SimpleVectorialPointChecker simpleVectorialPointChecker0 = new SimpleVectorialPointChecker();
      levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialPointChecker0);
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (double) 100;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[3];
      SimpleVectorialValueChecker simpleVectorialValueChecker0 = new SimpleVectorialValueChecker(2682.22766, 1.1102230246251565E-14);
      levenbergMarquardtOptimizer0.checker = (VectorialConvergenceChecker) simpleVectorialValueChecker0;
      doubleArray3[0] = (-2730.82);
      double[] doubleArray4 = new double[3];
      doubleArray1[0] = (double) 100;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray3, (Object) doubleArray3, (Object) doubleArray4, (Object) doubleArray4, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (double) 100;
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray5, doubleArray5, doubleArray5);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray2, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-819.1017566185437));
      levenbergMarquardtOptimizer0.setOrthoTolerance((-17.76907836707096));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray2, doubleArray2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // orthogonality tolerance is too small (-17.769), solution is orthogonal to the jacobian
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[22];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 100;
      doubleArray2[1] = (double) 100;
      doubleArray2[2] = (double) 100;
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray3, (Object) doubleArray3, (Object) doubleArray3, (Object) doubleArray3, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray4 = new double[3];
      doubleArray4[1] = (double) 100;
      doubleArray4[2] = (double) 100;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray4, doubleArray4, doubleArray4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (double) 100;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray1;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray3, (Object) doubleArray3, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray4 = new double[3];
      doubleArray4[0] = 100.0;
      doubleArray4[2] = (double) 100;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray4, doubleArray4, doubleArray4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }
}
