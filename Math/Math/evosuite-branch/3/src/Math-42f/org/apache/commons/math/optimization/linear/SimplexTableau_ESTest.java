/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 15:48:16 GMT 2019
 */

package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
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
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2213.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2822.76, 478);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2822.76);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-9, (-1805));
      double[][] doubleArray1 = simplexTableau0.getData();
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(1, 1);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 1);
      // Undeclared exception!
      try { 
        simplexTableau0.setEntry(0, 443, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // column index (443)
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0, (-1364.258));
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      int int0 = simplexTableau0.getNumDecisionVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      // Undeclared exception!
      try { 
        simplexTableau0.subtractRow((-1270), 0, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row index (-1,270)
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(arrayRealVector0, relationship0, 1.0E-12);
      linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-9, (-1805));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = 1.0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1.0);
      linkedList0.addLast(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals(1.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-9, (-1805));
      simplexTableau0.dropPhase1Objective();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1887.2387599729198));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1887.2387599729198), 855);
      boolean boolean0 = simplexTableau0.isOptimal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 3831.3626;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-4123.542046096), 10);
      boolean boolean0 = simplexTableau0.isOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-1.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals((-1.0), realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 1.0, relationship0, doubleArray0, 0.6299605249474366);
      linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0, (-1894));
      simplexTableau0.dropPhase1Objective();
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals(1.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = (-1.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, (-1.0), relationship0, doubleArray0, 0.6299605249474366);
      linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2476.4878390118);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1389.001666, 0);
      simplexTableau0.divideRow(0, 0.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1479.84293349));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, relationship0, (-2113.844247117663));
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 10);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      boolean boolean0 = simplexTableau0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 6.283185307179586);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 0);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 6.283185307179586);
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, 0.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, true, 0.0, 0);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 6.283185307179586);
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, (-1.0), relationship0, openMapRealVector0, 2081.903);
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 0);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1479.84293349));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 10);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 6.283185307179586);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 0);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, 0.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, true, 0.0, 10);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1479.84293349));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, relationship0, (-2113.844247117663));
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 10);
      simplexTableau1.dropPhase1Objective();
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, (GoalType) null, true, 0.0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 10);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }
}
