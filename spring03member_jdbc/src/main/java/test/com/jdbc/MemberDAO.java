package test.com.jdbc;

import java.util.List;

public interface MemberDAO {
	
	public int insert(MemberVO vo);
	public MemberVO login(MemberVO vo);
	public MemberVO selectOne(MemberVO vo);
	public int update(MemberVO vo);
	public int delete(MemberVO vo);
	public List<MemberVO> selectList();
	public MemberVO idCheck(MemberVO vo);

}
