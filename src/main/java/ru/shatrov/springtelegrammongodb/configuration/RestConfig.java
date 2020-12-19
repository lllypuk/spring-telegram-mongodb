package ru.shatrov.springtelegrammongodb.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import ru.shatrov.springtelegrammongodb.entity.Chat;
import ru.shatrov.springtelegrammongodb.entity.ChatMessage;
import ru.shatrov.springtelegrammongodb.entity.TelegramUser;

/**
 * author Shatrov create date 19.12.2020
 */
@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(ChatMessage.class);
        config.exposeIdsFor(Chat.class);
        config.exposeIdsFor(TelegramUser.class);
    }
}
