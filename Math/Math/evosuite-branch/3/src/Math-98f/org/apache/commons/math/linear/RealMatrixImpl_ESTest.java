/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 17:22:26 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealMatrixImpl_ESTest extends RealMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertTrue(realMatrixImpl0.isSquare());
      assertEquals(1.0, realMatrixImpl0.getNorm(), 0.01);
      
      RealMatrix realMatrix0 = realMatrixImpl0.inverse();
      realMatrixImpl0.isSingular();
      assertTrue(realMatrixImpl0.equals((Object)realMatrix0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.copy();
      assertTrue(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1.0, realMatrixImpl0.getNorm(), 0.01);
      
      double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getLUMatrix();
      assertNotSame(realMatrixImpl0, realMatrix0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      int[] intArray0 = new int[0];
      try { 
        realMatrixImpl0.getSubMatrix(intArray0, intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // selected row and column index arrays must be non-empty
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(32, 4012);
      // Undeclared exception!
      try { 
        realMatrixImpl0.getPermutation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl((-1628), (-1628));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(3706, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl((double[][]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      // Undeclared exception!
      try { 
        realMatrixImpl0.inverse();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      double[] doubleArray1 = new double[8];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.transpose();
      try { 
        realMatrixImpl0.add(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(372, 372);
      RealMatrix realMatrix0 = realMatrixImpl0.getRowMatrix(171);
      try { 
        realMatrixImpl0.add(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.add((RealMatrix) realMatrixImpl0);
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.transpose();
      try { 
        realMatrix0.subtract((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.subtract((RealMatrix) realMatrixImpl0);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(372, 372);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.getRowMatrix(171);
      try { 
        realMatrixImpl1.subtract(realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarAdd((-1182.3624));
      double double0 = realMatrix0.getDeterminant();
      assertEquals((-1182.3624), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarMultiply(0.0);
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.preMultiply((RealMatrix) realMatrixImpl0);
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.multiply((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrices are not multiplication compatible.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(32, 4012);
      assertEquals(4012, realMatrixImpl0.getColumnDimension());
      
      double[][] doubleArray0 = new double[1][2];
      realMatrixImpl0.data = doubleArray0;
      double double0 = realMatrixImpl0.getNorm();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix((-1945), (-1945), (-1945), 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(1, 1, (-636), (-636));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(1119, (-935), 395, 1121);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(1, 171, (-2662), 1834);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, 443, 32);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(372, 372);
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(171, 171, 171, 171);
      assertEquals(1, realMatrix0.getColumnDimension());
      assertTrue(realMatrix0.isSquare());
      assertTrue(realMatrixImpl0.isSquare());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, 1774, 1774);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      int[] intArray0 = new int[4];
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(intArray0, intArray0);
      assertEquals(4, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1713, 1713);
      double[][] doubleArray0 = new double[2][3];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, (-1977), 1713);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[2][5];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray1, 0, (-1244));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[][] doubleArray0 = new double[0][1];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[7][5];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray1, 1602, 3532);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[3][5];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 457, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[5][6];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 0, 1262);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[4][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray1[0];
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray1, 1, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 7);
      try { 
        realMatrixImpl0.getRowMatrix(644);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getColumnMatrix(0);
      assertEquals(7, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getColumnMatrix(1634);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.getRow(0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getRow((-1906));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[7];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray2 = realMatrixImpl0.getColumn(1);
      assertEquals(1, doubleArray2.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getColumn((-152));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getDeterminant();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.getTrace();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(400, 400);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getTrace();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.operate(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.operate(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.preMultiply(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(7, 7);
      double[] doubleArray0 = new double[5];
      try { 
        realMatrixImpl0.preMultiply(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = new double[6];
      try { 
        realMatrixImpl0.solve(doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // constant vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(372, 372);
      RealMatrix realMatrix0 = realMatrixImpl0.getRowMatrix(171);
      try { 
        realMatrixImpl0.solve(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incorrect row dimension
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 1598);
      double[] doubleArray0 = new double[1];
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // coefficient matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Matrix is singular.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (-1646.41730283197);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (-1646.41730283197);
      doubleArray0[1] = doubleArray2;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.solve((RealMatrix) realMatrixImpl0);
      assertEquals(1.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      boolean boolean0 = realMatrixImpl0.isSingular();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(15, 291);
      double[][] doubleArray0 = new double[8][6];
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (double) 291;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 4102.4521;
      doubleArray0[1] = doubleArray2;
      realMatrixImpl0.data = doubleArray0;
      try { 
        realMatrixImpl0.luDecompose();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is singular
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      String string0 = realMatrixImpl0.toString();
      assertEquals("RealMatrixImpl{}", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      String string0 = realMatrixImpl0.toString();
      assertEquals("RealMatrixImpl{{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0}}", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(6605, 68);
      // Undeclared exception!
      realMatrixImpl0.toString();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      Object object0 = new Object();
      boolean boolean0 = realMatrixImpl0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1.0, realMatrixImpl0.getNorm(), 0.01);
      
      RealMatrix realMatrix0 = realMatrixImpl0.inverse();
      boolean boolean0 = realMatrixImpl0.equals(realMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[4][9];
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[7][5];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1668.59672;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.inverse();
      boolean boolean0 = realMatrixImpl0.equals(realMatrix0);
      assertEquals(5.993059844921666E-4, realMatrix0.getNorm(), 0.01);
      assertFalse(realMatrix0.equals((Object)realMatrixImpl0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.hashCode();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.inverse();
      RealMatrix realMatrix1 = realMatrixImpl0.getLUMatrix();
      assertTrue(realMatrix1.equals((Object)realMatrix0));
  }
}
