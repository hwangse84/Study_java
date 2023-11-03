package pack02.email;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class Ex01_SendMail {
	Properties properties;// properties:파일을 읽어오기위한 객체

	public Ex01_SendMail() {
		properties = new Properties();

		try {
			properties.load(Ex01_SendMail.class.getResourceAsStream("emailinfo.properties"));
			System.out.println(properties.getProperty("email.id"));
			System.out.println(properties.getProperty("email.id"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Ex01_SendMail es = new Ex01_SendMail();
		try {
			es.htmlMail();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			es.sendSimple();
//		} catch (EmailException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			try {
//				es.attachEmail();
//			} catch (MalformedURLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (EmailException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	public void htmlMail() throws EmailException {// 파일 또는 url로 있는 이미지 등을 이메일 첨부
		EmailAttachment attach = new EmailAttachment();
		//attach.setPath("img.jpg");

		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);

		email.setCharset("utf-8");
		email.setDebug(true);

		email.setFrom(properties.getProperty("email.id"), "한울관리자");
		email.addTo(properties.getProperty("email.id"), "한울받는사람");
		email.addTo("youngmoon525@naver.com", "한울받는사람");
		email.setSubject("메일 확인 중 java재밌다");
		// email.setMsg("자바공부중");
		StringBuffer msg = new StringBuffer();
		msg.append("<html>");
		msg.append("<body>");
		msg.append("<a href='www.naver.com'>마이 네이버<a>");
		msg.append("</body>");
		msg.append("</html>");

		email.setHtmlMsg(msg.toString());

		email.attach(attach);
		attach = new EmailAttachment();// 기존에 컴퓨터에서 추가한 파일을 비우고 다시 만들기
		
		
		try {
			attach.setURL(new URL("https://img.freepik.com/free-photo/a-puppy-that-is-walking-in-the-snow_1340-37228.jpg"));
			email.attach(attach);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		email.send();

	}

	public void sendSimple() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);

		email.setCharset("utf-8");
		email.setDebug(true);

		email.setFrom(properties.getProperty("email.id"), "한울관리자");
		email.addTo(properties.getProperty("email.id"), "한울받는사람");
		email.addTo("youngmoon525@naver.com", "한울받는사람");
		email.setSubject("메일 확인 중 java재밌다");
		email.setMsg("자바공부중");
		email.send();
	}

	public void attachEmail() throws EmailException, URISyntaxException, MalformedURLException {// 이미지메일 보냄

//		EmailAttachment attachment = new EmailAttachment();
//		attachment.setPath("john.jpg");
//		attachment.setDisposition(EmailAttachment.ATTACHMENT);
//		attachment.setDescription("Picture of John");
//		attachment.setName("John");

		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);

		email.setCharset("utf-8");
		email.setDebug(true);

		email.setFrom(properties.getProperty("email.id"), "한울관리자");
		email.addTo(properties.getProperty("email.id"), "한울받는사람");
		email.addTo("youngmoon525@naver.com", "한울받는사람");
		email.setSubject("메일 확인 중 java재밌다");
		email.setMsg("자바공부중");

		// email.attach(attachment);
		EmailAttachment file = new EmailAttachment();
		file.setURL(new URL("https://image.utoimage.com/preview/cp872722/2022/12/202212008462_500.jpg"));
		email.attach(file);

		email.send();
	}

}
