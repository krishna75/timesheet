<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>BioEN FIT Calculator</title>
    <link rel="icon"type="image/png" href="<c:url value='/resources/images/favicon-cow.png' />">

    <script  src="<c:url value='/resources/js/bootstrap.js' />"></script>
    <link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet" type="text/css">

    <script src="<c:url value='/resources/js/jquery-1.10.2.js' />"></script>
    <script type="text/javascript" src="//www.google.com/jsapi"></script>

    <script src="<c:url value='/resources/js/simple-slider.js' />"></script>
    <link href="<c:url value='/resources/css/simple-slider.css' />" rel="stylesheet" type="text/css" />

    <link href="<c:url value='/resources/css/biogas-calculator.css' />" rel="stylesheet" type="text/css" />


    <script type="text/javascript" charset="utf-8">
           google.load("visualization", "1", {packages:["corechart"]});
           google.load('visualization', '1', {packages:['table']});

          $(function(){
            $("input:checkbox, input:radio, input:file, select").uniform();
          });
    </script>
</head>
<body >

   <h1>BIOGAS-FIT CALCULATOR</h1>
       <div class="main-table center">

