/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 10:53:39 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.ShapeList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeList_ESTest extends ShapeList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Object object0 = shapeList0.clone();
      boolean boolean0 = shapeList0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.hashCode();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Shape shape0 = shapeList0.getShape(1987);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Object object0 = new Object();
      boolean boolean0 = shapeList0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Object object0 = shapeList0.clone();
      Point2D.Double point2D_Double0 = new Point2D.Double(1.0, 1146.948);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      shapeList0.setShape(900, rectangle2D0);
      boolean boolean0 = shapeList0.equals(object0);
      assertEquals(901, shapeList0.size());
      assertFalse(boolean0);
  }
}
