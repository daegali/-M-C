package com.member.demo.controller;

import com.member.demo.model.Member;
import com.member.demo.repository.MemberRepository;
import com.member.demo.service.MemberService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class MemberController {

    private final MemberService memberService;
    private MemberRepository memberRepository;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 글 목록
    @GetMapping("/")
    public String list(Model model,@PageableDefault(size=3,sort="id",direction = Sort.Direction.DESC) Pageable pageable) {
        model.addAttribute("memberList", memberService.selectList(pageable));
//        model.addAttribute("pageList",pageList);
        return "/index";
    }


    // 글 자세히 보기
    @GetMapping("/view/{id}")
    public String findById(@PathVariable int id, Model model) {
//        Optional<Member> member = memberService.view(id);
        model.addAttribute("viewList", memberService.selectOne(id));
        return "member/view";
    }

    // 글 쓰기 페이지 이동
    @GetMapping("/write")
    public String write() {
        return "member/write";
    }

    // 글 쓰기
    @PostMapping("/write")
    public String write(Member member) {
        memberService.savePost(member);
        return "redirect:/";
    }

    // 글 수정하기 페이지 이동
    @GetMapping("/list/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
//        Optional<Member> member = memberService.view(id);
        model.addAttribute("viewList", memberService.selectOne(id));
//        System.out.println("---------------------MemberController= " + member);
        return "member/update";
    }

    // 글 수정하기
    @RequestMapping("/list/update/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute Member member) {
        System.out.println("--------------MemberController=PutMapping");
        memberService.updatePost(id, member);
        return "redirect:/";
    }

    // 삭제하기
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        memberService.deletePost(id);

        return "redirect:/";

//    @Transactional
//    @PutMapping("/update/{id}")
//    public Member updateMember(@PathVariable int id, @RequestBody Member requestMember) {
//        Member member = memberRepository.findById(id).orElseThrow(() -> {
//            return new IllegalArgumentException("수정 실패");
//        });
//        member.setName(requestMember.getName());
//        member.setAge(requestMember.getAge());
//        return member;
//    }

    }
}



