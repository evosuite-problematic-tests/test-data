/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 14:26:04 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AliasKeywords;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
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
      int int0 = AliasKeywords.estimateMinOccurrencesRequriedToAlias();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newString("7n:MYXmpy(#", 0, 0);
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
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
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
  public void test03()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("*\"U{JBPz`<m");
      assertEquals("\"*\\\"U{JBPz`<m\"", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("com.google.javascript.jscomp.RenamePrototypes$Property", (-962), (-962));
      // Undeclared exception!
      try { 
        codeGenerator0.addCaseBody(node0);
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
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString(0, "A/Wnj.p>MO}P", 0, 0);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for eof (type 0)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("*\"U{JBPz`<m");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("51*L.X\"g4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("vC>}Hz[+!sPj45Ff'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("4");
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newNumber(Double.NaN);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.PRESERVE_BLOCK;
      // Undeclared exception!
      try { 
        codeGenerator0.addLeftExpr(node0, 29, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newNumber(Double.NaN);
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
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
  public void test13()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString(0, "Fc`:K,QyrCu");
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.OTHER;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for eof (type 0)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = new Node((-1577), (-1577), (-1577));
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
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
  public void test17()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("\"JSCompiler_stubMethod\"", charsetEncoder0);
      assertEquals("'\"JSCompiler_stubMethod\"'", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = CodeGenerator.jsString("z'8*kGm", (CharsetEncoder) null);
      assertEquals("\"z'8*kGm\"", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("\u0014uninterpreted_option\u0018\u00E7\u0007 \u0003(\u000B2$.google.protobuf.UninterpretedOption*\t\b\u00E8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"_\n\rMethodOptions\u0012C\n\u0014uninterpreted_option\u0018\u00E7\u0007 \u0003(\u000B2$.google.protobuf.UninterpretedOption\t\b\u00E8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0085\u0002\n\u0013UninterpretedOption\u0012;\n\u0004name\u0018\u0002 \u0003(\u000B2-.google.protobuf6UninterpretedOption.NamePart\u0012\u0018K\u0010identifier_value\u0018\u0003 \u0001(\t\u0012\u001A\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004\u0012\u001A\n\u0012negative_int3value\u0018\u0005 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0007 \u0001(\f\u001A3\n\bNamePart\u0012\u0011\n");
      assertEquals("/\\u0014uninterpreted_option\\u0018\\u00e7\\u0007 \\u0003(\\u000b2$.google.protobuf.UninterpretedOption*\\t\\u0008\\u00e8\\u0007\\u0010\\u0080\\u0080\\u0080\\u0080\\u0002\"_\\n\\rMethodOptions\\u0012C\\n\\u0014uninterpreted_option\\u0018\\u00e7\\u0007 \\u0003(\\u000b2$.google.protobuf.UninterpretedOption\\t\\u0008\\u00e8\\u0007\\u0010\\u0080\\u0080\\u0080\\u0080\\u0002\"\\u0085\\u0002\\n\\u0013UninterpretedOption\\u0012;\\n\\u0004name\\u0018\\u0002 \\u0003(\\u000b2-.google.protobuf6UninterpretedOption.NamePart\\u0012\\u0018K\\u0010identifier_value\\u0018\\u0003 \\u0001(\\t\\u0012\\u001a\\n\\u0012positive_int_value\\u0018\\u0004 \\u0001(\\u0004\\u0012\\u001a\\n\\u0012negative_int3value\\u0018\\u0005 \\u0001(\\u0003\\u0012\\u0014\\n\\u000cdouble_value\\u0018 \\u0001(\\u0001\\u0012\\u0014\\n\\u000cstring_value\\u0018\\u0007 \\u0001(\\u000c\\u001a3\\n\\u0008NamePart\\u0012\\u0011\\n/", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("^.3F$f]>E");
      assertEquals("\"^.3F$f]>E\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("vC>}Hz[+!sPj45Ff'");
      assertEquals("\"vC>\\u007f}Hz[+!sPj45Ff'\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape(">", (CharsetEncoder) null);
      assertEquals("/>/", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape(".3,Af_{<!-->", 'c', "+Zj6dI5SoP;I5V &:aI:+", "?.EmsE3*", (String) null, charsetEncoder0);
      assertEquals("c.3,Af_{<\\!--\\>c", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("HNU'(yN%uqyVe;->", 'v', "HNU'(yN%uqyVe;->", "function", "I2v4 ^_g]rvFU0I", charsetEncoder0);
      assertEquals("vHNUfunction(yN%uqyVe;->v", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = CodeGenerator.strEscape(":2#</scripty*b.", 'g', "$I/c&n", "{|x4", "Ny<W1w+S", (CharsetEncoder) null);
      assertEquals("g:2#<\\/scripty*b.g", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("\u0014uninterpreted_option\u0018\u00E7\u0007 \u0003(\u000B2$.google.protobuf.UninterpretedOption*\t\b\u00E8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"_\n\rMethodOptions\u0012C\n\u0014uninterpreted_option\u0018\u00E7\u0007 \u0003(\u000B2$.google.protobuf.UninterpretedOption*\t\b\u00E8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0085\u0002\n\u0013UninterpretedOption\u0012;\n\u0004name\u0018\u0002 \u0003(\u000B2-.google.protobuf.UninterpretedOption.NamePart\u0012\u0018\n\u0010identifier_value\u0018\u0003 \u0001(\t\u0012\u001A\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004\u0012\u001A\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0006 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0007 \u0001(\f\u001A3\n\bNamePart\u0012\u0011\n");
      assertEquals("\\u0014uninterpreted_option\\u0018\\u00e7\\u0007 \\u0003(\\u000b2$.google.protobuf.UninterpretedOption*\\u0009\\u0008\\u00e8\\u0007\\u0010\\u0080\\u0080\\u0080\\u0080\\u0002\"_\\u000a\\u000dMethodOptions\\u0012C\\u000a\\u0014uninterpreted_option\\u0018\\u00e7\\u0007 \\u0003(\\u000b2$.google.protobuf.UninterpretedOption*\\u0009\\u0008\\u00e8\\u0007\\u0010\\u0080\\u0080\\u0080\\u0080\\u0002\"\\u0085\\u0002\\u000a\\u0013UninterpretedOption\\u0012;\\u000a\\u0004name\\u0018\\u0002 \\u0003(\\u000b2-.google.protobuf.UninterpretedOption.NamePart\\u0012\\u0018\\u000a\\u0010identifier_value\\u0018\\u0003 \\u0001(\\u0009\\u0012\\u001a\\u000a\\u0012positive_int_value\\u0018\\u0004 \\u0001(\\u0004\\u0012\\u001a\\u000a\\u0012negative_int_value\\u0018\\u0005 \\u0001(\\u0003\\u0012\\u0014\\u000a\\u000cdouble_value\\u0018\\u0006 \\u0001(\\u0001\\u0012\\u0014\\u000a\\u000cstring_value\\u0018\\u0007 \\u0001(\\u000c\\u001a3\\u000a\\u0008NamePart\\u0012\\u0011\\u000a", string0);
  }
}
