/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 06 18:25:46 GMT 2019
 */

package org.mockito.internal.matchers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Same_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.matchers.Same"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_52079_1546799134"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Same_ESTest_scaffolding.class.getClassLoader() ,
      "org.hamcrest.BaseMatcher",
      "org.mockito.ArgumentMatcher",
      "org.hamcrest.Description",
      "org.hamcrest.BaseDescription",
      "org.hamcrest.StringDescription",
      "org.hamcrest.Matcher",
      "org.hamcrest.SelfDescribing",
      "org.mockito.internal.matchers.Same"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Same_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.hamcrest.BaseMatcher",
      "org.mockito.ArgumentMatcher",
      "org.mockito.internal.matchers.Same",
      "org.hamcrest.BaseDescription",
      "org.hamcrest.StringDescription",
      "org.hamcrest.Description$NullDescription",
      "org.hamcrest.Description",
      "org.hamcrest.internal.SelfDescribingValueIterator",
      "org.hamcrest.internal.SelfDescribingValue",
      "org.hamcrest.internal.ReflectiveTypeFinder",
      "org.hamcrest.TypeSafeMatcher",
      "org.hamcrest.core.SubstringMatcher",
      "org.hamcrest.core.StringContains",
      "org.hamcrest.core.IsNull",
      "org.hamcrest.core.ShortcutCombination",
      "org.hamcrest.core.AnyOf",
      "org.hamcrest.core.IsNot",
      "org.hamcrest.TypeSafeDiagnosingMatcher",
      "org.hamcrest.core.CombinableMatcher",
      "org.hamcrest.number.BigDecimalCloseTo",
      "org.hamcrest.collection.IsMapContaining",
      "org.hamcrest.collection.IsEmptyCollection",
      "org.hamcrest.DiagnosingMatcher",
      "org.hamcrest.core.AllOf",
      "org.hamcrest.core.IsEqual",
      "org.hamcrest.beans.HasPropertyWithValue$2",
      "org.hamcrest.beans.HasPropertyWithValue",
      "org.hamcrest.core.IsSame",
      "org.hamcrest.FeatureMatcher",
      "org.hamcrest.collection.IsArrayWithSize",
      "org.hamcrest.core.DescribedAs",
      "org.hamcrest.beans.SamePropertyValuesAs",
      "org.hamcrest.beans.PropertyUtil",
      "org.hamcrest.core.IsAnything",
      "org.hamcrest.object.IsCompatibleType",
      "org.hamcrest.core.StringEndsWith",
      "org.hamcrest.collection.IsArrayContaining",
      "org.hamcrest.core.Is",
      "org.hamcrest.object.HasToString",
      "org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher",
      "org.hamcrest.collection.IsIn",
      "org.hamcrest.core.CombinableMatcher$CombinableBothMatcher",
      "org.hamcrest.core.IsCollectionContaining",
      "org.hamcrest.beans.HasProperty",
      "org.hamcrest.xml.HasXPath$1",
      "org.hamcrest.xml.HasXPath",
      "org.hamcrest.core.IsInstanceOf",
      "org.hamcrest.text.IsEqualIgnoringCase",
      "org.hamcrest.number.IsCloseTo",
      "org.hamcrest.object.IsEventFrom",
      "org.hamcrest.beans.SamePropertyValuesAs$PropertyMatcher",
      "org.hamcrest.internal.ArrayIterator",
      "org.hamcrest.collection.IsCollectionWithSize",
      "org.hamcrest.number.OrderingComparison",
      "org.hamcrest.core.StringStartsWith",
      "org.hamcrest.collection.IsArray",
      "org.hamcrest.core.Every",
      "org.hamcrest.text.IsEqualIgnoringWhiteSpace",
      "org.hamcrest.text.IsEmptyString"
    );
  }
}
