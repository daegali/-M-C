package com.member.demo.service;

import com.member.demo.model.Member;
import com.member.demo.model.User2;
import com.member.demo.repository.MemberRepository;
import com.member.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service

public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    @Autowired
    private UserRepository userRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    // 글 목록
    @Transactional
    public List<Member> writeList() {
        return memberRepository.findAll();
    }

    // 글 쓰기
    @Transactional
    public Member savePost(Member member) {
        return memberRepository.save(member);
    }


    // 상세보기
    @Transactional(readOnly = true)
    public Member view(int id) {
//        System.out.println("--------------------MemberService--" + memberRepository.findById(id));
//        return memberRepository.findById(id);
        return memberRepository.findById(id)
                .orElseThrow(() -> {
                    return new IllegalArgumentException("글 상세보기 실패");
                });
    }

    // 글 수정하기
    @Transactional
    public Member updatePost(@PathVariable int id, @RequestBody Member requestMember) {
//        System.out.println("--------------------MemberService=updatePost--" + memberRepository.save(member));
        Member member = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("수정 실패"));
        member.setName(requestMember.getName());
        member.setAge(requestMember.getAge());
        System.out.println("-----------memberServiceUpdatePost = " + requestMember.getName());
        return member;
    }

    // 게시글 삭제하기
    @Transactional
    public void deletePost(int id) {
        memberRepository.deleteById(id);
    }

//    // 로그인
//    public User2 loginPost(User2 user) {
//        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//    }


//    public Member updatePost(Member member) {
//        return memberRepository.save(member);
//    }
}
