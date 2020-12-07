
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Apply for exam</title>
    
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue.css">
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    

    <style>
        .topnav {
      overflow: hidden;
      background-color: black;
    }

    .topnav a {
      float: left;
      color: #f2f2f2;
      text-align: center;
      padding: 19px 16px;
      text-decoration: none;
      font-size: 17px;
    }

    .topnav a:hover {
      background-color: #ddd;
      color: black;
    }

    </style>
</head>

<body>
 
        <script type="text/javascript">
            jQuery.validator.addMethod("checkemail", function (value, element) {
                return /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(value) || /^[0-9]{10}$/.test(value);
            }, "Please enter the email format as abc@gmail.com");
            $(document).ready(function () {
                $("#signupform").validate({
                    rules: {
                         usn: {
                            required: true,
                            minlength: 4
                        },
                        name: {
                            required: true,
                            minlength: 4
                        },
                        branch: {
                            required: true,
                            minlength: 3,
                            maxlength: 3
                        },
                        scheme: {
                            required: true,
                           
                            maxlength: 4
                        },
                        
                        email: {
                            required: true,
                            checkemail: true
                        },
                        
                       
                       
                    },
                    messages: {
                        name: {
                            required: "Enter your name",
                            minlength: "Please enter atleast 4 characters"
                        },
                        email: {
                            required: "Enter your email"

                        },
                        branch: {
                            required: "Enter your respective branch",
                            minlength: "Please enter your branch with 3 characters(eg:CSE)",
                            maxlength: "Please enter you branch with 3 characters (eg:CSE) "
                        },
                       
                       
                    }
                });

            });
        </script>


    
    
    <div class="w3-top">
     <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
          <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>
          <a href="./student_home.jsp" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Logo</a>

     </div>
    </div></br></br></br>
