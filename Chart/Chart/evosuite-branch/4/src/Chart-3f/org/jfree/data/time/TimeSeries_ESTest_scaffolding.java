/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 06 04:11:41 GMT 2019
 */

package org.jfree.data.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TimeSeries_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.data.time.TimeSeries"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_214253_1546747780"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TimeSeries_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.general.Series",
      "org.jfree.chart.util.HashUtilities",
      "org.jfree.data.general.SeriesException",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.event.SeriesChangeListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TimeSeries_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Hour",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.time.Week",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.xy.YIntervalDataItem",
      "org.jfree.data.xy.YInterval",
      "org.jfree.data.time.Year",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.general.SeriesException",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.XIntervalSeries",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.Range",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.util.HashUtilities",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.time.DynamicTimeSeriesCollection$ValueSequence",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.general.SeriesChangeType",
      "org.jfree.data.general.SeriesChangeInfo",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.DataUtilities",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.data.KeyedObject"
    );
  }
}
