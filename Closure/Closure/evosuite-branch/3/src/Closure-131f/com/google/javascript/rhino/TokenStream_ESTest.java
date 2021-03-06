/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 12:04:25 GMT 2019
 */

package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.TokenStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TokenStream_ESTest extends TokenStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TokenStream tokenStream0 = new TokenStream();
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("wT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("-@&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("toto");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("L.czp");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("uOK+]!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("oh]~(!{");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("s& LK?NA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("j]F{NIbdj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("PI0tz,,RJ>");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("bKH[WGSM@vk");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("kOJ(;O!Z3!y[");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword(",f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("sn");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("in");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("{o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("f;e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("imr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("n!k");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("t!5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("vEp");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("fPr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("int");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("imt");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("tLy");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("try");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("bye");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("c^x0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("dol%");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("eXAi");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("f;e|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("goto");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("hyte");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ipor");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("j[ 6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("kH:V");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("long");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("moOh");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("null");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("o&AW");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("pCLf");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("q)mE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("rg<c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("s+er");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ulte");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("void");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("with");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("#8iQ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("cgse");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("cb,e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("cj/r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("c*ar");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("e/ze");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("e ym");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("tcye");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("tcue");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("t:ns");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("class");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("&ib,a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("4QdFv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword(":iei!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("`%f];");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("-\"gQp");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("m<hNx");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("swich");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword(")qj&^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("txkZL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("(rl]m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword(";fm~f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("const");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("h]og:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("super");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("EVq#q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("throw");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("HnsH)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("catch");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("^c,:o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("final");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("x4n&\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("float");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("short");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("native");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("mbKa(3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("^c+N:z");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Ud{MQ`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("aeOUYv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("wf,)r_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("TgK'RJ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("throws");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("fiEavl");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ij FR]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("rkJ.6s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ll_Xr)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("4m`j-D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("in-,X9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("double");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("\"p=22I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Xq:hJi");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Ss`qkR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("static");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("public");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Ev,R-c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("switch");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("export");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("typeof");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("delete");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("return");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("package");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("default");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("finally");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("boolean");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("private");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("extends");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("abstract");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("continue");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("dNO9{[Oq");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("function");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("vla4tile");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("interface");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("protected");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("transient");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("implements");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("instanceof");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("final");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("]N,|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("8s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("EN;T&0+s<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("L.czp");
      assertFalse(boolean0);
  }
}
