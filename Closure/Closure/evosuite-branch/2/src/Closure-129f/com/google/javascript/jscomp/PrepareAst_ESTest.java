/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 16:29:44 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PrepareAst;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrepareAst_ESTest extends PrepareAst_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, false);
      Node node0 = new Node(119);
      prepareAst0.process(node0, node0);
      assertFalse(node0.isThrow());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.PrepareAst$PreareAnotations");
      // Undeclared exception!
      try { 
        compiler0.ensureLibraryInjected("com.google.javascript.jscomp.PrepareAst$PreareAnotations");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, false);
      prepareAst0.process((Node) null, (Node) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.PrepareAst$PrepareAnnotations");
      prepareAst0.process(node0, node0);
      assertFalse(node0.isDec());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = new Node(126);
      prepareAst0.process(node0, node0);
      assertFalse(node0.isWith());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = new Node(110);
      prepareAst0.process(node0, node0);
      assertEquals(8, Node.FLAG_NO_THROWS);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = new Node(119);
      prepareAst0.process(node0, node0);
      assertFalse(node0.isAnd());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.PrepareAst$PrepareAnnotations");
      Node node1 = new Node(119);
      node1.addChildrenToBack(node0);
      node1.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        prepareAst0.process(node1, node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // normalizeNodeType constraints violated
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.PrepareAst$PrepareAnnotations");
      Node node1 = new Node(37);
      PrepareAst.PrepareAnnotations prepareAst_PrepareAnnotations0 = new PrepareAst.PrepareAnnotations();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, prepareAst_PrepareAnnotations0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        prepareAst_PrepareAnnotations0.visit(nodeTraversal0, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PrepareAst$PrepareAnnotations", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst.PrepareAnnotations prepareAst_PrepareAnnotations0 = new PrepareAst.PrepareAnnotations();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, prepareAst_PrepareAnnotations0);
      Node node0 = new Node(105);
      prepareAst_PrepareAnnotations0.visit(nodeTraversal0, node0, node0);
      assertEquals(40, Node.ORIGINALNAME_PROP);
  }
}
