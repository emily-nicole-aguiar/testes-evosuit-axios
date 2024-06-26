/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Apr 12 04:29:30 GMT 2024
 */

package com.axios;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Conn_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.axios.Conn"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/emily.aguiar/axios"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Manaus"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Conn_ESTest_scaffolding.class.getClassLoader() ,
      "com.axios.core.tool.text.StrJoiner$1",
      "com.axios.exception.HttpException",
      "com.axios.core.matcher.Matcher",
      "com.axios.core.tool.file.FileTool",
      "com.axios.core.tool.text.ArrayIter",
      "com.axios.core.http.HttpInterceptor",
      "com.axios.cookie.ThreadLocalCookieStore",
      "com.axios.core.rfc.PercentCodec",
      "com.axios.core.requestMethod.RequestMethod",
      "com.axios.core.tool.UrlTool",
      "com.axios.core.http.url.UrlPath",
      "com.axios.core.tool.io.IoTool",
      "com.axios.core.resource.FileResource",
      "com.axios.core.tool.text.StrJoiner",
      "com.axios.Conn",
      "com.axios.core.http.url.UrlQuery",
      "com.axios.core.map.CaseInsensitiveMap",
      "com.axios.core.tool.http.HttpTool",
      "com.axios.core.map.CustomKeyMap",
      "com.axios.core.mutable.MutableObj",
      "com.axios.core.tool.text.StrJoiner$NullMode",
      "com.axios.core.http.lang.Chain",
      "com.axios.core.map.TableMap$1",
      "com.axios.core.mutable.Mutable",
      "com.axios.exception.IORuntimeException",
      "com.axios.core.assertion.Assert",
      "com.axios.core.tool.io.FastByteBuffer",
      "com.axios.core.config.global.GlobalHeaders",
      "com.axios.core.config.global.GlobalCookieManager",
      "com.axios.core.http.url.URLDecoder",
      "com.axios.core.type.ContentType",
      "com.axios.core.http.url.FormUrlencoded",
      "com.axios.core.map.TableMap$Entry",
      "com.axios.core.tool.text.IterableIter",
      "com.axios.core.http.HttpInterceptor$Interceptor",
      "com.axios.header.RequestHeader",
      "com.axios.status.Status",
      "com.axios.core.rfc.RFC3986",
      "com.axios.core.resource.Resource",
      "com.axios.core.strem.HttpInputStream",
      "com.axios.core.tool.URLEncoder",
      "com.axios.response.HttpResponse",
      "com.axios.exception.ConnException",
      "com.axios.core.map.MapWrapper",
      "com.axios.core.http.HttpDownloader",
      "com.axios.cookie.ThreadLocalCookieStore$1",
      "com.axios.core.http.HttpBase",
      "com.axios.core.resource.MultiResource",
      "com.axios.core.http.HttpRequest",
      "com.axios.core.tool.mutable.MutableObj",
      "com.axios.core.map.TableMap",
      "com.axios.exception.NoResourceException",
      "com.axios.core.tool.regular.RegularTool",
      "com.axios.core.tool.mutable.Mutable",
      "com.axios.core.config.global.HttpGlobalConfig",
      "com.axios.core.connection.Connection",
      "com.axios.core.resource.MultiFileResource",
      "com.axios.core.resource.BytesResource",
      "com.axios.core.tool.io.FastByteArrayOutputStream",
      "com.axios.core.http.url.UrlBuilder"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.net.HttpURLConnection", false, Conn_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Conn_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.axios.Conn",
      "com.axios.core.requestMethod.RequestMethod",
      "com.axios.core.config.global.HttpGlobalConfig",
      "com.axios.core.rfc.PercentCodec",
      "com.axios.core.rfc.RFC3986",
      "com.axios.core.tool.URLEncoder",
      "com.axios.core.type.ContentType",
      "com.axios.core.tool.UrlTool",
      "com.axios.core.assertion.Assert",
      "com.axios.core.http.HttpDownloader",
      "com.axios.core.http.HttpBase",
      "com.axios.core.http.HttpRequest",
      "com.axios.core.http.url.UrlBuilder",
      "com.axios.core.tool.http.HttpTool",
      "com.axios.core.http.url.UrlPath",
      "com.axios.core.http.url.URLDecoder",
      "com.axios.core.http.url.UrlQuery",
      "com.axios.core.map.TableMap",
      "com.axios.core.http.HttpInterceptor$Interceptor",
      "com.axios.core.config.global.GlobalHeaders",
      "com.axios.core.tool.text.StrJoiner",
      "com.axios.core.tool.text.StrJoiner$NullMode",
      "com.axios.core.connection.Connection",
      "com.axios.cookie.ThreadLocalCookieStore$1",
      "com.axios.cookie.ThreadLocalCookieStore",
      "com.axios.core.config.global.GlobalCookieManager",
      "com.axios.response.HttpResponse",
      "com.axios.core.strem.HttpInputStream",
      "com.axios.exception.HttpException",
      "com.axios.core.tool.regular.RegularTool",
      "com.axios.core.mutable.MutableObj",
      "com.axios.core.tool.file.FileTool",
      "com.axios.core.map.MapWrapper",
      "com.axios.core.map.CustomKeyMap",
      "com.axios.core.map.CaseInsensitiveMap",
      "com.axios.core.http.url.FormUrlencoded",
      "com.axios.exception.IORuntimeException",
      "com.axios.core.tool.io.IoTool",
      "com.axios.exception.ConnException",
      "com.axios.core.map.TableMap$1",
      "com.axios.core.map.TableMap$Entry",
      "com.axios.core.tool.io.FastByteArrayOutputStream",
      "com.axios.core.tool.io.FastByteBuffer",
      "com.axios.core.resource.BytesResource",
      "com.axios.core.resource.MultiResource",
      "com.axios.core.resource.MultiFileResource",
      "com.axios.core.resource.FileResource",
      "com.axios.core.tool.text.StrJoiner$1",
      "com.axios.core.tool.text.ArrayIter",
      "com.axios.header.RequestHeader"
    );
  }
}
