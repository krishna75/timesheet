var showLog = true;

//$("#totalTime").text(diff);

$("#breakTime").change(function(){
   var startTime = $("#startTime").val();
   var endTime = $("#endTime").val();
   var breakTime = $("#breakTime").val();
   var result =  getTotalTime(startTime,endTime,breakTime);
   $("#totalTime").val(result);
});

$("#date_1").change(function(){ updateEndingDates();});
$("#date_2").change(function(){ updateEndingDates();});
$("#date_3").change(function(){ updateEndingDates();});

// this this the ultimate event to send data to the server
$("#button").click(function(){ process();});



/* Input variables */

var userId ="krishna";
var firstName  ="";
var lastName  ="";
var mm = 0;
var dd = 0;
var yyyy = 0;
var moduleTitle ="";
var activityDesc  ="";
var startTime = 0;
var endTime = 0;
var breakTime = 0;
var totalTime = 0;
var weekendDay ="";
var weekendDate  = 0;
var weekendMonth ="";
var weekendYear  = 0;
var date = "";
var name = "" ;



function updateEndingDates(){

    mm     =  $("#date_1").val();
     if (showLog) {console.log(" mm  = "+ mm);}
     dd    =  $("#date_2").val();
     if (showLog) {console.log(" dd  = "+ dd);}
     yyyy     =  $("#date_3").val();
      if (showLog) {console.log(" yyyy  = "+ yyyy);}

    var curr = new Date(yyyy,mm-1,dd); // get current date
    var first = curr.getDate() - curr.getDay(); // First day is the day of the month - the day of the week
    var last = first + 6; // last day is the first day + 6

    var firstday = new Date(curr.setDate(first));
    var lastday = new Date(curr.setDate(last));

    var monthNames = [ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December","December" ];
    var lastDate =  lastday.getDate();
    var m = lastday.getMonth();
    var lastMonth = monthNames[m];
    var lastYear = lastday.getFullYear();
//    alert ("inside function") ;

    $("#weekendDate").val(lastDate);
    $("#weekendMonth").val(lastMonth);
    $("#weekendYear").val(lastYear);
}

function process(){
    updateDefaultValues();
    update();
}



/* Sends and receives info from server in json format*/
function update(){

     $.ajax({
         url:"input-json",
         type:"POST",
         data:getInputJson(),
         contentType:"application/json; charset=utf-8",
     })
     .done(function(outputData){

     });

}


/* Creates json object */
function getInputJson(){

    var mapArray = [
        new Map("userId",userId),
        new Map("name",name),
        new Map("date",date),
        new Map("moduleTitle",moduleTitle),
        new Map("activityDesc",activityDesc),

        new Map("startTime",parseInt(startTime)),
        new Map("endTime",parseInt(endTime)),
        new Map("breakTime",parseInt(breakTime)),
        new Map("totalTime",parseInt(totalTime)),
        new Map("weekendDay",weekendDay),
        new Map("weekendDate",parseInt(weekendDate)),
        new Map("weekendMonth",weekendMonth),
        new Map("weekendYear",parseInt(weekendYear)),
        new Map("added",getDateTime())
    ];

    var json = '{';
    for (i=0;i<mapArray.length;i++){
        var map = mapArray[i];
        json += '"'+map.getKey()+'":';
        json += '"'+map.getValue()+'"';
        if (i< mapArray.length-1){
            json += ',';
        }
    }
    json += '}';
    console.log(json);
    return json;
}


/* Class Map */
function Map(key,value){
    this.key = key;
    this.value = value;
    this.getKey = getMapKey;
    this.getValue = getMapValue;
}
function getMapKey(){return this.key;}
function getMapValue(){ return  this.value;}


/* updates the variables from the html elements */
function updateDefaultValues(){

userId  =  $("#userId").val();
if (showLog) {console.log(" userId = "+ userId);}
firstName  =  $("#firstName").val();
if (showLog) {console.log(" firstName = "+ firstName);}
lastName  =  $("#lastName").val();
if (showLog) {console.log(" lastName = "+ lastName);}

moduleTitle    =  $("#moduleTitle").val();
   if (showLog) {console.log(" moduleTitle  = "+ moduleTitle);}
activityDesc   =  $("#activityDesc").val();
    if (showLog) {console.log(" activityDesc  = "+ activityDesc);}
startTime       =  $("#startTime").val();
     if (showLog) {console.log(" startTime  = "+ startTime);}
endTime       =  $("#endTime").val();
      if (showLog) {console.log(" endTime  = "+ endTime);}
breakTime      =  $("#breakTime").val();
       if (showLog) {console.log(" breakTime  = "+ breakTime);}
totalTime      =  $("#totalTime").val();
if (showLog) {console.log(" totalTime  = "+ totalTime);}
weekendDay      =  $("#weekendDay").val();
  if (showLog) {console.log(" weekendDay  = "+ weekendDay);}
weekendDate     =  $("#weekendDate").val();
   if (showLog) {console.log(" weekendDate  = "+ weekendDate);}
weekendMonth     =  $("#weekendMonth").val();
    if (showLog) {console.log(" weekendMonth  = "+ weekendMonth);}
weekendYear       =  $("#weekendYear").val();
     if (showLog) {console.log(" weekendYear  = "+ weekendYear);}

name = firstName + " "+lastName;
if (showLog) {console.log(" name  = "+ name);}





date = dd +"/" +mm+"/" + yyyy;
if (showLog) {console.log(" date  = "+ date);}

}


function getTotalTime(start, end, meal){
   var result = diff(start, end);
   result = diff(meal,result);
   return result;
}

function diff(start, end) {
    start = start.split(":");
    end = end.split(":");


    var startDate = new Date(0, 0, 0, start[0], start[1], 0);
    var endDate = new Date(0, 0, 0, end[0], end[1], 0);

    var diff = endDate.getTime()- startDate.getTime();

    var hours = Math.floor(diff / 1000 / 60 / 60);
    diff -= hours * 1000 * 60 * 60;
    var minutes = Math.floor(diff / 1000 / 60);
    var result = (hours <= 9 ? "0" : "") + hours + ":" + (minutes <= 9 ? "0" : "") + minutes;
    return result;
}


function getDateTime() {
    var now     = new Date();
    var year    = now.getFullYear();
    var month   = now.getMonth()+1;
    var day     = now.getDate();
    var hour    = now.getHours();
    var minute  = now.getMinutes();
    var second  = now.getSeconds();
    if(month.toString().length == 1) {
        var month = '0'+month;
    }
    if(day.toString().length == 1) {
        var day = '0'+day;
    }
    if(hour.toString().length == 1) {
        var hour = '0'+hour;
    }
    if(minute.toString().length == 1) {
        var minute = '0'+minute;
    }
    if(second.toString().length == 1) {
        var second = '0'+second;
    }
    var dateTime = year+'/'+month+'/'+day+' '+hour+':'+minute+':'+second;
    return dateTime;
}

