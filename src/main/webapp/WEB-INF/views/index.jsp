<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ATM_PV1.0</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/view.css' />" media="all">
<script type="text/javascript" src="<c:url value='/resources/js/view.js' />"></script>
<script type="text/javascript" src="<c:url value='/resources/js/calendar.js' />"></script>
<script src="<c:url value='/resources/js/jquery-2.0.3.js' />"></script>

</head>
<body id="main_body" >
    <span id="test"></span>
	<img id="top" src="top.png" alt="">
	<div id="form_container">

		<h1><a>ATM_PV1.0</a></h1>

					<div class="form_description">
			<h2>ATM_PV1.0</h2>
			<p>Go green Go easy</p>
		</div>
			<ul >

					<li class="section_break">
			<h3>Employee details</h3>
			<p></p>
		</li>		<li id="li_1" >
		<label class="description" for="userId">User ID </label>
		<div>
			<input id="userId" name="userId" class="element text small" type="text" maxlength="255" value=""/>
		</div>
		</li>		<li id="li_2" >
		<label class="description" for="element_2">Employee Name </label>
		<span>
			<input id="firstName" name= "firstName" class="element text" maxlength="255" size="8" value=""/>
			<label>First</label>
		</span>
		<span>
			<input id="lastName" name= "lastName" class="element text" maxlength="255" size="14" value=""/>
			<label>Last</label>
		</span>
		</li>		<li class="section_break">
			<h3>Time Sheet details</h3>
			<p></p>
			</li>		<li id="li_3" >
        		<label class="description" for="date">Date </label>
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

        		</li>		<li class="section_break">
			<h3>Module details</h3>
			<p></p>
		</li>		<li id="li_14" >
		<label class="description" for="moduleTitle">Module/Course Title  </label>
		<div>
		<select class="element select medium" id="moduleTitle" name="moduleTitle">
			<option value="" selected="selected"></option>
<option value="1" >ENG4053-Eng_mech</option>
<option value="2" >PRJ6029-UG_Pro</option>
<option value="3" >ENG4064-App_Them</option>
<option value="4" >ENG4067-Math_Ana</option>
<option value="5" >ENG7047-KBE</option>

		</select>
		</div>
		</li>		<li id="li_15" >
		<label class="description" for="activityDesc">Activity Description </label>
		<div>
		<select class="element select medium" id="activityDesc" name="activityDesc">
			<option value="" selected="selected"></option>
<option value="1" >Assessment</option>
<option value="2" >Class Contract</option>
<option value="3" >Marking</option>
<option value="4" >Preparation</option>
<option value="5" >Tutorial</option>
<option value="6" >Development</option>

		</select>
		</div>
		</li>		<li class="section_break">
			<h3>Number of Hours</h3>
			<p></p>
		</li>		<li id="li_16" >
		<label class="description" for="startTime">Start Time </label>
		<div>
		<select class="element select small" id="startTime" name="startTime">
			<option value="" selected="selected"></option>
<option value="1" >6:00</option>
<option value="2" >6:30</option>
<option value="3" >7:00</option>
<option value="4" >7:30</option>
<option value="5" >8:00</option>
<option value="6" >8:30</option>
<option value="7" >9:00</option>
<option value="8" >9:30</option>
<option value="9" >10:00</option>
<option value="10" >10:30</option>
<option value="11" >11:00</option>
<option value="12" >11:30</option>
<option value="13" >12:00</option>
<option value="14" >12:30</option>
<option value="15" >13:00</option>
<option value="16" >13:30</option>
<option value="17" >14:00</option>
<option value="14:30" >14:30</option>
<option value="19" >15:00</option>
<option value="20" >15:30</option>
<option value="21" >16:00</option>
<option value="22" >16:30</option>
<option value="23" >17:00</option>
<option value="24" >17:30</option>
<option value="25" >18:00</option>
<option value="26" >18:30</option>
<option value="27" >19:00</option>
<option value="28" >19:30</option>
<option value="29" >20:00</option>
<option value="30" >20:30</option>
<option value="31" >21:00</option>

		</select>
		</div>
		</li>		<li id="li_17" >
		<label class="description" for="endTime">End Time </label>
		<div>
		<select class="element select small" id="endTime" name="endTime">
			<option value="" selected="selected"></option>
<option value="1" >6:00</option>
<option value="2" >6:30</option>
<option value="3" >7:00</option>
<option value="4" >7:30</option>
<option value="5" >8:00</option>
<option value="6" >8:30</option>
<option value="7" >9:00</option>
<option value="8" >9:30</option>
<option value="9" >10:00</option>
<option value="10" >10:30</option>
<option value="11" >11:00</option>
<option value="12" >11:30</option>
<option value="13" >12:00</option>
<option value="14" >12:30</option>
<option value="15" >13:00</option>
<option value="16" >13:30</option>
<option value="17" >14:00</option>
<option value="18" >14:30</option>
<option value="19" >15:00</option>
<option value="20" >15:30</option>
<option value="21" >16:00</option>
<option value="22" >16:30</option>
<option value="23" >17:00</option>
<option value="24" >17:30</option>
<option value="25" >18:00</option>
<option value="26" >18:30</option>
<option value="27" >19:00</option>
<option value="28" >19:30</option>
<option value="29" >20:00</option>
<option value="30" >20:30</option>
<option value="21:00" >21:00</option>

		</select>
		</div>
		</li>		<li id="li_18" >
		<label class="description" for="breakTime">Meal Break Time </label>
		<div>
		<select class="element select small" id="breakTime" name="breakTime">
			<option value="" selected="selected"></option>
<option value="00:15" >15mins</option>
<option value="00:30" >30mins</option>
<option value="00:45" >45mins</option>
<option value="4" >1hr</option>

		</select>
		</div>
		</li>		<li id="li_10" >
		<label class="description" for="totalTime">Total Time </label>
		<div>
			<input id="totalTime" name="totalTime" class="element text small" type="text" maxlength="255" value=""/>
		</div>
		</li>		<li class="section_break">
			<h3>Weekending Details</h3>
			<p></p>
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
	</body>
</html>