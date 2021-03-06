/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 12:52:28 GMT 2019
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.jscomp.parsing.JsDocTokenStream;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.tools.ToolErrorReporter;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsDocInfoParser_ESTest extends JsDocInfoParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("M|[L");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@", 2037);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment((-851), 2037, token_CommentType0, "@");
      Node node0 = new Node(26, 214, 14);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("D-Y9s]5*/ ");
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment((-1781), (-1781), token_CommentType0, "D-Y9s]5*/ ");
      Node node0 = new Node((-1612416909), 1, 4);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Context context0 = Context.getCurrentContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorReporter0);
      jsDocInfoParser0.parse();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = new Node(0, 4, 8);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser((JsDocTokenStream) null, (Comment) null, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.hasParsedJSDocInfo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("oMG5)J_Ry|GiWWquV{s");
      assertNotNull(node0);
      
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("oMG5)J_Ry|GiWWquV{s", 16);
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorReporter0);
      jsDocInfoParser0.getFileOverviewJSDocInfo();
      assertEquals(0, node0.getSourcePosition());
      assertTrue(node0.isString());
      assertEquals(0, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("<qCz;QvNk$w");
      assertNotNull(node0);
      
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("", (-294));
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      Node.FileLevelJsDocBuilder node_FileLevelJsDocBuilder0 = node0.getJsDocBuilderForNode();
      jsDocInfoParser0.setFileLevelJsDocBuilder(node_FileLevelJsDocBuilder0);
      assertEquals(0, node0.getSourcePosition());
      assertEquals(11, node0.getLength());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("com.google.javascript.rhino.head.tools.shell.Main$IProxy");
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment((-766), (-766), token_CommentType0, "IomAYiy-.[>`2'K?");
      Node node0 = new Node(0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      jsDocInfoParser0.setFileOverviewJSDocInfo(jSDocInfo0);
      assertFalse(jSDocInfo0.isNoCompile());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("(_qXTB_oy,c&M]");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{_qzXTB_oy,c&M]");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser((JsDocTokenStream) null, (Comment) null, (Node) null, config0, (ErrorReporter) null);
      JSDocInfo jSDocInfo1 = jsDocInfoParser0.retrieveAndResetParsedJSDocInfo();
      assertNull(jSDocInfo1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@", 2037, 2037);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment((-729), 2037, token_CommentType0, "@");
      Node node0 = new Node(26, 214, 14);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("@", false);
      node0.setStaticSourceFile(simpleSourceFile0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("\n\nTree2:\n");
      Locale locale0 = Locale.GERMANY;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("7#O5ZB\"k?ca&H");
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*upkF");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!elUCBdU#", 30);
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(30, 30, token_CommentType0, "{>Z}V");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, false);
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, (Node) null, config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!dgD2]>-Tm.", 308, 308);
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment((-4052), 1, token_CommentType0, "!dgD2]>-Tm.");
      Node node0 = JsDocInfoParser.parseTypeString("!dgD2]>-Tm.");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      jsDocTokenStream0.ungetChar(44);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(":ACm");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(">z5yxadV9{4", 4507);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("[mc2*rT");
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(1214, 12, token_CommentType0, "z}t:z%v9%+S1 !F9");
      Node node0 = Node.newString("e,/*", (-823), 12);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{_qzXTB_oy,c&M]");
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(2, 2, token_CommentType0, "{_qzXTB_oy,c&M]");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Context context0 = Context.getCurrentContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, (Node) null, config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("(_qXTB_oy,c&M]", 29);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Context context0 = Context.getCurrentContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(".<");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("vLBfTRhK?d");
      assertNotNull(node0);
      
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("vLBfTRhK?d", 16);
      jsDocTokenStream0.getJsDocToken();
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(304, node0.getType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("|");
      Node node0 = Node.newString("Sos*X)\"u", 3, 8);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("]$UAEEO`?S1", (-4665));
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment((-3394), 43, token_CommentType0, "(?:)");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, set0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("}_qXTB_oy,c&M]");
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(2, 2, token_CommentType0, "}_qXTB_oy,c&M]");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Context context0 = Context.getCurrentContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, (Node) null, config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("oMG5)J_Ry|GiWWquV{s");
      assertNotNull(node0);
      
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("oMG5)J_Ry|GiWWquV{s", 16);
      jsDocTokenStream0.getJsDocToken();
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertEquals(4, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("...[");
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment((-2313), (-2313), token_CommentType0, "...[");
      Node node0 = Node.newString("...[");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=YDcyJw;0,A<Y");
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment((-2313), (-2313), token_CommentType0, "=YDcyJw;0,A<Y");
      Node node0 = Node.newString("funchion");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("\n");
      jsDocTokenStream0.ungetChar(4095);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("7#O5ZB\"k?ca&H");
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*upkF");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("negative size: ");
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("negative size: ", 29);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?cIxr}~{WfH");
      assertEquals(304, node0.getType());
      assertNotNull(node0);
      assertEquals(5, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("BN_9AX&#!\"L[#}MBdr");
      assertNotNull(node0);
      assertEquals(306, node0.getType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("*8$?_st{");
      assertNotNull(node0);
      assertEquals(302, node0.getType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("function");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("null");
      assertEquals(0, node0.getSourcePosition());
      assertTrue(node0.isString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("undefined");
      assertEquals(0, node0.getSourcePosition());
      assertEquals(9, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("^En-SDmJ|xxp|1");
      assertNotNull(node0);
      assertEquals(301, node0.getType());
      assertEquals(3, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("(eval)");
      assertEquals(301, node0.getType());
      assertNotNull(node0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[]");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[dFqShF]-_'9fRYET");
      assertEquals(308, node0.getType());
      assertTrue(node0.hasOneChild());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{>Z}V");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{KxY}yFm`j");
      assertNotNull(node0);
      assertEquals(309, node0.getType());
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{KxY:yFf`j");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{KxY:>Ff`j");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("!@gD2]>-<m.");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("D-Y9s]5*/ ");
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment((-1781), (-1781), token_CommentType0, "NEXT_IS_ANNOTATION");
      Node node0 = Node.newString("D-Y9s]5*/ ");
      Locale locale0 = Locale.ENGLISH;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, true);
      Context context0 = Context.getCurrentContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertTrue(boolean0);
  }
}
