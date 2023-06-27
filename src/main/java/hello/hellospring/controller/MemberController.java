package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired  //spring container에서 memberService 가져와서 연결시켜줌->새로운 memberService가 계속 생성되지 않음
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
