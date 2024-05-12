package test;

import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterAction extends ActionSupport {

    private User bb;

    public User getBb() {
        return bb;
    }

    public void setBb(User bb) {
        this.bb = bb;
    }

    public String execute() throws Exception {
        if (validateRegistration(bb.getUsername(),bb.getPassword())) {
            addUser(bb);
            System.out.println("用户注册成功。");
            return "success";
        } else {
            System.out.println("注册失败：用户名已存在。");
            return "fail";
        }
    }

    private boolean validateRegistration(String username,String password) {
        return username != null && !username.isEmpty() &&
                password != null && !password.isEmpty();
    }

    private void addUser(User user) {
        Configuration cfg = new Configuration().configure();
        try (SessionFactory sessionFactory = cfg.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("用户注册失败：" + e.getMessage());
            e.printStackTrace();
        }
    }
}

