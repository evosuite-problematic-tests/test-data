/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:51:06 GMT 2018
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.SystemColor;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.Box;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Point2D.Double point2D_Double0 = (Point2D.Double)ShapeUtilities.getPointInRectangle(0.0, 0.0F, rectangle0);
      assertEquals(0.0, point2D_Double0.x, 0.01);
      assertEquals(0.0, point2D_Double0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      Shape shape1 = ShapeUtilities.clone(shape0);
      assertFalse(shape1.equals((Object)shape0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, polygon0, 0, 0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross((-1590.17F), 0);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(2063.1F, 683.5002F, 0.0F, 2063.1F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-1.0F), (-1.0F));
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(1);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) polygon0, rectangleAnchor0, (-2362.7768335), (double) 1);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, (-1.0), 338.21, 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(502.1F, 2922.4097F, 0.0F, 502.1F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Point2D point2D0 = RectangleAnchor.coordinates(defaultCaret0, rectangleAnchor0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D0, point2D0);
      Line2D.Float line2D_Float0 = new Line2D.Float(0, 0.0F, 0, 0);
      line2D_Float0.setLine(0.0F, (-1.0F), 763.9F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Line2D.Double line2D_Double1 = new Line2D.Double(0.0, 0.0, 0.0, (-1200.1844482421875));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-137.3331369574347), 0, 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-1186.61975924), 0L, (-2146795792), (-2146795792));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, (-1.0F), 3202.0F, 0.0F);
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) arc2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float((-559.8671F), 2.0F, 591.66F, 2.0F, 591.66F, 1.0F, 0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 0, 0, 0);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, 102.879176, 0.0F, 0);
      Arc2D.Double arc2D_Double1 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double1, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, 0.0F, 2031.4694, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      polygon0.addPoint((-2146795792), (-2146795792));
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.ypoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      int[] intArray0 = new int[3];
      polygon0.ypoints = intArray0;
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle((-2270.9102F));
      GeneralPath generalPath1 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1356.0F, 1356.0F, 1356.0F, 1356.0F);
      GeneralPath generalPath0 = new GeneralPath();
      GeneralPath generalPath1 = new GeneralPath(line2D_Float0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Double0, 0);
      GeneralPath generalPath1 = new GeneralPath(defaultCaret0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      Shape shape1 = ShapeUtilities.createDiamond(1.0F);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      generalPath0.moveTo((-2002.0), 1.7976931348623157E308);
      GeneralPath generalPath1 = new GeneralPath(generalPath0);
      generalPath1.quadTo(426.9105F, (-1.0F), (-1.0F), (-1.0F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-2270.9102F));
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.createTranslatedShape(shape0, (double) (-2270.9102F), (double) (-2270.9102F));
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (-1212.203597818541), (-1212.203597818541));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-1955.5010753), 3091.49095);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 0, 0, 0);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle0, (RectangleAnchor) null, (-729.33), 236.8795180086672);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.rotateShape(arc2D_Float0, 0, 0.0F, 0);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 1.0F, 1.0F);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JTable jTable0 = new JTable();
      Rectangle rectangle0 = jTable0.getCellRect(2146795792, (-1090), true);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-137.3331369574347), 102.879176, 2146795792, (-2060.955322265625));
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, 1466.314, 0.0, 0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1420.5253F), (-1420.5253F), 0.0F, 0.0F);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0F, (-2653.341), (-1.7976931348623157E308), 4009.0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Float0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Rectangle rectangle1 = new Rectangle(1, 0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame((String) null);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.windowBorder;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(0, systemColor0, systemColor0, systemColor0, systemColor0);
      Box box0 = Box.createVerticalBox();
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) box0, (-2241), (-2241), 1, 3346);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      boolean boolean0 = ShapeUtilities.intersects(defaultCaret0, defaultCaret0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-1865.2445572201), 0.0, (-1865.2445572201));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1423.3695F, 1423.3695F, 1.0F, 1.0F);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createIntersection(rectangle0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      rectangle2D_Float0.setRect((float) 0, 2.0F, (float) 0, 0.0F);
      boolean boolean0 = ShapeUtilities.intersects(defaultCaret0, rectangle2D_Float0);
      assertFalse(boolean0);
  }
}
