<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "test";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>


<!DOCTYPE html>
<html lang="en">

<title>Admin_Home</title>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html, body, h1, h2, h3, h4, h5 {font-family: "Open Sans", sans-serif}
form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid rgb(151, 140, 140);
  float: left;
  width: 80%;
  background: #f1f1f1;
}

      .footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: #123969;
            color: white;
            text-align: center;
        }

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}

</style>
<body class="w3-theme-l5">

<!-- Navbar -->
<div class="w3-top">
 <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
      <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>
      <a href="#admin_home.jsp" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Logo</a>
      <a href="./Allot_seat.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white"><i class="fa fa-users"></i>Allot Seat</a>
     <div class="w3-dropdown-hover w3-hide-small w3-bar-item w3-button w3-hover-white">
        <button class="w3-button w3-padding-large w3-hide-small w3-padding-large w3-hover-white">Manage Subjects</button>
        <div class="w3-dropdown-content w3-card-4 w3-bar-block" style="width:250px">
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Edit Subject</a>
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Delete Subject</a>
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Add Subject</a>
          </div>
      </div>
     <div class="w3-dropdown-hover w3-hide-small w3-bar-item w3-button w3-hover-white" style="float:right;">
    <button class="w3-button w3-padding-large w3-hide-small w3-padding-large w3-hover-white" title="MY account"></i><i class="fa fa-user-circle" aria-hidden="true" style="margin-right: 5px;"></i><%=session.getAttribute("aname")%>
           </button>
    <div class="w3-dropdown-content w3-card-4 w3-bar-block" style="width:200px">
      <a href="#" class="w3-bar-item w3-button w3-hover-blue">Profile</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-blue">Settings</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-blue">Log out</a>
    </div>
  </div>
 </div>
</div>


<!-- Navbar on small screens -->
<div id="navDemo" class="w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium w3-large">
  <a href="#" class="w3-bar-item w3-button w3-padding-large">Link 1</a>
  <a href="#" class="w3-bar-item w3-button w3-padding-large">Link 2</a>
  <a href="#" class="w3-bar-item w3-button w3-padding-large">Link 3</a>
  <a href="#" class="w3-bar-item w3-button w3-padding-large">My Profile</a>
</div>

<!-- Page Container -->
<div class="w3-container w3-content" style="max-width:1400px;margin-top:80px">
  <!-- The Grid -->
  <div class="w3-row">
    <!-- Left Column -->
    <div class="w3-col m3">
      <!-- Profile -->
      <div class="w3-card w3-round w3-white">
        <div class="w3-container">
         <h4 class="w3-center">My Profile</h4>
<!--         <p class="w3-center"><img src="/images/photo.jpeg" class="w3-circle" style="height:106px;width:106px" alt="Avatar"></p>
         -->
        <h4 class="w3-center"> <i class="fa fa-user-circle" aria-hidden="true" style="margin-right: 5px;"></i><%=session.getAttribute("aname")%>
           
         </h4>
         <hr>
<p><i class="fa fa-pencil fa-fw w3-margin-right w3-text-theme"></i> Admin</p>
         
         <p><i class="fa fa-university fa-fw w3-margin-right w3-text-theme"></i> Jain Institute Of Technology</p>
         <p><i class="fa fa-map-marker fa-fw w3-margin-right w3-text-theme"></i> Davanagere, India</p>
        </div>
      </div>
        <br>
    </div>

    <!-- End Left Column -->

    <!-- Middle Column -->
    <div class="w3-col m9">

      <div class="w3-row-padding">
        <div class="w3-col m12">
          <div class="w3-card w3-round w3-white">
            <div class="w3-container w3-padding">
                <h3 class="w3-opacity">post an event</h3><hr>
                <label>Upload image/file</label><br>
    <form name="imageupload" method="post" action="upload" enctype="multipart/form-data">
  
                    <%@include file="upload.jsp"%>
                    <button type="submit" class="w3-button w3-theme w3-right " name="Upload" onclick="return IsEmpty()">upload</button>
                </form>
               <br><br>
               <form action="postmsg" method="post">
                    <label for="subject">Message</label></br>
                
              </br><textarea id="message" name="message" placeholder="Write something.." style="height:100px; width:100%" contenteditable="true" class="w3-border w3-padding"></textarea></br></br>
                
                    <div class="w3-row-padding">
                        <div class="w3-col m4">
                            <label for ="type">select type</label></br>
                            <select id="type" name="type" style="width:250px">
                                <option value="faculty">FACULTY</option>
                                <option value="student">STUDENT</option>
                                <option value="all">All</option>
                            </select>
                        </div>
              
                        <div class="w3-col m4">
                            <label for="branch">Select Branch</label></br>
                            <select id="branch" name="branch" style="width:250px">
                              <option value="1">Computer Science</option>
                              <option value="5">Mechanical</option>
                              <option value="3">Electronics</option>
                              <option value="2">Civil</option>
                              <option value="4">Electrical</option>
                              <option value="6">All</option>
                            </select>
                        </div>
                                    </br>  </br></br>                    </br> </br>

                        <button type="button" class="w3-button w3-theme w3-left">Cancel</button>
                        <button type="submit" id="post" class="w3-button w3-theme w3-right " name="but1"  >Post</button>
                        
                       
               </div>
             </form> 
                    </div>
                      </div>
        </div>
        </div>
           

                 
             
               
                   
