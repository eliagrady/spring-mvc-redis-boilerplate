<!DOCTYPE html>
<html>
<head>
    <title>Example App - Help</title>
<#include "header-scripts.ftl">
</head>
<body>
<div class="container-fluid">
    <div class="container-fluid thumbnail" style="margin-top:20px; padding:20px; box-shadow:#ccc 0 0 15px">
        <h1>Sample App</h1>

        <h2>Your App is live!</h2>
        <hr/>
        <p>You can now proceed to code your endpoints using Spring MVC controllers</p>

        <p>Here are some important links:</p>
        <ul>
            <li><a href=http://static.springsource.org/spring/docs/4.1.x/spring-framework-reference/html/mvc.html>Spring
                MVC documentation</a></li>
            <li><a href=http://freemarker.org/docs/>Freemarker Documentation</a> (the src/main/resources/templates/*.ftl files)
            </li>
            <li><a href=http://twitter.github.com/bootstrap/>Bootstrap</a> (the CSS framework used in the example)</li>
        </ul>
    </div>
    <h2>The project structure</h2>
    <pre style="font-family: inconsolata, monospace;" margin>
src &rarr; The sources folder
 &#9492; main &rarr; Production sources
   &#9492; java &rarr; Java production sources
     &#9492; com.haaretz.app &rarr; Your code package
       &#9492; controller &rarr; Application Controllers
       &#9492; dao &rarr; Data Access Objects
       &#9492; entities &rarr; Application Basic Data Objects
       &#9492; service &rarr; Spring Services
   &#9492; resources &rarr; Managed Resources
     &#9492; views &rarr; Application Views - Freemarker Templates
   &#9492; webapp &rarr; Root of the WAR archive
     &#9492; WEB-INF &rarr; WAR deployment descriptors folder
 &#9492; test &rarr; Test sources
   &#9492; java &rarr; Java test sources
pom.xml &rarr; Maven definition file
    </pre>
</div>
</body>
</html>
