package goodweather.rest.jacksonobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayLocation {

    private String city;
    private String state_name;

    public String getCity() {
        return city;
    }

    public String getState_name() {
        return state_name;
    }

    @Override
    public String toString() {
        return "DisplayLocation{" +
                "city='" + city + '\'' +
                ", state_name='" + state_name + '\'' +
                '}';
    }
}
