/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:17:54 GMT 2018
 */

package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.euclidean.threed.Rotation;
import org.apache.commons.math.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rotation_ESTest extends Rotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rotation rotation0 = Rotation.IDENTITY;
      Rotation.distance(rotation0, rotation0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation(1590.3935284, 61.7, 61.7, 0.0, false);
      double double0 = rotation0.getQ3();
      assertEquals(61.7, rotation0.getQ1(), 0.01);
      assertEquals(1590.3935284, rotation0.getQ0(), 0.01);
      assertEquals(61.7, rotation0.getQ2(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-342.75193983), 0.0, 1750.6666);
      Rotation rotation0 = new Rotation(vector3D0, (-342.75193983));
      double double0 = rotation0.getQ1();
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals((-0.1584990438213409), rotation0.getQ0(), 0.01);
      assertEquals((-0.18970713273953005), double0, 0.01);
      assertEquals(0.9689629801470575, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation(1590.3935284, 61.7, 61.7, 0.0, false);
      double double0 = rotation0.getQ2();
      assertEquals(1590.3935284, rotation0.getQ0(), 0.01);
      assertEquals(61.7, double0, 0.01);
      assertEquals(61.7, rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation(1590.3935284, 61.7, 61.7, 0.0, false);
      double double0 = rotation0.getQ0();
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals(61.7, rotation0.getQ1(), 0.01);
      assertEquals(61.7, rotation0.getQ2(), 0.01);
      assertEquals(1590.3935284, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation(1590.3935284, 61.7, 61.7, 0.0, false);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, 0.0, 0.0, 0.5, false);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 1.0471975511965979);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(0.0, rotation1.getQ0(), 0.01);
      assertEquals(0.5, rotation1.getQ1(), 0.01);
      assertEquals(0.5, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, 0.0);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 1.176342548272881E-8, 0.0, true);
      try { 
        rotation0.getAngles((RotationOrder) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, 1603.0588934478);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // a 4x5 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, 5249.0290185);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // a 3x7 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, 0.9950041652780262);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[3][0];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, 850.85471660796);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.5, 0.0, 0.0, false);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 3.141592653589793);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // the closest orthogonal matrix has a negative determinant -0.688
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rotation rotation0 = Rotation.IDENTITY;
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 1.0471975511965979);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, (-0.29334736504934344), (-0.29334736504934344), 0.5, false);
      double[][] doubleArray0 = rotation0.getMatrix();
      assertEquals(3, doubleArray0.length);
      
      Rotation rotation1 = new Rotation(doubleArray0, 0.016622975523133632);
      assertEquals((-0.39901432985161867), rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, (-0.2933474), 0.5, 0.5, false);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.05869498087390007);
      assertEquals(0.5157433545410528, rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = Vector3D.ZERO;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D1, vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.ZERO;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D0, vector3D1, vector3D1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.073741824E9, 1.073741824E9);
      Vector3D vector3D1 = Vector3D.ZERO;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, 0.0, 0.0, 0.5, false);
      Vector3D vector3D0 = rotation0.getAxis();
      Rotation rotation1 = Rotation.IDENTITY;
      Vector3D vector3D1 = rotation1.getAxis();
      Rotation rotation2 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
      assertEquals(0.7071067811865475, rotation2.getQ3(), 0.01);
      assertEquals(1.0, vector3D0.getNormSq(), 0.01);
      assertEquals(1.0, vector3D1.getX(), 0.01);
      assertEquals(-0.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.9868161777724352E-8, 789.1848347);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Vector3D vector3D2 = new Vector3D(0.13333332538604736, vector3D1, 0.25, vector3D0, 777.397181673, vector3D0, 287.8316287, vector3D1);
      Rotation rotation0 = new Rotation(vector3D2, vector3D1, vector3D2, vector3D0);
      assertEquals((-0.34725866863309596), rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Rotation rotation0 = new Rotation(vector3D0, 3794.67);
      Vector3D vector3D1 = rotation0.getAxis();
      Rotation rotation1 = new Rotation(vector3D1, vector3D0);
      assertEquals((-1.0), rotation1.getQ3(), 0.01);
      assertEquals(1.0, vector3D1.getNormSq(), 0.01);
      assertEquals(-0.0, vector3D1.getY(), 0.01);
      assertEquals(-0.0, rotation1.getQ2(), 0.01);
      assertEquals(-0.0, rotation1.getQ1(), 0.01);
      assertEquals((-0.18587545401600505), rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Rotation rotation0 = new Rotation(vector3D0, 1589.2);
      Vector3D vector3D1 = rotation0.getAxis();
      assertEquals(-0.0, vector3D1.getX(), 0.01);
      assertEquals((-0.9999999999999999), vector3D1.getY(), 0.01);
      assertEquals(-0.0, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, 0.0, 0.0, 0.5, false);
      Rotation rotation1 = rotation0.IDENTITY.applyInverseTo(rotation0);
      double double0 = Rotation.distance(rotation0, rotation1);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-0.5), rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, 0.0, 0.0, 0.5, false);
      Rotation rotation1 = Rotation.IDENTITY;
      Rotation rotation2 = rotation0.applyInverseTo(rotation1);
      double double0 = Rotation.distance(rotation0, rotation2);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(0.0, rotation2.getQ2(), 0.01);
      assertEquals(0.0, rotation2.getQ1(), 0.01);
      assertEquals((-0.5), rotation2.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, (-467.4712244), (-185.674313975203));
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Rotation rotation1 = new Rotation(vector3D0, vector3D0);
      double double0 = Rotation.distance(rotation0, rotation1);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(3.0433225270827218, double0, 0.01);
      assertEquals((-0.30401086420583484), rotation0.getQ1(), 0.01);
      assertEquals(0.04911529488253638, rotation0.getQ0(), 0.01);
      assertEquals(0.15173875486678517, rotation0.getQ2(), 0.01);
      assertEquals((-0.9392233134483516), rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-342.75193983), 0.0, 1750.6666);
      Rotation rotation0 = new Rotation(vector3D0, (-342.75193983));
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.064710543972296), (-0.3764682777162589), 2.8049818442792085}, doubleArray0, 0.01);
      assertEquals(0.9689629801470575, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Rotation rotation0 = new Rotation(6.283185307179586, (-0.5), 37.11212273481, (-0.03072967061969592), false);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.10526403784751892, (-1579.734676052), (-2832.138102458), 0.10526403784751892, false);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(1731.15162095, 1731.15162095, 1731.15162095, (-2092.697), false);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(458.9441, 458.9441, (-0.19), 559.196399, false);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.24999999999999994, 0.24999999999999994, 0.24999999999999994, 2496.7, false);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2455.21343207353), 2295.3903160634045, 0.001, (-2255.11612492972), false);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, 0.0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.19), (-0.19), 0.015846117015302114);
      Vector3D vector3D1 = new Vector3D((-0.19), vector3D0);
      Vector3D vector3D2 = new Vector3D(0.015846117015302114, vector3D0, 777.1766480777, vector3D0, 777.1766480777, vector3D1, (-0.19), vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, vector3D2);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Rotation rotation0 = new Rotation(2669143.2387616173, 2669143.2387616173, 0.3333333333333333, (-905.179306), false);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(2121.918912, (-0.19), 2121.918912);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[] doubleArray0 = rotation0.IDENTITY.getAngles(rotationOrder0);
      assertEquals(0.9999999999999999, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(0.5, 0.5, (-2399.92793911), 2.0, false);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-2.356194490192345), 1.5707963267948966, (-2.356194490192345));
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Rotation rotation0 = new Rotation((-131.8085), (-905.97614705), (-1.0), 1662705.3349657068, false);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1995.4843893186144), (-1995.4843893186144), (-1995.4843893186144), (-1809.020725250166), false);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, 0.0, 0.0, 0.5, false);
      double[] doubleArray0 = rotation0.getAngles((RotationOrder) null);
      assertArrayEquals(new double[] {0.0, 1.5707963267948966, 3.141592653589793}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.834E-20, 6.949522708971869E-31, 3.834E-20, 6.949522708971869E-31, false);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(2957.861389202274, vector3D0, (-295.4319205), vector3D0, 2622.959981, vector3D0, (-295.4319205), vector3D0);
      Vector3D vector3D2 = new Vector3D(0.6000000000000001, vector3D0, 0.00279133390661455, vector3D0, (-0.1), vector3D1);
      Rotation rotation0 = new Rotation(vector3D2, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Rotation rotation0 = new Rotation(vector3D0, 5.0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {3.141592653589793, 1.2831853071795865, 3.141592653589793}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder1 = RotationOrder.YXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Rotation rotation0 = Rotation.IDENTITY;
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      try { 
        rotation0.IDENTITY.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Vector3D vector3D2 = new Vector3D(0.0, vector3D0, (-0.999999999999998), vector3D1);
      Rotation rotation0 = new Rotation(vector3D0, vector3D2);
      Rotation rotation1 = rotation0.revert();
      Rotation rotation2 = rotation0.applyInverseTo(rotation1);
      try { 
        rotation2.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      try { 
        rotation0.IDENTITY.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Rotation rotation0 = new Rotation(vector3D0, 1589.2);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.221099138908316), rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {(-1.5707963267948966), 0.44588271643533306, 1.5707963267948966}, doubleArray0, 0.01);
      assertEquals(-0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.19), (-0.19), 0.015846117015302114);
      Vector3D vector3D1 = new Vector3D((-0.19), vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Rotation rotation0 = new Rotation(vector3D0, (-2313.173526));
      try { 
        rotation0.getAngles((RotationOrder) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5, 0.0, 0.0, 0.5, false);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, Double.NaN);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }
}
