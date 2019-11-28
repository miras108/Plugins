import java.util.ServiceLoader;

import dictionary.spi.Service;

public class Runner {

    public static void main(String[] args) {
        ServiceLoader<Service> loader = ServiceLoader.load(Service.class);

        System.out.println("number of loaders: " + loader);
        for (Service service : loader) {
            System.out.println("loader nr:");
            service.doStuff();
        }
    }
}
