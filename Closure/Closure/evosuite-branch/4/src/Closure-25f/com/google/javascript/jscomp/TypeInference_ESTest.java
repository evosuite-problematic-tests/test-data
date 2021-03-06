/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 05:49:00 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypeInference;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeInference_ESTest extends TypeInference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.TRUE;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, false);
      assertSame(booleanLiteralSet1, booleanLiteralSet0);
      
      System.setCurrentTimeMillis((-1L));
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      boolean boolean0 = true;
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, boolean0, boolean0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      boolean boolean1 = false;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, boolean1);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, jSTypeRegistry0);
      Scope scope0 = new Scope(node0, compiler0);
      HashMap<String, CodingConvention.AssertionFunctionSpec> hashMap0 = new HashMap<String, CodingConvention.AssertionFunctionSpec>();
      TypeInference typeInference0 = new TypeInference(compiler0, controlFlowGraph0, closureReverseAbstractInterpreter0, scope0, hashMap0);
      FlowScope flowScope0 = typeInference0.createInitialEstimateLattice();
      typeInference0.branchedFlowThrough(node0, flowScope0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, CodingConvention.AssertionFunctionSpec> hashMap0 = new HashMap<String, CodingConvention.AssertionFunctionSpec>();
      Compiler compiler0 = new Compiler();
      TypeInference typeInference0 = null;
      try {
        typeInference0 = new TypeInference(compiler0, (ControlFlowGraph<Node>) null, (ReverseAbstractInterpreter) null, (Scope) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.DataFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.TRUE;
      BooleanLiteralSet booleanLiteralSet1 = BooleanLiteralSet.BOTH;
      BooleanLiteralSet booleanLiteralSet2 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet1, true);
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet2);
  }
}
