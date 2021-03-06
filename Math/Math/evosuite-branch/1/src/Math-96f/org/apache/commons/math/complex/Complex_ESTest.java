/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 16:45:33 GMT 2018
 */

package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertTrue(complex0.isNaN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.sinh();
      Complex complex2 = complex1.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = new Complex((-1.0), (-1.0));
      Complex complex1 = complex0.NaN.divide(complex0);
      assertTrue(complex1.isNaN());
      assertEquals(1.4142135623730951, complex0.abs(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex0.divide(complex1);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertTrue(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.divide(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = new Complex(3522.5973221072163, (-1832.499083));
      boolean boolean0 = complex0.equals((Object) null);
      assertEquals((-1832.499083), complex0.getImaginary(), 0.01);
      assertEquals(3522.5973221072163, complex0.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.cosh();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = new Complex((-1762.7383503052831), (-1762.7383503052831));
      Complex complex1 = new Complex(0.0, 0.0);
      Complex complex2 = complex0.subtract(complex1);
      boolean boolean0 = complex0.equals(complex2);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = new Complex((-1762.7383503052831), (-1762.7383503052831));
      complex0.ONE.hashCode();
      assertEquals((-1762.7383503052831), complex0.getImaginary(), 0.01);
      assertEquals((-1762.7383503052831), complex0.getReal(), 0.01);
      assertEquals(2492.8884819169075, complex0.abs(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.NaN.hashCode();
      assertEquals(1.0, complex0.abs(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(complex0.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-2679.7283077));
      Complex complex1 = new Complex((-1.0), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.ONE.add(complex1);
      Complex complex3 = complex2.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(2679.7283077, complex0.abs(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NaN, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex((-1.0), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.asin();
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.sqrt();
      Complex complex2 = new Complex(525.11, Double.POSITIVE_INFINITY);
      Complex complex3 = complex1.multiply(complex2);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertTrue(complex3.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tan();
      Complex complex2 = complex1.negate();
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, 1.0);
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex2.subtract(complex2);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tan();
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex2.exp();
      assertFalse(complex0.isNaN());
      assertSame(complex3, complex1);
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.NaN.acos();
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-2679.7283077));
      Complex complex1 = complex0.INF.conjugate();
      Complex complex2 = complex1.sinh();
      Complex complex3 = complex2.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertNotSame(complex3, complex2);
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = new Complex(3522.5973221072163, (-1832.499083));
      Complex complex1 = complex0.cos();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1832.499083), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = new Complex((-1762.7383503052831), (-1762.7383503052831));
      Complex complex1 = complex0.NaN.cos();
      Complex complex2 = complex1.tanh();
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals((-1762.7383503052831), complex0.getReal(), 0.01);
      assertEquals((-1762.7383503052831), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-2679.7283077));
      Complex complex1 = complex0.NaN.cosh();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-2679.7283077), complex0.getImaginary(), 0.01);
      assertEquals(2679.7283077, complex0.abs(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.pow((Complex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex1.abs(), 0.01);
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sin();
      assertTrue(complex1.isNaN());
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sinh();
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-2679.7283077));
      Complex complex1 = complex0.tanh();
      assertEquals((-2679.7283077), complex0.getImaginary(), 0.01);
      assertEquals(0.05026808850338487, complex1.abs(), 0.01);
      assertEquals(0.05026808850338487, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }
}
