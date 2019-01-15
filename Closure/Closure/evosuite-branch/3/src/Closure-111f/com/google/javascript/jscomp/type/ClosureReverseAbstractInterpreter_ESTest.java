/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:24:54 GMT 2019
 */

package com.google.javascript.jscomp.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureReverseAbstractInterpreter_ESTest extends ClosureReverseAbstractInterpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention(jqueryCodingConvention0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(closureCodingConvention0, jSTypeRegistry0);
      Node node0 = Node.newString("Q_/9z(Ju:IOdR6@", 2, 2);
      FlowScope flowScope0 = closureReverseAbstractInterpreter0.firstPreciserScopeKnowingConditionOutcome(node0, (FlowScope) null, true);
      assertNull(flowScope0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention(jqueryCodingConvention0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, jSTypeRegistry0);
      Node node0 = Node.newString("Object#Key", (-3133), 482);
      Node node1 = new Node(37, node0, 57, 29);
      FlowScope flowScope0 = mock(FlowScope.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(flowScope0).toString();
      FlowScope flowScope1 = closureReverseAbstractInterpreter0.nextPreciserScopeKnowingConditionOutcome(node0, flowScope0, true);
      FlowScope flowScope2 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node1, flowScope1, true);
      assertSame(flowScope2, flowScope1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, jSTypeRegistry0);
      Node node0 = Node.newString("Object#Key");
      Node node1 = new Node(37, node0, node0, node0, node0);
      node1.addChildAfter(node1, node0);
      FlowScope flowScope0 = mock(FlowScope.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(flowScope0).toString();
      FlowScope flowScope1 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node1, flowScope0, false);
      assertSame(flowScope1, flowScope0);
  }
}
