/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 07:10:23 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.ValueMarker;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValueMarker_ESTest extends ValueMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-1849.1186979340225));
      boolean boolean0 = valueMarker0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals((-1849.1186979340225), valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      double double0 = valueMarker0.getValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-2713.209));
      valueMarker0.setValue((-2713.209));
      assertEquals((-2713.209), valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ValueMarker valueMarker0 = new ValueMarker(1.0E-5, ringPlot0.DEFAULT_LABEL_OUTLINE_PAINT, ringPlot0.DEFAULT_LABEL_OUTLINE_STROKE);
      ValueMarker valueMarker1 = new ValueMarker(1.0F, ringPlot0.DEFAULT_LABEL_PAINT, ringPlot0.DEFAULT_OUTLINE_STROKE);
      boolean boolean0 = valueMarker1.equals(valueMarker0);
      assertFalse(valueMarker0.equals((Object)valueMarker1));
      assertFalse(boolean0);
      assertEquals(1.0, valueMarker1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(360.0);
      ValueMarker valueMarker1 = (ValueMarker)valueMarker0.clone();
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertTrue(boolean0);
      assertEquals(360.0, valueMarker1.getValue(), 0.01);
  }
}
