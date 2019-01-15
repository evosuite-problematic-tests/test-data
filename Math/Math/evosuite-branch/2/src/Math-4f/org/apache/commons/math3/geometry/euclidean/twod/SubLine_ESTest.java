/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:07:52 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector1D vector1D0 = Vector1D.ZERO;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      IntervalsSet intervalsSet0 = orientedPoint0.wholeSpace();
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew(line0, intervalsSet0);
      assertNotSame(subLine0, abstractSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-6.663542893624021E-14), (-699.7362237));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      List<Segment> list0 = subLine0.getSegments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector2D vector2D1 = subLine0.intersection(subLine0, true);
      assertEquals(Double.NaN, vector2D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-6.663542893624021E-14), (-699.7362237));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNotSame(vector2D0, vector2D1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 8.0E298);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      SubLine subLine1 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine1, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-2222.920495087447), 767.687958345);
      Vector2D vector2D1 = new Vector2D((-1.0E-10), vector2D0, (-1.0E-10), vector2D0, 767.687958345, vector2D0);
      SubLine subLine0 = new SubLine(vector2D1, vector2D1);
      Line line0 = new Line(vector2D0, vector2D1);
      Segment segment0 = new Segment(vector2D1, vector2D0, line0);
      SubLine subLine1 = new SubLine(segment0);
      Vector2D vector2D2 = subLine0.intersection(subLine1, false);
      assertNull(vector2D2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, 1.1730463525082348E-7);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      SubLine subLine1 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine1, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-2222.920495087447), 767.687958345);
      Vector2D vector2D1 = new Vector2D(0.0, vector2D0);
      SubLine subLine0 = new SubLine(vector2D1, vector2D1);
      Line line0 = new Line(vector2D0, vector2D1);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.MINUS, side0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-6.663542893624021E-14), (-699.7362237));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-6.663542893624021E-14));
      Side side0 = subLine0.side(line0);
      assertEquals(Side.HYPER, side0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Line line1 = new Line(line0);
      line0.setOriginOffset((-79.97466288));
      SubLine subLine0 = new SubLine(line1, (Region<Euclidean1D>) null);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.MINUS, side0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-6.663542893624021E-14), (-699.7362237));
      Vector2D vector2D1 = new Vector2D((-537.094698091326), vector2D0, (-699.7362237), vector2D0, (-1.0E-10), vector2D0, 2561.171424032, vector2D0);
      SubLine subLine0 = new SubLine(vector2D1, vector2D1);
      Line line0 = new Line(vector2D0, (-6.663542893624021E-14));
      Side side0 = subLine0.side(line0);
      assertEquals(Side.PLUS, side0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-2222.920495087447), 767.687958345);
      Vector2D vector2D1 = new Vector2D((-1.0E-10), vector2D0, (-1.0E-10), vector2D0, 767.687958345, vector2D0);
      SubLine subLine0 = new SubLine(vector2D1, vector2D1);
      Line line0 = new Line(vector2D0, vector2D1);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.MINUS, side0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      line0.setAngle((-0.2081888242260194));
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Line line1 = new Line(line0);
      line0.setOriginOffset((-79.97466288));
      SubLine subLine0 = new SubLine(line1, (Region<Euclidean1D>) null);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, (-3811.7437923268726));
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }
}
