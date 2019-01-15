/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:28:49 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.withoutSource();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.parseTestCode("goog.base");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Multiple entries with same key: author=NOT_IMPLEMENTED and author=AUTHOR
         //
         verifyException("com.google.common.collect.ImmutableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newNumber(0.0);
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, preprocessorSymbolTable0, checkLevel0);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.hotSwapScript(node0, node0);
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
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, (PreprocessorSymbolTable) null, checkLevel0);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, (PreprocessorSymbolTable) null, checkLevel0);
      Node node0 = new Node((-4263));
      processClosurePrimitives0.process(node0, node0);
      assertEquals(53, Node.INPUT_ID);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, (PreprocessorSymbolTable) null, compilerOptions0.brokenClosureRequiresLevel);
      Node node0 = new Node(86, 29, 29);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, (PreprocessorSymbolTable) null, compilerOptions0.brokenClosureRequiresLevel);
      Node node0 = new Node(105, 29, 29);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter.withoutSource();
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.DefaultPassConfig$63");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Multiple entries with same key: author=NOT_IMPLEMENTED and author=AUTHOR
         //
         verifyException("com.google.common.collect.ImmutableMap", e);
      }
  }
}
