<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="MainServlet">
            <label>
                Username
                <input type="text" name="username" />
            </label>
            <label>
                Password
                <input type="password" name="password" />
            </label>
            <button  type="submit">Login</button>
        </form>
    </body>
</html>