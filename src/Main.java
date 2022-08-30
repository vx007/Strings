public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s\n", fullName);

        // Задание 2
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s\n", fullName.toUpperCase());

        // Задание 3
        fullName = "Иванов Семён Семёнович";
        System.out.printf("Данные ФИО сотрудника — %s\n", fullName.replace('ё', 'е'));

        // Задание 5
        fullName = "Ivanov Ivan Ivanovich";
        int firstIndexOfBlank = fullName.indexOf(" ");
        int lastIndexOfBlank = fullName.lastIndexOf(" ");
        lastName = fullName.substring(0, firstIndexOfBlank);
        firstName = fullName.substring(firstIndexOfBlank, lastIndexOfBlank);
        middleName = fullName.substring(lastIndexOfBlank);
        System.out.printf("Имя сотрудника — %s\n", firstName);
        System.out.printf("Отчество сотрудника — %s\n", middleName);
        System.out.printf("Фамилия сотрудника — %s\n", lastName);

        // Задание 6
        fullName = "ivanov ivan ivanovich";
        firstIndexOfBlank = fullName.indexOf(" ");
        lastIndexOfBlank = fullName.lastIndexOf(" ");
        if (lastIndexOfBlank == fullName.length() - 1) {
            throw new RuntimeException("Not valid name string!");
        }
        char[] charNames = fullName.toCharArray();
        charNames[0] = Character.toUpperCase(charNames[0]);
        charNames[firstIndexOfBlank + 1] = Character.toUpperCase(charNames[firstIndexOfBlank + 1]);
        charNames[lastIndexOfBlank + 1] = Character.toUpperCase(charNames[lastIndexOfBlank + 1]);
        fullName = new String(charNames);
        System.out.printf("Верное написание Ф. И. О. сотрудника с заглавных букв — %s\n", fullName);

        // Задание 7
        StringBuilder firstStr = new StringBuilder("135");
        StringBuilder secondStr = new StringBuilder("246");
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < firstStr.length() && i < secondStr.length(); i++) {
            finalStr.append(firstStr.charAt(i));
            finalStr.append(secondStr.charAt(i));
        }
        System.out.println(finalStr);

        // Задание 8
        String funnyStr ="aabccddefgghiijjkk";
        StringBuilder newFunnyStr = new StringBuilder();
        for (int i = 0; i < funnyStr.length() -1; i++) {
            if (funnyStr.charAt(i) == funnyStr.charAt(i+1))
                newFunnyStr.append(funnyStr.charAt(i));
        }
        System.out.println(newFunnyStr);
    }
}
