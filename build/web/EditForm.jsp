<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.user"%>
<%@page import="model.student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
    </head>
    <style>
        td input{
            display:block;
        }
        .jumbotron{
            background-color: white;
        }
    </style>
    <body>
         <%@include file="header.jsp"%>
    <center>
        
        <% if (session.getAttribute("uname") != null) {
                student reg = new student(session);
               user s = reg.getInfo();%>

       
        <font color="blue" size="5"><br>
        <h2> Edit Profile</h2>
        </font>
        <form action='update' method='POST'>
            <div class="container ">
                <div class="jumbotron">
                    <div class="form-group col-md-4">
                        <label >name</label>
                        <input type="text" class="form-control"  name="name" value="<%=s.getname()%>">
                    </div>
                    <div class="form-group col-md-4">
                        <label>branch</label>
                        <input type="text" class="form-control"  name="branch" value="<%=s.getbranch()%>">
                    </div>
                    <div class="form-group col-md-4">
                        <label >Phone Number</label>
                        <input type="number" class="form-control"  name="pno" value="<%=s.getphone()%>">
                    </div>
                    
                    <div class="form-group col-md-4">
                        <label >Email</label>
                        <input type="email" class="form-control"  name="email" value="<%=s.getemail()%>">
                    </div>
                    <div class="form-group col-md-4">
                        <label >password</label>
                        <input type="text" class="form-control"  name="pw" value="<%=s.getpw()%>">
                    </div>
                    
                    <button type="submit" class="btn btn-primary" name="submit">Update</button>
                </div>
            </div>
        </form>
     <%}%>
    </center>
    
</body>
</html>

