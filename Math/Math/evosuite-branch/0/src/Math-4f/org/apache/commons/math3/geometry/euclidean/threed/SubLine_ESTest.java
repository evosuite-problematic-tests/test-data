/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:41:51 GMT 2018
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      List<Segment> list0 = subLine0.getSegments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D(719.0, vector3D0, 719.0, vector3D0, 0.0, vector3D0, (-2965.22474), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertFalse(vector3D2.equals((Object)vector3D0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Vector3D vector3D1 = subLine0.intersection(subLine0, false);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = new Vector3D(1.9699272335463627E-8, vector3D0, 1.9699272335463627E-8, vector3D0, 604.66, vector3D0, (-123.7522106842), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertEquals(1.3677715322622446E-32, vector3D2.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = new Vector3D(1.9699272335463627E-8, vector3D0, 1.9699272335463627E-8, vector3D0, 604.66, vector3D0, (-123.7522106842), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine1.intersection(subLine0, true);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = new Vector3D(1.9699272335463627E-8, vector3D0, 1.9699272335463627E-8, vector3D0, 604.66, vector3D0, (-123.7522106842), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine1, true);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = new Vector3D(1.9699272335463627E-8, vector3D0, 1.9699272335463627E-8, vector3D0, 604.66, vector3D0, (-123.7522106842), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine1.intersection(subLine0, false);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = new Vector3D(1.9699272335463627E-8, vector3D0, 1.9699272335463627E-8, vector3D0, 604.66, vector3D0, (-123.7522106842), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine1, false);
      assertNull(vector3D2);
  }
}