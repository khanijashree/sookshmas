<!DOCTYPE html>
<html>
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
      <a href="#admin_home.html" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Logo</a>
      <a href="./Allot_seat.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white"><i class="fa fa-users"></i>Allot Seat</a>
      <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white"><i class="fa fa-question"></i>Resolve Problems</a>
      <a href="./student_page/message.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white" title="Messages"><i class="fa fa-envelope"></i>Message</a>
      <div class="w3-dropdown-hover w3-hide-small w3-bar-item w3-button w3-hover-white">
        <button class="w3-button w3-padding-large w3-hide-small w3-padding-large w3-hover-white">Manage</button>
        <div class="w3-dropdown-content w3-card-4 w3-bar-block" style="width:250px">
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Subject Management</a>
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Class Room Management</a>
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Floor Management</a>
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Faculty Management</a>
          <a href="#" class="w3-bar-item w3-button w3-hover-blue">Student Management</a>
        </div>
      </div>
     <div class="w3-dropdown-hover w3-hide-small w3-bar-item w3-button w3-hover-white" style="float:right;">
    <button class="w3-button w3-padding-large w3-hide-small w3-padding-large w3-hover-white" title="MY account"><i class="fa fa-user"></i> Sanjana</button>
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
         <p class="w3-center"><img src="/images/photo.jpeg" class="w3-circle" style="height:106px;width:106px" alt="Avatar"></p>
         <h4 class="w3-center">Department of Computer Science and Engineering</h4>
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
              <h3 class="w3-opacity">Automatic Seat Allotment</h3>
              <label for="subject">Message</label></br>
                <textarea id="subject" name="subject" placeholder="Write something.." style="height:100px; width:100%" contenteditable="true" class="w3-border w3-padding"></textarea></br></br>
                <label for="group">Select group</label></br>
              <select id="group" name="group" style="width:250px">
                <option value="Computer Science">Computer Science</option>
                <option value="Mechanical">Mechanical</option>
                <option value="Electronics">Electronics</option>
                <option value="civil">Civil</option>
                <option value="Electrical">Electrical</option>
                <option value="All">All</option>
              </select></br>
                        </br>
               <button type="button" class="w3-button w3-theme w3-left">Cancel</button>
              <button type="button" class="w3-button w3-theme w3-right">Post</button>
            </div>
          </div>
        </div>
      </div>

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



  <!-- End Grid -->
  </div>

<!-- End Page Container -->
</div>
<br>

<!-- Footer -->
<footer class="w3-container w3-theme-d3 w3-padding-16">
  <h5>Footer</h5>
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

<script>
var openInbox = document.getElementById("myBtn");
openInbox.click();

function w3_open() {
  document.getElementById("mySidebar").style.display = "block";
  document.getElementById("myOverlay").style.display = "block";
}

function w3_close() {
  document.getElementById("mySidebar").style.display = "none";
  document.getElementById("myOverlay").style.display = "none";
}

function myFunc(id) {
  var x = document.getElementById(id);
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
    x.previousElementSibling.className += " w3-blue";
  } else {
    x.className = x.className.replace(" w3-show", "");
    x.previousElementSibling.className =
    x.previousElementSibling.className.replace(" w3-blue", "");
  }
}
</script>

<script>
var openTab = document.getElementById("firstTab");
openTab.click();
</script>
</body>