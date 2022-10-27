import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getAge());
        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getAge());
        System.out.println(bean == helloWorldBean);
        System.out.println(cat == catBean);
    }
}