login.java:
package Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login_1", urlPatterns = {"/login_1"})
public class login extends HttpServlet
{
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
}
}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
String username = request.getParameter("uname");
String password = request.getParameter("pswd");

try {
Connection con;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "root");
String sql = "SELECT * FROM register WHERE username = ? AND password = ?";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, username);
pst.setString(2, password);
ResultSet rs = pst.executeQuery();
if (rs.next())
{
System.out.println("Login Success");
RequestDispatcher rd = request.getRequestDispatcher("index.html");
rd.forward(request, response);
}
else
{
System.out.println("Login Failed");
RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
rd.forward(request, response);
}
}
catch (Exception e)
{
System.out.println("SQL Error: " + e.getMessage());
}
}
@Override
public String getServletInfo()
{
return "Login Servlet";
}
}

