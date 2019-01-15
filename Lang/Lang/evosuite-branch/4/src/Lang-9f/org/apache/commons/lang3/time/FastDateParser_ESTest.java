/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 12:02:32 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(">]+dz2M(ey:LB&");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(">]+dz2M(ey:LB&", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \">]+dz2M(ey:LB&\" ; gave up at index 8
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("[G#'9{-c");
      Locale locale0 = new Locale("`YGVU<)wMnO9L&v4");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(":Ksy;;MqctN8(", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \":Ksy;;MqctN8(\" ; gave up at index 7
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?0}3 6_|z", timeZone0, locale0);
      fastDateParser0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?0}3 6_|z", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[w?0}3 6_|z,en,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?0}3 6_|z", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(63);
      // Undeclared exception!
      try { 
        fastDateParser0.parseObject("", parsePosition0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?0}3 6_|z", timeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals("w?0}3 6_|z", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutesSeconds(7, 7, 7);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.ROOT;
      FastDateParser fastDateParser0 = new FastDateParser("", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("", locale1.getVariant());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?0}3 6_|z", timeZone0, locale0);
      try { 
        fastDateParser0.parseObject("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"\" does not match (\\p{IsNd}++)\\?0\\}3 6_\\|(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|ACDT|Acre Time|ACST|ACT|ACWST|ADT|AEDT|AEST|Afghanistan Time|AFT|AKDT|AKST|Alaska Daylight Time|Alaska Standard Time|Alma-Ata Time|ALMT|Amazon Summer Time|Amazon Time|AMST|AMT|Anadyr Time|ANAT|Aqtau Time|Aqtobe Time|AQTT|Arabia Standard Time|Argentine Time|Armenia Time|ART|AST|Atlantic Daylight Time|Atlantic Standard Time|Australian Central Daylight Time \\(South Australia\\)|Australian Central Daylight Time \\(South Australia/New South Wales\\)|Australian Central Standard Time \\(Northern Territory\\)|Australian Central Standard Time \\(South Australia\\)|Australian Central Standard Time \\(South Australia/New South Wales\\)|Australian Central Western Standard Time|Australian Eastern Daylight Time \\(New South Wales\\)|Australian Eastern Daylight Time \\(Tasmania\\)|Australian Eastern Daylight Time \\(Victoria\\)|Australian Eastern Standard Time \\(New South Wales\\)|Australian Eastern Standard Time \\(Queensland\\)|Australian Eastern Standard Time \\(Tasmania\\)|Australian Eastern Standard Time \\(Victoria\\)|Australian Western Standard Time|AWST|Azerbaijan Time|Azores Summer Time|Azores Time|AZOST|AZOT|AZT|Bangladesh Time|BDT|Bhutan Time|BNT|Bolivia Time|BOT|Bougainville Standard Time|Brasilia Summer Time|Brasilia Time|British Summer Time|BRST|BRT|Brunei Time|BST|BTT|Cape Verde Time|CAT|CCT|CDT|Central African Time|Central Daylight Time|Central European Summer Time|Central European Time|Central Indonesia Time|Central Standard Time|CEST|CET|CHADT|Chamorro Standard Time|CHAST|Chatham Daylight Time|Chatham Standard Time|Chile Summer Time|Chile Time|China Standard Time|Choibalsan Time|CHOT|Christmas Island Time|ChST|CHUT|Chuuk Time|CKT|CLST|CLT|Cocos Islands Time|Colombia Time|Cook Is\\. Time|Coordinated Universal Time|COT|CST|Cuba Daylight Time|Cuba Standard Time|CVT|CXT|Davis Time|DAVT|DDUT|Dumont-d'Urville Time|EASST|EAST|East Indonesia Time|Easter Is\\. Summer Time|Easter Is\\. Time|Eastern African Time|Eastern Daylight Time|Eastern European Summer Time|Eastern European Time|Eastern Greenland Summer Time|Eastern Greenland Time|Eastern Standard Time|EAT|ECT|Ecuador Time|EDT|EEST|EET|EGST|EGT|EST|Falkland Is\\. Time|Fernando de Noronha Time|Fiji Summer Time|Fiji Time|FJST|FJT|FKT|FNT|French Guiana Time|French Southern & Antarctic Lands Time|Galapagos Time|GALT|Gambier Time|GAMT|Georgia Time|GET|GFT|Ghana Mean Time|Gilbert Is\\. Time|GILT|GMT|GMT\\+01:00|GMT\\+02:00|GMT\\+03:00|GMT\\+04:00|GMT\\+05:00|GMT\\+06:00|GMT\\+07:00|GMT\\+08:00|GMT\\+09:00|GMT\\+10:00|GMT\\+11:00|GMT\\+12:00|GMT\\+13:00|GMT\\+14:00|GMT-01:00|GMT-02:00|GMT-03:00|GMT-04:00|GMT-05:00|GMT-06:00|GMT-07:00|GMT-08:00|GMT-09:00|GMT-10:00|GMT-11:00|GMT-12:00|Greenwich Mean Time|GST|Gulf Standard Time|Guyana Time|GYT|Hawaii Daylight Time|Hawaii Standard Time|HDT|HKT|Hong Kong Time|Hovd Time|HOVT|HST|ICT|IDT|India Standard Time|Indian Ocean Territory Time|Indochina Time|IOT|Iran Daylight Time|Iran Standard Time|IRDT|Irish Summer Time|IRKT|Irkutsk Time|IRST|Israel Daylight Time|Israel Standard Time|IST|Japan Standard Time|JST|KGT|Kirgizstan Time|Korea Standard Time|Kosrae Time|KOST|Krasnoyarsk Time|KRAT|KST|LHDT|LHST|Line Is\\. Time|LINT|Lord Howe Daylight Time|Lord Howe Standard Time|Macquarie Island Standard Time|Magadan Time|MAGT|Malaysia Time|Maldives Time|Marquesas Time|Marshall Islands Time|MART|Mauritius Time|Mawson Time|MAWT|MDT|MEST|MET|MHT|Middle Europe Summer Time|Middle Europe Time|MIST|MMT|Moscow Standard Time|Mountain Daylight Time|Mountain Standard Time|MSK|MST|MUT|MVT|Myanmar Time|MYT|Nauru Time|NCT|NDT|Nepal Time|New Caledonia Time|New Zealand Daylight Time|New Zealand Standard Time|Newfoundland Daylight Time|Newfoundland Standard Time|NFT|Niue Time|Norfolk Time|Novosibirsk Time|NOVT|NPT|NRT|NST|NUT|NZDT|NZST|Omsk Time|OMST|Oral Time|ORAT|Pacific Daylight Time|Pacific Standard Time|Pakistan Time|Palau Time|Papua New Guinea Time|Paraguay Summer Time|Paraguay Time|PDT|Peru Time|PET|Petropavlovsk-Kamchatski Time|PETT|PGT|Philippines Time|Phoenix Is\\. Time|PHOT|PHT|Pierre & Miquelon Daylight Time|Pierre & Miquelon Standard Time|Pitcairn Standard Time|PKT|PMDT|PMST|Pohnpei Time|PONT|PST|PWT|PYST|PYT|QYZT|Qyzylorda Time|RET|Reunion Time|Rothera Time|ROTT|Sakhalin Time|SAKT|Samara Time|Samoa Standard Time|SAMT|SAST|SBT|SCT|Seychelles Time|SGT|Singapore Time|Solomon Is\\. Time|South Africa Standard Time|South Georgia Standard Time|Srednekolymsk Time|SRET|SRT|SST|Suriname Time|SYOT|Syowa Time|Tahiti Time|TAHT|Tajikistan Time|TFT|Timor-Leste Time|TJT|TKT|TLT|TMT|Tokelau Time|Tonga Time|TOT|Turkmenistan Time|Tuvalu Time|TVT|Ulaanbaatar Time|ULAT|Uruguay Time|Ust-Nera Time|UTC|UYT|Uzbekistan Time|UZT|Vanuatu Time|Venezuela Time|VET|Vladivostok Time|VLAT|VOST|Vostok Time|VUT|Wake Time|WAKT|Wallis & Futuna Time|WAT|WEST|West Indonesia Time|West Samoa Daylight Time|West Samoa Standard Time|Western African Time|Western European Summer Time|Western European Time|Western Greenland Summer Time|Western Greenland Time|WET|WFT|WGST|WGT|WIB|WIT|WITA|WSDT|WSST|Xinjiang Standard Time|XJT|YAKT|Yakutsk Time|Yekaterinburg Time|YEKT)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("y,W &", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertSame(timeZone0, timeZone1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("y,W &", timeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      assertEquals("(\\p{IsNd}++),(\\p{IsNd}++) &", pattern0.pattern());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("i=mD&9?Ue~2=i");
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("i=mD&9?Ue~2=i", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2473), "?Z=!F;1.");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("]", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      FastDateParser fastDateParser0 = new FastDateParser("w?0}3 6_|z", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(locale_Category0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2473), "?Z=!F;1.");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("]", simpleTimeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("7HG8", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2473), "?Z=O!F;1.");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("]", simpleTimeZone0, locale0);
      Locale locale1 = Locale.UK;
      FastDateParser fastDateParser1 = new FastDateParser("]", simpleTimeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2473), "?Z=!F;1.");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("]", simpleTimeZone0, locale0);
      Date date0 = fastDateParser0.parse("]");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("w?0}3 6_|z", timeZone0, locale0);
      try { 
        fastDateParser0.parseObject("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"\" does not match (\\p{IsNd}++)\\?0\\}3 6_\\|(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|ACDT|ACST|ACT|ACWST|ADT|AEDT|AEST|AFT|AKDT|AKST|ALMT|AMST|AMT|ANAT|AQTT|ART|AST|AWST|AZOST|AZOT|AZT|BDT|BNT|BOT|Bougainville Standard Time|BRST|BRT|BST|BTT|CAT|CCT|CDT|CEST|CET|CHADT|CHAST|CHOT|ChST|CHUT|CKT|CLST|CLT|COT|CST|CVT|CXT|DAVT|DDUT|EASST|EAST|EAT|ECT|EDT|EEST|EET|EGST|EGT|EST|FJST|FJT|FKT|FNT|GALT|GAMT|GET|GFT|GILT|GMT|GMT\\+01:00|GMT\\+02:00|GMT\\+03:00|GMT\\+04:00|GMT\\+05:00|GMT\\+06:00|GMT\\+07:00|GMT\\+08:00|GMT\\+09:00|GMT\\+10:00|GMT\\+11:00|GMT\\+12:00|GMT\\+13:00|GMT\\+14:00|GMT-01:00|GMT-02:00|GMT-03:00|GMT-04:00|GMT-05:00|GMT-06:00|GMT-07:00|GMT-08:00|GMT-09:00|GMT-10:00|GMT-11:00|GMT-12:00|GST|GYT|HDT|HKT|HOVT|HST|ICT|IDT|IOT|IRDT|IRKT|IRST|IST|JST|KGT|KOST|KRAT|KST|LHDT|LHST|LINT|MAGT|MART|MAWT|MDT|MEST|MET|MHT|MIST|MMT|MSK|MST|MUT|MVT|MYT|NCT|NDT|NFT|NOVT|NPT|NRT|NST|NUT|NZDT|NZST|OMST|ORAT|PDT|PET|PETT|PGT|PHOT|PHT|PKT|PMDT|PMST|PONT|PST|PWT|PYST|PYT|QYZT|RET|ROTT|SAKT|SAMT|SAST|SBT|SCT|SGT|Srednekolymsk Time|SRET|SRT|SST|SYOT|TAHT|TFT|TJT|TKT|TLT|TMT|TOT|TVT|ULAT|UTC|UYT|UZT|VET|VLAT|VOST|VUT|WAKT|WAT|WEST|WET|WFT|WGST|WGT|WIB|WIT|WITA|WSDT|WSST|XJT|YAKT|YEKT|\u30A2\u30A4\u30EB\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30A2\u30AF\u30BF\u30A6\u6642\u9593|\u30A2\u30AF\u30C8\u30D9\u6642\u9593|\u30A2\u30AF\u30EC\u6642\u9593|\u30A2\u30BC\u30EB\u30D0\u30A4\u30B8\u30E3\u30F3\u6642\u9593|\u30A2\u30BE\u30EC\u30B9\u590F\u6642\u9593|\u30A2\u30BE\u30EC\u30B9\u6642\u9593|\u30A2\u30CA\u30C9\u30A5\u30A4\u30EA\u6642\u9593|\u30A2\u30D5\u30AC\u30CB\u30B9\u30BF\u30F3\u6642\u9593|\u30A2\u30DE\u30BE\u30F3\u590F\u6642\u9593|\u30A2\u30DE\u30BE\u30F3\u6642\u9593|\u30A2\u30E9\u30B9\u30AB\u590F\u6642\u9593|\u30A2\u30E9\u30B9\u30AB\u6A19\u6E96\u6642|\u30A2\u30E9\u30D3\u30A2\u6A19\u6E96\u6642|\u30A2\u30EB\u30BC\u30F3\u30C1\u30F3\u6642\u9593|\u30A2\u30EB\u30DE\u30A2\u30BF\u6642\u9593|\u30A2\u30EB\u30E1\u30CB\u30A2\u6642\u9593|\u30A4\u30B9\u30E9\u30A8\u30EB\u590F\u6642\u9593|\u30A4\u30B9\u30E9\u30A8\u30EB\u6A19\u6E96\u6642|\u30A4\u30E9\u30F3\u590F\u6642\u9593|\u30A4\u30E9\u30F3\u6A19\u6E96\u6642|\u30A4\u30EB\u30AF\u30FC\u30C4\u30AF\u6642\u9593|\u30A4\u30F3\u30C9\u30B7\u30CA\u6642\u9593|\u30A4\u30F3\u30C9\u6A19\u6E96\u6642|\u30A4\u30F3\u30C9\u6D0B\u5730\u57DF\u6642\u9593|\u30A4\u30FC\u30B9\u30BF\u30FC\u5CF6\u590F\u6642\u9593|\u30A4\u30FC\u30B9\u30BF\u30FC\u5CF6\u6642\u9593|\u30A6\u30A7\u30FC\u30AF\u6642\u9593|\u30A6\u30B9\u30C1\u30CD\u30E9\u6642\u9593|\u30A6\u30BA\u30D9\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30A6\u30E9\u30B8\u30AA\u30B9\u30C8\u30AF\u6642\u9593|\u30A6\u30E9\u30FC\u30F3\u30D0\u30FC\u30C8\u30EB\u6642\u9593|\u30A6\u30EB\u30B0\u30A2\u30A4\u6642\u9593|\u30A8\u30AB\u30C6\u30EA\u30F3\u30D6\u30EB\u30B0\u6642\u9593|\u30A8\u30AF\u30A2\u30C9\u30EB\u6642\u9593|\u30AA\u30E0\u30B9\u30AF\u6642\u9593|\u30AA\u30E9\u30EB\u6642\u9593|\u30AB\u30FC\u30DC\u30D9\u30EB\u30C7\u6642\u9593|\u30AC\u30A4\u30A2\u30CA\u6642\u9593|\u30AC\u30E9\u30D1\u30B4\u30B9\u6642\u9593|\u30AC\u30F3\u30D3\u30A2\u6642\u9593|\u30AC\u30FC\u30CA\u6A19\u6E96\u6642|\u30AD\u30B8\u30EB\u30AA\u30EB\u30C0\u6642\u9593|\u30AD\u30E5\u30FC\u30D0\u590F\u6642\u9593|\u30AD\u30E5\u30FC\u30D0\u6A19\u6E96\u6642|\u30AD\u30EB\u30AE\u30B9\u30BF\u30F3\u6642\u9593|\u30AE\u30EB\u30D0\u30FC\u30C8\u8AF8\u5CF6\u6642\u9593|\u30AF\u30C3\u30AF\u8AF8\u5CF6\u6642\u9593|\u30AF\u30E9\u30B9\u30CE\u30E4\u30EB\u30B9\u30AF\u6642\u9593|\u30AF\u30EA\u30B9\u30DE\u30B9\u8AF8\u5CF6\u6642\u9593|\u30B0\u30A2\u30E0\u6A19\u6E96\u6642|\u30B0\u30EA\u30CB\u30C3\u30B8\u6A19\u6E96\u6642|\u30B0\u30EB\u30B8\u30A2\u6642\u9593|\u30B3\u30B3\u30B9\u8AF8\u5CF6\u6642\u9593|\u30B3\u30B9\u30E9\u30A8\u6642\u9593|\u30B3\u30ED\u30F3\u30D3\u30A2\u6642\u9593|\u30B5\u30DE\u30E9\u6642\u9593|\u30B5\u30E2\u30A2\u6A19\u6E96\u6642|\u30B5\u30F3\u30D4\u30A8\u30FC\u30EB\u30FB\u30DF\u30AF\u30ED\u30F3\u8AF8\u5CF6\u590F\u6642\u9593|\u30B5\u30F3\u30D4\u30A8\u30FC\u30EB\u30FB\u30DF\u30AF\u30ED\u30F3\u8AF8\u5CF6\u6A19\u6E96\u6642|\u30B7\u30F3\u30AC\u30DD\u30FC\u30EB\u6642\u9593|\u30B9\u30EA\u30CA\u30E0\u6642\u9593|\u30BB\u30A4\u30B7\u30A7\u30EB\u6642\u9593|\u30BD\u30ED\u30E2\u30F3\u8AF8\u5CF6\u6642\u9593|\u30BF\u30B8\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30BF\u30D2\u30C1\u6642\u9593|\u30C1\u30E3\u30BF\u30E0\u590F\u6642\u9593|\u30C1\u30E3\u30BF\u30E0\u6A19\u6E96\u6642|\u30C1\u30E5\u30FC\u30AF\u6642\u9593|\u30C1\u30E7\u30A4\u30D0\u30EB\u30B5\u30F3\u6642\u9593|\u30C1\u30EA\u590F\u6642\u9593|\u30C1\u30EA\u6642\u9593|\u30C4\u30D0\u30EB\u6642\u9593|\u30C7\u30A4\u30D3\u30B9\u6642\u9593|\u30C7\u30E5\u30E2\u30F3\u30C7\u30E5\u30EB\u30F4\u30A3\u30EB\u6642\u9593|\u30C8\u30B1\u30E9\u30A6\u8AF8\u5CF6\u6642\u9593|\u30C8\u30EB\u30AF\u30E1\u30CB\u30B9\u30BF\u30F3\u6642\u9593|\u30C8\u30F3\u30AC\u6642\u9593|\u30CA\u30A6\u30EB\u6642\u9593|\u30CB\u30A6\u30A8\u5CF6\u6642\u9593|\u30CB\u30E5\u30FC\u30AB\u30EC\u30C9\u30CB\u30A2\u6642\u9593|\u30CB\u30E5\u30FC\u30B8\u30FC\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30CB\u30E5\u30FC\u30B8\u30FC\u30E9\u30F3\u30C9\u6A19\u6E96\u6642|\u30CB\u30E5\u30FC\u30D5\u30A1\u30F3\u30C9\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30CB\u30E5\u30FC\u30D5\u30A1\u30F3\u30C9\u30E9\u30F3\u30C9\u6A19\u6E96\u6642|\u30CD\u30D1\u30FC\u30EB\u6642\u9593|\u30CE\u30DC\u30B7\u30D3\u30EB\u30B9\u30AF\u6642\u9593|\u30CE\u30FC\u30D5\u30A9\u30FC\u30AF\u6642\u9593|\u30CF\u30EF\u30A4\u590F\u6642\u9593|\u30CF\u30EF\u30A4\u6A19\u6E96\u6642|\u30D0\u30CC\u30A2\u30C4\u6642\u9593|\u30D0\u30F3\u30B0\u30E9\u30C7\u30B7\u30E5\u6642\u9593|\u30D1\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30D1\u30D7\u30A2\u30CB\u30E5\u30FC\u30AE\u30CB\u30A2\u6642\u9593|\u30D1\u30E9\u30AA\u6642\u9593|\u30D1\u30E9\u30B0\u30A2\u30A4\u590F\u6642\u9593|\u30D1\u30E9\u30B0\u30A2\u30A4\u6642\u9593|\u30D4\u30C8\u30B1\u30EB\u30F3\u5CF6\u6A19\u6E96\u6642|\u30D5\u30A3\u30B8\u30FC\u590F\u6642\u9593|\u30D5\u30A3\u30B8\u30FC\u6642\u9593|\u30D5\u30A3\u30EA\u30D4\u30F3\u6642\u9593|\u30D5\u30A7\u30CB\u30C3\u30AF\u30B9\u8AF8\u5CF6\u6642\u9593|\u30D5\u30A7\u30EB\u30CA\u30F3\u30C9\u30FB\u30C7\u30FB\u30CE\u30ED\u30FC\u30CB\u30E3\u6642\u9593|\u30D5\u30A9\u30FC\u30AF\u30E9\u30F3\u30C9\u8AF8\u5CF6\u6642\u9593|\u30D6\u30E9\u30B8\u30EB\u590F\u6642\u9593|\u30D6\u30E9\u30B8\u30EB\u6642\u9593|\u30D6\u30EB\u30CD\u30A4\u6642\u9593|\u30D6\u30FC\u30BF\u30F3\u6642\u9593|\u30D9\u30CD\u30BA\u30A8\u30E9\u6642\u9593|\u30DA\u30C8\u30ED\u30D1\u30D6\u30ED\u30D5\u30B9\u30AF\u30AB\u30E0\u30C1\u30E3\u30C4\u30AD\u30FC\u6642\u9593|\u30DA\u30EB\u30FC\u6642\u9593|\u30DB\u30D6\u30C9\u6642\u9593|\u30DC\u30B9\u30C8\u30FC\u30AF\u57FA\u5730\u6642\u9593|\u30DC\u30EA\u30D3\u30A2\u6642\u9593|\u30DD\u30F3\u30DA\u30A4\u6642\u9593|\u30DE\u30AC\u30C0\u30F3\u6642\u9593|\u30DE\u30C3\u30B3\u30FC\u30EA\u30FC\u5CF6\u6642\u9593|\u30DE\u30EB\u30B1\u30B5\u30B9\u6642\u9593|\u30DE\u30EC\u30FC\u30B7\u30A2\u6642\u9593|\u30DE\u30FC\u30B7\u30E3\u30EB\u5CF6\u6642\u9593|\u30DF\u30E3\u30F3\u30DE\u30FC\u6642\u9593|\u30E2\u30B9\u30AF\u30EF\u6A19\u6E96\u6642|\u30E2\u30EB\u30B8\u30D6\u6642\u9593|\u30E2\u30FC\u30BD\u30F3\u6642\u9593|\u30E2\u30FC\u30EA\u30B7\u30E3\u30B9\u6642\u9593|\u30E4\u30AF\u30FC\u30C4\u30AF\u6642\u9593|\u30E9\u30A4\u30F3\u8AF8\u5CF6\u6642\u9593|\u30EC\u30E6\u30CB\u30AA\u30F3\u6642\u9593|\u30ED\u30BC\u30E9\u6642\u9593|\u30ED\u30FC\u30C9\u30CF\u30A6\u5CF6\u590F\u6642\u9593|\u30ED\u30FC\u30C9\u30CF\u30A6\u5CF6\u6A19\u6E96\u6642|\u30EF\u30EA\u30B9\u53CA\u3073\u30D5\u30C4\u30CA\u6642\u9593|\u4E2D\u56FD\u6A19\u6E96\u6642|\u4E2D\u592E\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u4E2D\u897F\u90E8\u6A19\u6E96\u6642\\(\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u4E2D\u90E8\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u4E2D\u90E8\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u4E2D\u90E8\u590F\u6642\u9593|\u4E2D\u90E8\u590F\u6642\u9593\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u590F\u6642\u9593\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2/\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u4E2D\u90E8\u6A19\u6E96\u6642|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u30CE\u30FC\u30B6\u30F3\u30C6\u30EA\u30C8\u30EA\u30FC\\)|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2/\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u4ECF\u5357\u65B9\u9818\u304A\u3088\u3073\u5357\u6975\u6642\u9593|\u4ECF\u9818\u30AE\u30A2\u30CA\u6642\u9593|\u5354\u5B9A\u4E16\u754C\u6642|\u5357\u30A2\u30D5\u30EA\u30AB\u6A19\u6E96\u6642|\u5357\u30B8\u30E7\u30FC\u30B8\u30A2\u5CF6\u6A19\u6E96\u6642|\u5927\u897F\u6D0B\u590F\u6642\u9593|\u5927\u897F\u6D0B\u6A19\u6E96\u6642|\u592A\u5E73\u6D0B\u590F\u6642\u9593|\u592A\u5E73\u6D0B\u6A19\u6E96\u6642|\u5C71\u5730\u590F\u6642\u9593|\u5C71\u5730\u6A19\u6E96\u6642|\u65E5\u672C\u6A19\u6E96\u6642|\u662D\u548C\u57FA\u5730\u6642\u9593|\u6771\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u6771\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u6771\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u6771\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u6642\u9593|\u6771\u30C6\u30A3\u30E2\u30FC\u30EB\u6642\u9593|\u6771\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u6771\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u6771\u90E8\u590F\u6642\u9593|\u6771\u90E8\u590F\u6642\u9593\\(\u30BF\u30B9\u30DE\u30CB\u30A2\\)|\u6771\u90E8\u590F\u6642\u9593\\(\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u6771\u90E8\u590F\u6642\u9593\\(\u30D3\u30AF\u30C8\u30EA\u30A2\\)|\u6771\u90E8\u6A19\u6E96\u6642|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30AF\u30A4\u30FC\u30F3\u30BA\u30E9\u30F3\u30C9\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30BF\u30B9\u30DE\u30CB\u30A2\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30D3\u30AF\u30C8\u30EA\u30A2\\)|\u6A3A\u592A\u6642\u9593|\u6E7E\u5CB8\u6A19\u6E96\u6642|\u82F1\u56FD\u590F\u6642\u9593|\u897F\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u897F\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u897F\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u897F\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u6642\u9593|\u897F\u30B5\u30E2\u30A2\u590F\u6642\u9593|\u897F\u30B5\u30E2\u30A2\u6642\u9593|\u897F\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u897F\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u897F\u90E8\u6A19\u6E96\u6642\\(\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u97D3\u56FD\u6A19\u6E96\u6642|\u9999\u6E2F\u6642\u9593)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("$ShYpP1", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"$ShYpP1\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("(GM[+-]d{0,1}d{2}|[+-]d{2}:?d{2}|", timeZone0, locale0);
      assertEquals("(GM[+-]d{0,1}d{2}|[+-]d{2}:?d{2}|", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+ah+|k+|m+|s+|w+|y+|z+|''|'[G']++(''[^'P*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+ah+|k+|m+|s+|w+|y+|z+|''|'[G']++(''[^'P*+)*+'|[^'A-Za-z]++\" ; gave up at index 83
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("y,W &", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(1874);
      assertEquals(3774, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?80}3 6_|z", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(0);
      assertEquals(2000, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?80}3 6_|z", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.isNextNumber();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("*y)6]OJ", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"*y)6]OJ\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("y-]db68>KSZ'");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("y-]db68>KSZ'", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"y-]db68>KSZ'\" ; gave up at index 4
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("[G#'9{-c");
      Locale locale0 = new Locale("`YGVU<)wMnO9L&v4");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(".D*%P/vsoxwq1", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \".D*%P/vsoxwq1\" ; gave up at index 4
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("/.94_+a~5@dY\"r{H");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("/.94_+a~5@dY\"r{H", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"/.94_+a~5@dY\"r{H\" ; gave up at index 11
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1685, "CDSLV");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("2668y&3WS0R", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"2668y&3WS0R\" ; gave up at index 10
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("1cVf~}bk", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"1cVf~}bk\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(46, "Daj|Z>xQ");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("kmK3*J61:V.T", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"kmK3*J61:V.T\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("4~k", timeZone0, locale0);
      assertEquals("4~k", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("/.94S5f+a~5@dY\"r)H");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("/.94S5f+a~5@dY\"r)H", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"/.94S5f+a~5@dY\"r)H\" ; gave up at index 6
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("6R9)XI!7o/?<", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"6R9)XI!7o/?<\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-829), "9[:?NlDerUz");
      Locale locale0 = new Locale("9[:?NlDerUz");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("9[:?NlDerUz", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"9[:?NlDerUz\" ; gave up at index 4
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("<:w`+!s#i<x", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"<:w`+!s#i<x\" ; gave up at index 8
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "?Z=O!F;1.");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("?Z=O!F;1.", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"?Z=O!F;1.\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone timeZone0 = TimeZone.getTimeZone("@");
      FastDateParser fastDateParser0 = new FastDateParser("@", timeZone0, locale0);
      assertEquals("@", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(113, "\b8yyzk% jg(DHrc+");
      Locale locale0 = Locale.KOREA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("\b8yyzk% jg(DHrc+", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"\b8yyzk% jg(DHrc+\" ; gave up at index 8
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(46, "D!aj|Z>xQ");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("^k%KS*J61:VlT", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"^k%KS*J61:VlT\" ; gave up at index 6
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = new Locale("kmKS*J61:XlT", "kmKS*J61:XlT", "kmKS*J61:XlT");
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("_8/e2", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"_8/e2\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }
}