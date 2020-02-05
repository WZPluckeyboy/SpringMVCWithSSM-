package com.ping.Controller;

import com.ping.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/user")
public class UserControl {
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("测试成功");
        User user=new User();
        user.setUsername("营营");
        user.setPassword("1234");
        user.setAge(20);
        model.addAttribute("user",user);
        return "success";
    }
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("测试成功");
        //转发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
        //response.sendRedirect(request.getContextPath()+"/WEB-INF/pages/success.jsp");
        //直接相应
        //response.getWriter().print("hello");
    }
    @RequestMapping("/ModeAndView")
    public ModelAndView testModeAndView() {
        ModelAndView mv=new ModelAndView();
        System.out.println("测试成功");
        User user=new User();
        user.setUsername("营营");
        user.setPassword("1234");
        user.setAge(20);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("/testForwardOrRediction")
    public String testtestForwardOrRediction() throws Exception{
        System.out.println("测试成功");
        //请求转发
        return "forward:/WEB-INF/pages/success.jsp";
    }
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("测试成功");
        System.out.println(user);
       // 做相应
        user.setUsername("haha");
        user.setPassword("123");
        user.setAge(20);
       return  user;
    }
}
