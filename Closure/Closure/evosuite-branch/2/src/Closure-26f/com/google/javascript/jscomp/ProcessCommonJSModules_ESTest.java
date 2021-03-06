/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 12:39:56 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.ProcessCommonJSModules;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessCommonJSModules_ESTest extends ProcessCommonJSModules_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "operator {0} cannot be applied to {1}");
      JSModule jSModule0 = processCommonJSModules0.getModule();
      assertNull(jSModule0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "./", false);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "module.exports", "module.exports");
      processCommonJSModules0.process(node0, node0);
      assertEquals(4, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ProcessCommonJSModules.toModuleName("./", "unexpected: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in opaque part at index 11: unexpected: 
         //
         verifyException("com.google.javascript.jscomp.ProcessCommonJSModules", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = ProcessCommonJSModules.toModuleName("", "");
      assertEquals("module$", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ProcessCommonJSModules.toModuleName("../", "O>!Tje0G<;Gp@,");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 1: O>!Tje0G<;Gp@,
         //
         verifyException("com.google.javascript.jscomp.ProcessCommonJSModules", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "exports", false);
      Node node0 = compiler0.parseTestCode("module$module$OT$=t'v");
      processCommonJSModules0.process(node0, node0);
      processCommonJSModules0.process(node0, node0);
      assertEquals(2, Node.POST_FLAG);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "./", false);
      Node node0 = compiler0.parseTestCode("module$");
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "./", "ISmrv3'ALlNC ]M");
      node0.addChildrenToFront(node1);
      // Undeclared exception!
      try { 
        processCommonJSModules0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // ProcessCommonJSModules supports only one invocation per CompilerInput / script node
         //   Node(SCRIPT): [testcode]:1:0
         // ./
         //   Parent: NULL
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "./", true);
      Node node0 = compiler0.parseTestCode("module$");
      processCommonJSModules0.process(node0, node0);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("./", true);
      node0.setStaticSourceFile(simpleSourceFile0);
      processCommonJSModules0.process(node0, node0);
      assertEquals(0, compiler0.getErrorCount());
      assertFalse(compiler0.hasErrors());
  }
}
