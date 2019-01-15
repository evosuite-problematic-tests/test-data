/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 04:25:14 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiplePiePlot_ESTest extends MultiplePiePlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      multiplePiePlot0.setPieChart(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      String string0 = multiplePiePlot0.getPlotType();
      assertEquals("Multiple Pie Plot", string0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Comparable comparable0 = multiplePiePlot0.getAggregatedItemsKey();
      assertEquals("Other", comparable0);
      
      multiplePiePlot0.setAggregatedItemsKey(comparable0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setLimit((-1111.85));
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot((CategoryDataset) null);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals((-1111.85), multiplePiePlot0.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Color color0 = (Color)multiplePiePlot0.getAggregatedItemsPaint();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals(192, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      multiplePiePlot0.setDataset(jDBCCategoryDataset0);
      multiplePiePlot0.setDataset(jDBCCategoryDataset0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
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
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultMultiValueCategoryDataset0);
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
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) null);
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
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = new JFreeChart("_Ed7W7:F<M", multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 15);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[4][3];
      double[] doubleArray1 = new double[18];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, multiplePiePlot0);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[4][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, multiplePiePlot0);
      multiplePiePlot0.setLimit(15);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(15.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 1765);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, multiplePiePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      FontRenderContext fontRenderContext0 = new FontRenderContext((AffineTransform) null, true, true);
      Rectangle2D rectangle2D0 = jFreeChart0.DEFAULT_TITLE_FONT.getMaxCharBounds(fontRenderContext0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Point2D point2D0 = RectangleAnchor.coordinates(rectangle2D0, rectangleAnchor0);
      PlotState plotState0 = new PlotState();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, true, false, false, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      multiplePiePlot0.draw(graphics2D0, rectangle2D0, point2D0, plotState0, plotRenderingInfo0);
      assertEquals(3, plotRenderingInfo0.getSubplotCount());
      
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(3, legendItemCollection0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, multiplePiePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      multiplePiePlot0.getLegendItems();
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      FontRenderContext fontRenderContext0 = new FontRenderContext((AffineTransform) null, true, true);
      Rectangle2D rectangle2D0 = jFreeChart0.DEFAULT_TITLE_FONT.getMaxCharBounds(fontRenderContext0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Point2D point2D0 = RectangleAnchor.coordinates(rectangle2D0, rectangleAnchor0);
      PlotState plotState0 = new PlotState();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, true, false, false, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      multiplePiePlot0.draw(graphics2D0, rectangle2D0, point2D0, plotState0, plotRenderingInfo0);
      assertEquals(3, plotRenderingInfo0.getSubplotCount());
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[4][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, multiplePiePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Point point0 = new Point((byte)0, 338);
      JScrollPane jScrollPane0 = new JScrollPane((Component) null);
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      PlotState plotState0 = new PlotState();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      // Undeclared exception!
      try { 
        multiplePiePlot0.draw(graphics2D0, rectangle0, point0, plotState0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 10);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      SystemColor systemColor0 = SystemColor.controlText;
      boolean boolean0 = multiplePiePlot0.equals(systemColor0);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setAggregatedItemsKey(1.0F);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Object object0 = multiplePiePlot0.clone();
      assertTrue(object0.equals((Object)multiplePiePlot0));
      
      JEditorPane jEditorPane0 = new JEditorPane();
      Color color0 = jEditorPane0.getSelectionColor();
      multiplePiePlot0.setAggregatedItemsPaint(color0);
      boolean boolean0 = multiplePiePlot0.equals(object0);
      assertFalse(object0.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) null);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot((CategoryDataset) null);
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setForegroundAlpha(4865.1475F);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
  }
}