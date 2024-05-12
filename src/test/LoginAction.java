package test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginAction extends ActionSupport {
    private User bb;

    public User getBb() {
        return bb;
    }

    public void setBb(User bb) {
        this.bb = bb;
    }

    public String login_user() throws Exception {
        if (validateLogin(bb.getUsername(), bb.getPassword())) {
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpSession session = request.getSession();
            session.setAttribute("username", bb.getUsername());
            session.setAttribute("password", bb.getPassword());
            System.out.println("登录成功，以后可以直接通过内部页面的链接进入内部页面了");
            return "success";
        } else {
            return "fail";
        }
    }

    public boolean validateLogin(String username, String password) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        User result = (User) session.createQuery("FROM User WHERE username = :username AND password = :password")
                .setParameter("username", username)
                .setParameter("password", password)
                .uniqueResult();

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        return result != null;
    }
}




