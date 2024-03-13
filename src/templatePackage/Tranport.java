package templatePackage;

public interface Tranport {
    int type = 0;
    String GetGosNomer();
    void SetGosNomer(String value);
    //метод смены владельца транспорта
    String changeOwner(String value);
    //метод прохождения ТО
    boolean technicalService();
}
