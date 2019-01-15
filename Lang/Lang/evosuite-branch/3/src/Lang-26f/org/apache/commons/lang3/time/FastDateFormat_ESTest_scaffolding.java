/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jan 05 12:59:17 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FastDateFormat_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.lang3.time.FastDateFormat"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_11860_1546692944"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FastDateFormat_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField",
      "org.apache.commons.lang3.time.FastDateFormat$TimeZoneNumberRule",
      "org.apache.commons.lang3.time.FastDateFormat$Rule",
      "org.apache.commons.lang3.time.FastDateFormat$Pair",
      "org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField",
      "org.apache.commons.lang3.time.FastDateFormat$NumberRule",
      "org.apache.commons.lang3.time.FastDateFormat$TwentyFourHourField",
      "org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField",
      "org.apache.commons.lang3.time.FastDateFormat$StringLiteral",
      "org.apache.commons.lang3.time.FastDateFormat",
      "org.apache.commons.lang3.time.FastDateFormat$TextField",
      "org.apache.commons.lang3.time.FastDateFormat$TwelveHourField",
      "org.apache.commons.lang3.time.FastDateFormat$TwoDigitNumberField",
      "org.apache.commons.lang3.time.FastDateFormat$CharacterLiteral",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField",
      "org.apache.commons.lang3.time.FastDateFormat$TimeZoneNameRule",
      "org.apache.commons.lang3.time.FastDateFormat$TwoDigitYearField",
      "org.apache.commons.lang3.time.FastDateFormat$TimeZoneDisplayKey"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FastDateFormat_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.time.FastDateFormat",
      "org.apache.commons.lang3.time.FastDateFormat$TextField",
      "org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField",
      "org.apache.commons.lang3.time.FastDateFormat$TwoDigitNumberField",
      "org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField",
      "org.apache.commons.lang3.time.FastDateFormat$TwelveHourField",
      "org.apache.commons.lang3.time.FastDateFormat$TwentyFourHourField",
      "org.apache.commons.lang3.time.FastDateFormat$TimeZoneNameRule",
      "org.apache.commons.lang3.time.FastDateFormat$TimeZoneDisplayKey",
      "org.apache.commons.lang3.time.FastDateFormat$CharacterLiteral",
      "org.apache.commons.lang3.time.FastDateFormat$StringLiteral",
      "org.apache.commons.lang3.time.FastDateFormat$Pair",
      "org.apache.commons.lang3.time.FastDateFormat$TwoDigitYearField",
      "org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField",
      "org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField",
      "org.apache.commons.lang3.time.FastDateFormat$TimeZoneNumberRule",
      "org.apache.commons.lang3.Validate"
    );
  }
}
