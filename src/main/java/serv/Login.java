package serv;

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

public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("username");
        String pass = request.getParameter("password");

        Client existing_user = new Client() ;

        Configuration conf = new Configuration().configure().addAnnotatedClass(Client.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(sr);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        try{
            existing_user = (Client) session.get(Client.class,uname);
        }catch (java.lang.NullPointerException e){
            out.println("<h1>No such user found");
        }


        if(existing_user.getPass().equals(pass)){
            out.println("<h1> Hey "+existing_user+"");
        }else{
            out.println("<h1>Incorrect password");
        }

        tx.commit();
    }
}
