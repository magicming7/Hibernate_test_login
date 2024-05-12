package test;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Inter extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation arg0) throws Exception {

        ServletRequest request = ServletActionContext.getRequest();
        HttpServletRequest re = (HttpServletRequest) request;
        HttpSession session = re.getSession();

        if (session.getAttribute("username") != null && session.getAttribute("password") != null) {
            System.out.println("通过拦截");
            return arg0.invoke();
        } else {
            System.out.println("未能通过拦截");
            return "fail";
        }
    }
}
