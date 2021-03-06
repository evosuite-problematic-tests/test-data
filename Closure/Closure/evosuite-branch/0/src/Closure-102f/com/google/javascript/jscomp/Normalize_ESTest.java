/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 06:27:24 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Normalize_ESTest extends Normalize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.PropogateConstantAnnotations normalize_PropogateConstantAnnotations0 = new Normalize.PropogateConstantAnnotations(compiler0, true);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      // Undeclared exception!
      try { 
        normalize_PropogateConstantAnnotations0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize normalize0 = new Normalize(compiler0, true);
      Node node0 = Node.newString(0, "");
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      Compiler compiler0 = new Compiler();
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[1];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Node node1 = new Node(126, node0, 33, 0);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, true);
      Compiler compiler0 = new Compiler();
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[1];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Node node1 = new Node(126, node0, 33, 0);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.PropogateConstantAnnotations normalize_PropogateConstantAnnotations0 = new Normalize.PropogateConstantAnnotations(compiler0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_PropogateConstantAnnotations0);
      Node node0 = Node.newString(2455, "");
      normalize_PropogateConstantAnnotations0.visit(nodeTraversal0, node0, node0);
      assertEquals(11, Node.USES_PROP);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0);
      Node node0 = Node.newString(38, "");
      Normalize.PropogateConstantAnnotations normalize_PropogateConstantAnnotations0 = new Normalize.PropogateConstantAnnotations(compiler0, false);
      normalize_PropogateConstantAnnotations0.visit(nodeTraversal0, node0, node0);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0);
      Node node0 = Node.newString(38, "com.google.javascript.jscomp.SourceFile$Preloaded");
      Normalize.PropogateConstantAnnotations normalize_PropogateConstantAnnotations0 = new Normalize.PropogateConstantAnnotations(compiler0, false);
      // Undeclared exception!
      try { 
        normalize_PropogateConstantAnnotations0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Normalize$PropogateConstantAnnotations", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      Node node0 = new Node(0, 1060, (-1));
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
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("7p{!yvfg7'9PyANw$H");
      Node node1 = new Node(1293, node0, node0, node0);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, true);
      // Undeclared exception!
      try { 
        normalize_VerifyConstants0.process(node1, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      SyntheticAst syntheticAst0 = new SyntheticAst("ob:@n3'O");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize0);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants((AbstractCompiler) null, false);
      normalize_VerifyConstants0.visit(nodeTraversal0, node0, node0);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0);
      Node node0 = Node.newString(38, "com.google.javascript.jscomp.SourceFile$Preloaded");
      normalize_VerifyConstants0.visit(nodeTraversal0, node0, node0);
      normalize_VerifyConstants0.visit(nodeTraversal0, node0, node0);
      assertEquals(26, Node.DIRECTCALL_PROP);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0);
      Node node0 = Node.newString(38, "");
      normalize_VerifyConstants0.visit(nodeTraversal0, node0, node0);
      assertEquals(36, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0);
      Node node0 = Node.newString(38, "W/G;Z^");
      // Undeclared exception!
      try { 
        normalize_VerifyConstants0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The name W/G;Z^ is not annotated as constant.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0);
      Node node0 = Node.newString(38, "com.google.javascript.jscomp.SourceFile$Preloaded");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      nodeTraversal0.traverseInnerNode(node0, node0, scope0);
      assertFalse(node0.isSyntheticBlock());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize normalize0 = new Normalize(compiler0, true);
      Node node0 = new Node(113, 113, 113);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("TightenTypes pass appears to be stuck in an infinite loop.");
      Node node1 = new Node(126, node0, 33, 0);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      Node node0 = new Node(126);
      Node node1 = new Node(126, node0, 33, 0);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      SyntheticAst syntheticAst0 = new SyntheticAst("ob:@n3'O");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      node0.addChildToBack(node0);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("TightenTypes pass appears to be stuck in an infinite loop.");
      Node node1 = new Node(105, node0, 33, 0);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      Compiler compiler0 = new Compiler();
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[1];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Node node1 = new Node(105, node0, 33, 0);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }
}
