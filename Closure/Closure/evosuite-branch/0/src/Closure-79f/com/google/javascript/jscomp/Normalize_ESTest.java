/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 05:37:39 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Normalize_ESTest extends Normalize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "L", "L");
      Node node1 = new Node(0, node0);
      Normalize normalize0 = new Normalize(compiler0, true);
      normalize0.process(node0, node0);
      normalize0.process(node0, node0);
      assertEquals(0, Node.NON_SPECIALCALL);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeSyntheticCode(compiler0, "X[WR_ZIl_*SSXc'", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(105);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.Normalize$NormalizeStatements", "");
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      // Undeclared exception!
      try { 
        normalize_VerifyConstants0.process(node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "L", "L");
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, true);
      Node node1 = new Node(0, node0);
      normalize_VerifyConstants0.process(node0, node0);
      assertEquals(21, Node.LOCALCOUNT_PROP);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.Normalize$NormalizeStatements", "com.google.javascript.jscomp.Normalize$NormalizeStatements");
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      Node node1 = new Node((-2), node0);
      normalize_VerifyConstants0.process(node0, node0);
      assertEquals(47, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(126, "(L", 126, 126);
      Node node1 = new Node(0, node0);
      node0.addChildToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(126, "L");
      Node node1 = new Node(0, node0);
      node0.addChildToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, true);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Normalize constraints violated:
         // LABEL normalization
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0, syntacticScopeCreator0);
      Node node0 = new Node(105);
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements(compiler0, false);
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(113, 3429, 3429);
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements(compiler0, true);
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.Normalize$NormalizeStatements", "com.google.javascript.jscomp.Normalize$NormalizeStatements");
      assertEquals(13, Node.CASES_PROP);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements(compiler0, false);
      Node node0 = Node.newString("1Ex6/8;R2l.uQ0:s5O", (-20), (-20));
      normalize_NormalizeStatements0.visit((NodeTraversal) null, node0, node0);
      assertEquals(4, Node.ENUM_PROP);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0, syntacticScopeCreator0);
      Node node0 = new Node(105);
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements(compiler0, false);
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(126, "L");
      node0.addChildToFront(node0);
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}