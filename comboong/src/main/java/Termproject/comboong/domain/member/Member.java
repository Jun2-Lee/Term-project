package Termproject.comboong.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private Long id;
    private String name;
    private String password;
    private String email;
    private String nickName;

    public Member() {
    }

    public Member(String name, String password, String email, String nickName) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.nickName = nickName;
    }
}
