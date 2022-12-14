package com.mycom.myapp.member;

import com.mycom.myapp.market.MarketService;
import com.mycom.myapp.market.MarketVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


@Controller
//@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    UserServiceImpl service;

    @RequestMapping(value = "/login/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login/loginOk", method=RequestMethod.POST)
    public String loginCheck(HttpSession session, UserVO vo) {
        String returnURL = "";
        if(session.getAttribute("login") != null ) {
            session.removeAttribute("login");
        }

        UserVO loginvo = service.getUser(vo);
        if (loginvo != null) { //로그인 성공
            System.out.println("로그인 성공!");
            session.setAttribute("login",loginvo);
            returnURL = "redirect:/board/list";
        }else {
            System.out.println("로그인 실패!");
            returnURL = "redirect:/login/login";
        }
        return returnURL;
    }

    //로그아웃 하는 부분
    @RequestMapping(value = "/login/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login/login";
    }


    @RequestMapping(value="/login/useradd", method=RequestMethod.GET)
    public String addPost(){
        return "useradd";
    }

    //회원가입 하는 부분
    @RequestMapping(value="/login/useraddok",method=RequestMethod.POST)
    public String addPostOK(UserVO vo){
        if(service.insertUser(vo)==0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공!!!");
        return "redirect:login";
    }
}
