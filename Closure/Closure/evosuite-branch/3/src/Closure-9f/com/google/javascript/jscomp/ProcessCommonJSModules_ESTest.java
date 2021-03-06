/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 07:38:19 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.ProcessCommonJSModules;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessCommonJSModules_ESTest extends ProcessCommonJSModules_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "L!_AoUaV*6f5");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "module$", false);
      JSModule jSModule0 = processCommonJSModules0.getModule();
      assertNull(jSModule0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "module$module.exports", false);
      Node node0 = compiler0.parseTestCode("module.exports");
      processCommonJSModules0.process(node0, node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "./", false);
      SyntheticAst syntheticAst0 = new SyntheticAst("./");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      // Undeclared exception!
      try { 
        processCommonJSModules0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = ProcessCommonJSModules.toModuleName("./", "./");
      assertEquals("module$", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ProcessCommonJSModules.toModuleName(".js$", "module$vNX`UC$AiCYF<gOo");
      assertEquals("module$.js$", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ProcessCommonJSModules.toModuleName("../eR&Nv<(Ym", "com.google.javascript.jscomp.ShadowVariables$GatherReferenceInfo");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 3: ../eR&Nv<(Ym
         //
         verifyException("com.google.javascript.jscomp.ProcessCommonJSModules", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "./", false);
      Node node0 = compiler0.parseTestCode("require");
      processCommonJSModules0.process(node0, node0);
      processCommonJSModules0.process(node0, node0);
      assertFalse(compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "module$", false);
      Node node0 = compiler0.parseTestCode("");
      Node node1 = Node.newString(37, "./");
      processCommonJSModules0.process(node0, node1);
      assertEquals(0, node0.getChildCount());
      assertFalse(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "./", false);
      Node node0 = compiler0.parseTestCode("require");
      Node node1 = compiler0.parseTestCode("{$kk5p l$X\"LnQeo");
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
         // {$kk5p l$X\"LnQeo
         //   Parent: NULL
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "./", true);
      Node node0 = compiler0.parseTestCode("kequir");
      processCommonJSModules0.process(node0, node0);
      assertFalse(node0.isBreak());
  }
}
