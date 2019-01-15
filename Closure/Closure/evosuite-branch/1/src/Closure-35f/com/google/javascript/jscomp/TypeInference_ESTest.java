/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 07:55:55 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.FlowScope;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypeInference;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeInference_ESTest extends TypeInference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("PO[P|g#+6WzO*M", (String) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(closureCodingConvention0, jSTypeRegistry0);
      ObjectType objectType0 = jSTypeRegistry0.createObjectType((ObjectType) null);
      Scope scope0 = new Scope(node0, objectType0);
      HashMap<String, CodingConvention.AssertionFunctionSpec> hashMap0 = new HashMap<String, CodingConvention.AssertionFunctionSpec>();
      TypeInference typeInference0 = new TypeInference(compiler0, controlFlowGraph0, closureReverseAbstractInterpreter0, scope0, hashMap0);
      FlowScope flowScope0 = typeInference0.createInitialEstimateLattice();
      assertNotNull(flowScope0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("PO[P|g#+6WzO*M", (String) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(closureCodingConvention0, jSTypeRegistry0);
      ObjectType objectType0 = jSTypeRegistry0.createObjectType((ObjectType) null);
      Scope scope0 = new Scope(node0, objectType0);
      HashMap<String, CodingConvention.AssertionFunctionSpec> hashMap0 = new HashMap<String, CodingConvention.AssertionFunctionSpec>();
      TypeInference typeInference0 = new TypeInference(compiler0, controlFlowGraph0, closureReverseAbstractInterpreter0, scope0, hashMap0);
      FlowScope flowScope0 = typeInference0.createEntryLattice();
      List<FlowScope> list0 = typeInference0.branchedFlowThrough(node0, flowScope0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.BOTH;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, true);
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.BOTH;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, false);
      assertSame(booleanLiteralSet1, booleanLiteralSet0);
  }
}