<!--
session.getAttribute("id");
String message =request.getParameter("message");
String type=request.getParameter("type");
String Branch_id=request.getParameter("branch");
 
try
{
      

 Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
Statement st=con.createStatement();
   PreparedStatement ps;
     ps = (PreparedStatement) con.prepareStatement("insert into message(0,?,?,?,?,now())");
   System.out.println("insert into message("+message+","+type+","+Branch_id+","+ session.getAttribute("id")+","+"now(),);");
                  
//                 ps.setString(1, session.getAttribute("id").toString());
//            ps.setString(2, session.getAttribute("uname").toString());
//            //ps.setString(3, link);
                 ps.setString(1, message);
                 ps.setString(2, type);
                 ps.setString(3, Branch_id);
                 ps.setString(4, session.getAttribute("id").toString());
           
              // ps.setString(4,session.getAttribute("id").toString());
                

int i=ps.executeUpdate();
//st.executeUpdate("insert into users(first_name,last_name,city_name,email)values('"+first_name+"','"+last_name+"','"+city_name+"','"+email+"')")
//in t =st.executeUpdate("insert into message(admin_message,type,Branch_id,year) values('"+admin_message+"','"+type+"','"+Branch_id+'",'"+year+"')");
//     "select subject_id,name from subject where Branch_id ="+request.getParameter("branch")+" and sem ="+request.getParameter("sem")+" and scheme ="+request.getParameter("scheme");
//                    System.out.println(query);
-->                 
<!--}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}-->






 
      <div class="w3-container w3-card w3-white w3-round w3-margin">

<!--        <span class="w3-right w3-opacity">1 min</span>
        
        <h4>Examination Department</h4><br>
        <hr class="w3-clear">
        
      
        
       <p>For Math exam on 02/10/2020 (Friday)</p>
               <p> </p>
        <p>you have been alloted in </p>
          <p>main block <b>Room No:</b><br>
             1st row 2nd column <b>Seat No:23</b>
          </p>
          <div class="w3-row-padding" style="margin:0 -16px">
            <div class="w3-half">
            </div>
            <div class="w3-half">

          </div>
        </div>
   -->
           
          <%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from message";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!--
  <span class="w3-right w3-opacity">=resultSet.getString("now()")%></span>-->
   <h4>note for <%=resultSet.getString("type")%>'s</h4>
       <hr class="w3-clear">
   <div class="w3-container w3-card w3-white w3-round w3-margin"><br><%=resultSet.getString("message")%></div>
<br>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
 </div>
           
<!--           <div class="w3-container w3-card w3-white w3-round w3-margin"><br>
        <span class="w3-right w3-opacity">5 days ago</span>
        <h4></h4><br>
        <hr class="w3-clear">
       
         <p></p>
      </div>
      

      <div class="w3-container w3-card w3-white w3-round w3-margin"><br>

        <span class="w3-right w3-opacity">10 days ago</span>
        
        <p id="demo"></p>-->


      
<!--        <hr class="w3-clear">
        <p>Examination details</p>
        <p>your exams will start from the 02/10/2020 </p>-->
      </div>

    <!-- End Middle Column -->
    



  <!-- End Grid -->
  </div>

<!-- End Page Container -->
</div>
<br>

<!-- Footer -->
<footer class="w3-container w3-theme-d3 w3-padding-16" style=" position: fixed; height:10%;left: 0; bottom:0; width: 100%; background-color: #123969; color: white;text-align: center; ">  
    <p> Jain institute of technology , Davanagere</p>
</footer>         
           
           
            
 


<script>
// Accordion
function myFunction(id) {
  var x = document.getElementById(id);
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
    x.previousElementSibling.className += " w3-theme-d1";
  } else {
    x.className = x.className.replace("w3-show", "");
    x.previousElementSibling.className =
    x.previousElementSibling.className.replace(" w3-theme-d1", "");
  }
}

// Used to toggle the menu on smaller screens when clicking on the menu button
function openNav() {
  var x = document.getElementById("navDemo");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else {
    x.className = x.className.replace(" w3-show", "");
  }
}
</script>

<script>////
////var openInbox = document.getElementById("myBtn");
////openInbox.click();
////
////function w3_open() {
////  document.getElementById("mySidebar").style.display = "block";
////  document.getElementById("myOverlay").style.display = "block";
////}
////
////function w3_close() {
////  document.getElementById("mySidebar").style.display = "none";
////  document.getElementById("myOverlay").style.display = "none";
////}
////
////function myFunc(id) {
////  var x = document.getElementById(id);
////  if (x.className.indexOf("w3-show") == -1) {
////    x.className += " w3-show";
////    x.previousElementSibling.className += " w3-blue";
////  } else {
////    x.className = x.className.replace(" w3-show", "");
////    x.previousElementSibling.className =
////    x.previousElementSibling.className.replace(" w3-blue", "");
////  }
////}
////////
////var openTab = document.getElementById("firstTab");
////openTab.click();
////</script>
 

</body>
</html>