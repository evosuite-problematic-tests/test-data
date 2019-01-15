/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 10:47:29 GMT 2018
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.jscomp.parsing.JsDocToken;
import com.google.javascript.jscomp.parsing.JsDocTokenStream;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.tools.ToolErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsDocInfoParser_ESTest extends JsDocInfoParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(")mj0,[hCNjG");
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment((-293), (-293), token_CommentType0, ")mj0,[hCNjG");
      Locale locale0 = Locale.ITALY;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, (Node) null, config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&77@YEz0>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Node node0 = JsDocInfoParser.parseTypeString("q");
      assertNotNull(node0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, (Set<String>) null, false, config_LanguageMode0, false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo1 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNotNull(jSDocInfo1);
      
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
      assertEquals(0, node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("", 27);
      Node.newString("");
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      Context.getCurrentContext();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&77@YEz0>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Node node0 = JsDocInfoParser.parseTypeString("q");
      assertNotNull(node0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, (Set<String>) null, false, config_LanguageMode0, false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.hasParsedJSDocInfo();
      assertEquals(0, node0.getSourcePosition());
      assertEquals(1, node0.getLength());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(",r", (-1666), 57);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment((-1181), (-1666), token_CommentType0, ",r");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, (Node) null, config0, errorCollector0);
      JsDocToken jsDocToken0 = JsDocToken.QMARK;
      Node node0 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(304, node0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("BP[BYXn M~kfaMI(bD");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorReporter0);
      jsDocInfoParser0.setFileOverviewJSDocInfo((JSDocInfo) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("xu-_.{CHzcpSRfB\"g", 1696);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(1696, 1696, token_CommentType0, "xu-_.{CHzcpSRfB\"g");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[2];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Not declared as a type name");
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false, mockPrintStream0);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parseInlineTypeDoc();
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("xu-_.{CHzcpSRfB\"g", 1696, (-1158768571));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[2];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Not declared as a type name");
      node0.setSourceFileForTesting("Object#Key");
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false, mockPrintStream0);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.parseInlineTypeDoc();
      assertFalse(jSDocInfo0.hasTypedefType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&77@@0Ez0>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = JsDocInfoParser.parseTypeString("&77@@0Ez0>");
      assertNotNull(node0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, (Set<String>) null, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo1 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNotNull(jSDocInfo1);
      
      boolean boolean0 = jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(3, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(",", (-1467505519));
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment((-1467505519), (-1467505519), token_CommentType0, ",");
      Node node0 = new Node(10, 0, 3);
      jsDocTokenStream0.ungetChar(42);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("kXMn%s");
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(114, 114, token_CommentType0, "kXMn%s");
      Node node0 = Node.newString("kXMn%s");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.LC;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(0, node1.getSourcePosition());
      assertNotNull(node1);
      assertEquals(6, node1.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(":", (-807));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      HashSet<String> hashSet0 = new HashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(hashSet0, (Set<String>) null, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&7YE0z>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = JsDocInfoParser.parseTypeString("ltH^=<gu-6xPm~~a");
      assertNotNull(node0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, (Set<String>) null, true, config_LanguageMode0, false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo1 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNotNull(jSDocInfo1);
      
      boolean boolean0 = jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&L[7E0z>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = JsDocInfoParser.parseTypeString("&L[7E0z>");
      HashSet<String> hashSet0 = new HashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(hashSet0, (Set<String>) null, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNotNull(jSDocInfo0);
      
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
      assertEquals(0, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{XM", 115, 115);
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(115, 115, token_CommentType0, "{XM");
      Node node0 = new Node(22);
      HashSet<String> hashSet0 = new HashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(hashSet0, hashSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("kXMns", 115, 115);
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(115, 115, token_CommentType0, "kXMns");
      Node node0 = new Node(22);
      HashSet<String> hashSet0 = new HashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(hashSet0, hashSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.LT;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNull(node1);
      
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&7YE0z>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = JsDocInfoParser.parseTypeString("ltH^=<gu-6xPm~~a");
      assertNotNull(node0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, (Set<String>) null, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.PIPE;
      jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(",", (-1467505519));
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment((-1467505519), 2147483645, token_CommentType0, "KrnxKkd10js7");
      Node node0 = new Node((-1724561130), 0, 3);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false, (PrintStream) null);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.RB;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNull(node1);
      
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&7YE0z>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = JsDocInfoParser.parseTypeString("&7YE0z>");
      assertNotNull(node0);
      
      HashSet<String> hashSet0 = new HashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(hashSet0, (Set<String>) null, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.ELLIPSIS;
      jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
      assertEquals(6, node0.getLength());
      assertEquals(0, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("&7YE0z>", (-794));
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = JsDocInfoParser.parseTypeString("ltH^=<gu-6xPm~~a");
      assertNotNull(node0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, (Set<String>) null, true, config_LanguageMode0, false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.EQUALS;
      jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertFalse(boolean0);
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("com.google.javascript.rhino.jstype.TemplateTypeMap$EquivalenceMatch", 2105);
      Node node0 = Node.newNumber((-484.1613));
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
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
  public void test21()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(",", (-1467505519));
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment((-1467505519), (-1467505519), token_CommentType0, ",");
      Node node0 = Node.newString(9, ",");
      jsDocTokenStream0.ungetChar(42);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("kXMn%s", 105);
      Node node0 = JsDocInfoParser.parseTypeString("kXMn%s");
      assertNotNull(node0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.LC;
      JSDocInfo jSDocInfo1 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNotNull(jSDocInfo1);
      
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNull(node1);
      assertEquals(0, node0.getSourcePosition());
      assertEquals(0, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("3|`?");
      assertNotNull(node0);
      assertEquals(301, node0.getType());
      assertFalse(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("$*dx=x|C!nAnbt");
      assertNotNull(node0);
      
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("$*dx=x|C!nAnbt", 31, 57);
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      jsDocTokenStream0.getJsDocToken();
      Comment comment0 = new Comment(39, 2, token_CommentType0, "$*dx=x|C!nAnbt");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      JsDocToken jsDocToken0 = JsDocToken.QMARK;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNotNull(node1);
      assertTrue(node0.isString());
      assertEquals(304, node1.getType());
      
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNotNull(jSDocInfo0);
      
      Node node2 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(304, node2.getType());
      assertEquals(0, node0.getSourcePosition());
      assertEquals(61, node2.getCharno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("}OC+XjEt*~j5IOAjj]", 31, 57);
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(39, 2, token_CommentType0, "}OC+XjEt*~j5IOAjj]");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, (Node) null, config0, errorCollector0);
      JsDocToken jsDocToken0 = JsDocToken.QMARK;
      Node node0 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(304, node0.getType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?>");
      assertNotNull(node0);
      assertEquals(304, node0.getType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("xu-_.{CHzcpSRfB\"g", 1696, (-1158768571));
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[2];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Not declared as a type name");
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false, mockPrintStream0);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.BANG;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNotNull(node1);
      assertEquals(306, node1.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("er+eEFe%Bd8!h]kHiGF");
      assertEquals(306, node0.getType());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[na,@ve c(de for ");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("function");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("null");
      assertEquals(0, node0.getSourcePosition());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("undefined");
      assertEquals(0, node0.getSourcePosition());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("(Ljava/lang/String;)Ljava/lang/Class;");
      assertEquals(301, node0.getType());
      assertNotNull(node0);
      assertTrue(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[rnatCve code fr ");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{=royj:", (-9), (-9));
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment((-9), 10000, token_CommentType0, "{=royj:");
      Node node0 = new Node(14, (-2346), 5);
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parseInlineTypeDoc();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{proxy:", 19, 19);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(19, 10000, token_CommentType0, "{proxy:");
      Node node0 = new Node(14, (-2346), 5);
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parseInlineTypeDoc();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*", 27);
      Node.newString("*");
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      Context.getCurrentContext();
  }
}
