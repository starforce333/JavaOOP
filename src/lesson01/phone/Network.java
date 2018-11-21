package lesson01.phone;

import java.util.Arrays;

public class Network {

    private Phone[] numbers = new Phone[5];

    public Network(Phone[] numbers) {
        this.numbers = numbers;
    }

    public Network() {
    }

    public Phone[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Phone[] numbers) {
        this.numbers = numbers;
    }

    public void add(Phone number) {
        if (check(number)) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == null) {
                    numbers[i] = number;
                    System.out.println(number.getNumber() + "\t successfully added");
                    return;
                }
            }
        } else System.out.println(number.getNumber() + "\t has already registered! Please check your data!");
    }

    private boolean check(Phone number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null && numbers[i].getNumber().equals(number.getNumber())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Network{" +
                "numbers=" + Arrays.toString(numbers) + '}';
    }
}


//  Также опишите класс  Network  (сеть  мобильного  оператора).  Телефон  должен  иметь  метод
//        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
//        (номер другого телефона), который переберет все телефоны, зарегистрированные в
//        сети.  Если  такой  номер  будет  найден,  то  осуществить  вызов,  если  нет  -  вывести
//        сообщение об ошибочности набранного номера.