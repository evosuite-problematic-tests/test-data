/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 16:12:01 GMT 2018
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayRealVector_ESTest extends ArrayRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double[] doubleArray0 = arrayRealVector0.toArray();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3281);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3281, 3281);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) arrayRealVector0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      String string0 = arrayRealVector0.toString();
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        arrayRealVector0.append((ArrayRealVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = arrayRealVector0.ebeMultiply((RealVector) arrayRealVector0);
      assertEquals(0.0, realVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      double[] doubleArray1 = arrayRealVector0.getDataRef();
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      assertEquals(0, arrayRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      try { 
        arrayRealVector0.set((-352), arrayRealVector0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // index -352 out of allowed range [0, -1]
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0, 2141.8);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        arrayRealVector0.projection(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 0 but expected 4
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(44, 44);
      // Undeclared exception!
      try { 
        arrayRealVector0.getSubVector(44, 3);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // index 44 out of allowed range [0, 43]
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      double[] doubleArray1 = new double[8];
      RealVector realVector0 = arrayRealVector0.append(doubleArray1);
      assertEquals(11, realVector0.getDimension());
      assertEquals(1710.7845614177606, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.projection((RealVector) arrayRealVector0);
      assertTrue(realVector0.equals((Object)arrayRealVector0));
      assertEquals(1710.7845614177606, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        arrayRealVector0.setEntry((-1183), (-1.0));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // index -1,183 out of allowed range [0, 7]
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.append(1027.650643893);
      assertEquals(3990.816425073, realVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3229, (-98.01086));
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3229, 204);
      RealVector realVector0 = arrayRealVector0.append((RealVector) openMapRealVector0);
      assertEquals(6458, realVector0.getDimension());
      assertEquals(5569.397588704302, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3229, (-98.01086));
      ArrayRealVector arrayRealVector1 = arrayRealVector0.add(arrayRealVector0);
      assertEquals(11138.795177408603, arrayRealVector1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = doubleArray0[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.subtract((RealVector) arrayRealVector0);
      assertEquals(0.0, realVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      arrayRealVector0.set(1.0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = null;
      try {
        arrayRealVector0 = new ArrayRealVector((double[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, 0, 0);
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = null;
      try {
        arrayRealVector0 = new ArrayRealVector(doubleArray0, 32, 32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // position 32 and size 32 dont fit to the size of the input array {2}
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, 0, 0);
      assertEquals(0.0, arrayRealVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      ArrayRealVector arrayRealVector0 = null;
      try {
        arrayRealVector0 = new ArrayRealVector(doubleArray0, 33, 33);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // position 33 and size 33 dont fit to the size of the input array {2}
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      ArrayRealVector arrayRealVector0 = null;
      try {
        arrayRealVector0 = new ArrayRealVector(doubleArray0, 0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector((RealVector) arrayRealVector0);
      assertFalse(arrayRealVector1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3229, (-98.01086));
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, false);
      assertEquals(316477.0669399987, arrayRealVector1.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-487.4894732841041));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector((RealVector) arrayRealVector0, arrayRealVector0);
      assertEquals(2924.9368397046246, arrayRealVector1.getL1Norm(), 0.01);
      assertEquals(6, arrayRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      try { 
        arrayRealVector0.add((RealVector) arrayRealVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector must have at least one element
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1268.153);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.add((RealVector) openMapRealVector0);
      assertEquals(2536.306, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1268.153);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.subtract((RealVector) openMapRealVector0);
      assertEquals(0.0, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = arrayRealVector0.mapAddToSelf(0.0);
      assertFalse(realVector0.isNaN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapSubtract(1.0);
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01);
      assertEquals(4.0, realVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-1044.115902));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.unitVector();
      assertEquals(1808.4617912546066, arrayRealVector0.getNorm(), 0.01);
      assertEquals(1.0, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapPowToSelf(0.5);
      assertEquals(0.0, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = arrayRealVector0.mapExp();
      assertFalse(realVector0.equals((Object)arrayRealVector0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-1044.115902));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapExpm1();
      assertEquals(3.0, realVector0.getL1Norm(), 0.01);
      assertEquals(3132.347706, arrayRealVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3229, (-98.01086));
      RealVector realVector0 = arrayRealVector0.mapLog();
      assertEquals(316477.0669399987, arrayRealVector0.getL1Norm(), 0.01);
      assertTrue(realVector0.isNaN());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = arrayRealVector0.mapLog10();
      assertFalse(realVector0.equals((Object)arrayRealVector0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapCosh();
      assertEquals(16.0, realVector0.getL1Norm(), 0.01);
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = arrayRealVector0.mapTanhToSelf();
      assertSame(arrayRealVector0, realVector0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      arrayRealVector0.mapCosToSelf();
      assertEquals(0.5266654176152175, arrayRealVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapSin();
      assertEquals(16, realVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapTan();
      assertEquals(16, realVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray0[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      arrayRealVector0.mapAcosToSelf();
      assertEquals(1.5707963267948966, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = arrayRealVector0.mapAsinToSelf();
      assertSame(realVector0, arrayRealVector0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapAtan();
      assertFalse(realVector0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      arrayRealVector0.mapInvToSelf();
      assertEquals(0.0017535814080025607, arrayRealVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-1044.115902));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapAbsToSelf();
      assertEquals(3132.347706, realVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      arrayRealVector0.mapSqrtToSelf();
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      arrayRealVector0.mapCbrtToSelf();
      assertEquals(9.95890443701714, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = arrayRealVector0.mapCeilToSelf();
      assertEquals(0.0, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-1044.115902));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapFloor();
      assertEquals(1809.9930939094768, realVector0.getNorm(), 0.01);
      assertEquals(1044.115902, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-1044.115902));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapRint();
      assertEquals(3132.347706, arrayRealVector0.getL1Norm(), 0.01);
      assertEquals(3132.0, realVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapSignum();
      assertEquals(16, realVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      arrayRealVector0.mapUlpToSelf();
      assertEquals(1.1368683772161603E-13, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(12, 12);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(12);
      RealVector realVector0 = arrayRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      assertFalse(realVector0.isNaN());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.ebeDivide((RealVector) openMapRealVector0);
      assertTrue(realVector0.isNaN());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-1044.115902));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = arrayRealVector0.ebeDivide((RealVector) arrayRealVector0);
      assertEquals(1.7320508075688772, realVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = (-708.996767333);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = arrayRealVector0.dotProduct((RealVector) openMapRealVector0);
      assertEquals(502676.4160886441, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(39, 39);
      double double0 = arrayRealVector0.getL1Norm();
      assertEquals(1521.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = doubleArray0[3];
      doubleArray0[6] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      double double1 = arrayRealVector0.getLInfNorm();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = arrayRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(16, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double((-987.72192706));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      double double1 = arrayRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1710.7845614177606, arrayRealVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-863), 1842);
      try { 
        arrayRealVector0.getL1Distance((RealVector) openMapRealVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector length mismatch: got 16 but expected -863
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = arrayRealVector0.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(16, openMapRealVector0.getDimension());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      double double0 = arrayRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3281);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3281, 3281);
      double double0 = arrayRealVector0.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      double double0 = arrayRealVector0.getLInfDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      try { 
        arrayRealVector0.unitVector();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2966.904961704522);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      arrayRealVector0.unitize();
      assertEquals(0.9999999999999999, arrayRealVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      try { 
        arrayRealVector0.unitize();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // cannot normalize a zero norm vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) openMapRealVector0);
      assertEquals(6, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      assertEquals(6, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(9, 9);
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(0.5);
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      arrayRealVector0.setSubVector(0, (RealVector) openMapRealVector0);
      assertEquals(72.5, arrayRealVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      boolean boolean0 = arrayRealVector0.isInfinite();
      assertFalse(arrayRealVector0.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2966.904961704522);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      arrayRealVector0.mapLog1pToSelf();
      boolean boolean0 = arrayRealVector0.isInfinite();
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2967.92);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealVector realVector0 = arrayRealVector0.mapSinh();
      boolean boolean0 = realVector0.isInfinite();
      assertEquals(14, realVector0.getDimension());
      assertEquals(4197.2727160383565, arrayRealVector0.getNorm(), 0.01);
      assertTrue(boolean0);
      assertFalse(arrayRealVector0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-863), 1842);
      boolean boolean0 = arrayRealVector0.equals(openMapRealVector0);
      assertFalse(boolean0);
      assertEquals(16, arrayRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      boolean boolean0 = arrayRealVector0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(16, arrayRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      boolean boolean0 = arrayRealVector0.equals("Z&");
      assertEquals(8, arrayRealVector0.getDimension());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2967.92);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      ArrayRealVector arrayRealVector1 = (ArrayRealVector)arrayRealVector0.mapSinh();
      arrayRealVector0.mapLog1pToSelf();
      boolean boolean0 = arrayRealVector1.equals(arrayRealVector0);
      assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0);
      boolean boolean0 = arrayRealVector0.equals(arrayRealVector1);
      assertTrue(boolean0);
      assertEquals(14, arrayRealVector1.getDimension());
      assertFalse(arrayRealVector1.isNaN());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2966.904961704522);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0);
      ArrayRealVector arrayRealVector2 = (ArrayRealVector)arrayRealVector0.mapLog1pToSelf();
      boolean boolean0 = arrayRealVector2.equals(arrayRealVector1);
      assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      arrayRealVector0.hashCode();
      assertFalse(arrayRealVector0.isNaN());
      assertEquals(0, arrayRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2966.904961704522);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      ArrayRealVector arrayRealVector1 = (ArrayRealVector)arrayRealVector0.mapLog1pToSelf();
      arrayRealVector1.hashCode();
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
      assertTrue(arrayRealVector0.isNaN());
  }
}