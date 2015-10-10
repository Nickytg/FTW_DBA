package dto;

/**
 * Created by thaib on 10/7/2015.
 */
public class service_wanted_request {
    private String name;

    public service_wanted_request(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
