/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 07:18:31 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CleanupPasses;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeCheck_ESTest extends TypeCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: constructor
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, (JSTypeRegistry) null, checkLevel0);
      Node node1 = new Node(4095, node0, node0, 38, 8);
      typeCheck0.processForTesting(node0, node0);
      // Undeclared exception!
      try { 
        typeCheck0.process((Node) null, node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(11, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      typeCheck0.processForTesting((Node) null, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      // Undeclared exception!
      try { 
        nodeTraversal0.traverse(node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, (JSTypeRegistry) null, checkLevel0);
      Node node1 = new Node(4095, node0, node0, 38, 8);
      typeCheck0.processForTesting(node0, node0);
      // Undeclared exception!
      try { 
        typeCheck0.process(node1, node0);
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
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, (JSTypeRegistry) null, checkLevel0);
      Node node1 = new Node(4095, node0, node0, 38, 8);
      typeCheck0.processForTesting(node0, node0);
      // Undeclared exception!
      try { 
        typeCheck0.processForTesting(node1, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Scope scope0 = Scope.createGlobalScope((Node) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, jSTypeRegistry0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, jSTypeRegistry0, scope0, (MemoizedScopeCreator) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.processForTesting((Node) null, node0);
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
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, (JSTypeRegistry) null);
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
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(18, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      typeCheck0.processForTesting((Node) null, node0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(8, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 8
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(11, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      // Undeclared exception!
      try { 
        nodeTraversal0.traverse(node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      Node node1 = new Node(12, node0, node0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node1, node0);
      assertEquals(38, Node.SYNTHETIC_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      Node node1 = new Node(15, node0, node0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node1, node0);
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(17, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Normalize.parseAndNormalizeTestCode(compiler0, "yoQuP$h)JT8^3W-t>f");
      Node node0 = new Node(30, 54, 16);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, (JSTypeRegistry) null);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Hj;Go3G]?[q6`?}:");
      Node node1 = new Node(36, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 36
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "yoQuP$h)JT8^3W-t>f");
      Node node1 = new Node(38, node0, node0, node0);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, (JSTypeRegistry) null, checkLevel0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, jqueryCodingConvention0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, typedScopeCreator0);
      // Undeclared exception!
      try { 
        typeCheck0.visit(nodeTraversal0, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      Node node1 = Node.newNumber((double) 53);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      Node node1 = Node.newString(", 66S");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node1, node0);
      assertEquals(55, Node.INFERRED_FUNCTION);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 06S");
      Node node1 = new Node(42, node0, node0, node0, node0, 32, 0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      Node node1 = new Node(46, node0, node0, node0, 15, 31);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node1, node0);
      assertFalse(node1.isFor());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      Node node1 = Node.newString(49, ", 66S", 38, 2);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node1, node0);
      assertFalse(node1.isArrayLit());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "");
      Node node1 = new Node(52, node0, node0, node0);
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      TypeCheck typeCheck0 = new TypeCheck(compiler0, semanticReverseAbstractInterpreter0, (JSTypeRegistry) null);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode(", 66S");
      Node node0 = new Node(56, 37, 2);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        typeCheck0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 56
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(69, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 69
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(73, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 73
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, (JSTypeRegistry) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[0];
      Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      typeCheck0.visit(nodeTraversal0, node1, node0);
      assertFalse(node1.isStringKey());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      node0.setType(107);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        typeCheck0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 107
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      node0.setType(113);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node0, node0);
      assertEquals(56, Node.CHANGE_TIME);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      node0.setType(124);
      CompilerOptions compilerOptions0 = compiler0.options;
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.isHook());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(" 66");
      node0.setType(130);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node0, node0);
      assertEquals(48, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node0 = new Node(4095, 2, 42);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node0, (Node) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 4095
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(20, node0, node0, node0);
      Scope scope0 = Scope.createGlobalScope((Node) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, jSTypeRegistry0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, jSTypeRegistry0, scope0, (MemoizedScopeCreator) null, checkLevel0);
      typeCheck0.check(node0, true);
      typeCheck0.visit((NodeTraversal) null, node1, node1);
      assertFalse(node1.isNull());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, (JSTypeRegistry) null, checkLevel0);
      Node node1 = new Node(4095, node0, node0, 38, 8);
      typeCheck0.processForTesting(node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0);
      boolean boolean0 = typeCheck0.visitName(nodeTraversal0, node1, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(37, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      typeCheck0.processForTesting((Node) null, node0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      Node node1 = new Node(23, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, (ReverseAbstractInterpreter) null, (JSTypeRegistry) null, checkLevel0);
      typeCheck0.processForTesting((Node) null, node0);
      // Undeclared exception!
      try { 
        typeCheck0.visit((NodeTraversal) null, node1, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(" 66");
      node0.setType(47);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      node0.addSuppression("");
      typeCheck0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(", 66S");
      Node node1 = new Node(43, node0, 2, 8);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      TypeCheck typeCheck0 = cleanupPasses0.makeTypeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      typeCheck0.visit(nodeTraversal0, node1, node0);
      double double0 = typeCheck0.getTypedPercent();
      assertEquals(100.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Normalize.parseAndNormalizeTestCode(compiler0, ", 66S");
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, (JSTypeRegistry) null);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      TypeCheck typeCheck0 = new TypeCheck(compiler0, closureReverseAbstractInterpreter0, (JSTypeRegistry) null, checkLevel0);
      double double0 = typeCheck0.getTypedPercent();
      assertEquals(0.0, double0, 0.01);
  }
}