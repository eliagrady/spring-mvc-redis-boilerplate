<!DOCTYPE html>
<html>
<head>
    <title>Generic Error</title>

    <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
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

        <h2>Your App is alive on Google App Engine</h2>
        <hr/>
        <h3 class="text-info">However, you seem to have an error in you application</h3>

        <p class="text-error">
        <#--${exceptionMessage}-->
        </p>

        <div class="caused-by">Caused by</div>
        <#--${exceptionStackTrace}-->
        <hr/>
    </div>
</div>
</body>
</html>
