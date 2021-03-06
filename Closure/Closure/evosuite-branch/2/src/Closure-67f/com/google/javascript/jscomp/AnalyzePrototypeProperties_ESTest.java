/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 14:12:24 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AnalyzePrototypeProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import java.util.Collection;
import java.util.Deque;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnalyzePrototypeProperties_ESTest extends AnalyzePrototypeProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSModule jSModule0 = new JSModule((String) null);
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty((Node) null, (Node) null, (Node) null, (Node) null, jSModule0);
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_LiteralProperty0.getPrototype();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$LiteralProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty((Node) null, (Node) null, (Node) null, (Node) null, (JSModule) null);
      Node node0 = analyzePrototypeProperties_LiteralProperty0.getValue();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = new Node(634);
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, (JSModule) null);
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_LiteralProperty0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = new Node(4043);
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, (JSModule) null);
      JSModule jSModule0 = analyzePrototypeProperties_LiteralProperty0.getModule();
      assertNull(jSModule0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSModule jSModule0 = new JSModule("");
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty((Node) null, jSModule0);
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_AssignmentProperty0.getPrototype();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty((Node) null, (JSModule) null);
      JSModule jSModule0 = analyzePrototypeProperties_AssignmentProperty0.getModule();
      assertNull(jSModule0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty((Node) null, (JSModule) null);
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_AssignmentProperty0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSModule jSModule0 = new JSModule("%7QkDMw&");
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty((Node) null, jSModule0);
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_AssignmentProperty0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "2<W_&#", "2<W_&#");
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
      analyzePrototypeProperties0.process(node0, node0);
      assertFalse(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo((String) null);
      Deque<AnalyzePrototypeProperties.Symbol> deque0 = analyzePrototypeProperties_NameInfo0.getDeclarations();
      assertEquals(0, deque0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("");
      String string0 = analyzePrototypeProperties_NameInfo0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("");
      boolean boolean0 = analyzePrototypeProperties_NameInfo0.readsClosureVariables();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties((AbstractCompiler) null, (JSModuleGraph) null, false, false);
      Collection<AnalyzePrototypeProperties.NameInfo> collection0 = analyzePrototypeProperties0.getAllNameInfo();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Stack<JSModule> stack0 = new Stack<JSModule>();
      JSModule jSModule0 = new JSModule("e##9V(M. ';o{IBe");
      stack0.add(jSModule0);
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(stack0);
      Compiler compiler0 = new Compiler();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, true, true);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo((String) null);
      boolean boolean0 = analyzePrototypeProperties_NameInfo0.markReference(jSModule0);
      assertTrue(boolean0);
      
      boolean boolean1 = analyzePrototypeProperties_NameInfo0.markReference(jSModule0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.AnalyzePrototypeProperties$ProcessExternProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties$ProcessExternProperties");
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
      analyzePrototypeProperties0.process(node0, node0);
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "comgoogle.avascript.jscomp.AalyzePrototypeProperties$ProcessExternProperties", "comgoogle.avascript.jscomp.AalyzePrototypeProperties$ProcessExternProperties");
      JSModule jSModule0 = new JSModule("comgoogle.avascript.jscomp.AalyzePrototypeProperties$ProcessExternProperties");
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
      AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = null;
      try {
        analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, jSModule0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
