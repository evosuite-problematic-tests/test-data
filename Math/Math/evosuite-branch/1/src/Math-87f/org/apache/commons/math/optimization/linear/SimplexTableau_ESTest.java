/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 16:31:15 GMT 2018
 */

package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.Relationship;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexTableau_ESTest extends SimplexTableau_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(2125.626531970949);
      doubleArray0[0] = double0;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2125.626531970949);
      double[][] doubleArray1 = simplexTableau0.getData();
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      // Undeclared exception!
      try { 
        simplexTableau0.setEntry((-3172), (-3172), 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (-3,172, -3,172) in a 1x4 matrix
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(2125.626531970949);
      doubleArray0[0] = double0;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2125.626531970949);
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, Double.NEGATIVE_INFINITY);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      int int0 = simplexTableau0.getNumDecisionVariables();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2059.159583114));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      int int0 = simplexTableau0.getNumSlackVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(242);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      int int0 = simplexTableau0.getNumArtificialVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(210, 210);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 210);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
      simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 229.1);
      linkedList0.add(linearConstraint0);
      Relationship relationship1 = Relationship.GEQ;
      LinearConstraint linearConstraint1 = new LinearConstraint(doubleArray0, (-422.17), relationship1, doubleArray0, (-399.036438));
      linkedList0.offerLast(linearConstraint1);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2.0);
      assertEquals(8, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = Double.NEGATIVE_INFINITY;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2059.159583114));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(realVectorImpl0, relationship0, (-4425.01774891));
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals(Double.NaN, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2059.159583114));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(realVectorImpl0, relationship0, (-4425.01774891));
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.discardArtificialVariables();
      assertEquals(4, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, Double.NEGATIVE_INFINITY);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.discardArtificialVariables();
      assertEquals(2, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 193.19994231512337);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 193.19994231512337);
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 193.19994231512337);
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals(193.19994231512337, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2059.159583114));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(realVectorImpl0, relationship0, (-4425.01774891));
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.divideRow(1, (-1420.0));
      assertEquals(4, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2.0);
      boolean boolean0 = simplexTableau0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-943.03313));
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2110.5791695979));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, Double.NEGATIVE_INFINITY);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1.0));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-2817.495424341));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, (-95.892));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, false, 1.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, Double.NEGATIVE_INFINITY);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(5, 1.0);
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(realVectorImpl0, relationship0, 0.0);
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1.0));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 592.7017359363094);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1501.923745423);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.numArtificialVariables = 6;
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(simplexTableau1.equals((Object)simplexTableau0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2059.159583114));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1864.334));
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1864.334));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, 1);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, true, 0.0);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      double[] doubleArray1 = new double[0];
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray1, relationship0, 0.0);
      List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, list0, goalType0, true, 0.0);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2059.159583114));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1864.334));
      GoalType goalType1 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType1, true, (-1864.334));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }
}
