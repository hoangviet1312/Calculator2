import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/calculator")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        String firstNumberString = request.getParameter("first_number");
//        String secondNumberString = request.getParameter("second_number");
        String luachon = request.getParameter("luachon");

        double firstNumber = Double.parseDouble(request.getParameter("first_number"));
        double secondNumber = Double.parseDouble(request.getParameter("second_number"));
        double result;

        PrintWriter printWriter = response.getWriter();

        printWriter.println("First Number: " + firstNumber);
        printWriter.println("Second Number: " + secondNumber);

        try {
            switch (luachon) {
                case "/":
                    result = firstNumber / secondNumber;
                    printWriter.print(result);
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    printWriter.print(result);
                    break;
                case "*":
                    result = firstNumber - secondNumber;
                    printWriter.print(result);
                    break;
                case "+":
                    result = firstNumber + secondNumber;
                    printWriter.print(result);
                    break;
                default:
                    printWriter.print("loi");
                    break;
            }
        } catch (Exception e) {
            printWriter.print("Error" + e.getMessage());
        }
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
