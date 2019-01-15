/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 16:07:55 GMT 2019
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
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      complex0.equals(complex1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.INF;
      String string0 = complex0.ZERO.toString();
      assertEquals("(0.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.I;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.createComplex((-2919.7616), Double.NaN);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals((-2919.7616), complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.add(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.acos();
      Complex complex2 = complex1.conjugate();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = complex1.divide(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, (-351.572793345));
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.ZERO.divide(complex1);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertEquals((-351.572793345), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.equals("CbBc8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.conjugate();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, (-442.69100254693));
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(complex0.isInfinite());
      assertEquals((-442.69100254693), complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = new Complex(16.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.NaN.sin();
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(16.0, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = new Complex(16.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(16.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-3449.0));
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      List<Complex> list0 = complex2.nthRoot(2302);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-3449.0), complex0.getImaginary(), 0.01);
      assertTrue(list0.contains(complex1));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, (-351.572793345));
      Complex complex1 = new Complex((-351.572793345), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-351.572793345), complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.multiply(1162.282466);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, (-442.69100254693));
      Complex complex1 = complex0.ONE.multiply(Double.NaN);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertEquals((-442.69100254693), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = new Complex(16.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(16.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(902.25819591623);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = new Complex((-720.9904808136472), (-720.9904808136472));
      Complex complex1 = complex0.NaN.asin();
      assertEquals((-720.9904808136472), complex0.getReal(), 0.01);
      assertEquals((-720.9904808136472), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.cos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, (-351.572793345));
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.ZERO.pow(complex1);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals((-351.572793345), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, (-351.572793345));
      Complex complex1 = complex0.ONE.sin();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, (-442.69100254693));
      Complex complex1 = complex0.ZERO.sinh();
      assertEquals((-442.69100254693), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      Complex complex2 = complex1.sinh();
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = new Complex(0.8414709848078965, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.acos();
      Complex complex2 = complex1.tan();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.sqrt1z();
      Complex complex2 = complex1.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      List<Complex> list0 = complex0.nthRoot(33);
      assertEquals(33, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(list0.contains(complex0));
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.INF.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.NaN.nthRoot(1);
      assertFalse(list0.contains(complex0));
  }
}
