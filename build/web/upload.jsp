

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
              
        
        <script>
            function IsEmpty() {
                var imgs = document.getElementById('file').value;
                if (imgs == null || imgs == "" || imgs == "null") {
                } else {
                    document.imageupload.action = "upload";
                    document.imageupload.submit();
                }
            }
        </script>
                <%if(session.getAttribute("id")!=null){%>
                  <input type="file" id="file" name="image"/>
                  
           
                 <%}%> 
         
                   
    </body>
</html>
