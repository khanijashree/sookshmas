
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         
         <link rel="stylesheet" href="w3.css">
         <link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <style>
        h1{
            text-align: center;
            text-shadow: 2px 1px 2px black;
        }
        .errmsg{
            background: green;
            padding: 10px;
            width: 50%;
            color: white;
            font-weight: bold;
        }
    </style>
    <body>
       
        <% if (request.getAttribute("status") != null) {%>
        <h1 class="errmsg"> <%= request.getAttribute("status")%></h1>
        <%}%>
        <br>
        <div class="w3-top">
 <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
  <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>
  <a href="#" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Logo</a>
  <a href="./apply_for_exam.jsp" class="w3-bar-item w3-button w3-hover-white w3-padding-large" >Apply For Exam</a>

         
  
  
   <div class="w3-dropdown-hover w3-hide-small w3-right w3-bar-item w3-button" style="float:right;">
    <button class="w3-button w3-padding-large" title="MY account"><i class="fa fa-user">
        <% if (session.getAttribute("uname") != null) {%>
        <h1>  Welcome <%= session.getAttribute("uname")%></h1>
        <%}%></i></button>
    <div class="w3-dropdown-content w3-card-4 w3-bar-block" style="width:200px">
 
            <a href="EditForm.jsp" class="w3-bar-item w3-button w3-hover-blue">Profile</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-blue">Settings</a>
      <a href="contact.jsp" class="w3-bar-item w3-button w3-hover-blue">Contact us</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-blue">Log out</a>
    </div>
    

 
    
  </div>
 </div>
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
         <p class="w3-center"><img src="" class="w3-circle" style="height:106px;width:106px" alt="Avatar"></p>
          
        <% if (session.getAttribute("uname") != null) {%>
        <h1>  Welcome <%= session.getAttribute("uname")%></h1>
        <%}%>
        
         <hr>
         <p><i class="fa fa-pencil fa-fw w3-margin-right w3-text-theme"></i> Student</p>
         <p><i class="fa fa-home fa-fw w3-margin-right w3-text-theme"></i> Davanagere, India</p>
        </div>
      </div>
      <br>



    <!-- End Left Column -->
    </div>

    <!-- Middle Column -->
    <div class="w3-col m9">

      <div class="w3-container w3-card w3-white w3-round w3-margin"><br>

        <span class="w3-right w3-opacity">1 min</span>
        <h4>Examination Department</h4><br>
        <hr class="w3-clear">
        <p>For Math exam on 02/10/2020 (Friday)</p>
        <p>you have been alloted in </p>
          <p>main block <b>Room No:213</b><br>
             1st row 2nd column <b>Seat No:23</b>
          </p>
          <div class="w3-row-padding" style="margin:0 -16px">
            <div class="w3-half">
            </div>
            <div class="w3-half">

          </div>
        </div>
      </div>

      <div class="w3-container w3-card w3-white w3-round w3-margin"><br>
        <span class="w3-right w3-opacity">5 days ago</span>
        <h4>some person</h4><br>
        <hr class="w3-clear">
        <p>examination details </p>
         <p>your examination time table is scheduled and will be posted in the events</p>
      </div>

      <div class="w3-container w3-card w3-white w3-round w3-margin"><br>

        <span class="w3-right w3-opacity">10 days ago</span>
        <h4>Admin</h4><br>
        <hr class="w3-clear">
        <p>Examination details</p>
        <p>your exams will start from the 02/10/2020 </p>
      </div>

    <!-- End Middle Column -->
    </div>


</body>
</html>






