/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 07:04:26 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableBiMap;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.TightenTypes;
import java.io.PrintStream;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DisambiguateProperties_ESTest extends DisambiguateProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        DisambiguateProperties.forJSTypeSystem((AbstractCompiler) null, (Map<String, CheckLevel>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      compiler0.parseTestCode("\" missing method \"");
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ImmutableBiMap<String, CheckLevel> immutableBiMap0 = ImmutableBiMap.of("cYd\"-", checkLevel0);
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, immutableBiMap0);
      assertNotNull(disambiguateProperties0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DisambiguateProperties.Warnings disambiguateProperties_Warnings0 = new DisambiguateProperties.Warnings();
  }
}