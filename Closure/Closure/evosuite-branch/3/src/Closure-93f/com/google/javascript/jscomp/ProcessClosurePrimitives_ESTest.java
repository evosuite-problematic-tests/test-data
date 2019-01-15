/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 10:43:11 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      Node node0 = compiler0.parseSyntheticCode("9mxD", "goog.base");
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      processClosurePrimitives0.process(node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      SyntheticAst syntheticAst0 = new SyntheticAst("com.google.javascript.jscomp.Denormalize");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      processClosurePrimitives0.process(node0, node0);
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction");
      Node node1 = new Node(30, node0, node0);
      processClosurePrimitives0.process(node1, node1);
      assertTrue(node1.hasChildren());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = compiler0.parseSyntheticCode("ENUM_INIT_KEYS", "ENUM_INIT_KEYS");
      Node node1 = new Node(37, node0, node0, node0);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertEquals(4, Node.FLAG_ARGUMENTS_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ClosureR4vers=AbstractInterpreter$TypeRestriction");
      processClosurePrimitives0.process(node0, node0);
      assertTrue(node0.hasOneChild());
      assertEquals(1, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("O[gR*", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      Node node1 = new Node(33, node0, node0, 8, 40);
      Node node2 = new Node(37, node1, node1, node1);
      processClosurePrimitives0.visit(nodeTraversal0, node2, node1);
      assertFalse(node1.isOptionalArg());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = Node.newString("cgm.google", (-1805), 960);
      Node node1 = new Node(86, node0, node0);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node1);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction");
      Node node1 = new Node(30, node0, node0);
      processClosurePrimitives0.process(node1, node1);
      assertFalse(node1.isQualifiedName());
  }
}