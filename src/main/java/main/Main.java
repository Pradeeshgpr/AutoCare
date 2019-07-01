package main;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import modules.BluetoothModule;
import modules.DisplayModule;
import modules.WiFiModule;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"modules"},
                useDefaultFilters = false)
public class Main {

    public static final GpioController gpio = GpioFactory.getInstance();

    private ApplicationContext context;

    private WiFiModule wiFiModule;
    private BluetoothModule bluetoothModule;
    private DisplayModule displayModule;

    public void init() {
        context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        wiFiModule = context.getBean(WiFiModule.class);
        bluetoothModule = context.getBean(BluetoothModule.class);
        displayModule = context.getBean(DisplayModule.class);

        initialConfig();
    }

    public void initialConfig() {
        this.wiFiModule.turnOff();
        this.bluetoothModule.turnOff();
    }

    /**
     * Init stage of the software
     * @param args command line arguments
     */
    public static void main(String args[]) {
        //Initial Config turning down all the services
        new Main().init();
    }

}
