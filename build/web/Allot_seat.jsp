<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Allot Seat</title>

</head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


<body class="w3-theme-l5">

<!-- Navbar -->
<div class="w3-top">
 <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
      <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>
      <a href="./admin_home.jsp" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Logo</a>

 </div>
</div></br></br></br>
<div
<div class="w3-row-padding">
      <div class="w3-col m12">
    <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Exam Date And Time</h2>
  </div></br></br>
  <form class="w3-container">

      <div class="w3-row-padding">
          <div class="w3-col m2">
            <label class="w3-text-blue">Exam Date</label>
          </div>
          <div class="w3-col m3">
            <input class="w3-input w3-border w3-blue" type="text" placeholder="Date" style="border-radius: 12px;">
          </div>
          <div class="w3-col m1">
              <h2></h2>
          </div>
          <div class="w3-col m2">
            <label class="w3-text-blue">Exam Time</label>
          </div>
          <div class="w3-col m3">
            <input class="w3-input w3-border w3-blue" type="text" placeholder="Time" style="border-radius: 12px;">
          </div>
      </div></br></form></div></div></div></br>

<div class="w3-row-padding">
      <div class="w3-col m12">
    <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Subjects Details</h2>
  </div></br></br>
  <form class="w3-container">
    <div class="w3-row-padding">
      <div class="w3-col m1">
        <label class="w3-text-blue">Add Subjects</label>
      </div>
      <div class="w3-col m2">
        <select class="w3-select w3-border w3-blue" name="option" style="border-radius: 12px;">
          <option value="" disabled selected>Semester</option>
          <option value="1">1st Semester</option>
          <option value="2">2nd Semester</option>
          <option value="3">3rd Semester</option>
          <option value="4">4th Semester</option>
          <option value="5">5th Semester</option>
          <option value="6">6th Semester</option>
          <option value="7">7th Semester</option>
          <option value="8">8th Semester</option>
        </select>
      </div>
      <div class="w3-col m1">
          <h2></h2>
      </div>

      <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" name="option" style="border-radius: 12px;">
          <option value="" disabled selected>Subject</option>
          <option value="1">1st Subject</option>
          <option value="2">2nd Subject</option>
          <option value="3">3rd Subject</option>
          <option value="4">4th Subject</option>
          <option value="5">5th Subject</option>
          <option value="6">6th Subject</option>
          <option value="7">7th Subject</option>
          <option value="8">8th Subject</option>
        </select>
      </div>
        <div class="w3-col m1">
          <h2></h2>
      </div>
      <div class="w3-col m2">
          <button class="w3-btn w3-blue">Add</button>
      </div>

        </div></br>

      <div class="w3-row-padding">
           <table class="w3-table-all">
    <tr>
      <th>Sem</th>
      <th>Subject Code</th>
      <th>Subject Name</th>
      <th>Number Students Applied</th>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
      </table></br>
      </div></br>

        </form>

    </div>
      </div>
</div></br>
<div class="w3-row-padding">
      <div class="w3-col m12">
    <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Class Rooms Details</h2>
  </div></br></br>
  <form class="w3-container">

      <div class="w3-row-padding">
          <div class="w3-col m2">
            <label class="w3-text-blue">Choose Classes</label>
          </div>
          <div class="w3-col m3">
            <input class="w3-input w3-border w3-blue" type="text" placeholder="From: Class Room" style="border-radius: 12px;">
          </div>
          <div class="w3-col m1">
              <h2></h2>
          </div>
          <div class="w3-col m3">
            <input class="w3-input w3-border w3-blue" type="text" placeholder="To: Class Room" style="border-radius: 12px;">
          </div></br>
      </div></br>
          <div class="w3-row-padding">
           <table class="w3-table-all">
    <tr>
      <th>Class No</th>
      <th>Number of Seats</th>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
      </table></br>
      </div></br>
      </form></div></div></div></br>

<div class="w3-row-padding">
      <div class="w3-col m12">
    <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Allot Room Invigilators</h2>
  </div></br></br>
  <form class="w3-container">

      <div class="w3-row-padding">
          <div class="w3-col m2">
            <label class="w3-text-blue"></label>
          </div>
          <div class="w3-col m3">
            <input class="w3-input w3-border w3-blue" type="text" placeholder="Add invigilator" style="border-radius: 12px;">
          </div>
          <div class="w3-col m1">
              <h2></h2>
          </div>
          <div class="w3-col m2">
            <label class="w3-text-blue"></label>
          </div>
          <div class="w3-col m3">
            <input class="w3-input w3-border w3-blue" type="text" placeholder="Number of invigilators" style="border-radius: 12px;">
          </div></br>
      </div></br></form></div></br></div></br>
<button class="w3-btn w3-blue w3-right " style="width:200px;">Review Allotment</button>
</div></br>



<footer class="w3-container w3-theme-d3 w3-padding-16">
  <h5>Footer</h5>
</footer>
</body>
</html>