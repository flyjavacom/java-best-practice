package top.ylonline.sb.el.event;

import org.springframework.context.ApplicationEvent;
import top.ylonline.sb.el.domain.User;

/**
 * @author YL
 */
public class UserEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private User user;

    public UserEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
