/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:53:10 GMT 2018
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiplePiePlot_ESTest extends MultiplePiePlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      String string0 = multiplePiePlot0.getPlotType();
      assertEquals("Multiple Pie Plot", string0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      Comparable comparable0 = multiplePiePlot0.getAggregatedItemsKey();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals("Other", comparable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[17][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      multiplePiePlot0.setLimit(1489.946366540229);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(1489.946366540229, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultMultiValueCategoryDataset0);
      TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Color color0 = (Color)multiplePiePlot0.getAggregatedItemsPaint();
      assertEquals(192, color0.getBlue());
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultCategoryDataset0);
      multiplePiePlot0.setDataset(defaultCategoryDataset0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart(jFreeChart0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'pieChart' argument must be a chart based on a PiePlot.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultMultiValueCategoryDataset0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart((JFreeChart) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'pieChart' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      multiplePiePlot0.setPieChart(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setDataExtractOrder((TableOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsKey((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      Year year0 = new Year();
      defaultKeyedValues2DDataset0.setValue((Number) 1.0F, (Comparable) year0, (Comparable) 10);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 10, 15, 10, (-2145562013), 2136672111, (-1144), false, false, false, false, false, false);
      Rectangle rectangle0 = chartPanel0.getBounds();
      PlotState plotState0 = new PlotState();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      multiplePiePlot0.draw(sunGraphics2D0, rectangle0, (Point2D) null, plotState0, plotRenderingInfo0);
      assertEquals(2, sunGraphics2D0.antialiasHint);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Font font0 = new Font("j9ZL*nQk==z>", 10, 51);
      JFreeChart jFreeChart0 = new JFreeChart("", font0, multiplePiePlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      jFreeChart0.createBufferedImage(1705, 10, chartRenderingInfo0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      Year year0 = new Year();
      defaultKeyedValues2DDataset0.setValue((Number) 1.0F, (Comparable) year0, (Comparable) 10);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 10, 15, 10, (-2145562013), 2136672111, (-1144), false, false, false, false, false, false);
      Rectangle rectangle0 = chartPanel0.getBounds();
      PlotState plotState0 = new PlotState();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      multiplePiePlot0.draw(graphics2D0, rectangle0, (Point2D) null, plotState0, plotRenderingInfo0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[2][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      ArrayList<DefaultTableModel> arrayList0 = new ArrayList<DefaultTableModel>();
      jFreeChart0.setSubtitles(arrayList0);
      jFreeChart0.createBufferedImage(195, 195);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[8][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultKeyedValues2DDataset0);
      boolean boolean0 = multiplePiePlot0.equals("A?5o<h-d:kS6J");
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[2][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertTrue(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot1.setDataExtractOrder(tableOrder0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setLimit((-1095.3999569485363));
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultMultiValueCategoryDataset0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals((-1095.3999569485363), multiplePiePlot0.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setAggregatedItemsKey(10);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      Color color0 = Color.blue;
      multiplePiePlot1.setAggregatedItemsPaint(color0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[2][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      jFreeChart0.createBufferedImage(195, 195);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      BasicStroke basicStroke0 = new BasicStroke(1.0F, 1, 1, 10);
      CategoryMarker categoryMarker0 = new CategoryMarker(10, multiplePiePlot0.DEFAULT_BACKGROUND_PAINT, multiplePiePlot0.DEFAULT_OUTLINE_STROKE, multiplePiePlot0.DEFAULT_OUTLINE_PAINT, basicStroke0, 1);
      Font font0 = categoryMarker0.getLabelFont();
      multiplePiePlot0.setNoDataMessageFont(font0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }
}