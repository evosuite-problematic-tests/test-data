/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 11:18:35 GMT 2018
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.SpreadsheetDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getRed());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke(stackedAreaRenderer0.DEFAULT_STROKE);
      assertEquals(0.0, statisticalBarRenderer0.getBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("permitted.  Try using the addOrUpdate() method.");
      LogAxis logAxis0 = new LogAxis("permitted.  Try using the addOrUpdate() method.");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, defaultCaret0, combinedDomainCategoryPlot0, extendedCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 10, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Rectangle rectangle0 = new Rectangle();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-426.154035892662), (-3398.8010208326195));
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, (CategoryAxis) null, cyclicNumberAxis0, statisticalBarRenderer0);
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise((Graphics2D) null, rectangle0, categoryPlot0, 10, (PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle0, categoryPlot0, (CategoryAxis) null, cyclicNumberAxis0, (CategoryDataset) null, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("permitted.  Try using the addOrUpdate() method.");
      LogAxis logAxis0 = new LogAxis("permitted.  Try using the addOrUpdate() method.");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(10);
      defaultStatisticalCategoryDataset0.add((Number) statisticalBarRenderer0.ZERO, (Number) 2.0F, (Comparable) true, (Comparable) spreadsheetDate0);
      statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryStepRenderer_State0, defaultCaret0, combinedDomainCategoryPlot0, extendedCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 0);
      assertEquals(0.0, defaultCaret0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle rectangle0 = new Rectangle(0, 0);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis("J<4z|bH|x)v");
      LogAxis logAxis0 = new LogAxis("J<4z|bH|x)v");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) statisticalBarRenderer0.ZERO, (Number) 2.0F, (Comparable) true, (Comparable) null);
      statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, rectangle0, categoryPlot0, categoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 0);
      assertEquals(0.0, rectangle0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("permitted.  Try using the addOrUpdate() method.");
      LogAxis logAxis0 = new LogAxis("permitted.  Try using the addOrUpdate() method.");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(10);
      defaultStatisticalCategoryDataset0.add((Number) statisticalBarRenderer0.ZERO, (Number) 2.0F, (Comparable) true, (Comparable) spreadsheetDate0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, extendedCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 0);
      assertFalse(statisticalBarRenderer0.getBaseItemLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis("J<4z|bH|x)v");
      LogAxis logAxis0 = new LogAxis("J<4z|bH|x)v");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) statisticalBarRenderer0.ZERO, (Number) 2.0F, (Comparable) true, (Comparable) null);
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getDataArea();
      statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D0, categoryPlot0, categoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 0);
      assertTrue(Axis.DEFAULT_AXIS_VISIBLE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
      assertTrue(object0.equals((Object)statisticalBarRenderer0));
      
      statisticalBarRenderer0.setBase(1.0F);
      boolean boolean0 = statisticalBarRenderer0.equals(object0);
      assertFalse(object0.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.25);
      Paint paint0 = candlestickRenderer0.getItemPaint((-4036), (-4036));
      statisticalBarRenderer0.setErrorIndicatorPaint(paint0);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(boolean0);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
  }
}
