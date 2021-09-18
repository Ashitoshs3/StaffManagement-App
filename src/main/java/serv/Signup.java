package serv;

import com.user.UserMain;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import serv.tc.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Signup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("username");
        String email = request.getParameter("email");
        String password = (String) request.getParameter("password");

        Client newUser = new Client();
        newUser.setUsername(uname);
        newUser.setEmail(email);
        newUser.setPass(password);


        Configuration conf = new Configuration().configure().addAnnotatedClass(Client.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(sr);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(newUser);

        tx.commit();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Regestered successfully !!! "+uname+"");

    }
}
