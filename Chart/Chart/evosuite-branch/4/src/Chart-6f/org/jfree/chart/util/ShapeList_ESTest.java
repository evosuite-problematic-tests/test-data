/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 04:16:46 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Rectangle;
import java.awt.Shape;
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
      Shape shape0 = shapeList0.getShape(1);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      shapeList0.set(753, (Object) null);
      Object object0 = shapeList0.clone();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(3361.5F, (-2955.0F), 8, (-2955.0F));
      shapeList0.setShape(753, rectangle2D_Float0);
      boolean boolean0 = shapeList0.equals(object0);
      assertEquals(754, shapeList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      boolean boolean0 = shapeList0.equals(shapeList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      boolean boolean0 = shapeList0.equals(rectangle0);
      assertFalse(boolean0);
  }
}
