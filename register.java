SERVLETS (. Java Files):
register.java:
package Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet
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
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();

String fullname = request.getParameter("fname");
String username = request.getParameter("uname");
String email = request.getParameter("email");
String password = request.getParameter("pswd");
String confirmpassword = request.getParameter("cfmpswd");

try {
Connection con;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "root");
System.out.println("Connected to Database");
String sql = "INSERT INTO register (fullname, username, email, password, confirmpassword) VALUES (?, ?, ?, ?, ?)";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, fullname);
pst.setString(2, username);
pst.setString(3, email);
pst.setString(4, password);
pst.setString(5, confirmpassword);
pst.executeUpdate();
System.out.println("Regsitation Success");
RequestDispatcher rd = request.getRequestDispatcher("index.html");
rd.forward(request, response);
}
catch (Exception e)
{
System.out.println("Error :: " + e.getMessage());
}
}
@Override
public String getServletInfo()
{
return "Short description";
}
}
