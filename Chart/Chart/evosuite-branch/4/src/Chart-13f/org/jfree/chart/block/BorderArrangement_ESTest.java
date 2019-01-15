/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 04:27:10 GMT 2019
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.FIXED;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (Range) null, lengthConstraintType0, 0.0, (Range) null, lengthConstraintType1);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (Range) null, lengthConstraintType0, 0.0, (Range) null, lengthConstraintType1);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 940.538341);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range((-2744.05), (-2744.05));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (Range) null, lengthConstraintType0, 0.0, (Range) null, lengthConstraintType0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      EmptyBlock emptyBlock0 = new EmptyBlock((-2453.534757687309), (-2453.534757687309));
      borderArrangement0.add(emptyBlock0, (Object) null);
      Size2D size2D0 = blockContainer0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(1872.3935, 1872.3935);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(1872.3935, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(1872.3935, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1610.0);
      assertEquals(1610.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      EmptyBlock emptyBlock0 = new EmptyBlock((-2453.534757687309), (-2453.534757687309));
      borderArrangement0.add(emptyBlock0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(1610.0, 1610.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2744.05), (-2744.05));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2727.071787870436), (-2727.071787870436));
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range((-2744.05), (-2744.05));
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      Range range0 = new Range((-2745.6765147581277), (-2745.6765147581277));
      Color color0 = Color.black;
      ColorBlock colorBlock0 = new ColorBlock(color0, 1560.8386833, Double.NaN);
      blockContainer0.add((Block) colorBlock0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(1560.8386833, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint((-2744.05), 0.0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-2744.05).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      boolean boolean0 = borderArrangement0.equals(rectangleEdge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      EmptyBlock emptyBlock0 = new EmptyBlock((-1.0), (-1.0));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement1.add(emptyBlock0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      EmptyBlock emptyBlock0 = new EmptyBlock((-981.3405892093562), 0.0);
      borderArrangement1.add(emptyBlock0, (Object) null);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }
}
