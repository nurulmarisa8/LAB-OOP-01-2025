package login_app.models;

import java.util.ArrayList;


public class Profile {
    /*
     * 
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */

    private String fullName;
    private int age;
    private String hobby;
    private String nickName;

    private ArrayList<Peripheral> peripherals = new ArrayList<>();

    public void addPeripheral(Peripheral p) {
        peripherals.add(p);
    }
    
    public ArrayList<Peripheral> getPeripherals() {
        return peripherals;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNickName() {
        return nickName;
    }


}
