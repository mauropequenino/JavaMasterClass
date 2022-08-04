package training.challenge_3;

public class Station {
    private String code;
    private String name;

    public Station(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code + " Mhz";
    }

    public String getName() {
        return name;
    }
}
