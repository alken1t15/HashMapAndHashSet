package Task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
  private  static final HashMap<String, List<Contact>> hashMap = new HashMap<>();

    public void addContact(String nameGroup, List<Contact> list){
        hashMap.put(nameGroup,list);
    }

    public void foundGroup(String nameGroup){
        for(Map.Entry<String, List<Contact>> entry : hashMap.entrySet()){
            String key = entry.getKey();
            List<Contact> value = entry.getValue();
            if(nameGroup.equals(key)){
                for(Contact contact : value){
                    System.out.printf("Имя: %s номер: %s\n",contact.getName(),contact.getNumber());
                }
                return;
            }
        }
        System.err.println("Такой группы нету!!");
    }
    public void fountContact(String number){
        for(Map.Entry<String, List<Contact>> entry : hashMap.entrySet()){
            List<Contact> value = entry.getValue();
                for(Contact contact : value){
                    if (contact.getNumber().equals(number)) {
                        System.out.printf("Имя: %s номер: %s\n",contact.getName(),contact.getNumber());
                        return;
                    }
                }
        }
        System.err.println("Такого номера нету!!");
    }
}
