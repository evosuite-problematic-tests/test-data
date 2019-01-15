/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 10:39:18 GMT 2018
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Shape;
import java.awt.geom.Line2D;
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
      assertNotSame(shapeList0, object0);
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
      Line2D.Double line2D_Double0 = new Line2D.Double();
      shapeList0.setShape(1, line2D_Double0);
      ShapeList shapeList1 = new ShapeList();
      boolean boolean0 = shapeList0.equals(shapeList1);
      assertEquals(2, shapeList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      Object object0 = new Object();
      boolean boolean0 = shapeList0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      ShapeList shapeList1 = new ShapeList();
      boolean boolean0 = shapeList0.equals(shapeList1);
      assertTrue(boolean0);
  }
}