package generics.teste;

public class Player {
    private String nickName;
    private String age;

    public Player(String nickName, String age){
        this.nickName = nickName;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAge() {
        return age;
    }
}
