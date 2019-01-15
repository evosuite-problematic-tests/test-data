/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:38:31 GMT 2018
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
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
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, (-2772.4789));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Vector2D vector2D1 = new Vector2D((-2772.4789), 0.0);
      SubLine subLine1 = new SubLine(vector2D1, vector2D1);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      // Undeclared exception!
      try { 
        polygonsSet0.getVertices();
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
      PolygonsSet polygonsSet0 = new PolygonsSet((-1.7976931348623157E308), 0.005, (-1.7976931348623157E308), 0.005);
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
  public void test2()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Boolean boolean0 = new Boolean(false);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet1.computeGeometricalProperties();
      assertFalse(polygonsSet0.equals((Object)polygonsSet1));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.4028234663852886E38, 2.2860509143963117E-8, 1073.64267000154, 2.2860509143963117E-8);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-813.1042), 0.001, 0.0, 2344.465506956265);
      polygonsSet0.getVertices();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = new Vector2D(0.0, 0.0);
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, (-3.43338934259355E-8), 3.199999999999999E-5, (-5292.57871));
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, 1609.75427, 0.0, 1.301204386157242);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      line0.setAngle((-2681.558));
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      polygonsSet1.computeGeometricalProperties();
      assertFalse(polygonsSet0.equals((Object)polygonsSet1));
  }
}
