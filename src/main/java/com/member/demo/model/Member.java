package com.member.demo.model;

import lombok.*;

import javax.persistence.*;

//롬복의 어노테이션으로 Getter과 Setter를 직접 구현하지 않아도 사용할 수 있게
// 해주는 어노테이션이다.

// 데이터베이스와 연결된 객체를 Entity로 지정한다는 어노테이션이다.
// 우리가 Entity로 만들어야지 Repository에서 Entity를 가지고 쉽게 쿼리문을 사용할 수 있게 해준다.

@SuppressWarnings("ALL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 20)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User2 user2;

    @Column(nullable = false, length = 3)
    private int age;


}
