// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {

   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello World3";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      Connection c = null;
      String value = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgres",
            "tung", "");

         // ActiveRecord::Base.connection.select_value('SELECT version()')
         // https://alvinalexander.com/java/java-mysql-select-query-example
         // our SQL SELECT query.
         // if you only need a few columns, specify them by name instead of using "*"
         String query = "SELECT version()";
         // create the java statement
         Statement st = c.createStatement();
         // execute the query, and get a java resultset
         ResultSet rs = st.executeQuery(query);

         rs.next();
         value = rs.getString(1);
         System.out.println("value: " + value);

      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");

      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + value + "</h1>");
   }

   public void destroy() {
      // do nothing.
   }
}
