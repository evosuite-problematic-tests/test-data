/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 06:16:55 GMT 2019
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.tools.ToolErrorReporter;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression();
      astRoot0.addChildToBack(parenthesizedExpression0);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "unnamed function statement", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3, 140);
      ObjectProperty objectProperty0 = new ObjectProperty(4);
      objectProperty0.setIsGetter();
      objectLiteral0.addElement(objectProperty0);
      astRoot0.addChildrenToBack(objectLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
      assertEquals(1, node0.getLength());
      assertTrue(node0.isScript());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(150);
      Locale locale0 = Locale.GERMAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      EmptyExpression emptyExpression0 = new EmptyExpression(40);
      astRoot0.addChildrenToBack(emptyExpression0);
      Config config0 = new Config(set0, set0, false, config_LanguageMode0, false);
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, errorReporter0);
      assertEquals(Integer.MAX_VALUE, node0.getSourceOffset());
      assertTrue(node0.hasOneChild());
      assertTrue(node0.isScript());
      assertEquals(0, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ElementGet elementGet0 = new ElementGet();
      astRoot0.addChildToBack(elementGet0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1);
      ObjectProperty objectProperty0 = new ObjectProperty(10, 1);
      astRoot0.addChildrenToBack(objectLiteral0);
      astRoot0.addChildBefore(objectProperty0, objectLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 103
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      ForLoop forLoop0 = new ForLoop();
      astRoot0.addChild(forLoop0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, simpleSourceFile0, ")VrJTtsqd9w.r^g", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3, 140);
      ObjectProperty objectProperty0 = new ObjectProperty(4);
      objectLiteral0.addElement(objectProperty0);
      objectProperty0.setIsSetter();
      astRoot0.addChildrenToBack(objectLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
      assertEquals(0, node0.getLength());
      assertEquals(132, node0.getType());
      assertTrue(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.setIsDestructuring(true);
      astRoot0.addChild(arrayLiteral0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "oXN~V|~1H#NM[jT#>", config0, errorCollector0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name(6);
      ContinueStatement continueStatement0 = new ContinueStatement(name0);
      astRoot0.addChildToFront(continueStatement0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(180, 0, token_CommentType0, (String) null);
      astRoot0.addComment(comment0);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("~1VrJTtsqd9wS|?^g", true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, simpleSourceFile0, "~1VrJTtsqd9wS|?^g", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(26, 0, token_CommentType0, "com.google.common.base.Predicates$AssignableFromPredicate");
      astRoot0.addComment(comment0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, false);
      Node node0 = IRFactory.transformTree(astRoot0, simpleSourceFile0, ")VrJTtsqd9w.r^g", config0, errorCollector0);
      assertEquals(0, node0.getLength());
      assertTrue(node0.isScript());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("com.google.javascript.rhino.jstype.JSType$TypePair", false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(3, 1, token_CommentType0, "r8d94s&oo!c{");
      astRoot0.addComment(comment0);
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Node node0 = IRFactory.transformTree(astRoot0, simpleSourceFile0, "com.google.javascript.rhino.jstype.JSType$TypePair", config0, errorCollector0);
      assertEquals(0, node0.getLength());
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3, 140);
      ObjectProperty objectProperty0 = new ObjectProperty(4);
      objectProperty0.setIsSetter();
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(20, 2231, token_CommentType0, "language version");
      objectProperty0.setJsDocNode(comment0);
      astRoot0.addChildrenToBack(objectLiteral0);
      astRoot0.addChildBefore(objectProperty0, objectLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
      assertEquals(0, node0.getLength());
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      HashMap<String, Comment> hashMap0 = new HashMap<String, Comment>();
      Set<String> set0 = hashMap0.keySet();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "\n * @", config0, toolErrorReporter0);
      assertEquals(1, node0.getLength());
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3, 140);
      ObjectProperty objectProperty0 = new ObjectProperty(4);
      objectLiteral0.addElement(objectProperty0);
      astRoot0.addChildrenToBack(objectLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(3594);
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("", false);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(1);
      astRoot0.addChild(arrayLiteral0);
      Locale locale0 = Locale.UK;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, linkedHashSet0, false, config_LanguageMode0, false);
      Context.getCurrentContext();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("~1VrJtsqd9w|?^g", true);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.addElement(astRoot0);
      astRoot0.addChild(arrayLiteral0);
      Locale locale0 = Locale.UK;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, linkedHashSet0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, simpleSourceFile0, "~1VrJtsqd9w|?^g", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      ContinueStatement continueStatement0 = new ContinueStatement((Name) null);
      astRoot0.addChildToFront(continueStatement0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name((-1), 11, "error reporter");
      ContinueStatement continueStatement0 = new ContinueStatement(name0);
      astRoot0.addChildToFront(continueStatement0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
      assertEquals(1, node0.getLength());
      assertTrue(node0.isScript());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-824), 140);
      objectLiteral0.setIsDestructuring(true);
      astRoot0.addChildrenToBack(objectLiteral0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "Unsupported syntax: ", config0, errorCollector0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3, 140);
      ObjectProperty objectProperty0 = new ObjectProperty(1, 26);
      objectLiteral0.addElement(objectProperty0);
      astRoot0.addChildrenToBack(objectLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "error reporter", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(2);
      astRoot0.addChild(variableDeclaration0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Node node0 = IRFactory.transformTree(astRoot0, simpleSourceFile0, "Cannot set maximumInterpreterStackDepth to less than 1", config0, errorCollector0);
      assertEquals(132, node0.getType());
      assertEquals(4, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(2);
      astRoot0.addChild(variableDeclaration0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile((String) null, false);
      Node node0 = IRFactory.transformTree(astRoot0, simpleSourceFile0, ")VrJTtsqd9w.r^g", config0, errorCollector0);
      assertEquals(0, node0.getLength());
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(2);
      VariableInitializer variableInitializer0 = new VariableInitializer(1, 8);
      variableDeclaration0.addVariable(variableInitializer0);
      astRoot0.addChild(variableDeclaration0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("com.google.common.base.Predicates$AssignableFromPredicate", false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, simpleSourceFile0, ")VrJTtsqd9w.r^g", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(1);
      ObjectProperty objectProperty0 = new ObjectProperty(10, 1);
      objectProperty0.setOperator(17);
      astRoot0.addChildrenToBack(objectLiteral0);
      astRoot0.addChildBefore(objectProperty0, objectLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (StaticSourceFile) null, "language version", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
