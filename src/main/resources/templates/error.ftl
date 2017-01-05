<#-- @ftlvariable name="exceptionMessage" type="java.lang.String" -->
<#-- @ftlvariable name="exceptionStackTrace" type="java.lang.String" -->
<!DOCTYPE html>
<html>
<head>
    <title>Generic Error</title>
<#include "header-scripts.ftl">

    <style type="text/css">
        .stack-trace {
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            font-size: 12px;
            color: rgb(110, 109, 105);
            margin-left: 20px;
        }

        .caused-by {
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            font-size: 12px;
            color: rgb(133, 50, 48)
        }
    </style>
</head>
<body>
<div class="container-fluid">
<div class="container-fluid thumbnail" style="margin-top:20px; padding:20px; box-shadow:#ccc 0 0 15px">
    <h1>Generic Error</h1>

    <h2>Your app is alive </h2>
    <hr/>
    <h3 class="text-info">However, you seem to have an error in you application</h3>


<#if exceptionMessage??><p class="text-error">${exceptionMessage}</p></#if>

<#if exceptionStackTrace??><div class="caused-by">Caused by</div>${exceptionStackTrace}</div></#if>
    <hr/>
</div>
</div>
</body>
</html>
