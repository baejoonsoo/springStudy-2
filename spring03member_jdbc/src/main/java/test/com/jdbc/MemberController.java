package test.com.jdbc;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MemberService service;

	@Autowired
	HttpSession session;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert() {
		logger.info("Welcome insert!");

		return "insert";
	}

	@RequestMapping(value = "/insertOK.do", method = RequestMethod.POST)
	public String insertOK(MemberVO vo) {
		logger.info("Welcome insertOK!");
		logger.info("vo:{}", vo);

		int result = service.insert(vo);
		logger.info("result:{}", result);

		return "redirect:/";
	}

	@RequestMapping(value = "/loginOK.do", method = RequestMethod.POST)
	public String loginOK(MemberVO vo) {
		logger.info("Welcome loginOK!");
		logger.info("vo:{}", vo);

		MemberVO vo2 = service.login(vo);
		logger.info("vo2:{}", vo2);

		if (vo2 != null) {
			session.setAttribute("user_id", vo2.getId()); // admin
			session.setMaxInactiveInterval(5000);// 5초후 세션유지종료
		}

		return "redirect:/";
	}

	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout() {
		logger.info("logout()");

		session.removeAttribute("user_id");
		return "redirect:/";
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(MemberVO vo, Model model) {
		logger.info("update()");

		MemberVO vo2 = service.selectOne(vo);
		logger.info("vo:{}", vo2);

		model.addAttribute("vo2", vo2);

		return "update";
	}

	@RequestMapping(value = "/updateOK.do", method = RequestMethod.POST)
	public String updateOK(MemberVO vo) {
		logger.info("Welcome updateOK!");
		logger.info("vo:{}", vo);

		int result = service.update(vo);
		logger.info("result:{}", result);

		return "redirect:/";
	}

	@RequestMapping(value = "/deleteOK.do", method = RequestMethod.GET)
	public String deleteOK(MemberVO vo) {
		logger.info("Welcome deleteOK!");
		logger.info("vo:{}", vo);

		int result = service.delete(vo);
		logger.info("result:{}", result);

		return "redirect:logout.do";
	}

	@RequestMapping(value = "/selectList.do", method = RequestMethod.GET)
	public String selectList(Model model) {
		logger.info("Welcome deleteOK!");

		List<MemberVO> vos = service.selectList();
		logger.info("vos:{}", vos);
		model.addAttribute("vos", vos);
		return "selectList";
	}

	@RequestMapping(value = "/idCheck.do", method = RequestMethod.GET)
	@ResponseBody
	public String idCheck(MemberVO vo) {
		logger.info("Welcome idCheck()!");
		logger.info("vo:{}", vo);

		MemberVO vo2 = service.idCheck(vo);
		logger.info("vo2:{}", vo2);

		if (vo2 != null) {
			return "not OK";
		} else {
			return "OK";
		}

	}
}