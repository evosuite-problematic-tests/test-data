/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 06:41:35 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScopedAliases_ESTest extends ScopedAliases_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      Node node0 = Node.newString(3402, "';^T70s0");
      scopedAliases0.hotSwapScript(node0, node0);
      assertFalse(node0.isInstanceOf());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("isBoolean");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      // Undeclared exception!
      try { 
        scopedAliases0.process((Node) null, (Node) null);
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
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("M`2g!f$-o}E,x");
      Node node1 = new Node(37, node0);
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node1);
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, (CompilerOptions.AliasTransformationHandler) null);
      scopedAliases0.hotSwapScript(node0, node1);
      assertEquals(30, Node.VAR_ARGS_NAME);
  }
}
