package spingclouddemo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;

/**user监听器*/

@Component
@WebListener
public class UserListener implements ApplicationListener {




    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
         Object source = applicationEvent.getSource();


    }
}
