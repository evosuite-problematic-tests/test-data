/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:59:13 GMT 2018
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, (-1358.77), (-1.0), (-1358.77));
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      assertEquals(1, vector2DArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew((BSPTree<Euclidean2D>) null);
      assertNotSame(polygonsSet0, polygonsSet1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, (-0.9999999999));
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      polygonsSet0.getVertices();
      bSPTree0.insertCut(line0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(892.4627630572754, 314.0, 892.4627630572754, 314.0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getPlus();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
      polygonsSet1.computeGeometricalProperties();
      assertNotSame(polygonsSet0, polygonsSet1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, 4.0E-8, 0.0, 4.0E-8);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(8.0E298, (-1.9549657798720983), 8.0E298, (-1.9549657798720983));
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.4028234663852886E38, 843.852598, 3.141592653489793, 0.0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      assertEquals(1, vector2DArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(Double.POSITIVE_INFINITY, (-1140.8315187), (-1140.8315187), Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }
}
