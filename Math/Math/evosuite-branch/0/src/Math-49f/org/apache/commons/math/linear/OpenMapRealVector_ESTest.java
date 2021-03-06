/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:12:53 GMT 2018
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.function.Logit;
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
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1915.54);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.projection((RealVector) openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(202);
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
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-2499.658283565));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(1848.4197948268645);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd((-1477.606798));
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(8865.640788, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      double double0 = openMapRealVector0.getSparsity();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 31);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(31);
      // Undeclared exception!
      try { 
        openMapRealVector0.setSubVector(150, (RealVector) arrayRealVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // index (150)
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertEquals(6, openMapRealVector0.getDimension());
      
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.projection(doubleArray0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 1628.869201998124;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      assertEquals(8, openMapRealVector1.getDimension());
      
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.add(openMapRealVector0);
      assertEquals(0.125, openMapRealVector2.getSparsity(), 0.01);
      assertFalse(openMapRealVector2.equals((Object)openMapRealVector1));
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(openMapRealVector2.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector2, openMapRealVector0);
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
      assertNotSame(openMapRealVector0, openMapRealVector1);
      
      Double[] doubleArray1 = new Double[8];
      doubleArray1[0] = (Double) openMapRealVector1.DEFAULT_ZERO_TOLERANCE;
      doubleArray1[1] = (Double) 1628.869201998124;
      doubleArray1[2] = (Double) 1.0E-12;
      doubleArray1[3] = (Double) openMapRealVector2.DEFAULT_ZERO_TOLERANCE;
      doubleArray1[4] = (Double) 1.0E-12;
      doubleArray1[5] = (Double) 1.0E-12;
      doubleArray1[6] = (Double) openMapRealVector2.DEFAULT_ZERO_TOLERANCE;
      doubleArray1[7] = (Double) doubleArray0[5];
      OpenMapRealVector openMapRealVector3 = new OpenMapRealVector(doubleArray1, 9.140260083262505E-9);
      assertEquals(0.25, openMapRealVector3.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 1628.869201998124;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      assertEquals(0.125, openMapRealVector1.getSparsity(), 0.01);
      
      Double[] doubleArray1 = new Double[8];
      doubleArray1[0] = (Double) openMapRealVector1.DEFAULT_ZERO_TOLERANCE;
      doubleArray1[1] = (Double) 1628.869201998124;
      doubleArray1[2] = (Double) 1.0E-12;
      doubleArray1[3] = (Double) openMapRealVector1.DEFAULT_ZERO_TOLERANCE;
      doubleArray1[4] = (Double) 1.0E-12;
      doubleArray1[5] = (Double) 1.0E-12;
      doubleArray1[6] = doubleArray1[3];
      doubleArray1[7] = (Double) doubleArray0[5];
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(doubleArray1, 9.140260083262505E-9);
      OpenMapRealVector openMapRealVector3 = openMapRealVector0.add(openMapRealVector2);
      assertEquals(0.375, openMapRealVector3.getSparsity(), 0.01);
      assertTrue(openMapRealVector0.equals((Object)openMapRealVector1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-458.1322110087));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[3];
      doubleArray0[6] = doubleArray0[3];
      doubleArray0[7] = doubleArray0[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      openMapRealVector0.add((RealVector) arrayRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.add((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[9];
      Double double0 = new Double((-928.763139609));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[3];
      doubleArray0[5] = doubleArray0[2];
      doubleArray0[6] = doubleArray0[1];
      doubleArray0[7] = doubleArray0[0];
      doubleArray0[8] = double0;
      double[] doubleArray1 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.add(openMapRealVector1);
      assertTrue(openMapRealVector2.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector2, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-0.7853981633974483);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1.0E-12;
      openMapRealVector0.setSubVector(0, doubleArray1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(doubleArray0);
      double double0 = openMapRealVector1.dotProduct(openMapRealVector0);
      assertEquals(0.5, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0);
      double[] doubleArray0 = openMapRealVector0.getData();
      openMapRealVector0.dotProduct(doubleArray0);
      assertEquals(0, openMapRealVector0.getDimension());
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double[] doubleArray1 = openMapRealVector0.toArray();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2021.003565;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 2021.003565);
      double double0 = openMapRealVector0.getDistance(openMapRealVector1);
      assertEquals(Double.NaN, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(2021.003565, double0, 0.01);
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = openMapRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-216.2902633166759);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide((RealVector) openMapRealVector0);
      double double0 = openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(217.2902633166759, double0, 0.01);
      assertEquals(0.125, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = mock(OpenIntToDoubleHashMap.Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(openIntToDoubleHashMap_Iterator0).key();
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry(openIntToDoubleHashMap_Iterator0);
      openMapRealVector_OpenMapEntry0.setValue(3606.0);
      double double0 = openMapRealVector0.getLInfDistance(doubleArray0);
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(3606.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.NaN;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(30, 47, 1630.869201998124);
      Logit logit0 = new Logit();
      openMapRealVector0.mapToSelf(logit0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-216.2902633166759);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.NaN;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertTrue(boolean0);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      assertEquals(6, realMatrix0.getRowDimension());
      assertEquals(6, realMatrix0.getColumnDimension());
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 342.0);
      Double[] doubleArray1 = new Double[6];
      doubleArray1[0] = (Double) 342.0;
      doubleArray1[1] = (Double) 342.0;
      doubleArray1[2] = (Double) 0.0;
      doubleArray1[3] = (Double) (-1.0);
      doubleArray1[4] = (Double) 342.0;
      doubleArray1[5] = (Double) 0.0;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 0.0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.subtract(openMapRealVector1);
      assertEquals(0.5, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-458.1322110087));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[0];
      doubleArray0[6] = double0;
      doubleArray0[7] = doubleArray0[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) arrayRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
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
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-216.2902633166759);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.hashCode();
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.equals(":M RhdsAK=");
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(boolean0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(doubleArray0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertFalse(boolean0);
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(4, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, (-3850.51817049371));
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1325.83586776);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(1, 1, 1.0E-12);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(boolean0);
      assertEquals(1, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1016.35814986085);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-1016.35814986085));
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.mapSubtract((-1016.35814986085));
      openMapRealVector0.set(0.0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1325.83586776);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(1, 1, 1.0E-12);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertFalse(boolean0);
      assertEquals(1, openMapRealVector1.getDimension());
  }
}
