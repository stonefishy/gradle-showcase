package hello;

import org.joda.time.LocalTime;
/**
 * Created by Andrewsy on 2016/4/2.
 */
public class Greeter {
    public void sayHello() {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is:" + currentTime);
        System.out.println("Hello World");
    }
}
