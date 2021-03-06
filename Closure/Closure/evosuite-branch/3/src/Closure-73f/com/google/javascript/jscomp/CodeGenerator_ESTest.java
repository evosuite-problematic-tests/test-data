/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 09:56:45 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      String string0 = compiler0.toSource(node0);
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      // Undeclared exception!
      try { 
        codeGenerator0.addArrayList(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for lp (type 83)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("!--l* t");
      String string0 = compiler0.toSource(node0);
      assertEquals("!--l*t", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("\n\u0013functiou_info.proto\u0012\u0006jscomp\"\u00BF\u0002\n\u0016FunctionInformationMap\u00123\n\u0005entry8\u0001 \u0003(\n2$.jscomp.FunctionInformationMap.Entry\u00125\n\u0006module\u0018e \u0003(\n2%.jscomp.Funct\"onInformationMap.Module\u001A\u0087\u0001\n\u0005Entry\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000Bsource_name;\u0003 \u0002(\t\u0012\u0013\n\u000Bline_number\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000Bmodule_name\u0018\u0005 \u0002(z\u0012\f\n\u0004size\u0018\u0006 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0007 \u0002(\t\u0012\u0017\n\u000Fcompiled_source}\b \u0002(\t\u001A/\n\u0006ModVle\u0012\f\n\u0004name\u0018f \u0002(\t\u0012\u0017\n\u000Fcompiled_source\u0018g \u0002(\tB \n\u001Ccom.googBe.javascript.jscompP\u0001");
      assertEquals("\"\\n\\u0013functiou_info.proto\\u0012\\u0006jscomp\\\"\\u00bf\\u0002\\n\\u0016FunctionInformationMap\\u00123\\n\\u0005entry8\\u0001 \\u0003(\\n2$.jscomp.FunctionInformationMap.Entry\\u00125\\n\\u0006module\\u0018e \\u0003(\\n2%.jscomp.Funct\\\"onInformationMap.Module\\u001a\\u0087\\u0001\\n\\u0005Entry\\u0012\\n\\n\\u0002id\\u0018\\u0002 \\u0002(\\u0005\\u0012\\u0013\\n\\u000bsource_name;\\u0003 \\u0002(\\t\\u0012\\u0013\\n\\u000bline_number\\u0018\\u0004 \\u0002(\\u0005\\u0012\\u0013\\n\\u000bmodule_name\\u0018\\u0005 \\u0002(z\\u0012\\u000c\\n\\u0004size\\u0018\\u0006 \\u0002(\\u0005\\u0012\\u000c\\n\\u0004name\\u0018\\u0007 \\u0002(\\t\\u0012\\u0017\\n\\u000fcompiled_source}\\u0008 \\u0002(\\t\\u001a/\\n\\u0006ModVle\\u0012\\u000c\\n\\u0004name\\u0018f \\u0002(\\t\\u0012\\u0017\\n\\u000fcompiled_source\\u0018g \\u0002(\\tB \\n\\u001ccom.googBe.javascript.jscompP\\u0001\"", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("\"_~S}sOKA_ayIMOb#-@", 0, (-2426));
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
  public void test06()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newNumber((-4744.8072679), 3073, 2110);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false);
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
      Charset charset0 = Charset.forName("default");
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newNumber((-1.0), 1601076620, 112);
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
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("!-rl* t");
      String string0 = compiler0.toSource(node0);
      assertEquals("!-rl*t", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("]");
      String string0 = compiler0.toSource(node0);
      assertEquals("\"]\"", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("]");
      String string0 = compiler0.toSource(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("\n\u0013function_info.proto\u0012\u0006jscomp\"\u00BF\u0002\n\u0016FunctionInformationMap\u00123\n\u0005entry\u0018\u0001 \u0003(\n2$.jscomp.FunctionInformationMap.Entry\u00125\n\u0006module\u0018e \u0003(\n2%.jscomp.FunctionInformationMap.Module\u001A\u0087\u0001\n\u0005Entry\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000Bsource_name\u0018\u0003 \u0002(\t\u0012\u0013\n\u000Bline_number\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000Bmodule_name\u0018\u0005 \u0002(\t\u0012\f\n\u0004size\u0018\u0006 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0007 \u0002(\t\u0012\u0017\n\u000Fcompiled_source\u0018\b \u0002(\t\u001A/\n\u0006Module\u0012\f\n\u0004name\u0018f \u0002(\t\u0012\u0017\n\u000Fcompiled_source\u0018g \u0002(\tB \n\u001Ccom.google.javascript.jscompP\u0001");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("6PT3QuR-s~@zOHbX4");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("3");
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = new Node(16);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.STATEMENT;
      // Undeclared exception!
      try { 
        codeGenerator0.addLeftExpr(node0, 54, codeGenerator_Context0);
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
      Node node0 = Node.newString("", 2110, 2110);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
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
  public void test18()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("\"ie9;U\"", charsetEncoder0);
      assertEquals("'\"ie9;U\"'", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("!R=,~6B@:4['c", charsetEncoder0);
      assertEquals("\"!R=,~6B@:4['c\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("E+cK^c<jEF8L[8?|x^k", 'o', "E+cK^c<jEF8L[8?|x^k", "E+cK^c<jEF8L[8?|x^k", "E+cK^c<jEF8L[8?|x^k", charsetEncoder0);
      assertEquals("oE+cK^c<jEF8L[8?|x^ko", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("``Oq?EYO&l");
      assertEquals("/``Oq?EYO&l/", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString(">b8'UYpQ`JC(O+");
      assertEquals("\">b8'UYpQ`JC(O+\"", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = CodeGenerator.strEscape("<!-->", 'r', "</script--y></scriptype=\"text/css\">body, td, p {font-family: arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</script", "^$!$cI5/lqN1WV.X", ";`flfpipgwa</scriptcom.google.protobuf.descriptorprotos$fielddescriptorproto;", (CharsetEncoder) null);
      assertEquals("r<\\!--\\>r", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("^G->raS", 'p', "e@b0bM[ElHWNlnV8HCj", "e@b0bM[ElHWNlnV8HCj", ",@.=+WLYI%yM}J`ej<d", charsetEncoder0);
      assertEquals("p^G->raSp", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("S]>rR1?U3LSnQOj[ a");
      assertEquals("\"S]>rR1?U3LSnQOj[ a\"", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = CodeGenerator.strEscape("6hrl_~)7~kwd</script/", 'M', "//", "nF[<M}-\"`;u.", "", (CharsetEncoder) null);
      assertEquals("M6hrl_~)7~kwd<\\/script/M", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("\n\u0013function_info.proto\u0012\u0006jscomp\"\u00BF\u0002\n\u0016FunctionInformationMap\u00123\n\u0005entry\u0018\u0001 \u0003(\n2$.jscomp.FunctionInformationMap.Entry\u00125\n\u0006module\u0018e \u0003(\n2%.jscomp.FunctionInformationMap.Module\u001A\u0087\u0001\n\u0005Entry\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000Bsource_name\u0018\u0003 \u0002(\t\u0012\u0013\n\u000Bline_number\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000Bmodule_name\u0018\u0005 \u0002(\t\u0012\f\n\u0004size\u0018\u0006 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0007 \u0002(\t\u0012\u0017\n\u000Fcompiled_source\u0018\b \u0002(\t\u001A/\n\u0006Module\u0012\f\n\u0004name\u0018f \u0002(\t\u0012\u0017\n\u000Fcompiled_source\u0018g \u0002(\tB \n\u001Ccom.google.javascript.jscompP\u0001");
      assertEquals("\\u000a\\u0013function_info.proto\\u0012\\u0006jscomp\"\\u00bf\\u0002\\u000a\\u0016FunctionInformationMap\\u00123\\u000a\\u0005entry\\u0018\\u0001 \\u0003(\\u000a2$.jscomp.FunctionInformationMap.Entry\\u00125\\u000a\\u0006module\\u0018e \\u0003(\\u000a2%.jscomp.FunctionInformationMap.Module\\u001a\\u0087\\u0001\\u000a\\u0005Entry\\u0012\\u000a\\u000a\\u0002id\\u0018\\u0002 \\u0002(\\u0005\\u0012\\u0013\\u000a\\u000bsource_name\\u0018\\u0003 \\u0002(\\u0009\\u0012\\u0013\\u000a\\u000bline_number\\u0018\\u0004 \\u0002(\\u0005\\u0012\\u0013\\u000a\\u000bmodule_name\\u0018\\u0005 \\u0002(\\u0009\\u0012\\u000c\\u000a\\u0004size\\u0018\\u0006 \\u0002(\\u0005\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0007 \\u0002(\\u0009\\u0012\\u0017\\u000a\\u000fcompiled_source\\u0018\\u0008 \\u0002(\\u0009\\u001a/\\u000a\\u0006Module\\u0012\\u000c\\u000a\\u0004name\\u0018f \\u0002(\\u0009\\u0012\\u0017\\u000a\\u000fcompiled_source\\u0018g \\u0002(\\u0009B \\u000a\\u001ccom.google.javascript.jscompP\\u0001", string0);
  }
}
