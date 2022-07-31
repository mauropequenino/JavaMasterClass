package arrays.autoboxing.provinces;

import java.util.ArrayList;

public class District {
    private String provinceName;
    private ArrayList<String> districtList;

    public District(String provinceName, String districtName){
        this.provinceName = provinceName;
        this.districtList = new ArrayList<String>();
        addNewDistrict(districtName);
    }

    public void addNewDistrict (String districtName) {
        this.districtList.add(districtName);
    }

    public String getProvinceName() {
        return provinceName;
    }

    public ArrayList<String> getDistrictList() {
        return districtList;
    }
}
