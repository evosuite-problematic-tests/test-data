/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:30:38 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.setValue(0.0);
      openMapRealVector0.add((RealVector) openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.14285714285714285;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      double double0 = openMapRealVector0.dotProduct(doubleArray0);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.02040816326530612, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double((-0.09088450866185192));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
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
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(78474.96631060327);
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        openMapRealVector0.unitVector();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0);
      double[] doubleArray0 = openMapRealVector0.toArray();
      assertEquals(0, doubleArray0.length);
      assertEquals(0, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.14285714285714285;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector0);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd((-1.0));
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(128, 0, 128);
      double double0 = openMapRealVector0.getSparsity();
      assertEquals(128, openMapRealVector0.getDimension());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-956), (-956));
      Double[] doubleArray0 = new Double[7];
      doubleArray0[0] = (Double) 1.0E-12;
      doubleArray0[1] = (Double) 1.0E-12;
      doubleArray0[2] = (Double) 1.0E-12;
      doubleArray0[3] = (Double) 1.0E-12;
      doubleArray0[4] = (Double) 1.0E-12;
      doubleArray0[5] = (Double) 1.0E-12;
      doubleArray0[6] = (Double) 1.0E-12;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        openMapRealVector0.setSubVector(3797, (RealVector) arrayRealVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // index (3,797)
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      // Undeclared exception!
      try { 
        openMapRealVector0.append((RealVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-2979.044));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      RealVector realVector0 = openMapRealVector0.add((RealVector) arrayRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(realVector0.equals((Object)arrayRealVector0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn((-3623)).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.setValue(0.0);
      openMapRealVector0.add((RealVector) openMapRealVector1);
      assertEquals(0.0045045045045045045, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      RealVector realVector0 = openMapRealVector0.projection((RealVector) openMapRealVector0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn((-3289)).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.setValue(0.0);
      // Undeclared exception!
      try { 
        openMapRealVector0.add(realVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // index (-3,289)
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-2979.044));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(2, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(doubleArray0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(7, openMapRealVector1.getDimension());
      assertEquals(Double.NaN, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.projection((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector0.projection((RealVector) openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(openMapRealVector2.equals((Object)openMapRealVector1));
      assertEquals(222, openMapRealVector2.getDimension());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertEquals(0.1111111111111111, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(doubleArray0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      openMapRealVector1.set(1.0E-12);
      openMapRealVector1.getSubVector(0, 222);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.14285714285714285;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(2, 2);
      assertEquals(2, openMapRealVector1.getDimension());
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 673.21853773923;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.003);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 0);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(Double.NaN, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.14285714285714285;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      double[] doubleArray1 = openMapRealVector0.getData();
      assertArrayEquals(new double[] {0.14285714285714285, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Double[] doubleArray1 = new Double[3];
      doubleArray1[0] = (Double) 1.0E-12;
      doubleArray1[1] = (Double) openMapRealVector0.DEFAULT_ZERO_TOLERANCE;
      doubleArray1[2] = (Double) 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1);
      double double0 = openMapRealVector0.getDistance(openMapRealVector1);
      assertEquals(1.7320508075688772E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = openMapRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 20.0);
      double double0 = openMapRealVector0.getDistance(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-280.1338);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      Double[] doubleArray1 = new Double[4];
      doubleArray1[0] = (Double) (-280.1338);
      doubleArray1[1] = (Double) 7.549889948768648E-8;
      doubleArray1[2] = (Double) 1.0E-12;
      doubleArray1[3] = (Double) 0.14285714285714285;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 0.14285714285714285);
      double double0 = openMapRealVector1.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(560.4104571428572, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getL1Distance(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector1);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.projection(doubleArray0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      
      openMapRealVector1.mapAddToSelf(1.0E-12);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector1);
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-1293.68));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1);
      double double1 = openMapRealVector0.getLInfDistance((RealVector) arrayRealVector0);
      assertEquals(1293.68, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getLInfDistance(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.projection((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector1.isInfinite();
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(boolean0);
      assertEquals(222, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.14285714285714285;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.ebeDivide((RealVector) openMapRealVector1);
      boolean boolean0 = openMapRealVector2.isInfinite();
      assertEquals(0.25, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.setValue(0.0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertEquals(0.0045045045045045045, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      RealVector realVector0 = openMapRealVector0.projection((RealVector) openMapRealVector0);
      boolean boolean0 = realVector0.isNaN();
      assertTrue(boolean0);
      assertEquals(222, realVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      assertEquals(3, realMatrix0.getRowDimension());
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(3, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(296);
      double[] doubleArray0 = new double[1];
      openMapRealVector0.setSubVector(1, doubleArray0);
      assertEquals(296, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.projection((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.subtract(openMapRealVector1);
      assertNotSame(openMapRealVector2, openMapRealVector1);
      assertEquals(222, openMapRealVector2.getDimension());
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
      assertTrue(openMapRealVector2.equals((Object)openMapRealVector1));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(1406.182845993296);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[3];
      doubleArray0[5] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.setValue(0.0);
      openMapRealVector0.hashCode();
      assertEquals(0.0045045045045045045, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      Object object0 = new Object();
      boolean boolean0 = openMapRealVector0.equals(object0);
      assertEquals(222, openMapRealVector0.getDimension());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector();
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
      assertEquals(Double.NaN, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(222, 0, 222);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(222, openMapRealVector1.getDimension());
      assertFalse(boolean0);
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.copy();
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.projection(doubleArray0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector0.mapMultiplyToSelf(793.976212249);
      OpenMapRealVector openMapRealVector3 = openMapRealVector1.copy();
      boolean boolean0 = openMapRealVector2.equals(openMapRealVector3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.14285714285714285;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }
}