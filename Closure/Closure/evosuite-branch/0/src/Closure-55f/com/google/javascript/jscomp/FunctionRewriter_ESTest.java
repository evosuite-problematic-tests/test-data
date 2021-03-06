/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 04:44:28 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionRewriter;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import java.io.File;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionRewriter_ESTest extends FunctionRewriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}", "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}");
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      functionRewriter0.process(node0, node0);
      assertEquals(21, Node.LOCALCOUNT_PROP);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("function JSNompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}");
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      Node node1 = Normalize.parseAndNormalizeSyntheticCode(compiler0, "function JSCompiler_emptyFn() {  return function() {}}", "JSCompiler_ipentityFn_value");
      functionRewriter0.process(node0, node1);
      assertEquals(48, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("function JSNompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}");
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      functionRewriter0.process(node0, node0);
      assertEquals(13, Node.CASES_PROP);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}", "function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}");
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      MockFile mockFile0 = new MockFile("function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}", "hB-{GdzJ");
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, (Charset) null);
      CompilerOptions compilerOptions0 = compiler0.options;
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      functionRewriter0.process(node0, node0);
      assertEquals(53, Node.LAST_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_idenpityF*_value}}", "function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_idenpityF*_value}}");
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      functionRewriter0.process(node0, node0);
      assertEquals(53, Node.LAST_PROP);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("function JSCompiler_identityFn() {  return~function(JSCompiler_identityFn_value) {return JSCompiler_identityFnQvalue}}", "function JSCompiler_identityFn() {  return~function(JSCompiler_identityFn_value) {return JSCompiler_identityFnQvalue}}");
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      functionRewriter0.process(node0, node0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("function JSCompiler_set(JSCompiler_set_name) {  return function(JSCompiler_set_value) {this[JSCompiler_set_name] = JSCompiler_set_value}}");
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      functionRewriter0.process(node0, node0);
      assertEquals(12, Node.COLUMN_BITS);
  }
}
