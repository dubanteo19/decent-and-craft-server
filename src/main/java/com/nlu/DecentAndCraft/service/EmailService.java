package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.model.Order;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class EmailService {
    private final JavaMailSender javaMailSender;
    private final SpringTemplateEngine templateEngine;
    private final ExecutorService executorService;

    public EmailService(JavaMailSender javaMailSender, SpringTemplateEngine templateEngine) {
        this.javaMailSender = javaMailSender;
        this.templateEngine = templateEngine;
        this.executorService = Executors.newFixedThreadPool(10);
    }

    public void sendPasswordResetEmail(String to, String newPassword) throws MessagingException, UnsupportedEncodingException {
        Context context = new Context();
        context.setVariable("newPassword", newPassword);
        String htmlContent = templateEngine.process("password-reset-email", context);
        sendEmail(to, "Yêu cầu mật khẩu mới", htmlContent);
    }

    public void sendOrderDetailsEmail(String to, Order order) throws MessagingException, UnsupportedEncodingException {
        Context context = new Context();
        context.setVariable("order", order);
        String htmlContent = templateEngine.process("order-email", context);
        sendEmail(to, "Xác nhận đơn hàng", htmlContent);
    }

    private void sendEmail(String to, String subject, String text) throws MessagingException, UnsupportedEncodingException {
        executorService.submit(() -> {
            try {
                MimeMessage mimeMessage = javaMailSender.createMimeMessage();
                MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
                InternetAddress fromAddress = new InternetAddress("21130451@st.hcmuaf.edu.vn", "Decent&Craft");
                mimeMessage.setFrom(fromAddress);
                mimeMessageHelper.setTo(to);
                mimeMessageHelper.setSubject(subject);
                mimeMessageHelper.setText(text, true);
                javaMailSender.send(mimeMessage);
            } catch (MessagingException | UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