<div >
    <div class="w3-row-padding">
      <div class="w3-col m12">
    <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Student Details</h2>
  </div></br></br>
  <form class="w3-container">

    <div class="w3-row-padding">
      <div class="w3-col m1">
        <label class="w3-text-blue">Name</label>
      </div>
      <div class="w3-col m4">
        <input class="w3-input w3-border w3-blue" type="text" placeholder="Name" name="name" style="border-radius: 12px;">
      </div>
      <div class="w3-col m2">
          <h2></h2>
      </div>
      <div class="w3-col m1">
        <label class="w3-text-blue">USN</label>
      </div>
      <div class="w3-col m4">
        <input class="w3-input w3-border w3-blue" type="text" placeholder="USN" name="usn" style="border-radius: 12px;">
      </div>
    </div></br>
 
       <div class="w3-row-padding">
      <div class="w3-col m1">
        <label class="w3-text-blue">Branch</label>
      </div>
       
 <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" id="branch" name="branch" style="border-radius: 12px;">
          <option value="" disabled selected>Branch</option>
          <option value="1">Computer Science and Engineering</option>
          <option value="2">Mechanical Engineering</option>
          <option value="3">Electrical Engineering</option>
          <option value="3">Electronics Engineering</option>
          <option value="3">Civil Engineering</option>
        </select>
      </div>
      <div class="w3-col m2">
          <h2></h2>
      </div>
      <div class="w3-col m1">
        <label class="w3-text-blue">Sem</label>
      </div>
      
      <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" id="sem" name="sem" style="border-radius: 12px;">
          <option value="" disabled selected>Semester</option>
          <option value="1">1st Semester</option>
          <option value="2">2nd Semester</option>
          <option value="3">3rd Semester</option>
          <option value="4">4th Semester</option>
          <option value="5">5th Semester</option>
          <option value="6">6th Semester</option>
          
        </select>
      </div>
    </div></br>

    <div class="w3-row-padding">
      <div class="w3-col m1">
        <label class="w3-text-blue">E-mail</label>
      </div>
      <div class="w3-col m4">
        <input class="w3-input w3-border w3-blue" type="text" placeholder="Mail-id" style="border-radius: 12px;">
      </div>
      <div class="w3-col m2">
          <h2></h2>
      </div>
      <div class="w3-col m1">
        <label class="w3-text-blue">Scheme</label>
      </div>
      <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" id="scheme" name="scheme" style="border-radius: 12px;">
          <option value="" disabled selected>Scheme</option>
          <option value="1">2017</option>
          <option value="2">2018</option>
          <option value="3">2019</option>
          <option value="4">2020</option>
        </select>
      </div>
         <button type="submit" id="next" class="w3-button w3-theme w3-left">next</button>
    </div></br>
     
               
  </form></br>
    </div></br>

    
    <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Subject Details</h2>
  </div></br></br>
  <form class="w3-container" action="/action_page.php">

      <table class="w3-table-all">
    <tr>
      <th>Subject Code</th>
      <th>Subject Name</th>
      <%-- <th>Apply</th>--%>
    </tr>
    <tr> <td><input type="text"  name="subcode" id="subcode" placeholder="1st subject code">
     </td>
      <td><input type="text"  name="subcode" id="subcode" placeholder="1st subject">
    </td>
      
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    
    <tr>
      <td><input type="text"  name="subcode" id="subcode" placeholder="2nd subject code">
    </td>
      <td><input type="text"  name="subcode" id="subcode" placeholder="2nd subject">
    </td>
      
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><input type="text"  name="subcode" id="subcode" placeholder="3rd subject code">
    </td>
      <td><input type="text"  name="subcode" id="subcode" placeholder="3rd subject">
    
      </td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><input type="text"  name="subcode" id="subcode" placeholder="4th subject code">
    </td>
      <td><input type="text"  name="subcode" id="subcode" placeholder="4th subject">
    </td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><input type="text"  name="subcode" id="subcode" placeholder="5th subject code">
    </td>
    <td><input type="text"  name="subcode" id="subcode" placeholder="5th subject">
    </td>
  
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><input type="text"  name="subcode" id="subcode" placeholder="6th subject code">
    </td>
      <td><input type="text"  name="subcode" id="subcode" placeholder="6th subject">
   </td>
    </tr>
      </table></br>

  </form></br>
    </div></br>

    <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Electives</h2>
  </div></br></br>
  <form class="w3-container" action="/action_page.php">

    <div class="w3-row-padding">
      <div class="w3-col m1">
        <label class="w3-text-blue">Elective-1</label>
      </div>
      <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" name="option" style="border-radius: 12px;">
          <option value="" disabled selected>Choose Elective</option>
          <option value="1">Option 1</option>
          <option value="2">Option 2</option>
          <option value="3">Option 3</option>
        </select>
      </div>
      <div class="w3-col m2">
          <h2></h2>
      </div>
      <div class="w3-col m1">
        <label class="w3-text-blue">Elective-2</label>
      </div>
      <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" name="option" style="border-radius: 12px;">
          <option value="" disabled selected>Choose Elective</option>
          <option value="1">Option 1</option>
          <option value="2">Option 2</option>
          <option value="3">Option 3</option>
        </select>
      </div>
    </div></br>
  </form>
    </div></br>

   <div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>Arrears</h2>
  </div></br></br>
  <form class="w3-container" action="/action_page.php">

    <div class="w3-row-padding">
      <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" name="option" style="border-radius: 12px;">
          <option value="" disabled selected>Semester</option>
          <option value="1">Semester 1</option>
          <option value="2">Semester 2</option>
          <option value="3">Semester 3</option>
          <option value="4">Semester 4</option>
          <option value="5">Semester 5</option>
          <option value="6">Semester 6</option>
          <option value="7">Semester 7</option>
          <option value="8">Semester 8</option>
        </select>
      </div>
      <div class="w3-col m1">
          <h2></h2>
      </div>
      <div class="w3-col m4">
        <select class="w3-select w3-border w3-blue" name="option" style="border-radius: 12px;">
          <option value="" disabled selected>Subject Name</option>
          <option value="1">option 1</option>
          <option value="2">Option 2</option>
          <option value="3">Option 3</option>
        </select>
      </div>
      <div class="w3-col m1">
          <h2></h2>
      </div>
    <div class="w3-col m1">
      <button class="w3-btn w3-blue">Add</button>
    </div>
    </div></br>

    </form>
    </div>

          <p><button class="w3-btn w3-blue w3-right">Submit</button></p></br>
</div>
    </div></br>
</div>

<!-- Footer -->
<footer class="w3-container w3-theme-d3 w3-padding-16">
  <h5>Footer</h5>
</footer>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
    $("#next").click(function(){
       var branch=$("#branch option:selected ").text();
       var sem=$("#sem option:selected ").text();
       var scheme=$("#scheme option:selected ").text();
       
       <%
           Connection con = null;
       PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st = null;
           try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                 st = con.createStatement();
                 
                    String query = "select subject_id,name from subject where Branch_id in(SELECT Branch_id from branch where Name="+request.getParameter("branch")+") and sem ="+request.getParameter("sem")+" and scheme ="+request.getParameter("scheme");
                    System.out.println(query);
                 rs = st.executeQuery(query);
       
           }catch(Exception e){
               System.out.print(e);
           %>
    });
    </script>

</body>
</html>