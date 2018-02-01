package goodweather.rest.jacksonobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    private String state;
    private String city;

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
