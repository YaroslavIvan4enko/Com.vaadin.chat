package com.yaroslav.chat;

import com.vaadin.flow.component.page.Push;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@Push
public class ChatApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}
}
