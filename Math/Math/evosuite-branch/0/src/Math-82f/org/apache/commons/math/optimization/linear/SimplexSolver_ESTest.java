/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 12:09:52 GMT 2018
 */

package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.Relationship;
import org.apache.commons.math.optimization.linear.SimplexSolver;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship0, relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(0.01, (-1905.580959)).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      assertEquals((-1905.580959), realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      Relationship relationship0 = Relationship.GEQ;
      Relationship relationship1 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship0, relationship1, relationship1).when(linearConstraint0).getRelationship();
      doReturn(1.0E-12, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      Relationship relationship1 = Relationship.GEQ;
      Relationship relationship2 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0, openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship1, relationship0, relationship0, relationship2).when(linearConstraint0).getRelationship();
      doReturn(0.0, 610.895609102, (double)100, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0, relationship0, relationship2, relationship1, relationship2).when(linearConstraint1).getRelationship();
      doReturn(100.0, (double)100).when(linearConstraint1).getValue();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1328.88319);
      linkedList0.offerLast(linearConstraint1);
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship0, relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(100.0, 610.895609102).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2663.0));
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship0, relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(0.0, 610.895609102).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
}
