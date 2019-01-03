package spingclouddemo.Utils.xmail;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


import javax.mail.internet.MimeMessage;
import java.io.File;

/**Spring boot 带的email 类*/

@Slf4j
public class SendEmail {

	private  Logger logger = LoggerFactory.getLogger(SendEmail.class);

	/**邮件发送者*/
	//@Autowired
	//private JavaMailSender javaMailSender;

	//@Value("${spring.mail.username}")
	//private String Sender; //读取配置文件中的参数

	/**发送普通文本 邮件*/
	/*public void SendSimpleEmail( String sendto,String title,String text){
		try {

			logger.debug("开始发送邮件 ");
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(Sender);
			message.setSubject(title);
			message.setTo(sendto);
			message.setText(text);
			javaMailSender.send(message);
		}catch (Exception e){
			e.printStackTrace();
			logger.debug("发送邮件失败");
		}
	}
	*//**发送带html格式的邮件**//*
	public void SendHtmlEmail(String html,String sendto,String title){
		MimeMessage message = null;
		try {
			logger.debug("开始发送html形式邮件");
			message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true,"utf-8");
			helper.setFrom(Sender);
			helper.setTo(sendto);
			helper.setSubject(title);
			StringBuffer sb = new StringBuffer();
			sb.append("<h1>大标题-h1</h1>")
					.append("<p style='color:#F00'>红色字</p>")
					.append("<p style='text-align:right'>右对齐</p>");
			helper.setText(sb.toString(), true);
			javaMailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*//***带附件的邮件*//*
	public void sendAttachmentsMail(String filepath,String title,String text,String sendto) {
		MimeMessage message = null;
		try {
			message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true,"utf-8");
			helper.setFrom(Sender);
			helper.setTo(sendto);
			helper.setSubject(title);
			helper.setText(text);
			//注意项目路径问题，自动补用项目路径
			FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/"+filepath));
			//加入邮件
			helper.addAttachment("图片.jpg", file);
			javaMailSender.send(message);
		} catch (Exception e){
			e.printStackTrace();
		}
	}



*/







	public static void main(String[] args) {

	}
}