/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 15:08:19 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FindExportableNodes;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckGlobalThis_ESTest extends CheckGlobalThis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0, memoizedScopeCreator0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0, memoizedScopeCreator0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      Node node1 = compiler0.parseTestCode("dangerous use of the global 'this' object");
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0, memoizedScopeCreator0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      Node node1 = compiler0.parseTestCode("ikkT,t");
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0, memoizedScopeCreator0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      Node node1 = Node.newNumber((double) 31);
      node1.setType(38);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0, memoizedScopeCreator0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(40, node0, node0, node0, 11, 4);
      // Undeclared exception!
      try { 
        checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0, memoizedScopeCreator0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      Node node1 = Node.newNumber(0.0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((MessageFormatter) null, (Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = new Node((-3131), 2268, (-2517));
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals(43, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      Node node0 = Node.newString(86, "pne(_0Q}NX_n!4L<", 86, 86);
      Node node1 = new Node(86, node0, node0, node0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node1, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      Node node0 = Node.newString(86, "pne(_0Q}NX_n!4L<", 42, 2441);
      Node node1 = new Node(86, node0, node0, node0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      boolean boolean1 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      Node node0 = new Node(42);
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      Node node0 = Node.newString(86, "pne(_0Q}NX_n!4L<", 42, 86);
      Node node1 = new Node(86, node0, node0, node0);
      checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      checkGlobalThis0.visit(nodeTraversal0, node0, node1);
      assertEquals(27, Node.SPECIALCALL_PROP);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      Node node0 = new Node(42);
      checkGlobalThis0.visit(nodeTraversal0, node0, (Node) null);
      assertEquals(26, Node.DIRECTCALL_PROP);
  }
}