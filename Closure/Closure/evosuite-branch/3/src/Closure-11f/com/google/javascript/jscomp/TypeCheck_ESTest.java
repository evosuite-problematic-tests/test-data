/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 07:42:51 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeCheck_ESTest extends TypeCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      typeCheck0.reportMissingProperties(true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, jSTypeRegistry0);
      TypeCheck typeCheck0 = null;
      try {
        typeCheck0 = new TypeCheck((AbstractCompiler) null, semanticReverseAbstractInterpreter0, jSTypeRegistry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      Node node0 = Node.newNumber(0.0);
      typeCheck0.visit(nodeTraversal0, node0, node0);
      boolean boolean0 = typeCheck0.visitName(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      Node node0 = Node.newNumber(0.0);
      Node node1 = new Node(40, node0, node0, 45, 30);
      typeCheck0.processForTesting(node0, node0);
      // Undeclared exception!
      try { 
        typeCheck0.process(node1, node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      Node node0 = Node.newNumber(0.0);
      Node node1 = new Node(40, node0, node0, 45, 30);
      typeCheck0.processForTesting(node0, node0);
      typeCheck0.process((Node) null, node0);
      assertEquals(53, Node.INPUT_ID);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      Node node0 = Node.newNumber(0.0);
      Node node1 = new Node(40, node0, node0, 45, 30);
      typeCheck0.processForTesting(node0, node0);
      // Undeclared exception!
      try { 
        typeCheck0.processForTesting(node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      Node node0 = Node.newNumber(0.0);
      // Undeclared exception!
      try { 
        typeCheck0.processForTesting(node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      Node node0 = Node.newNumber(0.0);
      Node node1 = new Node(40, node0, node0, 45, 30);
      typeCheck0.visit(nodeTraversal0, node1, node1);
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) arrayList0);
      typeCheck0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.isString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      Node node0 = Node.newNumber(0.0);
      node0.setType((-46));
      // Undeclared exception!
      try { 
        typeCheck0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -46
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      Node node0 = Node.newNumber(0.0);
      // Undeclared exception!
      try { 
        typeCheck0.visitName(nodeTraversal0, node0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NUMBER 0.0 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) arrayList0);
      boolean boolean0 = typeCheck0.visitName(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      Node node0 = Node.newNumber(0.0);
      typeCheck0.visit(nodeTraversal0, node0, node0);
      double double0 = typeCheck0.getTypedPercent();
      assertEquals(100.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.initOptions(compilerOptions0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, jSTypeRegistry0, compilerOptions0.checkGlobalNamesLevel, compilerOptions0.checkGlobalNamesLevel);
      double double0 = typeCheck0.getTypedPercent();
      assertEquals(0.0, double0, 0.01);
  }
}
