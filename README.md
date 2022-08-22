#J2cl WebComponent boilerplate - observed - grid - example

How to run this sample ? :

At the root of the project (j2cl-observed-grid ) :

```bash
mvn clean install
```

then

```bash
cd server
```

then

```bash
mvn spring-boot:run
```

At this point you should see this in the console :

```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.3)

2022-08-22 17:53:21.968  INFO 6172 --- [  restartedMain] server.GridApplication                   : Starting GridApplication using Java 18.0.1 on Mac-mini-de-Ponthiaux.local with PID 6172 (/Users/epoth/Projects/j2cl-observed-grid/server/target/classes started by epoth in /Users/epoth/Projects/j2cl-observed-grid/server)
2022-08-22 17:53:21.969  INFO 6172 --- [  restartedMain] server.GridApplication                   : No active profile set, falling back to 1 default profile: "default"
2022-08-22 17:53:21.987  INFO 6172 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2022-08-22 17:53:21.987  INFO 6172 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2022-08-22 17:53:22.331  INFO 6172 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-08-22 17:53:22.336  INFO 6172 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-08-22 17:53:22.336  INFO 6172 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.65]
2022-08-22 17:53:22.360  INFO 6172 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-08-22 17:53:22.361  INFO 6172 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 374 ms
2022-08-22 17:53:22.432  INFO 6172 --- [  restartedMain] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [static/index.html]
2022-08-22 17:53:22.473  INFO 6172 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2022-08-22 17:53:22.483  INFO 6172 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-08-22 17:53:22.487  INFO 6172 --- [  restartedMain] server.GridApplication                   : Started GridApplication in 0.644 seconds (JVM running for 0.795)
2022-08-22 17:53:30.670  INFO 6172 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2022-08-22 17:53:30.670  INFO 6172 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2022-08-22 17:53:30.671  INFO 6172 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
```

Then navigate through a browser to http://localhost:8080