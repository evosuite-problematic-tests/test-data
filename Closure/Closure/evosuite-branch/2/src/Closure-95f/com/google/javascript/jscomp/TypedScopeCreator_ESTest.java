/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 15:16:04 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypedScopeCreator_ESTest extends TypedScopeCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("", charset0);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      Node node0 = Node.newString("");
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      Node node1 = new Node(26, node0, node0, node0, node0, 1, 1);
      Scope scope1 = typedScopeCreator0.createScope(node1, scope0);
      assertTrue(scope1.isLocal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      TypedScopeCreator typedScopeCreator0 = null;
      try {
        typedScopeCreator0 = new TypedScopeCreator(compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[1];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      node0.setType(120);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node0, (Scope) null);
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
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("goog.now", charset0);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      CodingConvention codingConvention0 = compiler0.getCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, codingConvention0);
      Node node0 = Node.newString(43, "");
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertFalse(scope0.isLocal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      Node node0 = Node.newNumber(0.0);
      Node node1 = new Node(47, node0, 49, 1);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, (Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypedScopeCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, defaultCodingConvention0);
      Node node0 = new Node(64);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertEquals(33, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("", charset0);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      Node node0 = Node.newString("");
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      node0.setType(105);
      Node node1 = new Node(26, node0, node0, node0, node0, 1, 1);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, scope0);
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
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("goog.now", charset0);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      Node node0 = Node.newString("goog.now");
      SyntheticAst syntheticAst0 = new SyntheticAst((String) null);
      Node node1 = syntheticAst0.getAstRoot(compiler0);
      node0.addChildToFront(node1);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node0, (Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypedScopeCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      Node node0 = new Node(33, 12, 12);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node0, (Scope) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, defaultCodingConvention0);
      Node node0 = new Node(37);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertFalse(scope0.isLocal());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("oog.ano", charset0);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      Node node0 = new Node(129, 129, 129);
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      Node[] nodeArray0 = new Node[0];
      Node node1 = new Node(86, nodeArray0, 44, 28);
      Node node2 = new Node(1, node0, node1, node1, 41, 41);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node2, scope0);
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
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[1];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      Node node1 = new Node(4, node0, node0, node0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }
}
