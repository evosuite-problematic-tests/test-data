/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:01:22 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.AffineTransform;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((-1433.7976704991), (-1433.7976704991), 27.50497143688058);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Transform<Euclidean2D, Euclidean1D> transform0 = Line.getTransform(affineTransform0);
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.applyTransform(transform0);
      linkedList0.add((SubHyperplane<Euclidean2D>) abstractSubHyperplane0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(200.755737688617, 1.0, 3942.253586698, 0.0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      assertFalse(polygonsSet1.equals((Object)polygonsSet0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(200.755737688617, 1.0, 3942.253586698, 0.0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getPlus();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
      polygonsSet1.computeGeometricalProperties();
      assertTrue(polygonsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(20.0, 3.4028234663852886E38, (-50.22371403499), 11063.980087603906);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.4028234663852886E38, (-3427.063104617), 0.5286835987417408, (-3427.063104617));
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(200.755737688617, 1.0, 3942.253586698, 0.0);
      polygonsSet0.getVertices();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet((-1433.7976704991), (-3812.0));
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(7.0, 1.499, 1.499, 1.3723816948218563);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(1958.1644545841423, (-8.0E298), 1958.1644545841423, (-8.0E298));
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
}