/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 10:09:02 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.VarCheck;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VarCheck_ESTest extends VarCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      VarCheck varCheck0 = null;
      try {
        varCheck0 = new VarCheck(compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[0];
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      Node node0 = Node.newNumber(938.8782569735789, (-5), (-5));
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, varCheck0, (ScopeCreator) null);
      Node node1 = Node.newString(38, "");
      // Undeclared exception!
      try { 
        varCheck0.visit(nodeTraversal0, node1, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[0];
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      VarCheck varCheck0 = new VarCheck(compiler0, true);
      // Undeclared exception!
      try { 
        varCheck0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[0];
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      Node node0 = compiler0.parseInputs();
      Node node1 = Node.newString(38, "// Input %num%");
      Node node2 = new Node(41, node1, node0);
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      varCheck0.process(node0, node1);
      varCheck0.process(node0, node0);
      assertEquals(2, compiler0.getErrorCount());
      assertTrue(compiler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[0];
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      Node node0 = compiler0.parseInputs();
      Node node1 = Node.newString(38, "// Input %num%");
      Node node2 = new Node(41, node1, node0);
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      varCheck0.process(node0, node1);
      varCheck0.process(node0, node1);
      assertEquals(2, compiler0.getErrorCount());
      assertTrue(compiler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[0];
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      Node node0 = compiler0.parseInputs();
      Node node1 = Node.newString(38, "// Input %num%");
      Node node2 = new Node(41, node1, node0);
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      varCheck0.process(node0, node1);
      compiler0.init(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      varCheck0.process(node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(2, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[0];
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      Node node0 = compiler0.parseInputs();
      Node node1 = Node.newString(38, "// Input %num%");
      Node node2 = new Node(41, node1, node0);
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      // Undeclared exception!
      try { 
        varCheck0.process(node2, node0);
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
}