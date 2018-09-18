package lab1A;

public class SimpleList {

    private class Unit {
        Unit next = null; // Рефренс на след. элемент
        int data; // Текст

        private Unit(int d) {
            data = d; // Назначение текста
        }
    }

    private Unit header; // Объявление рефренса на начало листа
    private int listIter; // Состояние итератора

    public SimpleList() {
        header = new Unit(0); // Создание начала листа
        listIter = 0; // Итератор устанавливается на 0
    }

    public void printUnits() { // Функция вывода всего списка
        Unit current = header; // Переход на начало списка
        System.out.println("Данные в списки:");

        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean addUnit(int d) { // Добавление в конец списка
        Unit eol = new Unit(d); // Создание последнего элемента списка
        Unit current = header; // Переход в начало

        while (current.next != null) { // Поиск конца списка
            current = current.next;
        }
        current.next = eol;
        //System.out.println(d+" добавлен в конец");
        listIter++;
        return true;
    }

    public boolean addUnit(int d, int index) { // Добавление в данный индекс
        Unit eol = new Unit(d);
        Unit current = header;
        int i;

        if (index > listIter || index < 1) {
            System.out.println("Индекс находится вне границ списка.");
            return false;
        } else {
            i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            eol.next = current.next;
            current.next = eol;
            listIter++;
            System.out.println(d + " добавлено в индекс " + index);
            return true;
        }
    }

    public boolean deleteUnitAtIndex(int index) { // Удаление элемента списка
        Unit current = header;
        int i;

        if (index > listIter || index < 1) {
            System.out.println("Индекс элемента находится вне границ списка.");
            return false;
        } else {
            i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            current.next = current.next.next;
            System.out.println("Элемент в индексе" + index + " удалён.");
            listIter--;
            return true;
        }
    }

    public int findElement(int d) { // Поиск элемента
        Unit current = header;
        int out, i = 1;

        while (current.next != null) {
            if (current.data == d) {
                i = d;
                break;
            }
            i++;
            current = current.next;
        }
        return 1;
    }

    public int[] getDataArray() {
        Unit current = header;
        int i = 0;
        int dArray[] = new int[listIter];

        while (current.next != null) {
            current = current.next;
            dArray[i] = current.data;
            i++;
        }
        return dArray;
    }

    public static void main(String[] arg) {
        SimpleList SL = new SimpleList();
        for (int i = 1; i < 7; i++) {
            SL.addUnit(i);
        }
        SL.printUnits();
        int d[] = SL.getDataArray();
        if (SL.listIter == 0) {
            System.out.println("Лист пуст.");
        } else {
            int sum = 0;
            for (int i = 0; i < SL.listIter; i++) {
                sum = sum + d[i];
            }
            System.out.println(sum);
            System.out.println(SL.listIter);
            float r = sum / SL.listIter;
            System.out.printf("Средние арифимитическое элементов списка: %.1f", r);
        }
    }
}

