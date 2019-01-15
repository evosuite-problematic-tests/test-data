/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 15:14:21 GMT 2019
 */

package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.complex.ComplexField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.INF.readResolve();
      Complex complex2 = complex1.multiply(37);
      assertTrue(complex2.equals((Object)complex1));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.toString();
      assertEquals("(1.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.ONE.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      boolean boolean0 = complex0.isNaN();
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = new Complex((-705.19705448), (-705.19705448));
      Complex complex1 = complex0.INF.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-705.19705448), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = new Complex((-705.19705448), (-705.19705448));
      Complex complex1 = complex0.asin();
      assertEquals((-7.598198044497376), complex1.getImaginary(), 0.01);
      assertEquals((-0.7853979120415772), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.pow(complex0);
      Complex complex2 = complex1.negate();
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.log();
      Complex complex3 = complex2.add(complex0);
      assertSame(complex3, complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertNotSame(complex3, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.I.add(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.add((-6.508966857277253E-9));
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = new Complex((-705.19705448), (-705.19705448));
      Complex complex1 = complex0.I.add((-2911.2603));
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2911.2603), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isNaN());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.atan();
      Complex complex3 = complex2.conjugate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertSame(complex3, complex2);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.atan();
      Complex complex2 = complex1.divide(complex0);
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.atan();
      Complex complex2 = complex1.INF.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = new Complex((-1063.7793291120602));
      Complex complex1 = complex0.pow((-1063.7793291120602));
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.I.atan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.divide(complex1);
      assertNotSame(complex2, complex0);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(357.1);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(1440.34576499);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(6.942777382394309E-4, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.sin();
      Complex complex2 = complex1.reciprocal();
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.createComplex(1671.93, 1671.93);
      Complex complex2 = complex1.reciprocal();
      assertEquals(1671.93, complex1.getImaginary(), 0.01);
      assertEquals(2.9905558247055795E-4, complex2.getReal(), 0.01);
      assertEquals(1671.93, complex1.getReal(), 0.01);
      assertEquals((-2.9905558247055795E-4), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.reciprocal();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sin();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.ZERO.createComplex(0.0, (-4.711988033385175E-8));
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-4.711988033385175E-8), complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.subtract(2454.0);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertEquals((-2454.0), complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(boolean0);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.ZERO.hashCode();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      complex0.NaN.hashCode();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex0.pow(complex1);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ZERO.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, (-1416.9156));
      Complex complex1 = new Complex(3444.842042137, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals((-1416.9156), complex0.getImaginary(), 0.01);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ZERO.multiply(1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(1409);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.createComplex(-0.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.NaN.multiply(0.0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.ZERO.pow(Double.NaN);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(2454.0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = new Complex(3444.842042137, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(3444.842042137);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(3444.842042137, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.pow(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
      assertNotSame(complex1, complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.subtract(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex1.subtract(1440.34576499);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.acos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-591.0433575859242));
      Complex complex1 = complex0.NaN.asin();
      assertEquals((-591.0433575859242), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.INF.cos();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.log();
      Complex complex3 = complex2.cos();
      assertNotSame(complex3, complex1);
      assertFalse(complex1.isInfinite());
      assertSame(complex3, complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex1.cosh();
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-586.231345501));
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.sin();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-586.231345501), complex0.getReal(), 0.01);
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.I.sinh();
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.reciprocal();
      Complex complex2 = complex1.sqrt();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.atan();
      Complex complex2 = complex1.tan();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Complex complex0 = new Complex((-705.19705448), (-705.19705448));
      Complex complex1 = complex0.tan();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-705.19705448), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.createComplex(1671.93, 1671.93);
      Complex complex2 = complex1.tan();
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(1671.93, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ZERO.sqrt();
      Complex complex2 = complex1.tan();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.atan();
      Complex complex2 = complex1.tanh();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Complex complex0 = new Complex((-705.19705448), (-705.19705448));
      Complex complex1 = complex0.ONE.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.7615941559557649, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tanh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.createComplex(1671.93, 1671.93);
      Complex complex2 = complex1.tanh();
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(1671.93, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3079.87826));
      Complex complex1 = complex0.tanh();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals((-3079.87826), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      List<Complex> list0 = complex0.nthRoot(476);
      assertEquals(476, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.cosh();
      List<Complex> list0 = complex1.nthRoot(476);
      assertFalse(complex1.isInfinite());
      assertTrue(list0.contains(complex1));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(3714);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-751.3194), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }
}