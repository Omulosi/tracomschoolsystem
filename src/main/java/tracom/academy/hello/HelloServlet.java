package tracom.academy.hello;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/helloservlet")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String password = request.getParameter("password");
        String cname = request.getParameter("cname");
        String ccode = request.getParameter("ccode");
        String details = request.getParameter("details");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("[{\n"
            + "        id: 1,\n"
            + "        name: \""+cname+"\",\n"
            + "        code: \""+cname+"\",\n"
            + "        details: \""+details+"\",\n"
            + "        SomeStuff: \""+details+"\"\n"
            + "    },{\n"
            + "        id: 2,\n"
            + "        name: \"DISCRETE MATHEMATICS\",\n"
            + "        code: \"232323\",\n"
            + "        details: \"JUST DESCRIPTION\",\n"
            + "        SomeStuff: \"JUST DESCRIPTION\"\n"
            + "    }]");

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }

}
