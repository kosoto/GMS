package sevice;

import java.util.List;

import domain.MemberBean;

public interface MemberService {
	public void createMember(MemberBean member);
	public List<MemberBean> list();
	public List<MemberBean> readSome(String word);
	public MemberBean readOne(String word);
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
}
