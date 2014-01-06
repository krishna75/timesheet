<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!AUTOMATED TIME SHEET MANAGAMENT HTML>
<html>

<head>
  <title>ATM_PV1.0</title>
  <meta name="AUTOMATED TIME SHEET MANAGAMENT" content="SUBMIT PAGE" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />" media="all">
  <!-- HTML 5 -->
  <script src="<c:url value='/resources/js/modernizr-1.5.min.js' />"></script>
  <script src="<c:url value='/resources/js/jquery.easing-sooper.js' />"></script>
  <script src="<c:url value='/resources/js/jquery.sooperfish.js' />"></script>

</head>

<body>
  <div id="main">
    <header>
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.html">AUTOMATED TIME SHEET MANAGAMENT<span class="logo_colour">(ATM_PV1.0)</span></a></h1>
          <h2>Go green Go easy</h2>
        </div>
      </div>
      <nav>
        <div id="menu_container">
          <ul class="sf-menu" id="nav">
              <ul>
                  <ul>
                  </ul>
                </li>
              </ul>
            </li>
          </ul>
        </div>
      </nav>
    </header>
    <div id="site_content">
      <div class="content">
        <h1>TIMESHEET FORM</h1>  



        <!PAST THE FORM CODE HERE>


      </div>
    </div>
    <footer>
      <p> <!COPY RIGHT REFERNECE HERE </p>
    </footer>
  </div>
  <p>&nbsp;</p>
  <!-- javascript at the bottom for fast page loading -->
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
  <script type="text/javascript" src="js/jquery.sooperfish.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
    });
  </script>
</body>
</html>
