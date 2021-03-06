/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 10:09:05 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.Set;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = compiler0.parseTestCode("goog.base");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, compilerOptions0.brokenClosureRequiresLevel, false);
      processClosurePrimitives0.process(node0, node0);
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(1, loggerErrorManager0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("e.jqvascrpt");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, (ScopeCreator) null);
      Node node0 = Node.newString("com.googGe", 33, 33);
      Node node1 = new Node(30, node0, node0, node0, node0, 1, 30);
      nodeTraversal0.traverse(node1);
      assertEquals(22, Node.TARGETBLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = Node.newNumber((-0.580185007650429));
      Node node1 = new Node(37, node0, node0, node0, 2, 0);
      processClosurePrimitives0.visit((NodeTraversal) null, node1, node0);
      assertEquals(32, Node.MEMBER_TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.goog,e.javascrpt.jcom.mozilla.rhigo.Interpr=ter");
      CompilerOptions compilerOptions0 = compiler0.getOptions();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, compilerOptions0.brokenClosureRequiresLevel, false);
      processClosurePrimitives0.process(node0, node0);
      assertEquals(17, Node.TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105);
      Node node1 = new Node(0, node0, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals(42, Node.IS_CONSTANT_NAME);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.googe.jvascrpt.jscom.mozilla.rhigo.Interpr=ter", "com.googe.jvascrpt.jscom.mozilla.rhigo.Interpr=ter");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, compilerOptions0.checkUndefinedProperties, false);
      processClosurePrimitives0.process(node0, node0);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("e.jqvascrpt");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, (ScopeCreator) null);
      Node node0 = Node.newString("com.googGe", 33, 33);
      Node node1 = new Node(30, node0, node0, 34, 1524);
      nodeTraversal0.traverse(node1);
      assertEquals(44, Node.IS_VAR_ARGS_PARAM);
  }
}
