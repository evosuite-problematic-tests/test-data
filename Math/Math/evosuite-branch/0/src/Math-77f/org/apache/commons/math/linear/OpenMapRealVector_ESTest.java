/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:56:41 GMT 2018
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.AbstractRealVector;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.getIndex();
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector.OpenMapSparseIterator openMapRealVector_OpenMapSparseIterator0 = openMapRealVector0.new OpenMapSparseIterator();
      // Undeclared exception!
      try { 
        openMapRealVector_OpenMapSparseIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        openMapRealVector0.unitVector();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // cannot normalize a zero norm vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getSparcity();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      try { 
        openMapRealVector0.setSubVector(0, (RealVector) openMapRealVector0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // index 0 out of allowed range [0, -1]
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1094, 0.0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.projection((RealVector) openMapRealVector0);
      assertEquals(1094, openMapRealVector0.getDimension());
      assertEquals(1.0, openMapRealVector1.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(Double.NaN, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3755, 2428, 3755);
      double[] doubleArray0 = new double[3];
      try { 
        openMapRealVector0.projection(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 3,755 but expected 3
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(4);
      openMapRealVector0.set(4);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(4, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      assertEquals(8, openMapRealVector0.getDimension());
      
      openMapRealVector0.add((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2330.123706853355;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparcity(), 0.01);
      
      openMapRealVector0.mapUlpToSelf();
      openMapRealVector1.add((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2322.4464618026;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2322.4464618026);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.add(openMapRealVector0);
      assertEquals(0.2, openMapRealVector1.getSparcity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.2, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2322.4464618026;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2322.4464618026);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector1.mapPowToSelf(0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector1.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.setValue((-38.71375343351336));
      // Undeclared exception!
      try { 
        openMapRealVector2.add(openMapRealVector0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // index 32 out of allowed range [0, 4]
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 1380);
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.append((RealVector) openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparcity(), 0.01);
      assertEquals(0.0, openMapRealVector2.getSparcity(), 0.01);
      assertEquals(7, openMapRealVector2.getDimension());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray0[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[2]);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(31);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) arrayRealVector0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2330.123706853355;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparcity(), 0.01);
      
      openMapRealVector0.mapUlpToSelf();
      double double0 = openMapRealVector0.dotProduct(openMapRealVector1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.dotProduct(openMapRealVector0);
      assertEquals(0.2, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = openMapRealVector0.dotProduct((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide((RealVector) openMapRealVector0);
      assertEquals(0.2, openMapRealVector1.getSparcity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 2745.472150264516;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2745.472150264516);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      assertEquals(0.25, openMapRealVector0.getSparcity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.25, openMapRealVector1.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      assertEquals(0, openMapRealVector0.getDimension());
      
      double[] doubleArray0 = new double[0];
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(doubleArray0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3274.24790118);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(doubleArray0);
      assertEquals(0.2, openMapRealVector1.getSparcity(), 0.01);
      assertEquals(0.2, openMapRealVector0.getSparcity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 819.126449333;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(0.5, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparcity(), 0.01);
      assertEquals(1, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1.0E-12;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(1.0, openMapRealVector1.getSparcity(), 0.01);
      assertEquals(0.5, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2973, 433, 433);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 2973;
      openMapRealVector0.setSubVector(40, doubleArray0);
      openMapRealVector0.getSubVector(1, 40);
      assertEquals(3.363605785401951E-4, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = Double.NaN;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = openMapRealVector0.toArray();
      assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(0.25, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(920, 920);
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(920, openMapRealVector0.getDimension());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-1234.0));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double1 = openMapRealVector0.getDistance(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-1234.0));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 1.0E-12);
      double double1 = openMapRealVector0.getDistance(openMapRealVector1);
      assertEquals(0.14285714285714285, openMapRealVector1.getSparcity(), 0.01);
      assertEquals(1234.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2330.123706853355;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((double) 1);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector1);
      assertEquals(2, openMapRealVector1.getDimension());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, Double.NaN);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2284, 0, 0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2284, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getL1Distance(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(684.9869861733965);
      double double0 = openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(684.9869861733965, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2330.123706853355;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2330.123706853355;
      doubleArray0[2] = 2029.31531607112;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      RealVector realVector0 = openMapRealVector0.mapUlpToSelf();
      double double0 = realVector0.getLInfDistance((RealVector) openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2499.6206004423;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2745.472150264516);
      double double0 = openMapRealVector0.getLInfDistance(doubleArray0);
      assertEquals(2499.6206004423, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2330.123706853355;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1339.4772030538397;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1339.4772030538397);
      openMapRealVector0.mapAsinToSelf();
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertEquals(0.3333333333333333, openMapRealVector0.getSparcity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertEquals(0.14285714285714285, openMapRealVector0.getSparcity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Double[] doubleArray0 = new Double[9];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      Double double1 = new Double(Double.NaN);
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[0];
      doubleArray0[6] = doubleArray0[3];
      doubleArray0[7] = doubleArray0[2];
      doubleArray0[8] = doubleArray0[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertEquals(0.4444444444444444, openMapRealVector0.getSparcity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2427.34;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0E-12;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      assertEquals(6, realMatrix0.getRowDimension());
      assertEquals(0.16666666666666666, openMapRealVector0.getSparcity(), 0.01);
      assertEquals(6, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2322.4464618026;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 2322.4464618026);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparcity(), 0.01);
      assertEquals(0.2, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1909.7;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 3355.537);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 730.7601152493);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.subtract((RealVector) openMapRealVector1);
      assertNotSame(openMapRealVector2, openMapRealVector0);
      assertTrue(openMapRealVector2.equals((Object)openMapRealVector0));
      assertEquals(0.25, openMapRealVector1.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) arrayRealVector0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      assertEquals(0.2, openMapRealVector0.getSparcity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.2, openMapRealVector1.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(6129.51452402);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = doubleArray0[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[5]);
      openMapRealVector0.hashCode();
      assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      AbstractRealVector.EntryImpl abstractRealVector_EntryImpl0 = openMapRealVector0.new EntryImpl();
      boolean boolean0 = openMapRealVector0.equals(abstractRealVector_EntryImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 398.035525239892);
      boolean boolean0 = openMapRealVector0.equals((Object) null);
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-7));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 2145868503);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertFalse(boolean0);
      assertEquals(2145868496, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-470));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((-470), (-470), (-470));
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals((-470), openMapRealVector1.getDimension());
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2747);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.setEntry(816, 2747);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(3.6403349108117945E-4, openMapRealVector1.getSparcity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 854.14521804787;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0.125, openMapRealVector1.getSparcity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2330.123706853355;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparcity(), 0.01);
      
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector0.mapUlpToSelf();
      boolean boolean0 = openMapRealVector2.equals(openMapRealVector1);
      assertEquals(0.0, openMapRealVector2.getSparcity(), 0.01);
      assertFalse(boolean0);
  }
}
