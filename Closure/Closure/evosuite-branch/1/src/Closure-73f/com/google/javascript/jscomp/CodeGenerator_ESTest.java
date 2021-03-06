/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 09:22:15 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newString("8rh4Rb'6", 63743, 63743);
      // Undeclared exception!
      try { 
        codeGenerator0.addExpr(node0, 24);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("gl?}");
      assertEquals("/\\u007fgl?}/", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException");
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.rhino.JSDocInfo$TypePosition", "com.google.javascript.rhino.JSDocInfo$TypePosition");
      String string0 = compiler0.toSource(node0);
      assertEquals("com.google.javascript.rhino.JSDocInfo$TypePosition", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.tagAsStrict();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("yfGfG'&c6pI1S^5!QX{4&c6pI1S^5!QX{4y");
      assertEquals("\"yfGfG'&c6pI1S^5!QX{4&c6pI1S^5!QX{4y\"", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.addCaseBody((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addList((Node) null, true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("d:K$^l", "d:K$^l");
      String string0 = compiler0.toSource(node0);
      assertEquals("d:K$^l", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("-dgKPI^f", "-dgKPI^f");
      String string0 = compiler0.toSource(node0);
      assertEquals("-dgKPI^f", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("XaC>Ni", "XaC>Ni");
      Node node1 = new Node(6, node0, node0);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+dKI^f", "+dKI^f");
      Node node1 = new Node(10, node0, node0, node0);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+dKI^f", "+dKI^f");
      Node node1 = new Node(11, node0, 1, 32);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:I^f", "+d:I^f");
      Node node1 = new Node(12);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 12
         // EQ
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+dKI^f", "+dKI^f");
      Node node1 = new Node(14, node0, node0, 24, 25);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      node0.setType(16);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 16
         // GT [sourcename: java.lang.String@0000000459]
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = new Node(21);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 21
         // ADD
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:I^f", "+d:I^f");
      Node node1 = new Node(25, node0, node0);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = new Node(31, node0, node0, 7, 35);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = new Node(34, node0, node0, node0, node0, 24, 41);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = new Node(35, node0);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Bad GETELEM: expected 2 children but got 1
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("4", "4");
      String string0 = compiler0.toSource(node0);
      assertEquals("4", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("}", (-1290), (-1290));
      String string0 = compiler0.toSource(node0);
      assertEquals("\"}\"", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = new Node(45, node0, node0, node0, 41, 35);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("/^1><!-->/", "/^1><!-->/");
      String string0 = compiler0.toSource(node0);
      assertEquals("/^1><\\!--\\>/", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("[", "[");
      String string0 = compiler0.toSource(node0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      node0.setType(69);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      node0.setType(97);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 97
         // ASSIGN_MOD [sourcename: java.lang.String@0000000459]
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("}", (-1588), (-1588));
      node0.setType((-1588));
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1588
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = new Node(47, node0, node0, node0, node0, 37, 13);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Expected children to be strings
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      node0.addChildrenToBack(node1);
      String string0 = compiler0.toSource(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("}", (-1290), (-1290));
      Node node1 = new Node(6, node0, node0, node0, 64, 69);
      String string0 = compiler0.toSource(node0);
      assertEquals("\"}\"", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("}", (-1290), (-1290));
      node0.addChildrenToFront(node0);
      // Undeclared exception!
      compiler0.toSource(node0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+d:K$I^f", "+d:K$I^f");
      Node node1 = new Node(31, node0, node0, 7, 35);
      node1.removeChildren();
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("[]");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("%s.call");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("8");
      assertEquals(8.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("n2&", 51, 51);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, true, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = new Node(51, 51, 51);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newString("?", (int) 'D', (int) 'D');
      // Undeclared exception!
      try { 
        codeGenerator0.addArrayList(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("-dgKPI^f", "-dgKPI^f");
      // Undeclared exception!
      try { 
        codeGenerator0.addAllSiblings(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("$\"|08fqQ|<n2&Y#ZMlV", charsetEncoder0);
      assertEquals("'$\"|08fqQ|<n2&Y#ZMlV'", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = CodeGenerator.jsString("'", (CharsetEncoder) null);
      assertEquals("\"'\"", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("\tat ");
      assertEquals("/\\tat /", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("\n", charsetEncoder0);
      assertEquals("\"\\n\"", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape(">QYxb,C", 'L', ">QYxb,C", "S02q%'ST", ">QYxb,C", charsetEncoder0);
      assertEquals("L>QYxb,CL", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("^[> ->");
      assertEquals("/^[> ->/", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("$\"|08fqq|</scriptlv", (CharsetEncoder) null);
      assertEquals("/$\"|08fqq|<\\/scriptlv/", string0);
  }
}
