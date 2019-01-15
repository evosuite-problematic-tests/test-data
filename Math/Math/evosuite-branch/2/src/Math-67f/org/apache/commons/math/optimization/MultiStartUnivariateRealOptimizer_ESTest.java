/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:58:24 GMT 2019
 */

package org.apache.commons.math.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.UnivariateRealOptimizer;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.MersenneTwister;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiStartUnivariateRealOptimizer_ESTest extends MultiStartUnivariateRealOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister(2987L);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.setRelativeAccuracy(2987L);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, jDKRandomGenerator0);
      int int0 = multiStartUnivariateRealOptimizer0.getMaximalIterationCount();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealOptimizer0).getRelativeAccuracy();
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1695, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1695, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy(0.0);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealOptimizer0).getAbsoluteAccuracy();
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1695, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.getAbsoluteAccuracy();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister(2667L);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1, mersenneTwister0);
      int int0 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1695, mersenneTwister0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister(2667L);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.resetRelativeAccuracy();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 15, jDKRandomGenerator0);
      int int0 = multiStartUnivariateRealOptimizer0.getIterationCount();
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getIterationCount();
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getEvaluations();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1695, mersenneTwister0);
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 2357.05, (-1948.5256801458), 1.0);
      double[] doubleArray1 = multiStartUnivariateRealOptimizer0.getOptima();
      assertEquals(1695, doubleArray1.length);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(Integer.MAX_VALUE);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, Integer.MAX_VALUE, mersenneTwister0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1695, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister(2667L);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1, mersenneTwister0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.getFunctionValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1695, mersenneTwister0);
      int int0 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 3062, mersenneTwister0);
      try { 
        multiStartUnivariateRealOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(univariateRealOptimizer0).getIterationCount();
      doReturn(0).when(univariateRealOptimizer0).getEvaluations();
      doReturn(0.0).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister(2667L);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1, mersenneTwister0);
      GoalType goalType0 = GoalType.MINIMIZE;
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) null, goalType0, (double) 1, 0.0);
      double[] doubleArray0 = multiStartUnivariateRealOptimizer0.getOptimaValues();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(1);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 0, mersenneTwister0);
      try { 
        multiStartUnivariateRealOptimizer0.getOptimaValues();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((-1925), 199, (-1889), 675, (-1925)).when(univariateRealOptimizer0).getIterationCount();
      doReturn(169, (-1889), 23, (-1925), (-1925)).when(univariateRealOptimizer0).getEvaluations();
      doReturn((-1791.3542155352), (double)23, 0.0, (-1.0), (double)(-1889)).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(0.0, 3487.7, (-1791.3542155352), (double)199, Double.NaN).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 84, mersenneTwister0);
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 2564.4839880658856, 700.8034);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getIterationCount();
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getEvaluations();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      GoalType goalType0 = GoalType.MAXIMIZE;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (byte)120, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) null, goalType0, (double) (byte)120, Double.POSITIVE_INFINITY);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((-712), 10, 10, 10, 10).when(univariateRealOptimizer0).getIterationCount();
      doReturn((-3007), (-322), 966, 71, 2297).when(univariateRealOptimizer0).getEvaluations();
      doReturn((double)966, (double)(-322), 0.0, (double)966, 1.0).when(univariateRealOptimizer0).getFunctionValue();
      doReturn((-801.1098491157679), 3370.0, (double)966, (-2.0), (-1.0)).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister(1186);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1186, mersenneTwister0);
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double double0 = multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, (double) 966, 0.0);
      assertEquals(2712762, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(3370.0, double0, 0.01);
  }
}