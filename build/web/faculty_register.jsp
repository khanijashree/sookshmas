
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
        <title>faculty_Register</title>
        <script type = "text/javascript" src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
     <body>
    <style>
        body{
            /*            background-image: url(images/download.jpg)  ;*/
            background-color: white;
            background-size: cover;

        }
        .box{
            margin: 70px;
            border-radius: 5px;
            background-color:transparent;
            padding: 20px;
            /*            box-shadow: 39px -9px 33px 5px rgba(0,0,0,0.75);*/
        }
        input[type=text],[type=email],[type=password],[type=tel],textarea{
            width: 100%;
            padding: 12px;
            border: 2px solid black;
            border-radius: 4px;
            box-sizing: border-box;
            margin-top: 6px;
            margin-bottom: 16px;
            resize:vertical;
        }
        input:hover{
            border: 1px solid grey;

        }
        .button{
            width: 100%;
            height: 100%;
            border-radius: 20px;
            font-size: 20px;
        }
        .button:focus{
            outline: none;
        }
        .button:hover{
            background-color:grey;
        }
        .error{   
            color:red;
        }

        #msg
        {
            background: transparent;
            color:black;
            /*                border: 1px solid green;
                            width:24%;*/
            text-align: center;
            font-family: cursive;
            font-weight: bold;
            font-size: 25px;
            padding: 5px;
        }


    </style>
    <%@include file="fac_header.jsp" %>
   
        <script type="text/javascript">
            jQuery.validator.addMethod("checkemail", function (value, element) {
                return /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(value) || /^[0-9]{10}$/.test(value);
            }, "Please enter the email format as abc@gmail.com");
            $(document).ready(function () {
                $("#signupform").validate({
                    rules: {
                        name: {
                            required: true,
                            minlength: 4
                        },
                        email: {
                            required: true,
                            checkemail: true
                        },
                        branch: {
                            required: true,
                            minlength:1,
                            maxlength: 1
                        },
                      
                        phone: {
                            required: true,
                            minlength: 10,
                            maxlength: 10
                        },
                        password: {
                            required: true,
                            minlength: 6

                        },
                        confirm_password: {
                            required: true,
                            equalTo: "#epassword"
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
                            minlength: "Please enter your branch with 1 as CSE,2 as Civil,3 as ece,4 as EEE,5 as mechanical ",
                     
                            maxlength: "Please enter your branch with 1 as CSE,2 as Civil,3 as ece,4 as EEE,5 as mechanical ",
                                            },
                       
                        phone: {
                            required: "Enter your phone number",
                            minlength: "Please enter valid phone number",
                            maxlength: "Please enter valid phone number with 10 numbers"
                        },
                        password: {
                            required: "Enter your password",
                            minlength: "Please enter password with atleast 6 characters",
                        },
                        confirm_password: {
                            required: "Re-Enter your password",
                            equalTo: "Password doesn't match"
                        },
                    }
                });

            });
        </script>


        <% if (request.getAttribute("status") != null) {%>
        <div id="msg">  <%= request.getAttribute("status")%></div>
        <%}%>


        <div class="row">
            <div class="col-lg-4"></div>
            <div class="col-lg-4">
                <div class="box">
                    <h3 style="color:black;text-align: center; font-family: cursive">Faculty Sign Up</h3></br>
                    <form id="signupform" action="faculty_register" method="post" class="form">
                        <i class="fa fa-user" aria-hidden="true" style="color:black"> <label> Faculty Name</label></i>
                        <input type="text" name="name" id="name"  placeholder="Faculty Name" ><br>

                        <i class="fa fa-envelope" aria-hidden="true" style="color:black"> <label> E-mail</label></i>
                        <input type="email" name="email" id="email" placeholder="someone@abc.com"><br>

                        <i class="fa fa-building" aria-hidden="true" style="color:black"><label> Branch</label></i>
                        <input type="text"  name="branch" id="branch" placeholder="Branch"><br>

                        <i class="fa fa-phone" aria-hidden="true" style="color:black"><label> Phone Number</label></i>
                        <input type="tel" name="phone" id="phone" placeholder="Phone Number"><br>

                        
                        <i class="fa fa-lock" aria-hidden="true" style="color:black"><label> Password</label></i>
                        <input type="password" id="pw" name="pw"  placeholder="Password"><br>

                        <i class="fa fa-lock" aria-hidden="true" style="color:black"><label> Confirm Password</label></i>
                        <input type="password" name="cp" id="cp" placeholder="Confirm Password"><br>
                         
                        
                   <button type="submit" class="button" name="register">submit</button>
                   <p style="color:black; text-align: center "> Already have an account?  <a href="faculty_login.jsp" style="color:blue ">Login</a></p>
                    </form>
                </div>
            </div>
            <div class="col-lg-4"> </div>
        </div>

   <footer class="w3-container w3-theme-d3 w3-padding-16" style=" position: fixed; height:10%;left: 0; bottom:0; width: 100%; background-color: #123969; color: white;text-align: center; ">  
    <p> Jain institute of technology , Davanagere</p>
</footer>         
           
     </body>
</html>
