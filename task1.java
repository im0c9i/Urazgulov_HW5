/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */

public class task1{
    public static void main(String[] args) {
        telefon telefon = new telefon();
        telefon.add("8922234523435", "Иванов Илья");
        telefon.add("66-44-33", "Иванов Илья");
        telefon.add("8943256745453", "Петров Петя");
        telefon.add("89567767756445", "Максимов Игорь");
        telefon.add("892223", "Сетапанов Вадим");
        telefon.add("7834576454546", "Иванова Наталья");
        telefon.add("235546567574", "Сидорова Ксенья");
        telefon.add("894325652784", "Зотова Ирина");
        telefon.print("Иванов Илья");
        
    }

}