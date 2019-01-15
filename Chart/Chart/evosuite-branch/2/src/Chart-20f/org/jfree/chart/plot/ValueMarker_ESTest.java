/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 11:35:59 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Paint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValueMarker_ESTest extends ValueMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      double double0 = valueMarker0.getValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      valueMarker0.setValue(0.0);
      assertEquals(0.0, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Paint paint0 = stackedAreaRenderer0.getBasePaint();
      ValueMarker valueMarker0 = new ValueMarker(0.0, paint0, stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE);
      boolean boolean0 = valueMarker0.equals(paint0);
      assertEquals(0.0, valueMarker0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Paint paint0 = stackedAreaRenderer0.getBasePaint();
      ValueMarker valueMarker0 = new ValueMarker(0.0, paint0, stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE);
      ValueMarker valueMarker1 = (ValueMarker)valueMarker0.clone();
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertEquals(0.0, valueMarker1.getValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      ValueMarker valueMarker1 = new ValueMarker(0.1);
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertFalse(boolean0);
      assertFalse(valueMarker1.equals((Object)valueMarker0));
      assertEquals(0.1, valueMarker1.getValue(), 0.01);
  }
}