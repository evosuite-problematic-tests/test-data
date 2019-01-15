/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Dec 24 11:08:51 GMT 2018
 */

package org.jfree.chart.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CategoryPlot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.CategoryPlot"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_11171_1545649569"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CategoryPlot_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.Effect3D",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.data.time.Quarter",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.ui.Licences",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "org.jfree.data.time.Month",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.renderer.category.CategoryStepRenderer$State",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.data.Value",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.HashUtilities",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Day",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.title.LegendItemBlockContainer",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.time.Year",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.general.Series",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.entity.LegendItemEntity",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.util.PaintUtilities"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, CategoryPlot_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CategoryPlot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.DataUtilities",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.plot.PieLabelRecord",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.chart.HashUtilities",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.urls.StandardXYZURLGenerator",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.title.LegendItemBlockContainer",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.entity.LegendItemEntity",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.data.general.CombinedDataset$DatasetInfo",
      "org.jfree.chart.renderer.xy.XYDotRenderer",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XIntervalSeries"
    );
  }
}
