package test.com.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
	
	public int insert(MemberVO vo) {
		return dao.insert(vo);
	}
	
	public MemberVO login(MemberVO vo) {
		return dao.login(vo);
	}

	public MemberVO selectOne(MemberVO vo) {
		return dao.selectOne(vo);
	}

	public int update(MemberVO vo) {
		return dao.update(vo);
	}

	public int delete(MemberVO vo) {
		return dao.delete(vo);
	}

	public List<MemberVO> selectList() {
		return dao.selectList();
	}

	public MemberVO idCheck(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.idCheck(vo);
	}
	
}
