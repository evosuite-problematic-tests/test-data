/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 11:43:51 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.text.TextAnchor;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      statisticalBarRenderer0.setErrorIndicatorPaint(color0);
      assertEquals((-8355712), color0.getRGB());
      assertEquals(128, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      statisticalBarRenderer0.setErrorIndicatorStroke(basicStroke0);
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.data.time.TimePeriodValues");
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, subCategoryAxis0, logarithmicAxis0, defaultCategoryDataset0, 2661, (-1760), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      combinedDomainCategoryPlot0.setOrientation(plotOrientation0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, false, false, false);
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      LogAxis logAxis0 = new LogAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.initialise(graphics2D0, rectangle2D0, combinedDomainCategoryPlot0, 420, (PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(categoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, false, false, false);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)chartPanel0.getScreenDataArea();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      LogAxis logAxis0 = new LogAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 0, (Comparable) false, (Comparable) 0.2);
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, categoryPlot0, 420, (PlotRenderingInfo) null);
      statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, categoryPlot0, categoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 0);
      assertEquals((-1), sunGraphics2D0.eargb);
      assertEquals((-1), sunGraphics2D0.pixel);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(categoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, false, false, false);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)chartPanel0.getScreenDataArea();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      LogAxis logAxis0 = new LogAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 0, (Comparable) false, (Comparable) 0.2);
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, categoryPlot0, 420, (PlotRenderingInfo) null);
      statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, categoryPlot0, categoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 0, 0);
      assertEquals((-1), sunGraphics2D0.eargb);
      assertEquals((-1), sunGraphics2D0.pixel);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      boolean boolean0 = statisticalBarRenderer0.equals(stackedAreaRenderer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ItemLabelAnchor itemLabelAnchor0 = ItemLabelAnchor.INSIDE4;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_LEFT;
      ItemLabelPosition itemLabelPosition0 = new ItemLabelPosition(itemLabelAnchor0, textAnchor0);
      statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition0);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundSelectionColor();
      statisticalBarRenderer0.setErrorIndicatorPaint(color0);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }
}
