/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:39:41 GMT 2018
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vector3D_ESTest extends Vector3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D.angle(vector3D0, vector3D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(-0.0, vector3D1.getX(), 0.01);
      assertEquals(0.0, vector3D1.getY(), 0.01);
      assertEquals(1.0, vector3D1.getZ(), 0.01);
      assertEquals(1.0, vector3D0.getX(), 0.01);
      assertEquals(0.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      double double0 = Vector3D.distanceInf(vector3D0, vector3D0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D(3940.3393068247906, vector3D0, 1980.7490547375944, vector3D0, (-1420.28041436), vector3D0);
      assertEquals(2.0257272177600153E7, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      double double0 = Vector3D.distance1(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      double double0 = vector3D0.MINUS_I.getAlpha();
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      double double0 = Vector3D.distance(vector3D0, vector3D0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      String string0 = vector3D0.toString();
      assertEquals("{(Infinity); (Infinity); (Infinity)}", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = vector3D0.add(vector3D0);
      assertTrue(vector3D1.equals((Object)vector3D0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      double double0 = vector3D0.MINUS_I.getDelta();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      double double0 = vector3D0.NaN.getNorm1();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D((-1790.98718598), vector3D0);
      assertEquals((-1790.98718598), vector3D1.getY(), 0.01);
      assertEquals(3207635.100344559, vector3D1.getNormSq(), 0.01);
      assertEquals(-0.0, vector3D1.getZ(), 0.01);
      assertEquals(-0.0, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      double double0 = Vector3D.distanceSq(vector3D0, vector3D0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      double double0 = vector3D0.PLUS_J.getNormInf();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = new Vector3D(0.1818181574344635, vector3D0, 0.1818181574344635, vector3D0);
      assertEquals(0.0, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = new Vector3D(0.6, vector3D0, 0.6, vector3D0, 0.6, vector3D0, 0.6, vector3D0);
      assertEquals(Double.POSITIVE_INFINITY, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = vector3D0.MINUS_J.normalize();
      assertEquals(0.0, vector3D1.getX(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals((-1.0), vector3D1.getY(), 0.01);
      assertEquals(1.0, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      // Undeclared exception!
      try { 
        vector3D0.normalize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot normalize a zero norm vector
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        vector3D1.orthogonal();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = vector3D0.MINUS_I.add(1.0, vector3D0);
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.7071067811865475, vector3D2.getX(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(0.7071067811865475, vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        Vector3D.angle(vector3D1, vector3D1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = vector3D0.MINUS_K.negate();
      Vector3D vector3D2 = Vector3D.MINUS_K;
      double double0 = Vector3D.angle(vector3D2, vector3D1);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(-0.0, vector3D1.getY(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, vector3D0.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Vector3D vector3D2 = vector3D0.PLUS_I.add((-408.28913), vector3D1);
      Vector3D vector3D3 = vector3D2.ZERO.subtract(vector3D0);
      double double0 = Vector3D.angle(vector3D3, vector3D2);
      assertEquals((-1.0), vector3D3.getY(), 0.01);
      assertEquals(166701.0136761569, vector3D2.getNormSq(), 0.01);
      assertEquals(1.0, vector3D2.getX(), 0.01);
      assertEquals(0.0, vector3D2.getY(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
      assertEquals(408.28913, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      vector3D0.hashCode();
      assertTrue(vector3D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      vector3D0.hashCode();
      assertTrue(vector3D0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(209980.32334321, 6.0, Double.NaN);
      boolean boolean0 = vector3D0.isNaN();
      assertEquals(209980.32334321, vector3D0.getX(), 0.01);
      assertEquals(6.0, vector3D0.getY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = vector3D0.orthogonal();
      boolean boolean0 = vector3D1.isInfinite();
      assertEquals(Double.NaN, vector3D1.getY(), 0.01);
      assertTrue(vector3D1.isNaN());
      assertEquals(Double.NaN, vector3D1.getZ(), 0.01);
      assertFalse(boolean0);
      assertTrue(vector3D0.isInfinite());
      assertEquals(0.0, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      boolean boolean0 = vector3D0.isInfinite();
      assertFalse(boolean0);
      assertFalse(vector3D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      boolean boolean0 = vector3D0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(3.487944013904723E12, Double.NEGATIVE_INFINITY, (-43.446));
      boolean boolean0 = vector3D0.isInfinite();
      assertEquals(Double.NEGATIVE_INFINITY, vector3D0.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals((-43.446), vector3D0.getZ(), 0.01);
      assertEquals(3.487944013904723E12, vector3D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(3812.854608219093, 0.9999, Double.NEGATIVE_INFINITY);
      boolean boolean0 = vector3D0.isInfinite();
      assertEquals(3812.854608219093, vector3D0.getX(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, vector3D0.getZ(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.9999, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = vector3D0.orthogonal();
      boolean boolean0 = vector3D1.equals(vector3D0);
      assertFalse(boolean0);
      assertEquals(1.0, vector3D1.getY(), 0.01);
      assertEquals(0.0, vector3D1.getX(), 0.01);
      assertEquals(-0.0, vector3D1.getZ(), 0.01);
      assertEquals(1.0, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = Vector3D.ZERO;
      Vector3D vector3D2 = vector3D0.ZERO.subtract(0.6, vector3D1);
      boolean boolean0 = vector3D2.equals(vector3D1);
      assertTrue(boolean0);
      assertFalse(vector3D2.equals((Object)vector3D0));
      assertEquals(0.0, vector3D2.getZ(), 0.01);
      assertEquals(0.0, vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      boolean boolean0 = vector3D0.equals("{1; 0; 0}");
      assertEquals(1.0, vector3D0.getNormSq(), 0.01);
      assertEquals(0.0, vector3D0.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertEquals(1.0, vector3D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = Vector3D.NaN;
      boolean boolean0 = vector3D0.equals(vector3D1);
      assertTrue(vector3D1.isNaN());
      assertFalse(vector3D1.equals((Object)vector3D0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      boolean boolean0 = vector3D0.equals(vector3D1);
      assertEquals(1.0, vector3D0.getNormSq(), 0.01);
      assertEquals(0.0, vector3D1.getY(), 0.01);
      assertEquals(0.0, vector3D1.getX(), 0.01);
      assertFalse(vector3D1.equals((Object)vector3D0));
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      boolean boolean0 = vector3D0.equals(vector3D1);
      assertFalse(boolean0);
      assertFalse(vector3D1.equals((Object)vector3D0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      assertSame(vector3D1, vector3D0);
  }
}
