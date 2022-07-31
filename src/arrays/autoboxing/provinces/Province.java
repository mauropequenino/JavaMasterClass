//package arrays.autoboxing.provinces;
//
//import java.util.ArrayList;
//
//public class Province {
//    private String name;
//    private ArrayList<District> districts = new ArrayList<District>();
//
//    public Province (String name) {
//        this.name = name;
//        this.districts = new ArrayList<District>();
//    }
//
//    public boolean newProvince(String provinceName, String fistDistrictName){
//        if(findDistrict(provinceName) == null){
//            this.districts.add(new District(provinceName, fistDistrictName));
//            return true;
//        }
//        return false;
//    }
//
//    private District findDistrict(String provinceName) {
//        return
//    }
//
//    public boolean addProvinceDistrict(String provinceName, String districtName){
//        District existringProvince = findDistrict(provinceName);
//        if (existringProvince != null){
//            existringProvince.addNewDistrict(districtName);
//            return true;
//        }
//        return false;
//    }
//
//    public District findProvince(String districtName) {
//        for (int i=0;i<this.districts.size();i++){
//            District checked = this.districts.get(i);
//            if (checked.getProvinceName().equalsIgnoreCase(districtName)){
//                return checked;
//            }
//        }
//        return null;
//    }
//
//}
