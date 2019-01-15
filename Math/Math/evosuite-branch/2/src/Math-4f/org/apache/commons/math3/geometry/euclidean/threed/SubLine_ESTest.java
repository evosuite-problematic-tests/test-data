/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:07:45 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
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
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = new Vector3D(2575.70353, vector3D0, 2575.70353, vector3D0, 0.0, vector3D0, 0.0, vector3D0);
      SubLine subLine0 = new SubLine(vector3D1, vector3D0);
      List<Segment> list0 = subLine0.getSegments();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = new Vector3D(2575.70353, vector3D0);
      SubLine subLine0 = new SubLine(vector3D1, vector3D0);
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      Vector3D vector3D1 = subLine0.intersection(subLine0, false);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertFalse(vector3D2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Vector3D vector3D2 = Vector3D.PLUS_I;
      Line line0 = new Line(vector3D0, vector3D2);
      Segment segment0 = new Segment(vector3D1, vector3D0, line0);
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      SubLine subLine1 = new SubLine(segment0);
      Vector3D vector3D3 = subLine1.intersection(subLine0, true);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Vector3D vector3D2 = Vector3D.PLUS_I;
      Line line0 = new Line(vector3D0, vector3D2);
      Segment segment0 = new Segment(vector3D1, vector3D0, line0);
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      SubLine subLine1 = new SubLine(segment0);
      Vector3D vector3D3 = subLine0.intersection(subLine1, true);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.0, vector3D0);
      Vector3D vector3D2 = vector3D0.orthogonal();
      Vector3D vector3D3 = vector3D2.normalize();
      Vector3D vector3D4 = new Vector3D(0.0, vector3D1, 0.0, vector3D1, 1.0, vector3D0, 3378.6439154803134, vector3D0);
      SubLine subLine0 = new SubLine(vector3D4, vector3D1);
      SubLine subLine1 = new SubLine(vector3D3, vector3D0);
      Vector3D vector3D5 = subLine0.intersection(subLine1, false);
      assertNull(vector3D5);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertTrue(vector3D2.equals((Object)vector3D1));
  }
}