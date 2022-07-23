package test.com.jdbc;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO{
	
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberDAOimpl.class);
	
	@Autowired
	SqlSession session;
	

	@Override
	public int insert(MemberVO vo) {
		logger.info("insert()...");
		logger.info("vo:{}",vo);
		
		try {			
			return session.insert("m_insert",vo);
		} catch (Exception e) {
			return 0;
		}
	}



	@Override
	public MemberVO login(MemberVO vo) {
		logger.info("login()...");
		logger.info("vo:{}",vo);
		return session.selectOne("m_login",vo);
	}
	
	
	@Override
	public MemberVO selectOne(MemberVO vo) {
		logger.info("selectOne()...");
		logger.info("vo:{}",vo);
		return session.selectOne("m_selectOne",vo);
	}



	@Override
	public int update(MemberVO vo) {
		logger.info("update()...");
		logger.info("vo:{}",vo);
		return session.update("m_update",vo);
	}



	@Override
	public int delete(MemberVO vo) {
		logger.info("delete()...");
		logger.info("vo:{}",vo);
		return session.delete("m_delete",vo);
	}



	@Override
	public List<MemberVO> selectList() {
		logger.info("selectList()...");
		return session.selectList("m_selectList");
	}



	@Override
	public MemberVO idCheck(MemberVO vo) {
		logger.info("idCheck()...");
		logger.info("vo:{}",vo);
		return session.selectOne("m_idCheck",vo);
	}
}
