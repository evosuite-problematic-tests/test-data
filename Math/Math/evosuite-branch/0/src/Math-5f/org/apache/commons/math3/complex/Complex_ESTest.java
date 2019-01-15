/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:44:05 GMT 2018
 */

package org.apache.commons.math3.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(1324.004663428443);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      complex0.getField();
      assertFalse(complex0.isInfinite());
      assertEquals((-1409.65), complex0.getReal(), 0.01);
      assertEquals((-1409.65), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      String string0 = complex0.toString();
      assertEquals("(-1409.65, -1409.65)", string0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.pow(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(2712.6);
      Complex complex2 = complex1.cosh();
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(2712.6, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(0.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      List<Complex> list0 = complex0.ONE.nthRoot(1);
      assertEquals(1, list0.size());
      assertFalse(list0.contains(complex0));
      assertEquals((-1409.65), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1409.65), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      Complex complex1 = complex0.acos();
      assertEquals(2.3561944273709536, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = new Complex((-3618.6304867));
      Complex complex1 = complex0.INF.asin();
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-3618.6304867), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.sqrt();
      Complex complex2 = complex0.ZERO.add(complex1);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1950.9907721028, 1950.9907721028);
      Complex complex1 = complex0.NaN.add(0.0);
      assertEquals(1950.9907721028, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(1950.9907721028, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      Complex complex1 = complex0.add(0.6598852872848511);
      assertFalse(complex1.isInfinite());
      assertEquals((-1409.65), complex1.getImaginary(), 0.01);
      assertEquals((-1408.9901147127152), complex1.getReal(), 0.01);
      assertEquals((-1409.65), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      Complex complex1 = complex0.NaN.conjugate();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals((-1409.65), complex0.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals((-1409.65), complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.subtract(complex0);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.atan();
      complex2.nthRoot(1042);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.I.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(1939.85971036);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(5.15501195606779E-4, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.divide(0.0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.reciprocal();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.reciprocal();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.reciprocal();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = new Complex(566.081509107735, (-2082.146960540864));
      Complex complex1 = complex0.ONE.reciprocal();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = new Complex((-3823.83));
      Complex complex1 = new Complex((-3823.83), (-3823.83));
      boolean boolean0 = complex0.equals(complex1);
      assertEquals((-3823.83), complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertEquals((-3823.83), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.I.hashCode();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      Complex complex1 = complex0.INF.cos();
      Complex complex2 = complex1.ZERO.multiply(complex1);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-1409.65), complex0.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertEquals((-1409.65), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2501.9829384), 8.310629417537063E264);
      Complex complex1 = new Complex(4.232889602759328E-304, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals((-2501.9829384), complex0.getReal(), 0.01);
      assertEquals(8.310629417537063E264, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.multiply((-2355));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.NaN.multiply(2309);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 8.310629417537063E264);
      Complex complex1 = complex0.multiply(1061);
      assertTrue(complex0.isInfinite());
      assertEquals(8.310629417537063E264, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = new Complex(49.65680968, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply((-191));
      assertEquals(49.65680968, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.pow(Double.NaN);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.sqrt();
      Complex complex3 = complex2.multiply((-2323.026070844));
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = new Complex(566.081509107735, (-2082.146960540864));
      Complex complex1 = complex0.ZERO.multiply(Double.POSITIVE_INFINITY);
      assertEquals((-2082.146960540864), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(566.081509107735, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.subtract(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.subtract(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals((-1409.65), complex0.getReal(), 0.01);
      assertEquals((-1409.65), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-799.608676));
      Complex complex1 = complex0.subtract(0.0);
      assertEquals((-799.608676), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-799.608676), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-799.608676));
      Complex complex1 = complex0.NaN.reciprocal();
      Complex complex2 = complex1.multiply((-799.608676));
      Complex complex3 = complex2.asin();
      assertSame(complex2, complex1);
      assertEquals((-799.608676), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex3.equals((Object)complex0));
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.sin();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.divide(Double.NaN);
      Complex complex2 = complex1.sqrt();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1950.9907721028, 1950.9907721028);
      Complex complex1 = complex0.I.sinh();
      Complex complex2 = complex1.sqrt();
      assertEquals(1950.9907721028, complex0.getReal(), 0.01);
      assertEquals(0.6486412663436919, complex2.getImaginary(), 0.01);
      assertEquals(1950.9907721028, complex0.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.6486412663436919, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      assertEquals(0.7615941559557649, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = new Complex((-1409.65), (-1409.65));
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.tan();
      assertFalse(complex0.isInfinite());
      assertEquals((-1409.65), complex0.getImaginary(), 0.01);
      assertEquals((-1409.65), complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1950.9907721028, 1950.9907721028);
      Complex complex1 = complex0.tan();
      assertEquals(1950.9907721028, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(1950.9907721028, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-799.608676));
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-799.608676), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.divide(Double.NaN);
      Complex complex2 = complex1.tanh();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.tanh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2427.144201), 1032.09);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.tanh();
      assertEquals(1032.09, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2427.144201), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(3457.69, 795.8);
      Complex complex2 = complex1.tanh();
      assertFalse(complex2.isInfinite());
      assertEquals(3457.69, complex1.getReal(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Complex complex0 = new Complex((-3823.83));
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals((-3823.83), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math3.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-799.608676));
      Complex complex1 = complex0.NaN.reciprocal();
      List<Complex> list0 = complex1.nthRoot(1214);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(list0.contains(complex1));
      assertEquals(1, list0.size());
      assertEquals((-799.608676), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 0.0);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }
}
