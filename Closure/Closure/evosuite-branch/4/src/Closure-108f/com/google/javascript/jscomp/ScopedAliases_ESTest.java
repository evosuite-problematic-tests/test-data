/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 10:55:01 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScopedAliases_ESTest extends ScopedAliases_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      Node node0 = Node.newString("tZj=kz)<FM&).R-_E", (-2824), (-2824));
      scopedAliases0.process(node0, node0);
      assertFalse(node0.isGetProp());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      Node node0 = new Node((-2814));
      Node node1 = new Node(37, node0, 36, 0);
      Compiler compiler0 = new Compiler();
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      scopedAliases0.hotSwapScript(node0, node0);
      assertEquals(31, Node.SIDE_EFFECTS_FLAGS_MASK);
  }
}
