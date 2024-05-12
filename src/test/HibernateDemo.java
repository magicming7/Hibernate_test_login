package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        // 创建Hibernate配置文件
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        // 创建SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // 创建Session
        Session session = sessionFactory.openSession();

        // 开启事务
        Transaction transaction = session.beginTransaction();

        try {

            transaction.commit();
        } catch (Exception e) {
            // 发生异常时回滚事务
            transaction.rollback();
            e.printStackTrace();
        } finally {
            // 关闭Session和SessionFactory
            session.close();
            sessionFactory.close();
        }
    }
}

