/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 07:53:58 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodePrinter;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodePrinter_ESTest extends CodePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = Node.newNumber(20.12309185808605);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      Charset charset0 = Charset.defaultCharset();
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputCharset(charset0);
      assertSame(codePrinter_Builder1, codePrinter_Builder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString("4USucouyLkcyF");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputTypes(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("\"4\\u007fUSucouyLkcyF\"", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodePrinter codePrinter0 = new CodePrinter();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = new Node(17);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setLineLengthThreshold(0);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 17
         // GE
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newNumber(20.12309185808605);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      String string0 = codePrinter_Builder0.build();
      assertEquals("20.12309185808605", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(1736);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("com.google.javascript.jscomp.SourceMap$DetailLevel", false);
      node0.setStaticSourceFile(simpleSourceFile0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1736
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = Node.newNumber(727.0514);
      Node node1 = new Node(1736, node0, node0, node0, 4095, 16);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("com.google.javascript.jscomp.SourceMap$DetailLevel", false);
      node1.setStaticSourceFile(simpleSourceFile0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setSourceMapDetailLevel(sourceMap_DetailLevel0);
      // Undeclared exception!
      try { 
        codePrinter_Builder1.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1736
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1736);
      Node node1 = new Node(31, node0, node0, 43, 41);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("]a^`!", true);
      node1.setStaticSourceFile(simpleSourceFile0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      String string0 = codePrinter_Builder0.build();
      assertEquals("delete 1736", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = new Node(4, 54, 15);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setLineLengthThreshold(2);
      codePrinter_Builder0.setPrettyPrint(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("return;\n", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = Node.newNumber(727.0514);
      Node node1 = new Node(1736, node0, node0, node0, node0);
      Node node2 = new Node(29, node1, node1);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node2);
      codePrinter_Builder0.setPrettyPrint(true);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1736
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newNumber((double) 1736);
      Node node1 = new Node(1, 35, 1736);
      Node node2 = new Node(45, node0, node1, 12, 49);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node2);
      codePrinter_Builder0.setPrettyPrint(true);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newNumber((double) 3390);
      Node node1 = new Node(46, 35, 3390);
      Node node2 = new Node(32, node0, node1, 12, 49);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node2);
      codePrinter_Builder0.setPrettyPrint(true);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 46
         // SHNE 35
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newNumber(20.12309185808605);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setLineLengthThreshold(8);
      codePrinter_Builder0.setPreferLineBreakAtEndOfFile(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("20.12309185808605;\n", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-6));
      Node node1 = new Node(49, node0, node0, node0, node0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      codePrinter_Builder0.setLineBreak(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("throw-6;", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = Node.newNumber((double) 28);
      Node node1 = new Node(49, node0, node0, node0, node0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      codePrinter_Builder0.setLineLengthThreshold(2);
      String string0 = codePrinter_Builder0.build();
      assertEquals("throw 28;\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = Node.newNumber(10.0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setPreferLineBreakAtEndOfFile(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("10", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.setSourceMapDetailLevel((SourceMap.DetailLevel) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder((Node) null);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot build without root node being specified
         //
         verifyException("com.google.javascript.jscomp.CodePrinter$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = Node.newNumber(727.0514);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setTagAsStrict(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("'use strict';727.0514", string0);
  }
}
