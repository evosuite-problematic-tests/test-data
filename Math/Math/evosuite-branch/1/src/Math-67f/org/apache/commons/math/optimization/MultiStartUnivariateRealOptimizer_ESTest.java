/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:56:38 GMT 2018
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
import org.apache.commons.math.random.RandomAdaptor;
import org.apache.commons.math.random.RandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiStartUnivariateRealOptimizer_ESTest extends MultiStartUnivariateRealOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, (-753), jDKRandomGenerator0);
      int int0 = multiStartUnivariateRealOptimizer0.getMaximalIterationCount();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.setRelativeAccuracy((-1909.0));
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealOptimizer0).getRelativeAccuracy();
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) Integer.MAX_VALUE);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, Integer.MAX_VALUE, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 57, jDKRandomGenerator0);
      multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy(57);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealOptimizer0).getAbsoluteAccuracy();
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.getAbsoluteAccuracy();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
      int int0 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, jDKRandomGenerator0);
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
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, jDKRandomGenerator0);
      multiStartUnivariateRealOptimizer0.resetRelativeAccuracy();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
      int int0 = multiStartUnivariateRealOptimizer0.getIterationCount();
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
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
  public void test12()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1166, (RandomGenerator) null);
      int int0 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getIterationCount();
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getEvaluations();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 605, mersenneTwister0);
      GoalType goalType0 = GoalType.MINIMIZE;
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) null, goalType0, 1098.06817, (double) 8090289516618172508L);
      double[] doubleArray0 = multiStartUnivariateRealOptimizer0.getOptima();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(605, doubleArray0.length);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 1, jDKRandomGenerator0);
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
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getIterationCount();
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getEvaluations();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1798, mersenneTwister0);
      GoalType goalType0 = GoalType.MINIMIZE;
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) null, goalType0, (double) 1798, (double) 1798, (double) 1798);
      double[] doubleArray0 = multiStartUnivariateRealOptimizer0.getOptimaValues();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(1798, doubleArray0.length);
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 1, jDKRandomGenerator0);
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
      doReturn((-330), (-330), 1989, (-330), 194).when(univariateRealOptimizer0).getIterationCount();
      doReturn((-773), 527, (-271), (-773), 54).when(univariateRealOptimizer0).getEvaluations();
      doReturn(0.0, (double)54, (double)54, Double.NaN, (double)1989).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(Double.NaN, 0.0, (double)1989, 1366.148162, Double.NaN).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister(377);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 377, mersenneTwister0);
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, 1000.0618054);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 377
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getIterationCount();
      doReturn(0, 0, 0, 0, 0).when(univariateRealOptimizer0).getEvaluations();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      MersenneTwister mersenneTwister0 = new MersenneTwister(377);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 377, mersenneTwister0);
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, 1000.0618054);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(69, (-3534), (-3534), (-1722), 1393).when(univariateRealOptimizer0).getIterationCount();
      doReturn(2898, 2898, 2874, 69, (-1)).when(univariateRealOptimizer0).getEvaluations();
      doReturn((double)(-3534), (double)2874, (double)1393, (double)2898, 92.3).when(univariateRealOptimizer0).getFunctionValue();
      doReturn((-921.4026529684), 1614.99412324664, 92.3, (-2218.566), (-1550.30557772)).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      int[] intArray0 = new int[8];
      MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
      RandomAdaptor randomAdaptor0 = new RandomAdaptor(mersenneTwister0);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1983, randomAdaptor0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double double0 = multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) null, goalType0, 2.220446049250313E-16, 768.4447, (double) 0);
      assertEquals(2748026, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals((-921.4026529684), double0, 0.01);
  }
}
