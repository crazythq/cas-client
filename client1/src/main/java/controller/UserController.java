package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	private Log log = LogFactory.getLog(UserController.class);

	@RequestMapping("/getUser")
	public String getUser() {
//		Map map = new HashMap();
		// 获得用户名信息:
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		log.info(authentication.toString());
		String username = authentication.getName();
		log.info(username);
		return username;
	}
}