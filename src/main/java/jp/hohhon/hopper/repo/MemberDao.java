package jp.hohhon.hopper.repo;

import java.util.List;

import jp.hohhon.hopper.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
