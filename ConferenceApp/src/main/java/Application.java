import com.example.AppConfig;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


    public static void main(String args[]) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = ctx.getBean(SpeakerService.class);
        System.out.println(speakerService.findAll().get(0).getfName() + " " + speakerService.findAll().get(0).getlName());
    }
}
