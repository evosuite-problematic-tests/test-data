/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:38:37 GMT 2019
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
      Complex complex0 = Complex.INF;
      Complex complex1 = (Complex)complex0.INF.readResolve();
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.INF;
      String string0 = complex0.ONE.toString();
      assertEquals("(1.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      complex1.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.INF;
      ComplexField complexField0 = complex0.I.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      List<Complex> list0 = complex0.ONE.nthRoot(73);
      assertEquals(73, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.createComplex(726.08, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.I.negate();
      Complex complex3 = complex2.multiply(complex1);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
      assertFalse(complex2.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.sinh();
      double double0 = complex1.abs();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex0.add(complex1);
      Complex complex3 = complex2.divide(complex0);
      assertSame(complex3, complex2);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.exp();
      Complex complex2 = complex0.I.divide(complex1);
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.tan();
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.divide(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.multiply(complex0);
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.tan();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.equals("org.apache.commons.math.complex.Complex");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tan();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(complex0);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.ONE.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex0.pow(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex((-1741.1131664781076), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals((-1741.1131664781076), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex((-43.3378196155), (-43.3378196155));
      Complex complex2 = complex1.pow(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-43.3378196155), complex1.getImaginary(), 0.01);
      assertEquals((-43.3378196155), complex1.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.multiply(4262.023965);
      assertSame(complex3, complex2);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.multiply(0.7853981633974483);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.multiply(0.0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex((-2375.43538), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(0.7853981633974483);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2375.43538), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex((-43.3378196155), (-43.3378196155));
      Complex complex2 = complex1.multiply(Double.POSITIVE_INFINITY);
      assertEquals((-43.3378196155), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-43.3378196155), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.negate();
      Complex complex2 = complex1.acos();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.cos();
      Complex complex2 = complex1.sqrt1z();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.negate();
      Complex complex2 = complex1.asin();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.NaN.cosh();
      assertFalse(complex0.isNaN());
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.acos();
      Complex complex3 = complex2.sqrt();
      assertEquals(0.7071067811865475, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.exp();
      Complex complex2 = complex1.tanh();
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.nthRoot((-311));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -311
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = new Complex(0.041666666666621166, 0.041666666666621166);
      Complex complex1 = complex0.INF.sin();
      List<Complex> list0 = complex1.nthRoot(1);
      assertFalse(list0.contains(complex0));
      assertEquals(0.041666666666621166, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(list0.contains(complex1));
      assertEquals(0.041666666666621166, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.INF.nthRoot(2984);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }
}