/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 03:01:45 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.ProcessCommonJSModules;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessCommonJSModules_ESTest extends ProcessCommonJSModules_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "com.google.common.base.Predicates$InPredicate", false);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", (String) null);
      processCommonJSModules0.process(node0, node0);
      processCommonJSModules0.process(node0, node0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "");
      JSModule jSModule0 = processCommonJSModules0.getModule();
      assertNull(jSModule0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules((AbstractCompiler) null, "./", true);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = ProcessCommonJSModules.toModuleName("./", "require");
      assertEquals("module$", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = ProcessCommonJSModules.toModuleName("v3G-3Zx0ysp@x#", "com.google.common.base.Predicates$InPredicate");
      assertEquals("module$v3G_3Zx0ysp@x#", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = ProcessCommonJSModules.toModuleName("../", "../");
      assertEquals("module$..$..$", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "exports", true);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "exports", "exports");
      processCommonJSModules0.process(node0, node0);
      assertEquals(4096, node0.getSourcePosition());
  }
}
