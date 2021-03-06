/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 15:43:16 GMT 2019
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
      Rotation rotation0 = Rotation.IDENTITY;
      Rotation rotation1 = rotation0.IDENTITY.revert();
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(4867.93, 3297.406, 4867.93, 3297.406, false);
      double double0 = rotation0.getQ3();
      assertEquals(3297.406, double0, 0.01);
      assertEquals(4867.93, rotation0.getQ0(), 0.01);
      assertEquals(3297.406, rotation0.getQ1(), 0.01);
      assertEquals(4867.93, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation(4867.93, 3297.406, 4867.93, 3297.406, false);
      double double0 = rotation0.getQ1();
      assertEquals(3297.406, double0, 0.01);
      assertEquals(3297.406, rotation0.getQ3(), 0.01);
      assertEquals(4867.93, rotation0.getQ2(), 0.01);
      assertEquals(4867.93, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getQ2();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getQ0();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 1526.7080074370087, 1526.7080074370087, (-98.30366133));
      double[][] doubleArray0 = rotation0.getMatrix();
      assertEquals(3, doubleArray0.length);
      
      Rotation rotation1 = new Rotation(doubleArray0, 0.1);
      assertEquals((-0.024124037994860074), rotation0.getQ2(), 0.01);
      assertEquals((-0.07083330898618752), rotation1.getQ1(), 0.01);
      assertEquals(0.437629180203093, rotation0.getQ0(), 0.01);
      assertEquals((-0.437629180203093), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D1, (-629.949732628));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, 2.0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // a 5x9 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // a 3x6 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, (-2669.51130599294));
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.euclidean.threed.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[6];
      doubleArray0[2] = doubleArray1;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(doubleArray0, Double.POSITIVE_INFINITY);
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
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Rotation rotation0 = new Rotation(vector3D0, 0.5);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.5);
      assertEquals((-0.24740395925452294), rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(-0.0, rotation0.getQ2(), 0.01);
      assertEquals((-0.24740395925452296), rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 1526.7080074370087, 1526.7080074370087, (-98.30366133));
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.1);
      assertEquals((-0.024124037994860074), rotation0.getQ3(), 0.01);
      assertEquals((-0.07083330898618752), rotation1.getQ2(), 0.01);
      assertEquals(0.07083330898618753, rotation0.getQ2(), 0.01);
      assertEquals(0.02412403799486007, rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.6666622867206672, 0.6666622867206672, (-98.30366133));
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.1);
      assertEquals((-0.11669971544563906), rotation1.getQ0(), 0.01);
      assertEquals((-0.9377239257973449), rotation0.getQ2(), 0.01);
      assertEquals(0.23253187250853663, rotation1.getQ1(), 0.01);
      assertEquals((-0.23018241390209682), rotation0.getQ3(), 0.01);
      assertEquals(0.11669971544563906, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 425.51, 425.51, 425.51);
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Vector3D vector3D2 = rotation0.applyTo(vector3D1);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, vector3D2, vector3D1, vector3D1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(-0.0, vector3D0);
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D0, vector3D1, vector3D0);
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
  public void test20()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D1);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      Vector3D vector3D2 = new Vector3D((-527.4483), vector3D0, (-527.4483), vector3D1, (-527.4483), vector3D0);
      Rotation rotation0 = new Rotation(vector3D2, vector3D0, vector3D2, vector3D1);
      assertEquals(0.894427190999916, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.IDENTITY.getAxis();
      Rotation rotation1 = new Rotation(vector3D0, vector3D1);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getQ0(), 0.01);
      assertEquals(1.0, vector3D1.getX(), 0.01);
      assertEquals(1.0, rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      assertEquals(Double.NaN, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1168.1438), (-1168.1438), (-1168.1438), 0.0, true);
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals((-0.7071067811865475), vector3D0.getX(), 0.01);
      assertEquals((-0.5773502691896257), rotation0.getQ0(), 0.01);
      assertEquals((-0.7071067811865475), vector3D0.getY(), 0.01);
      assertEquals((-0.5773502691896257), rotation0.getQ1(), 0.01);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.IDENTITY.getAngle();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9999999999), 3104.0, 0.1666666505023083, 0.1666666505023083, true);
      double double0 = rotation0.getAngle();
      assertEquals(3.1409483237170996, double0, 0.01);
      assertEquals(5.3694149926743476E-5, rotation0.getQ3(), 0.01);
      assertEquals(0.9999999452218153, rotation0.getQ1(), 0.01);
      assertEquals((-3.2216493077378075E-4), rotation0.getQ0(), 0.01);
      assertEquals(5.3694149926743476E-5, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 1526.7080074370087, 1526.7080074370087, (-98.30366133));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.10602220763076793), (-0.106022207630768), 2.2273035848733866}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1158.746124), (-1158.746124), (-1158.746124), (-177.24), false);
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
  public void test31()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(0.0, 813.0391, 813.0391, 813.0391, false);
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
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.07490822288864472, (-1791.80984), 0.07490822288864472, 0.9999999999, false);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
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
      Rotation rotation0 = new Rotation((-1724.8), (-1724.8), (-1724.8), (-1724.8), false);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
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
  public void test35()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 2107.9205536983604, (-3850.743087620309), 0.0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {3.0534757931989662, 0.8495056807776403, 0.0}, doubleArray0, 0.01);
      assertEquals((-0.9102564290645758), rotation0.getQ2(), 0.01);
      assertEquals((-0.018150411674135048), rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.11113807559013367, (-29.873), (-29.873), 0.11113807559013367, false);
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
  public void test37()  throws Throwable  {
      Rotation rotation0 = new Rotation((-23.29262341), (-1514.4179), (-1514.4179), (-0.33333333333333287), false);
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
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 1526.7080074370087, 1526.7080074370087, (-98.30366133));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.10602220763076793), (-0.106022207630768), 2.2273035848733866}, doubleArray0, 0.01);
      assertEquals(0.437629180203093, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1236.3349768939006), (-0.5), (-450.2944), (-450.2944), false);
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
  public void test40()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation((-252.7297094921157), 319.0, 319.0, (-0.1), false);
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
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9999999999, 0.9999999999, (-277.482705503285), 0.9999999999999998, false);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
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
      Rotation rotation0 = new Rotation((-71.10309765169), 220.6879568, 29.4943, 29.4943, false);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
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
  public void test44()  throws Throwable  {
      Rotation rotation0 = new Rotation(4867.93, 3297.406, 4867.93, 3297.406, false);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.IDENTITY.getAngles(rotationOrder0);
      assertEquals(4867.93, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9190587025939628), 2109.8692929464, (-0.1), (-0.9190587025939628), false);
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
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1556.9248), 0.7937005259840998);
      Rotation rotation0 = new Rotation(vector3D0, 0.7937005259840998);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.8885372983010462, 0.7793974532752902, (-0.7345459466698394)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
  public void test48()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test49()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
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
  public void test50()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.003042525764185109, 0.003042525764185109, 0.003042525764185109, 1333.973855012302, true);
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
  public void test51()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Rotation rotation0 = new Rotation(vector3D0, (-0.5));
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.9689124217106447, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Rotation rotation0 = new Rotation(vector3D0, 0.5);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, 0.5000000000000003, 0.0}, doubleArray0, 0.01);
      assertEquals((-0.24740395925452294), rotation0.getQ1(), 0.01);
      assertEquals(-0.0, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, (-386.396943400342), 0.0, (-386.396943400342), false);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
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
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 1.4456468917292502E-16, 1.4456468917292502E-16, 0.0952233225107193);
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
  public void test55()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 2.0, 3351.6742505, 2.0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.9999999999999998, 2.736481773280606, 2.0}, doubleArray0, 0.01);
      assertEquals(0.9795556907583058, rotation0.getQ3(), 0.01);
      assertEquals(0.182926255715191, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(0.0, (-3216.2), 0.0, (-3723.66), true);
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
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
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
  public void test58()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Vector3D vector3D1 = new Vector3D(1299.5648, vector3D0, 1299.5648, vector3D0, (-4457.1828), vector3D0, (-4457.1828), vector3D0);
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
  public void test60()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.2060135969134738, 1.2060135969134738, 1.304E19, 2163.311, true);
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
  public void test61()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
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
