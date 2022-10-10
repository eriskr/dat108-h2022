package no.hvl.dat108.webshop.util;

import no.hvl.dat108.webshop.model.Cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {
	
	private final static int MAX_INTERACTIVE_INTERVAL = 60;

	public static void loggUtBruker(HttpSession session) {
	}

	public static void loggInnBruker(HttpServletRequest request, String username) {
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("cart", new Cart());
	}
	
	public static boolean erBrukerInnlogget(HttpSession session) {
		return false;
	}

}
