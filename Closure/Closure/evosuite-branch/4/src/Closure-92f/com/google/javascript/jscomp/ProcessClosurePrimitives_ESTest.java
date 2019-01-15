/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 10:21:10 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      Compiler compiler0 = new Compiler();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseSyntheticCode("goog.base", "goog.base");
      processClosurePrimitives0.process(node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      Compiler compiler0 = new Compiler();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.CrossModuleMethodMotion", "com.google.javascript.jscomp.CrossModuleMethodMotion");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = new Node(208);
      Node node1 = new Node(37, node0, node0, node0, node0, (-1), 26);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node1);
      assertTrue(node1.hasChildren());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = new Node(105);
      Node node1 = new Node((-3), node0, node0);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals(41, Node.SIDE_EFFECT_FLAGS);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = new Node(86);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals(20, Node.FINALLY_PROP);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(30, 30, 30);
      processClosurePrimitives0.process(node0, node0);
      assertEquals(0, Node.BOTH);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = new Node(30, 30, 30);
      Node node1 = Node.newNumber((double) (-1), 4, 29);
      node0.addChildrenToBack(node1);
      processClosurePrimitives0.process(node1, node0);
      assertFalse(node1.hasChildren());
  }
}
