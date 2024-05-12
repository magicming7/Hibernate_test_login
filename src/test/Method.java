package test;
import com.opensymphony.xwork2.ActionSupport;

public class Method extends ActionSupport {
    public String show() throws Exception {
        System.out.println("成功查看");
        return "success";
    }
}
