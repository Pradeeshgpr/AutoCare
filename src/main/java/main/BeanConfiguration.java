package main;

import modules.BluetoothModule;
import modules.DisplayModule;
import modules.WiFiModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public WiFiModule getWiFiModule() {
        return new WiFiModule();
    }

    @Bean
    public BluetoothModule getBluetoothModule() {
        return new BluetoothModule();
    }

    @Bean
    public DisplayModule getDisplayModule() {
        return new DisplayModule();
    }

}
