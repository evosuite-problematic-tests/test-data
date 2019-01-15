/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 09:46:04 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newNumber((-375.13594), 132, 14);
      // Undeclared exception!
      try { 
        codeGenerator0.addExpr(node0, 55);
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
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addList((Node) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = new Node(51, 51, 51);
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      codeGenerator0.addList((Node) null, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Charset charset0 = Charset.forName("default");
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newNumber((double) 3540L);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
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
  public void test07()  throws Throwable  {
      Node node0 = Node.newNumber((-375.13594), 132, 132);
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
  public void test08()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newNumber(0.0);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.STATEMENT;
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
  public void test09()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newNumber((-1688.8));
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
  public void test11()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = new Node(5049, 5049, 5049);
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
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("36<!--->ZIU.?#", charsetEncoder0);
      assertEquals("\"36<\\!---\\>ZIU.?#\"", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("\"&9zSg9", charsetEncoder0);
      assertEquals("'\"&9zSg9'", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("'JScom.google.javascript.jscomp.StatementFusionv&15DQCu*r'", charsetEncoder0);
      assertEquals("\"'JScom.google.javascript.jscomp.StatementFusionv&15DQCu*r'\"", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = CodeGenerator.strEscape("\">", 'j', "\">", "com.google.javascript.jscomp.LineNumberCheck", "\">", (CharsetEncoder) null);
      assertEquals("j\">>j", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape(";`SLJ->CcU.?f");
      assertEquals("/;`SLJ->CcU.?f/", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("Kbz]>!truH_", ' ', "Kbz]>!truH_", "Kbz]>!truH_", ";AE:fHtQvM(!jt7", charsetEncoder0);
      assertEquals(" Kbz]>!truH_ ", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("sbbgd*</scripttu:", '`', "sbbgd*</scripttu:", "4oL87<z~:ql#", "sbbgd*</scripttu:", charsetEncoder0);
      assertEquals("`sbbgd*<\\/scripttu:`", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("+y_-?^0%}.@D<r");
      assertEquals("\"+y_-?^0%}.@D<r\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("{\t\n\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000\u00A0\u180E\u202F{");
      assertEquals("/{\\t\\n\\u000b\\u000c\\r \\u0085\\u1680\\u2028\\u2029\\u205f\\u3000\\u00a0\\u180e\\u202f{/", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("\n\u0013function_info.proto\u0012\u0006jscomp\"\u00BF\u0002\n\u0016FunctionInformationMap\u00123\n\u0005entry\u0018\u0001 \u0003(\n2$.jscomp.FunctionInformationMap.Entry\u00125\n\u0006module\u0018e \u0003(\n2%.jscomp.FunctionInformationMap.Module\u001A\u0087\u0001\n\u0005Entry\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000Bsource_name\u0018\u0003 \u0002(\t\u0012\u0013\n\u000Bline_number\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000Bmodule_name\u0018\u0005 \u0002(\t\u0012\f\n\u0004size\u0018\u0006 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0007 \u0002(\t\u0012\u0017\n\u000Fcompiled_source\u0018\b \u0002(\t\u001A/\n\u0006Module\u0012\f\n\u0004name\u0018f \u0002(\t\u0012\u0017\n\u000Fcompiled_source\u0018g \u0002(\tB \n\u001Ccom.google.javascript.jscompP\u0001");
      assertEquals("\\u000a\\u0013function_info.proto\\u0012\\u0006jscomp\"\\u00bf\\u0002\\u000a\\u0016FunctionInformationMap\\u00123\\u000a\\u0005entry\\u0018\\u0001 \\u0003(\\u000a2$.jscomp.FunctionInformationMap.Entry\\u00125\\u000a\\u0006module\\u0018e \\u0003(\\u000a2%.jscomp.FunctionInformationMap.Module\\u001a\\u0087\\u0001\\u000a\\u0005Entry\\u0012\\u000a\\u000a\\u0002id\\u0018\\u0002 \\u0002(\\u0005\\u0012\\u0013\\u000a\\u000bsource_name\\u0018\\u0003 \\u0002(\\u0009\\u0012\\u0013\\u000a\\u000bline_number\\u0018\\u0004 \\u0002(\\u0005\\u0012\\u0013\\u000a\\u000bmodule_name\\u0018\\u0005 \\u0002(\\u0009\\u0012\\u000c\\u000a\\u0004size\\u0018\\u0006 \\u0002(\\u0005\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0007 \\u0002(\\u0009\\u0012\\u0017\\u000a\\u000fcompiled_source\\u0018\\u0008 \\u0002(\\u0009\\u001a/\\u000a\\u0006Module\\u0012\\u000c\\u000a\\u0004name\\u0018f \\u0002(\\u0009\\u0012\\u0017\\u000a\\u000fcompiled_source\\u0018g \\u0002(\\u0009B \\u000a\\u001ccom.google.javascript.jscompP\\u0001", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("XU9WjA#?o[c<!--");
      assertEquals("XU9WjA#?o[c<!--", string0);
  }
}
