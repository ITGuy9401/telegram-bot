package de.simonscholz.bot.telegram;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("bot")
public class BotProperties {

	private String apiKey = "apikey";
	private String apiUrl = "apiurl";
	private String webHookUrl = "webhookurl";

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getWebHookUrl() {
		return webHookUrl;
	}

	public void setWebHookUrl(String webHookUrl) {
		this.webHookUrl = webHookUrl;
	}
}