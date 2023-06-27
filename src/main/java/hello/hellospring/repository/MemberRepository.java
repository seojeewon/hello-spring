package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //find 했는데 null일 수 있음->optional로 감싸서 반환 java 8
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
