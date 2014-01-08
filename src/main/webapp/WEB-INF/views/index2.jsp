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


  <script src="<c:url value='/resources/js/modernizr-1.5.min.js' />"></script>
  <script src="<c:url value='/resources/js/jquery.easing-sooper.js' />"></script>
  <script src="<c:url value='/resources/js/jquery.sooperfish.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/view.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/calendar.js' />"></script>
  <script src="<c:url value='/resources/js/jquery-2.0.3.js' />"></script>

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
       
        			<form>
<ul >

        					
        			
                 <h3>Employee details</h3>
     
        		</li>		<li id="li_1" >
        		<label class="description" for="userId">User ID </label>
        		<div>
        			<input id="userId" name="userId" class="element text small" type="text" maxlength="255" value=""/>
        		</div>
        		</li>		<li id="li_2" >
        		<label class="description" for="element_2">Employee Name</label>
        		<span>
        			<input id="firstName" name= "firstName" class="element text" maxlength="255" size="8" value=""/>
        			<label>First</label>
        		</span>
        		<span>
        			<input id="lastName" name= "lastName" class="element text" maxlength="255" size="14" value=""/>
        			<label>Last</label>
        		</span>
                <p></p>
        		
        			<h3>Time Sheet details</h3>
        			</li>		<li id="li_3" >
                		<label class="description" for="date">Date</label>
                		<span>
                                       			<input id="date_2" name="element_3_2" class="element text" size="2" maxlength="2" value="" type="text"> /
                                       			<label for="element_3_2">DD</label>
                                       		</span>
                		<span>
                			<input id="date_1" name="element_3_1" class="element text" size="2" maxlength="2" value="" type="text"> /
                			<label for="element_3_1">MM</label>
                		</span>
                		<span>
                	 		<input id="date_3" name="element_3_3" class="element text" size="4" maxlength="4" value="" type="text">
                			<label for="element_3_3">YYYY</label>
                		</span>

                		<span id="calendar_3">
                			<img id="cal_img_3" class="datepicker" src="<c:url value='/resources/images/calendar.gif' />" alt="Pick a date.">
                		</span>
                		<script type="text/javascript">
                			Calendar.setup({
                			inputField	 : "date_3",
                			baseField    : "date",
                			displayArea  : "calendar_3",
                			button		 : "cal_img_3",
                			ifFormat	 : "%B %e, %Y",
                			onSelect	 : selectDate
                			});
                		</script>
                        <p></p>
        			
                        <h3>Module details</h3>
        			
        		</li>		<li id="li_14" >
        		<label class="description" for="moduleTitle">Module/Course Title  </label>
        		<div>
        		<select class="element select medium" id="moduleTitle" name="moduleTitle">
        			<option value="" selected="selected"></option>
        <option value="ENG4053-Eng_mech" >ENG4053-Eng_mech</option>
        <option value="PRJ6029-UG_Pro" >PRJ6029-UG_Pro</option>
        <option value="ENG4064-App_Them" >ENG4064-App_Them</option>
        <option value="ENG4067-Math_Ana" >ENG4067-Math_Ana</option>
        <option value="ENG7047-KBE" >ENG7047-KBE</option>

        		</select>
        		</div>
        		</li>		<li id="li_15" >
        		<label class="description" for="activityDesc">Activity Description </label>
        		<div>
        		<select class="element select medium" id="activityDesc" name="activityDesc">
        			<option value="" selected="selected"></option>
        <option value="Assessment" >Assessment</option>
        <option value="Class Contract" >Class Contract</option>
        <option value="Marking" >Marking</option>
        <option value="Preparation" >Preparation</option>
        <option value="Tutorial" >Tutorial</option>
        <option value="Development" >Development</option>

        		</select>
        		</div>
        		 <p></p>
        			<h3>Number of Hours</h3>
        			
        		</li>		<li id="li_16" >
        		<label class="description" for="startTime">Start Time </label>
        		<div>
        		<select class="element select small" id="startTime" name="startTime">
        			<option value="" selected="selected"></option>
        <option value="6:00" >6:00</option>
        <option value="6:30" >6:30</option>
        <option value="7:00" >7:00</option>
        <option value="7:30" >7:30</option>
        <option value="8:00" >8:00</option>
        <option value="8:30" >8:30</option>
        <option value="9:00" >9:00</option>
        <option value="9:30" >9:30</option>
        <option value="10:00" >10:00</option>
        <option value="10:30" >10:30</option>
        <option value="11:00" >11:00</option>
        <option value="11:30" >11:30</option>
        <option value="12:00" >12:00</option>
        <option value="12:30" >12:30</option>
        <option value="13:00" >13:00</option>
        <option value="13:30" >13:30</option>
        <option value="14:00" >14:00</option>
        <option value="14:30" >14:30</option>
        <option value="15:00" >15:00</option>
        <option value="15:30" >15:30</option>
        <option value="16:00" >16:00</option>
        <option value="16:30" >16:30</option>
        <option value="17:00" >17:00</option>
        <option value="17:30" >17:30</option>
        <option value="18:00" >18:00</option>
        <option value="18:30" >18:30</option>
        <option value="19:00" >19:00</option>
        <option value="19:30" >19:30</option>
        <option value="20:00" >20:00</option>
        <option value="20:30" >20:30</option>
        <option value="21:00" >21:00</option>

        		</select>
        		</div>
        		</li>		<li id="li_17" >
        		<label class="description" for="endTime">End Time </label>
        		<div>
        		<select class="element select small" id="endTime" name="endTime">
        			<option value="" selected="selected"></option>
        <option value="6:00" >6:00</option>
        <option value="6:30" >6:30</option>
        <option value="7:00" >7:00</option>
        <option value="7:30" >7:30</option>
        <option value="8:00" >8:00</option>
        <option value="8:30" >8:30</option>
        <option value="9:00" >9:00</option>
        <option value="9:30" >9:30</option>
        <option value="10:00" >10:00</option>
        <option value="10:30" >10:30</option>
        <option value="11:00" >11:00</option>
        <option value="11:30" >11:30</option>
        <option value="12:00" >12:00</option>
        <option value="12:30" >12:30</option>
        <option value="13:00" >13:00</option>
        <option value="13:30" >13:30</option>
        <option value="14:00" >14:00</option>
        <option value="14:30" >14:30</option>
        <option value="15:00" >15:00</option>
        <option value="15:30" >15:30</option>
        <option value="16:00" >16:00</option>
        <option value="16:30" >16:30</option>
        <option value="17:00" >17:00</option>
        <option value="17:30" >17:30</option>
        <option value="18:00" >18:00</option>
        <option value="18:30" >18:30</option>
        <option value="19:00" >19:00</option>
        <option value="19:30" >19:30</option>
        <option value="20:00" >20:00</option>
        <option value="20:30" >20:30</option>
        <option value="21:00" >21:00</option>

        		</select>
        		</div>
        		</li>		<li id="li_18" >
        		<label class="description" for="breakTime">Meal Break Time </label>
        		<div>
        		<select class="element select small" id="breakTime" name="breakTime">

        <option value="00:00" >00mins</option>
        <option value="00:15" >15mins</option>
        <option value="00:30" >30mins</option>
        <option value="00:45" >45mins</option>
        <option value="01:00" >1hr</option>

        		</select>
        		</div>
        		</li>		<li id="li_10" >
        		<label class="description" for="totalTime">Total Time </label>
        		<div>
        			<input id="totalTime" name="totalTime" class="element text small" type="text" maxlength="255" value=""/>
        		</div>
        		 <p></p>
        			<h3>Weekending Details</h3>
        			
        		</li>		<li id="li_13" >
        		<label class="description" for="weekendDay">Weekending Day </label>
        		<div>
        		<select class="element select small" id="weekendDay" name="weekendDay">
        			<option value="Sunday" selected="selected"> Sunday</option>


        		</select>
        		</div>
        		</li>		<li id="li_4" >
        		<label class="description" for="weekendDate">Weekending Date </label>
        		<div>
        			<input id="weekendDate" name="weekendDate" class="element text small" type="text" maxlength="255" value=""/>
        		</div>
        		</li>		<li id="li_5" >
        		<label class="description" for="weekendMonth">Weekending Month </label>
        		<div>
        			<input id="weekendMonth" name="weekendMonth" class="element text small" type="text" maxlength="255" value=""/>
        		</div>
        		</li>		<li id="li_6" >
        		<label class="description" for="weekendYear">Weekending Year </label>
        		<div>
        			<input id="weekendYear" name="weekendYear" class="element text small" type="text" maxlength="255" value=""/>
        		</div>
        		</li>
				<p></p>           
				   <h3>Contract Details</h3>
				        			
				<li id="li_21" >
		<label class="description" for="supervisorName">Supervisor Name</label>
		<div>
			<input id="supervisorName" name="supervisorName" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_22" >
		<label class="description" for="costCentre">Cost Centre</label>
		<div>
			<input id="costCentre" name="costCentre" class="element text small" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_23" >
		<label class="description" for="schoolName">School</label>
		<div>
			<input id="schoolName" name="schoolName" class="element text small" type="text" maxlength="255" value=""/> 
		</div> 
		</li>

		 <!-- last calendar things -->
		<li id="li_24" >
            <label class="description" for="startDate">Date of Start </label>
            <span>
                <input id="startDate_1" name="element_4_1" class="element text" size="2" maxlength="2" value="" type="text"> /
                <label for="element_4_1">MM</label>
            </span>
            <span>
                <input id="startDate_2" name="element_4_2" class="element text" size="2" maxlength="2" value="" type="text"> /
                <label for="element_4_2">DD</label>
            </span>
            <span>
                <input id="startDate_3" name="element_4_3" class="element text" size="4" maxlength="4" value="" type="text">
                <label for="element_4_3">YYYY</label>
            </span>

            <span id="calendar_4">
                <img id="cal_img_4" class="datepicker" src="<c:url value='/resources/images/calendar.gif' />" alt="Pick a date.">
            </span>
            <script type="text/javascript">
                Calendar.setup({
                inputField	 : "startDate_3",
                baseField    : "startDate",
                displayArea  : "calendar_4",
                button		 : "cal_img_4",
                ifFormat	 : "%B %e, %Y",
                onSelect	 : selectDate
                });
            </script>
            <!if errors comes change the img to _4 and check it>
		</li>
			  

        			    <li class="buttons">
        			    <input type="hidden" name="form_id" value="753413" />
                        <img id="button" src="<c:url value='/resources/images/button.jpg' />" alt="">

        		</li>   
        			</ul>
        		</form>
        		<div id="footer">

        		</div>
        	</div>
        	<img id="bottom" src="<c:url value='/resources/images/bottom.png' />" alt="">

        	<script src="<c:url value='/resources/js/biogas/biogas-calculator.js' />"></script>


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
