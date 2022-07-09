package Termproject.comboong.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static final Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id){
        return store.get(id);
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }

    public void update(Long memberId, Member updateParam){
        Member findMember = findById(memberId);

        findMember.setName(updateParam.getName());
        findMember.setPassword(updateParam.getPassword());
        findMember.setEmail(updateParam.getEmail());
        findMember.setNickName(updateParam.getNickName());
    }

    public void clearStore(){
        store.clear();
    }
}
